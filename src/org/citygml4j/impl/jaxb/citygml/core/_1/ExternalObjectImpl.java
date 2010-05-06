package org.citygml4j.impl.jaxb.citygml.core._1;

import org.citygml4j.jaxb.citygml.core._1.ExternalObjectReferenceType;
import org.citygml4j.model.citygml.CityGMLClass;
import org.citygml4j.model.citygml.CityGMLModule;
import org.citygml4j.model.citygml.core.CoreModule;
import org.citygml4j.model.citygml.core.ExternalObject;

public class ExternalObjectImpl extends CityGMLBaseImpl implements ExternalObject {
	protected ExternalObjectReferenceType externalObject;

	public ExternalObjectImpl() {
		externalObject = new ExternalObjectReferenceType();
	}

	public ExternalObjectImpl(ExternalObjectReferenceType externalObject) {
		this.externalObject = externalObject;
	}

	@Override
	public ExternalObjectReferenceType getJAXBObject() {
		return externalObject;
	}

	@Override
	public CityGMLClass getCityGMLClass() {
		return CityGMLClass.EXTERNALOBJECT;
	}

	@Override
	public final CityGMLModule getCityGMLModule() {
		return CoreModule.v1_0_0;
	}
	
	public String getName() {
		return externalObject.getName();
	}

	public String getUri() {
		return externalObject.getUri();
	}

	public void setName(String name) {
		externalObject.setName(name);
	}

	public void setUri(String uri) {
		externalObject.setUri(uri);
	}
	
	public boolean isSetName() {
		return externalObject.isSetName();
	}

	public boolean isSetUri() {
		return externalObject.isSetUri();
	}

	public void unsetName() {
		externalObject.setName(null);
	}

	public void unsetUri() {
		externalObject.setUri(null);
	}
}
