package org.citygml4j.builder.jaxb.unmarshal;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import org.citygml4j.builder.jaxb.JAXBBuilder;
import org.citygml4j.builder.jaxb.unmarshal.citygml.CityGMLUnmarshaller;
import org.citygml4j.builder.jaxb.unmarshal.citygml.ade.ADEUnmarshaller;
import org.citygml4j.builder.jaxb.unmarshal.gml.GMLUnmarshaller;
import org.citygml4j.builder.jaxb.unmarshal.xal.XALUnmarshaller;
import org.citygml4j.xml.io.reader.MissingADESchemaException;
import org.citygml4j.xml.schema.SchemaHandler;
import org.w3c.dom.Element;

public class JAXBUnmarshaller {
	private final CityGMLUnmarshaller citygml;
	private final GMLUnmarshaller gml;
	private final XALUnmarshaller xal;
	private final ADEUnmarshaller ade;

	private final JAXBBuilder jaxbBuilder;
	private final SchemaHandler schemaHandler;
	private boolean parseSchema = true;
	private boolean releaseJAXBElements = true;

	public JAXBUnmarshaller(JAXBBuilder jaxbBuilder, SchemaHandler schemaHandler) {
		this.jaxbBuilder = jaxbBuilder;
		this.schemaHandler = schemaHandler;

		citygml = new CityGMLUnmarshaller(this);
		gml = new GMLUnmarshaller(this);
		xal = new XALUnmarshaller();
		ade = new ADEUnmarshaller(this);
	}

	public Object unmarshal(JAXBElement<?> src) throws MissingADESchemaException {
		Object dest = citygml.unmarshal(src);
		if (dest == null)
			dest = gml.unmarshal(src);
		if (dest == null)
			dest = xal.unmarshal(src);

		// release memory
		if (releaseJAXBElements)
			src.setValue(null);

		return dest;
	}

	public Object unmarshal(Element element) throws MissingADESchemaException {
		Object dest = null;

		try {
			Unmarshaller um = jaxbBuilder.getJAXBContext().createUnmarshaller();			
			dest = um.unmarshal(element);	
			if (dest instanceof JAXBElement<?>)
				dest = unmarshal((JAXBElement<?>)dest);
		} catch (JAXBException e) {
			//
		}

		return dest;
	}

	public Object unmarshal(Object src) throws MissingADESchemaException {
		if (src instanceof JAXBElement<?>)
			return unmarshal((JAXBElement<?>)src);

		if (src instanceof Element)
			return unmarshal((Element)src);

		Object dest = citygml.unmarshal(src);
		if (dest == null)
			dest = gml.unmarshal(src);
		if (dest == null)
			dest = xal.unmarshal(src);

		return dest;
	}

	public CityGMLUnmarshaller getCityGMLUnmarshaller() {
		return citygml;
	}

	public GMLUnmarshaller getGMLUnmarshaller() {
		return gml;
	}

	public XALUnmarshaller getXALUnmarshaller() {
		return xal;
	}

	public ADEUnmarshaller getADEUnmarshaller() {
		return ade;
	}

	public SchemaHandler getSchemaHandler() {
		return schemaHandler;
	}

	public boolean isParseSchema() {
		return parseSchema;
	}

	public void setParseSchema(boolean parseSchema) {
		this.parseSchema = parseSchema;
	}

	public boolean isReleaseJAXBElementsFromMemory() {
		return releaseJAXBElements;
	}

	public void setReleaseJAXBElementsFromMemory(boolean releaseJAXBElements) {
		this.releaseJAXBElements = releaseJAXBElements;
	}	

}