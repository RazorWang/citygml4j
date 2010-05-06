package org.citygml4j.impl.jaxb.citygml.building._1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.xml.bind.JAXBElement;

import org.citygml4j.impl.jaxb.ModelMapper;
import org.citygml4j.jaxb.citygml.bldg._1.BuildingType;
import org.citygml4j.model.citygml.CityGMLClass;
import org.citygml4j.model.citygml.ade.ADEComponent;
import org.citygml4j.model.citygml.building.Building;

public class BuildingImpl extends AbstractBuildingImpl implements Building {
	private BuildingType buildingType;

	public BuildingImpl() {
		this(new BuildingType());
	}

	public BuildingImpl(BuildingType buildingType) {
		super(buildingType);
		this.buildingType = buildingType;
	}

	@Override
	public BuildingType getJAXBObject() {
		return buildingType;
	}

	@Override
	public CityGMLClass getCityGMLClass() {
		return CityGMLClass.BUILDING;
	}

	public void addGenericApplicationPropertyOfBuilding(ADEComponent adeObject) {
		JAXBElement<?> jaxbElem = ModelMapper.ADE.toJAXB(adeObject);
		if (jaxbElem != null)
			buildingType.get_GenericApplicationPropertyOfBuilding().add(jaxbElem);
	}

	public List<ADEComponent> getGenericApplicationPropertyOfBuilding() {
		List<ADEComponent> adeList = new ArrayList<ADEComponent>();

		for (JAXBElement<?> elem : buildingType.get_GenericApplicationPropertyOfBuilding()) {
			if (elem.getValue() != null) {
				ADEComponent ade = ModelMapper.ADE.toADEComponent(elem.getValue(), elem.getName());
				if (ade != null)
					adeList.add(ade);
			}
		}

		return adeList;
	}

	public void setGenericApplicationPropertyOfBuilding(List<ADEComponent> adeObject) {
		List<JAXBElement<?>> elemList = new ArrayList<JAXBElement<?>>();

		for (ADEComponent ade : adeObject) {
			JAXBElement<?> elem = ModelMapper.ADE.toJAXB(ade);
			if (elem != null)
				elemList.add(elem);
		}

		if (!elemList.isEmpty()) {
			buildingType.unset_GenericApplicationPropertyOfBuilding();
			buildingType.get_GenericApplicationPropertyOfBuilding().addAll(elemList);
		}
	}

	public boolean isSetGenericApplicationPropertyOfBuilding() {
		return buildingType.isSet_GenericApplicationPropertyOfBuilding();
	}

	public void unsetGenericApplicationPropertyOfBuilding() {
		buildingType.unset_GenericApplicationPropertyOfBuilding();
	}
	
	public boolean unsetGenericApplicationPropertyOfBuilding(ADEComponent adeObject) {
		if (buildingType.isSet_GenericApplicationPropertyOfBuilding()) {
			Iterator<JAXBElement<?>> iter = buildingType.get_GenericApplicationPropertyOfBuilding().iterator();
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
