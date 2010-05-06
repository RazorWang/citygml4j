package org.citygml4j.impl.jaxb.citygml.appearance._0_4;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.xml.bind.JAXBElement;

import org.citygml4j.impl.jaxb.ModelMapper;
import org.citygml4j.jaxb.citygml._0_4.ParameterizedTextureType;
import org.citygml4j.jaxb.citygml._0_4.TextureAssociationType;
import org.citygml4j.model.citygml.CityGMLClass;
import org.citygml4j.model.citygml.ade.ADEComponent;
import org.citygml4j.model.citygml.appearance.ParameterizedTexture;
import org.citygml4j.model.citygml.appearance.TextureAssociation;

public class ParameterizedTextureImpl extends AbstractTextureImpl implements ParameterizedTexture {
	private ParameterizedTextureType parameterizedTextureType;

	public ParameterizedTextureImpl() {
		this(new ParameterizedTextureType());
	}

	public ParameterizedTextureImpl(ParameterizedTextureType parameterizedTextureType) {
		super(parameterizedTextureType);
		this.parameterizedTextureType = parameterizedTextureType;
	}

	@Override
	public CityGMLClass getCityGMLClass() {
		return CityGMLClass.PARAMETERIZEDTEXTURE;
	}

	@Override
	public ParameterizedTextureType getJAXBObject() {
		return parameterizedTextureType;
	}

	public void addTarget(TextureAssociation target) {
		parameterizedTextureType.getTarget().add(((TextureAssociationImpl)target).getJAXBObject());
	}

	public List<TextureAssociation> getTarget() {
		List<TextureAssociation> texAssList = new ArrayList<TextureAssociation>();

		for (TextureAssociationType texAssType : parameterizedTextureType.getTarget())
			texAssList.add(new TextureAssociationImpl(texAssType));

		return texAssList;
	}

	public void setTarget(List<TextureAssociation> target) {
		List<TextureAssociationType> texAssTypeList = new ArrayList<TextureAssociationType>();

		for (TextureAssociation texAss : target)
			texAssTypeList.add(((TextureAssociationImpl)texAss).getJAXBObject());

		parameterizedTextureType.unsetTarget();
		parameterizedTextureType.getTarget().addAll(texAssTypeList);
	}

	public void addGenericApplicationPropertyOfParameterizedTexture(ADEComponent adeObject) {
		JAXBElement<?> jaxbElem = ModelMapper.ADE.toJAXB(adeObject);
		if (jaxbElem != null)
			parameterizedTextureType.get_GenericApplicationPropertyOfParameterizedTexture().add(jaxbElem);
	}

	public List<ADEComponent> getGenericApplicationPropertyOfParameterizedTexture() {
		List<ADEComponent> adeList = new ArrayList<ADEComponent>();

		for (JAXBElement<?> elem : parameterizedTextureType.get_GenericApplicationPropertyOfParameterizedTexture()) {
			if (elem.getValue() != null) {
				ADEComponent ade = ModelMapper.ADE.toADEComponent(elem.getValue(), elem.getName());
				if (ade != null)
					adeList.add(ade);
			}
		}

		return adeList;
	}

	public void setGenericApplicationPropertyOfParameterizedTexture(List<ADEComponent> adeObject) {
		List<JAXBElement<?>> elemList = new ArrayList<JAXBElement<?>>();

		for (ADEComponent ade : adeObject) {
			JAXBElement<?> elem = ModelMapper.ADE.toJAXB(ade);
			if (elem != null)
				elemList.add(elem);
		}

		if (!elemList.isEmpty()) {
			parameterizedTextureType.unset_GenericApplicationPropertyOfParameterizedTexture();
			parameterizedTextureType.get_GenericApplicationPropertyOfParameterizedTexture().addAll(elemList);
		}
	}

	public boolean isSetGenericApplicationPropertyOfParameterizedTexture() {
		return parameterizedTextureType.isSet_GenericApplicationPropertyOfParameterizedTexture();
	}

	public boolean isSetTarget() {
		return parameterizedTextureType.isSetTarget();
	}

	public void unsetGenericApplicationPropertyOfParameterizedTexture() {
		parameterizedTextureType.unset_GenericApplicationPropertyOfParameterizedTexture();
	}

	public void unsetTarget() {
		parameterizedTextureType.unsetTarget();
	}

	public boolean unsetGenericApplicationPropertyOfParameterizedTexture(ADEComponent adeObject) {
		if (parameterizedTextureType.isSet_GenericApplicationPropertyOfParameterizedTexture()) {
			Iterator<JAXBElement<?>> iter = parameterizedTextureType.get_GenericApplicationPropertyOfParameterizedTexture().iterator();
			while (iter.hasNext()) {
				JAXBElement<?> elem = iter.next();
				if (elem.getValue() != null && elem.getValue() != null) {
					JAXBElement<?> ade = ModelMapper.ADE.toJAXB(adeObject);
					if (ade != null && ade.getValue() != null && elem.getValue().equals(ade.getValue())) {
						iter.remove();
						return true;
					}
				}
			}				
		}
		
		return false;
	}

	public boolean unsetTarget(TextureAssociation target) {
		if (parameterizedTextureType.isSetTarget())
			return parameterizedTextureType.getTarget().remove(((TextureAssociationImpl)target).getJAXBObject());
		
		return false;
	}

}
