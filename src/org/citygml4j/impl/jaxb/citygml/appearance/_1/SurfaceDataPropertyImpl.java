package org.citygml4j.impl.jaxb.citygml.appearance._1;

import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

import org.citygml4j.impl.jaxb.ModelMapper;
import org.citygml4j.impl.jaxb.citygml.core._1.CityGMLBaseImpl;
import org.citygml4j.jaxb.citygml.app._1.AbstractSurfaceDataType;
import org.citygml4j.jaxb.citygml.app._1.AbstractTextureType;
import org.citygml4j.jaxb.citygml.app._1.GeoreferencedTextureType;
import org.citygml4j.jaxb.citygml.app._1.ParameterizedTextureType;
import org.citygml4j.jaxb.citygml.app._1.SurfaceDataPropertyType;
import org.citygml4j.jaxb.citygml.app._1.X3DMaterialType;
import org.citygml4j.model.citygml.CityGMLClass;
import org.citygml4j.model.citygml.CityGMLModule;
import org.citygml4j.model.citygml.appearance.AbstractSurfaceData;
import org.citygml4j.model.citygml.appearance.AbstractTexture;
import org.citygml4j.model.citygml.appearance.AppearanceModule;
import org.citygml4j.model.citygml.appearance.GeoreferencedTexture;
import org.citygml4j.model.citygml.appearance.ParameterizedTexture;
import org.citygml4j.model.citygml.appearance.SurfaceDataProperty;
import org.citygml4j.model.citygml.appearance.X3DMaterial;

public class SurfaceDataPropertyImpl extends CityGMLBaseImpl implements SurfaceDataProperty {
	private SurfaceDataPropertyType surfaceDataPropertyType;

	public SurfaceDataPropertyImpl() {
		surfaceDataPropertyType = new SurfaceDataPropertyType();
	}

	public SurfaceDataPropertyImpl(SurfaceDataPropertyType surfaceDataPropertyType) {
		this.surfaceDataPropertyType = surfaceDataPropertyType;
	}

	@Override
	public SurfaceDataPropertyType getJAXBObject() {
		return surfaceDataPropertyType;
	}

	@Override
	public CityGMLClass getCityGMLClass() {
		return CityGMLClass.SURFACEDATAPROPERTY;
	}
	
	@Override
	public final CityGMLModule getCityGMLModule() {
		return AppearanceModule.v1_0_0;
	}

	public AbstractSurfaceData getSurfaceData() {
		if (surfaceDataPropertyType.isSet_SurfaceData()) {
			JAXBElement<? extends AbstractSurfaceDataType> abstractSurfaceData = surfaceDataPropertyType.get_SurfaceData();

			if (abstractSurfaceData.getValue() != null) {
				AbstractSurfaceDataType elem = abstractSurfaceData.getValue();
				QName name = abstractSurfaceData.getName();
				
				if (elem instanceof X3DMaterialType)
					return ModelMapper.APP_1.toCityGML((X3DMaterialType)elem, name);
				else if (elem instanceof GeoreferencedTextureType)
					return ModelMapper.APP_1.toCityGML((GeoreferencedTextureType)elem, name);
				else if (elem instanceof ParameterizedTextureType)
					return ModelMapper.APP_1.toCityGML((ParameterizedTextureType)elem, name);
				else if (elem instanceof AbstractTextureType)
					return ModelMapper.APP_1.toCityGML((AbstractTextureType)elem, name);
				else if (elem instanceof AbstractSurfaceDataType)
					return ModelMapper.APP_1.toCityGML((AbstractSurfaceDataType)elem, name);
			}
		}

		return null;
	}

	public void setSurfaceData(AbstractSurfaceData surfaceData) {
		JAXBElement<? extends AbstractSurfaceDataType> jaxbElem = null;

		if (surfaceData instanceof X3DMaterial)
			jaxbElem = ModelMapper.APP_1.toJAXB((X3DMaterial)surfaceData);
		else if (surfaceData instanceof GeoreferencedTexture)
			jaxbElem = ModelMapper.APP_1.toJAXB((GeoreferencedTexture)surfaceData);
		else if (surfaceData instanceof ParameterizedTexture)
			jaxbElem = ModelMapper.APP_1.toJAXB((ParameterizedTexture)surfaceData);
		else if (surfaceData instanceof AbstractTexture)
			jaxbElem = ModelMapper.APP_1.toJAXB((AbstractTexture)surfaceData);
		else if (surfaceData instanceof AbstractSurfaceData)
			jaxbElem = ModelMapper.APP_1.toJAXB((AbstractSurfaceData)surfaceData);

		if (jaxbElem != null)
			surfaceDataPropertyType.set_SurfaceData(jaxbElem);
	}

	public String getActuate() {
		return surfaceDataPropertyType.getActuate();
	}

	public String getArcrole() {
		return surfaceDataPropertyType.getArcrole();
	}

	public String getHref() {
		return surfaceDataPropertyType.getHref();
	}

	public String getRemoteSchema() {
		return surfaceDataPropertyType.getRemoteSchema();
	}

	public String getRole() {
		return surfaceDataPropertyType.getRole();
	}

	public String getShow() {
		return surfaceDataPropertyType.getShow();
	}

	public String getTitle() {
		return surfaceDataPropertyType.getTitle();
	}

	public String getType() {
		return surfaceDataPropertyType.getType();
	}

	public void setActuate(String actuate) {
		surfaceDataPropertyType.setActuate(actuate);
	}

	public void setArcrole(String arcrole) {
		surfaceDataPropertyType.setArcrole(arcrole);
	}

	public void setHref(String href) {
		surfaceDataPropertyType.setHref(href);
	}

	public void setRemoteSchema(String remoteSchema) {
		surfaceDataPropertyType.setRemoteSchema(remoteSchema);
	}

	public void setRole(String role) {
		surfaceDataPropertyType.setRole(role);
	}

	public void setShow(String show) {
		surfaceDataPropertyType.setShow(show);
	}

	public void setTitle(String title) {
		surfaceDataPropertyType.setTitle(title);
	}

	public void setType(String type) {
		surfaceDataPropertyType.setType(type);
	}

	public boolean isSetSurfaceData() {
		return surfaceDataPropertyType.isSet_SurfaceData();
	}

	public void unsetSurfaceData() {
		surfaceDataPropertyType.set_SurfaceData(null);
	}
	
	public boolean isSetActuate() {
		return surfaceDataPropertyType.isSetActuate();
	}

	public boolean isSetArcrole() {
		return surfaceDataPropertyType.isSetArcrole();
	}

	public boolean isSetHref() {
		return surfaceDataPropertyType.isSetHref();
	}

	public boolean isSetRemoteSchema() {
		return surfaceDataPropertyType.isSetRemoteSchema();
	}

	public boolean isSetRole() {
		return surfaceDataPropertyType.isSetRole();
	}

	public boolean isSetShow() {
		return surfaceDataPropertyType.isSetShow();
	}

	public boolean isSetTitle() {
		return surfaceDataPropertyType.isSetTitle();
	}

	public boolean isSetType() {
		return surfaceDataPropertyType.isSetType();
	}

	public void unsetActuate() {
		surfaceDataPropertyType.setActuate(null);
	}

	public void unsetArcrole() {
		surfaceDataPropertyType.setArcrole(null);
	}

	public void unsetHref() {
		surfaceDataPropertyType.setHref(null);
	}

	public void unsetRemoteSchema() {
		surfaceDataPropertyType.setRemoteSchema(null);
	}

	public void unsetRole() {
		surfaceDataPropertyType.setRole(null);
	}

	public void unsetShow() {
		surfaceDataPropertyType.setShow(null);
	}

	public void unsetTitle() {
		surfaceDataPropertyType.setTitle(null);
	}

	public void unsetType() {
		surfaceDataPropertyType.setType(null);
	}
}
