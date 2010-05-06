package org.citygml4j.impl.jaxb.citygml.building._0_4;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.xml.bind.JAXBElement;

import org.citygml4j.impl.jaxb.ModelMapper;
import org.citygml4j.jaxb.citygml._0_4.ClosureSurfaceType;
import org.citygml4j.model.citygml.CityGMLClass;
import org.citygml4j.model.citygml.ade.ADEComponent;
import org.citygml4j.model.citygml.building.ClosureSurface;

public class ClosureSurfaceImpl extends BoundarySurfaceImpl implements ClosureSurface {
	private ClosureSurfaceType closureSurfaceType;

	public ClosureSurfaceImpl() {
		this(new ClosureSurfaceType());
	}

	public ClosureSurfaceImpl(ClosureSurfaceType closureSurfaceType) {
		super(closureSurfaceType);
		this.closureSurfaceType = closureSurfaceType;
	}

	@Override
	public ClosureSurfaceType getJAXBObject() {
		return closureSurfaceType;
	}

	@Override
	public CityGMLClass getCityGMLClass() {
		return CityGMLClass.CLOSURESURFACE;
	}

	public void addGenericApplicationPropertyOfClosureSurface(ADEComponent adeObject) {
		JAXBElement<?> jaxbElem = ModelMapper.ADE.toJAXB(adeObject);
		if (jaxbElem != null)
			closureSurfaceType.get_GenericApplicationPropertyOfClosureSurface().add(jaxbElem);
	}

	public List<ADEComponent> getGenericApplicationPropertyOfClosureSurface() {
		List<ADEComponent> adeList = new ArrayList<ADEComponent>();

		for (JAXBElement<?> elem : closureSurfaceType.get_GenericApplicationPropertyOfClosureSurface()) {
			if (elem.getValue() != null) {
				ADEComponent ade = ModelMapper.ADE.toADEComponent(elem.getValue(), elem.getName());
				if (ade != null)
					adeList.add(ade);
			}
		}

		return adeList;
	}

	public void setGenericApplicationPropertyOfClosureSurface(List<ADEComponent> adeObject) {
		List<JAXBElement<?>> elemList = new ArrayList<JAXBElement<?>>();

		for (ADEComponent ade : adeObject) {
			JAXBElement<?> elem = ModelMapper.ADE.toJAXB(ade);
			if (elem != null)
				elemList.add(elem);
		}

		if (!elemList.isEmpty()) {
			closureSurfaceType.unset_GenericApplicationPropertyOfClosureSurface();
			closureSurfaceType.get_GenericApplicationPropertyOfClosureSurface().addAll(elemList);
		}
	}

	public boolean isSetGenericApplicationPropertyOfClosureSurface() {
		return closureSurfaceType.isSet_GenericApplicationPropertyOfClosureSurface();
	}

	public void unsetGenericApplicationPropertyOfClosureSurface() {
		closureSurfaceType.unset_GenericApplicationPropertyOfClosureSurface();
	}

	public boolean unsetGenericApplicationPropertyOfClosureSurface(ADEComponent adeObject) {
		if (closureSurfaceType.isSet_GenericApplicationPropertyOfClosureSurface()) {
			Iterator<JAXBElement<?>> iter = closureSurfaceType.get_GenericApplicationPropertyOfClosureSurface().iterator();
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

}
