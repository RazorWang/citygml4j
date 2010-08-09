package org.citygml4j.visitor;

import org.citygml4j.model.xal.Address;
import org.citygml4j.model.xal.AddressDetails;
import org.citygml4j.model.xal.AddressIdentifier;
import org.citygml4j.model.xal.AddressLatitude;
import org.citygml4j.model.xal.AddressLatitudeDirection;
import org.citygml4j.model.xal.AddressLine;
import org.citygml4j.model.xal.AddressLines;
import org.citygml4j.model.xal.AddressLongitude;
import org.citygml4j.model.xal.AddressLongitudeDirection;
import org.citygml4j.model.xal.AdministrativeArea;
import org.citygml4j.model.xal.AdministrativeAreaName;
import org.citygml4j.model.xal.Barcode;
import org.citygml4j.model.xal.BuildingName;
import org.citygml4j.model.xal.Country;
import org.citygml4j.model.xal.CountryName;
import org.citygml4j.model.xal.CountryNameCode;
import org.citygml4j.model.xal.Department;
import org.citygml4j.model.xal.DepartmentName;
import org.citygml4j.model.xal.DependentLocality;
import org.citygml4j.model.xal.DependentLocalityName;
import org.citygml4j.model.xal.DependentLocalityNumber;
import org.citygml4j.model.xal.DependentThoroughfare;
import org.citygml4j.model.xal.EndorsementLineCode;
import org.citygml4j.model.xal.Firm;
import org.citygml4j.model.xal.FirmName;
import org.citygml4j.model.xal.KeyLineCode;
import org.citygml4j.model.xal.LargeMailUser;
import org.citygml4j.model.xal.LargeMailUserIdentifier;
import org.citygml4j.model.xal.LargeMailUserName;
import org.citygml4j.model.xal.Locality;
import org.citygml4j.model.xal.LocalityName;
import org.citygml4j.model.xal.MailStop;
import org.citygml4j.model.xal.MailStopName;
import org.citygml4j.model.xal.MailStopNumber;
import org.citygml4j.model.xal.PostBox;
import org.citygml4j.model.xal.PostBoxNumber;
import org.citygml4j.model.xal.PostBoxNumberExtension;
import org.citygml4j.model.xal.PostBoxNumberPrefix;
import org.citygml4j.model.xal.PostBoxNumberSuffix;
import org.citygml4j.model.xal.PostOffice;
import org.citygml4j.model.xal.PostOfficeName;
import org.citygml4j.model.xal.PostOfficeNumber;
import org.citygml4j.model.xal.PostTown;
import org.citygml4j.model.xal.PostTownName;
import org.citygml4j.model.xal.PostTownSuffix;
import org.citygml4j.model.xal.PostalCode;
import org.citygml4j.model.xal.PostalCodeNumber;
import org.citygml4j.model.xal.PostalCodeNumberExtension;
import org.citygml4j.model.xal.PostalRoute;
import org.citygml4j.model.xal.PostalRouteName;
import org.citygml4j.model.xal.PostalRouteNumber;
import org.citygml4j.model.xal.PostalServiceElements;
import org.citygml4j.model.xal.Premise;
import org.citygml4j.model.xal.PremiseLocation;
import org.citygml4j.model.xal.PremiseName;
import org.citygml4j.model.xal.PremiseNumber;
import org.citygml4j.model.xal.PremiseNumberPrefix;
import org.citygml4j.model.xal.PremiseNumberRange;
import org.citygml4j.model.xal.PremiseNumberRangeFrom;
import org.citygml4j.model.xal.PremiseNumberRangeTo;
import org.citygml4j.model.xal.PremiseNumberSuffix;
import org.citygml4j.model.xal.SortingCode;
import org.citygml4j.model.xal.SubAdministrativeArea;
import org.citygml4j.model.xal.SubAdministrativeAreaName;
import org.citygml4j.model.xal.SubPremise;
import org.citygml4j.model.xal.SubPremiseLocation;
import org.citygml4j.model.xal.SubPremiseName;
import org.citygml4j.model.xal.SubPremiseNumber;
import org.citygml4j.model.xal.SubPremiseNumberPrefix;
import org.citygml4j.model.xal.SubPremiseNumberSuffix;
import org.citygml4j.model.xal.SupplementaryPostalServiceData;
import org.citygml4j.model.xal.Thoroughfare;
import org.citygml4j.model.xal.ThoroughfareLeadingType;
import org.citygml4j.model.xal.ThoroughfareName;
import org.citygml4j.model.xal.ThoroughfareNumber;
import org.citygml4j.model.xal.ThoroughfareNumberFrom;
import org.citygml4j.model.xal.ThoroughfareNumberPrefix;
import org.citygml4j.model.xal.ThoroughfareNumberRange;
import org.citygml4j.model.xal.ThoroughfareNumberSuffix;
import org.citygml4j.model.xal.ThoroughfareNumberTo;
import org.citygml4j.model.xal.ThoroughfarePostDirection;
import org.citygml4j.model.xal.ThoroughfarePreDirection;
import org.citygml4j.model.xal.ThoroughfareTrailingType;

public interface XALFunction<T> {
	public T accept(Address address);
	public T accept(AddressDetails addressDetails);
	public T accept(AddressIdentifier addressIdentifier);
	public T accept(AddressLatitude addressLatitude);
	public T accept(AddressLatitudeDirection addressLatitudeDirection);
	public T accept(AddressLine addressLine);
	public T accept(AddressLines addressLines);
	public T accept(AddressLongitude addressLongitude);
	public T accept(AddressLongitudeDirection addressLongitudeDirection);
	public T accept(AdministrativeArea administrativeArea);
	public T accept(AdministrativeAreaName administrativeAreaName);
	public T accept(Barcode barcode);
	public T accept(BuildingName buildingName);
	public T accept(Country country);
	public T accept(CountryName countryName);
	public T accept(CountryNameCode countryNameCode);
	public T accept(Department department);
	public T accept(DepartmentName departmentName);
	public T accept(DependentLocality dependentLocality);
	public T accept(DependentLocalityName dependentLocalityName);
	public T accept(DependentLocalityNumber dependentLocalityNumber);
	public T accept(DependentThoroughfare dependentThoroughfare);
	public T accept(EndorsementLineCode endorsementLineCode);
	public T accept(Firm firm);
	public T accept(FirmName firmName);
	public T accept(KeyLineCode keyLineCode);
	public T accept(LargeMailUser largeMailUser);
	public T accept(LargeMailUserIdentifier largeMailUserIdentifier);
	public T accept(LargeMailUserName largeMailUserName);
	public T accept(Locality locality);
	public T accept(LocalityName localityName);
	public T accept(MailStop mailStop);
	public T accept(MailStopName mailStopName);
	public T accept(MailStopNumber mailStopNumber);
	public T accept(PostalCode postalCode);
	public T accept(PostalCodeNumber postalCodeNumber);
	public T accept(PostalCodeNumberExtension postalCodeNumberExtension);
	public T accept(PostalRoute postalRoute);
	public T accept(PostalRouteName postalRouteName);
	public T accept(PostalRouteNumber postalRouteNumber);
	public T accept(PostalServiceElements postalServiceElements);
	public T accept(PostBox postBox);
	public T accept(PostBoxNumber postBoxNumber);
	public T accept(PostBoxNumberExtension postBoxNumberExtension);
	public T accept(PostBoxNumberPrefix postBoxNumberPrefix);
	public T accept(PostBoxNumberSuffix postBoxNumberSuffix);
	public T accept(PostOffice postOffice);
	public T accept(PostOfficeName postOfficeName);
	public T accept(PostOfficeNumber postOfficeNumber);
	public T accept(PostTown postTown);
	public T accept(PostTownName postTownName);
	public T accept(PostTownSuffix postTownSuffix);
	public T accept(Premise premise);
	public T accept(PremiseLocation premiseLocation);
	public T accept(PremiseName premiseName);
	public T accept(PremiseNumber premiseNumber);
	public T accept(PremiseNumberPrefix premiseNumberPrefix);
	public T accept(PremiseNumberRange premiseNumberRange);
	public T accept(PremiseNumberRangeFrom premiseNumberRangeFrom);
	public T accept(PremiseNumberRangeTo premiseNumberRangeTo);
	public T accept(PremiseNumberSuffix premiseNumberSuffix);
	public T accept(SortingCode sortingCode);
	public T accept(SubAdministrativeArea subAdministrativeArea);
	public T accept(SubAdministrativeAreaName subAdministrativeAreaName);
	public T accept(SubPremise subPremise);
	public T accept(SubPremiseLocation subPremiseLocation);
	public T accept(SubPremiseName subPremiseName);
	public T accept(SubPremiseNumber subPremiseNumber);
	public T accept(SubPremiseNumberPrefix subPremiseNumberPrefix);
	public T accept(SubPremiseNumberSuffix subPremiseNumberSuffix);
	public T accept(SupplementaryPostalServiceData supplementaryPostalServiceData);
	public T accept(Thoroughfare thoroughfare);
	public T accept(ThoroughfareLeadingType thoroughfareLeadingType);
	public T accept(ThoroughfareName thoroughfareName);
	public T accept(ThoroughfareNumber thoroughfareNumber);
	public T accept(ThoroughfareNumberFrom thoroughfareNumberFrom);
	public T accept(ThoroughfareNumberPrefix thoroughfareNumberPrefix);
	public T accept(ThoroughfareNumberRange thoroughfareNumberRange);
	public T accept(ThoroughfareNumberSuffix thoroughfareNumberSuffix);
	public T accept(ThoroughfareNumberTo thoroughfareNumberTo);
	public T accept(ThoroughfarePostDirection thoroughfarePostDirection);
	public T accept(ThoroughfarePreDirection thoroughfarePreDirection);
	public T accept(ThoroughfareTrailingType thoroughfareTrailingType);
}