package org.citygml4j.impl.jaxb.citygml.transportation._1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.xml.bind.JAXBElement;

import org.citygml4j.impl.jaxb.ModelMapper;
import org.citygml4j.impl.jaxb.gml._3_1_1.GeometricComplexPropertyImpl;
import org.citygml4j.impl.jaxb.gml._3_1_1.MultiSurfacePropertyImpl;
import org.citygml4j.jaxb.citygml.tran._1.AuxiliaryTrafficAreaPropertyType;
import org.citygml4j.jaxb.citygml.tran._1.TrafficAreaPropertyType;
import org.citygml4j.jaxb.citygml.tran._1.TransportationComplexType;
import org.citygml4j.jaxb.gml._3_1_1.AbstractCurveType;
import org.citygml4j.jaxb.gml._3_1_1.GeometricComplexPropertyType;
import org.citygml4j.model.citygml.CityGMLClass;
import org.citygml4j.model.citygml.ade.ADEComponent;
import org.citygml4j.model.citygml.transportation.AuxiliaryTrafficAreaProperty;
import org.citygml4j.model.citygml.transportation.TrafficAreaProperty;
import org.citygml4j.model.citygml.transportation.TransportationComplex;
import org.citygml4j.model.gml.AbstractGeometricPrimitive;
import org.citygml4j.model.gml.CompositeCurve;
import org.citygml4j.model.gml.GeometricComplex;
import org.citygml4j.model.gml.GeometricComplexProperty;
import org.citygml4j.model.gml.GeometricPrimitiveProperty;
import org.citygml4j.model.gml.MultiSurface;
import org.citygml4j.model.gml.MultiSurfaceProperty;

public class TransportationComplexImpl extends TransportationObjectImpl implements TransportationComplex {
	private TransportationComplexType transportationComplexType;

	public TransportationComplexImpl() {
		this(new TransportationComplexType());
	}

	public TransportationComplexImpl(TransportationComplexType transportationComplexType) {
		super(transportationComplexType);
		this.transportationComplexType = transportationComplexType;
	}

	@Override
	public CityGMLClass getCityGMLClass() {
		return CityGMLClass.TRANSPORTATIONCOMPLEX;
	}

	@Override
	public TransportationComplexType getJAXBObject() {
		return transportationComplexType;
	}

	public void addAuxiliaryTrafficArea(AuxiliaryTrafficAreaProperty auxiliaryTrafficArea) {
		transportationComplexType.getAuxiliaryTrafficArea().add(((AuxiliaryTrafficAreaPropertyImpl)auxiliaryTrafficArea).getJAXBObject());
	}

	public void addFunction(String function) {
		transportationComplexType.getFunction().add(function);
	}

	public void addTrafficArea(TrafficAreaProperty trafficArea) {
		transportationComplexType.getTrafficArea().add(((TrafficAreaPropertyImpl)trafficArea).getJAXBObject());
	}

	public void addUsage(String usage) {
		transportationComplexType.getUsage().add(usage);
	}

	public List<AuxiliaryTrafficAreaProperty> getAuxiliaryTrafficArea() {
		List<AuxiliaryTrafficAreaProperty> auxPropertyList = new ArrayList<AuxiliaryTrafficAreaProperty>();

		for (AuxiliaryTrafficAreaPropertyType auxPropertyType : transportationComplexType.getAuxiliaryTrafficArea())
			auxPropertyList.add(new AuxiliaryTrafficAreaPropertyImpl(auxPropertyType));

		return auxPropertyList;
	}

	public List<String> getFunction() {
		return transportationComplexType.getFunction();
	}

	public List<GeometricComplexProperty> getLod0Network() {
		List<GeometricComplexProperty> geomPropertyList = new ArrayList<GeometricComplexProperty>();

		for (GeometricComplexPropertyType geomPropertyType : transportationComplexType.getLod0Network())
			geomPropertyList.add(new GeometricComplexPropertyImpl(geomPropertyType));

		return geomPropertyList;
	}

	public MultiSurfaceProperty getLod1MultiSurface() {
		if (transportationComplexType.isSetLod1MultiSurface())
			return new MultiSurfacePropertyImpl(transportationComplexType.getLod1MultiSurface());

		return null;
	}

	public MultiSurfaceProperty getLod2MultiSurface() {
		if (transportationComplexType.isSetLod2MultiSurface())
			return new MultiSurfacePropertyImpl(transportationComplexType.getLod2MultiSurface());

		return null;
	}

	public MultiSurfaceProperty getLod3MultiSurface() {
		if (transportationComplexType.isSetLod3MultiSurface())
			return new MultiSurfacePropertyImpl(transportationComplexType.getLod3MultiSurface());

		return null;
	}

	public MultiSurfaceProperty getLod4MultiSurface() {
		if (transportationComplexType.isSetLod4MultiSurface())
			return new MultiSurfacePropertyImpl(transportationComplexType.getLod4MultiSurface());

		return null;
	}

	public List<TrafficAreaProperty> getTrafficArea() {
		List<TrafficAreaProperty> trafficPropertyList = new ArrayList<TrafficAreaProperty>();

		for (TrafficAreaPropertyType trafficPropertyType : transportationComplexType.getTrafficArea())
			trafficPropertyList.add(new TrafficAreaPropertyImpl(trafficPropertyType));

		return trafficPropertyList;
	}

	public List<String> getUsage() {
		return transportationComplexType.getUsage();
	}

	public void setAuxiliaryTrafficArea(List<AuxiliaryTrafficAreaProperty> auxiliaryTrafficArea) {
		List<AuxiliaryTrafficAreaPropertyType> auxPropertyTypeList = new ArrayList<AuxiliaryTrafficAreaPropertyType>();

		for (AuxiliaryTrafficAreaProperty auxProperty : auxiliaryTrafficArea)
			auxPropertyTypeList.add(((AuxiliaryTrafficAreaPropertyImpl)auxProperty).getJAXBObject());

		transportationComplexType.unsetAuxiliaryTrafficArea();
		transportationComplexType.getAuxiliaryTrafficArea().addAll(auxPropertyTypeList);
	}

	public void setFunction(List<String> function) {
		transportationComplexType.unsetFunction();
		transportationComplexType.getFunction().addAll(function);
	}

	public void setLod1MultiSurface(MultiSurfaceProperty lod1MultiSurface) {
		transportationComplexType.setLod1MultiSurface(((MultiSurfacePropertyImpl)lod1MultiSurface).getJAXBObject());
	}

	public void setLod2MultiSurface(MultiSurfaceProperty lod2MultiSurface) {
		transportationComplexType.setLod2MultiSurface(((MultiSurfacePropertyImpl)lod2MultiSurface).getJAXBObject());
	}

	public void setLod3MultiSurface(MultiSurfaceProperty lod3MultiSurface) {
		transportationComplexType.setLod3MultiSurface(((MultiSurfacePropertyImpl)lod3MultiSurface).getJAXBObject());
	}

	public void setLod4MultiSurface(MultiSurfaceProperty lod4MultiSurface) {
		transportationComplexType.setLod4MultiSurface(((MultiSurfacePropertyImpl)lod4MultiSurface).getJAXBObject());
	}

	public void setTrafficArea(List<TrafficAreaProperty> trafficArea) {
		List<TrafficAreaPropertyType> trafficPropertyTypeList = new ArrayList<TrafficAreaPropertyType>();

		for (TrafficAreaProperty trafficProperty : trafficArea)
			trafficPropertyTypeList.add(((TrafficAreaPropertyImpl)trafficProperty).getJAXBObject());

		transportationComplexType.unsetTrafficArea();
		transportationComplexType.getTrafficArea().addAll(trafficPropertyTypeList);
	}

	public void setUsage(List<String> usage) {
		transportationComplexType.unsetUsage();
		transportationComplexType.getUsage().addAll(usage);
	}

	@Override
	public void calcBoundedBy() {
		MultiSurfaceProperty multiSurfaceProperty = null;

		for (int lod = 1; lod < 5; lod++) {
			switch (lod) {
			case 1:
				multiSurfaceProperty = getLod1MultiSurface();
				break;
			case 2:
				multiSurfaceProperty = getLod2MultiSurface();
				break;
			case 3:
				multiSurfaceProperty = getLod3MultiSurface();
				break;
			case 4:
				multiSurfaceProperty = getLod4MultiSurface();
				break;
			}

			if (multiSurfaceProperty != null) {
				MultiSurface multiSurface = multiSurfaceProperty.getMultiSurface();
				if (multiSurface != null) {
					calcBoundedBy(multiSurface);
				} else {
					// xlink?
				}
			}
		}

		// we just consider curve types here!
		if (isSetLod0Network()) {
			for (GeometricComplexProperty geomProperty : getLod0Network()) {
				if (geomProperty.isSetCompositeCurve()) {
					CompositeCurve compositeCurve = geomProperty.getCompositeCurve();
					if (compositeCurve != null)
						calcBoundedBy(compositeCurve);
				}

				else if (geomProperty.isSetGeometricComplex()) {
					GeometricComplex complex = geomProperty.getGeometricComplex();
					if (complex.isSetElement()) {
						for (GeometricPrimitiveProperty primitiveProperty : complex.getElement()) {
							AbstractGeometricPrimitive absPrimitive = primitiveProperty.getGeometricPrimitive();
							if (absPrimitive != null && absPrimitive instanceof AbstractCurveType)
								calcBoundedBy(absPrimitive);
						}
					}
				}
			}
		}

		if (isSetAuxiliaryTrafficArea()) {
			for (AuxiliaryTrafficAreaProperty auxTrafficAreaProperty : getAuxiliaryTrafficArea()) {
				if (auxTrafficAreaProperty.isSetObject()) {
					calcBoundedBy(auxTrafficAreaProperty.getObject());
				} else {
					// xlink?
				}
			}
		}

		if (isSetTrafficArea()) {
			for (TrafficAreaProperty trafficAreaProperty : getTrafficArea()) {
				if (trafficAreaProperty.isSetObject()) {
					calcBoundedBy(trafficAreaProperty.getObject());
				} else {
					// xlink?
				}
			}
		}
	}

	public void addLod0Network(GeometricComplexProperty lod0Network) {
		transportationComplexType.getLod0Network().add(((GeometricComplexPropertyImpl)lod0Network).getJAXBObject());
	}

	public void setLod0Network(List<GeometricComplexProperty> lod0Network) {
		List<GeometricComplexPropertyType> geomPropertyTypeList = new ArrayList<GeometricComplexPropertyType>();

		for (GeometricComplexProperty geomProperty : lod0Network)
			geomPropertyTypeList.add(((GeometricComplexPropertyImpl)geomProperty).getJAXBObject());

		transportationComplexType.unsetLod0Network();
		transportationComplexType.getLod0Network().addAll(geomPropertyTypeList);
	}

	public void addGenericApplicationPropertyOfTransportationComplex(ADEComponent adeObject) {
		JAXBElement<?> jaxbElem = ModelMapper.ADE.toJAXB(adeObject);
		if (jaxbElem != null)
			transportationComplexType.get_GenericApplicationPropertyOfTransportationComplex().add(jaxbElem);
	}

	public List<ADEComponent> getGenericApplicationPropertyOfTransportationComplex() {
		List<ADEComponent> adeList = new ArrayList<ADEComponent>();

		for (JAXBElement<?> elem : transportationComplexType.get_GenericApplicationPropertyOfTransportationComplex()) {
			if (elem.getValue() != null) {
				ADEComponent ade = ModelMapper.ADE.toADEComponent(elem.getValue(), elem.getName());
				if (ade != null)
					adeList.add(ade);
			}
		}

		return adeList;
	}

	public void setGenericApplicationPropertyOfTransportationComplex(List<ADEComponent> adeObject) {
		List<JAXBElement<?>> elemList = new ArrayList<JAXBElement<?>>();

		for (ADEComponent ade : adeObject) {
			JAXBElement<?> elem = ModelMapper.ADE.toJAXB(ade);
			if (elem != null)
				elemList.add(elem);
		}

		if (!elemList.isEmpty()) {
			transportationComplexType.unset_GenericApplicationPropertyOfTransportationComplex();
			transportationComplexType.get_GenericApplicationPropertyOfTransportationComplex().addAll(elemList);
		}
	}

	public boolean isSetAuxiliaryTrafficArea() {
		return transportationComplexType.isSetAuxiliaryTrafficArea();
	}

	public boolean isSetFunction() {
		return transportationComplexType.isSetFunction();
	}

	public boolean isSetGenericApplicationPropertyOfTransportationComplex() {
		return transportationComplexType.isSet_GenericApplicationPropertyOfTransportationComplex();
	}

	public boolean isSetLod0Network() {
		return transportationComplexType.isSetLod0Network();
	}

	public boolean isSetLod1MultiSurface() {
		return transportationComplexType.isSetLod1MultiSurface();
	}

	public boolean isSetLod2MultiSurface() {
		return transportationComplexType.isSetLod2MultiSurface();
	}

	public boolean isSetLod3MultiSurface() {
		return transportationComplexType.isSetLod3MultiSurface();
	}

	public boolean isSetLod4MultiSurface() {
		return transportationComplexType.isSetLod4MultiSurface();
	}

	public boolean isSetTrafficArea() {
		return transportationComplexType.isSetTrafficArea();
	}

	public boolean isSetUsage() {
		return transportationComplexType.isSetUsage();
	}

	public void unsetAuxiliaryTrafficArea() {
		transportationComplexType.unsetAuxiliaryTrafficArea();
	}

	public void unsetFunction() {
		transportationComplexType.unsetFunction();
	}

	public void unsetGenericApplicationPropertyOfTransportationComplex() {
		transportationComplexType.unset_GenericApplicationPropertyOfTransportationComplex();
	}

	public void unsetLod0Network() {
		transportationComplexType.unsetLod0Network();
	}

	public void unsetLod1MultiSurface() {
		transportationComplexType.setLod1MultiSurface(null);
	}

	public void unsetLod2MultiSurface() {
		transportationComplexType.setLod2MultiSurface(null);
	}

	public void unsetLod3MultiSurface() {
		transportationComplexType.setLod3MultiSurface(null);
	}

	public void unsetLod4MultiSurface() {
		transportationComplexType.setLod4MultiSurface(null);
	}

	public void unsetTrafficArea() {
		transportationComplexType.unsetTrafficArea();
	}

	public void unsetUsage() {
		transportationComplexType.unsetUsage();
	}
	
	public boolean unsetAuxiliaryTrafficArea(AuxiliaryTrafficAreaProperty auxiliaryTrafficArea) {
		if (transportationComplexType.isSetAuxiliaryTrafficArea())
			return transportationComplexType.getAuxiliaryTrafficArea().remove(((AuxiliaryTrafficAreaPropertyImpl)auxiliaryTrafficArea).getJAXBObject());

		return false;
	}

	public boolean unsetFunction(String function) {
		if (transportationComplexType.isSetFunction())
			return transportationComplexType.getFunction().remove(function);
		
		return false;
	}

	public boolean unsetGenericApplicationPropertyOfTransportationComplex(ADEComponent adeObject) {
		if (transportationComplexType.isSet_GenericApplicationPropertyOfTransportationComplex()) {
			Iterator<JAXBElement<?>> iter = transportationComplexType.get_GenericApplicationPropertyOfTransportationComplex().iterator();
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

	public boolean unsetLod0Network(GeometricComplexProperty lod0Network) {
		if (transportationComplexType.isSetLod0Network())
			return transportationComplexType.getLod0Network().remove(((GeometricComplexPropertyImpl)lod0Network).getJAXBObject());
		
		return false;
	}

	public boolean unsetTrafficArea(TrafficAreaProperty trafficArea) {
		if (transportationComplexType.isSetTrafficArea())
			return transportationComplexType.getTrafficArea().remove(((TrafficAreaPropertyImpl)trafficArea).getJAXBObject());
		
		return false;
	}

	public boolean unsetUsage(String usage) {
		if (transportationComplexType.isSetUsage())
			return transportationComplexType.getUsage().remove(usage);
		
		return false;
	}
	
}