
package com.wushuo.p6.UserPortType;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>User complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="User">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AllResourceAccessFlag" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="AssignmentStaffingPreference" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value=""/>
 *               &lt;enumeration value="New"/>
 *               &lt;enumeration value="Existing"/>
 *               &lt;enumeration value="Ask Me"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="CreateDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="CreateUser" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CurrencyId" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="6"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="CurrencyName" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="80"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="CurrencyObjectId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="CurrencyShowDecimals" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="CurrencyShowSymbol" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="DateFormatType" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="Month, Day, Year"/>
 *               &lt;enumeration value="Day, Month, Year"/>
 *               &lt;enumeration value="Year, Month, Day"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="DateSeparator" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="/"/>
 *               &lt;enumeration value="-"/>
 *               &lt;enumeration value="."/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="DateShowFourDigitYear" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="DateShowMinutes" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="DateTimeFormatType" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="12 hour (1:30 PM)"/>
 *               &lt;enumeration value="24 hour (13:30)"/>
 *               &lt;enumeration value="Do not show time"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="DateUseLeadingZero" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="DateUseMonthName" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="DurationDecimalCount" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="0"/>
 *               &lt;enumeration value="1"/>
 *               &lt;enumeration value="2"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="DurationUnitType" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="Hour"/>
 *               &lt;enumeration value="Day"/>
 *               &lt;enumeration value="Week"/>
 *               &lt;enumeration value="Month"/>
 *               &lt;enumeration value="Year"/>
 *               &lt;enumeration value="Days Hours"/>
 *               &lt;enumeration value="Hours Minutes"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="DurationUseFraction" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="EmailAddress" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="255"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="EmailProtocol" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="Internet Mail"/>
 *               &lt;enumeration value="MAPI Mail"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="EnableUserToModifyViewSettingsFlag" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="FinancialPeriodEndObjectId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="FinancialPeriodStartObjectId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="GUID" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;pattern value="\{[0-9a-fA-F]{8}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{12}\}|"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="GlobalProfileObjectId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="LastUpdateDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="LastUpdateUser" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MailServerLoginName" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="255"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Name" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="255"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="NewProjectDurationType" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="Fixed Units/Time"/>
 *               &lt;enumeration value="Fixed Duration and Units/Time"/>
 *               &lt;enumeration value="Fixed Units"/>
 *               &lt;enumeration value="Fixed Duration and Units"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ObjectId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="OfficePhone" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="32"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="OutgoingMailServer" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="120"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="PersonalName" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="255"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="RateSourcePreference" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value=""/>
 *               &lt;enumeration value="Resource"/>
 *               &lt;enumeration value="Role"/>
 *               &lt;enumeration value="Ask Me"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ReportingFlag" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="RespectActivityDurationType" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="RoleLimitDisplayOption" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="Custom Role Limit"/>
 *               &lt;enumeration value="Calculated Primary Resources Limit"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ShowDurationTimeUnit" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ShowTimeUnit" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="SmallScaleDecimalCount" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="0"/>
 *               &lt;enumeration value="1"/>
 *               &lt;enumeration value="2"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="SmallScaleUnitType" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="Hour"/>
 *               &lt;enumeration value="Day"/>
 *               &lt;enumeration value="Week"/>
 *               &lt;enumeration value="Month"/>
 *               &lt;enumeration value="Year"/>
 *               &lt;enumeration value="Days Hours"/>
 *               &lt;enumeration value="Hours Minutes"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="SmallScaleUseFraction" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="TMSelectedActivityFilters" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TMSelectedActivityFiltersJoin" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TMSelectedTimesheetFilters" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TeamMemberActivityFilters" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TeamMemberActivityFiltersJoin" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TeamMemberActivitySortField" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TeamMemberActivitySortOrder" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TeamMemberApplicationTheme" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TeamMemberDateFormat" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TeamMemberDisplayQRQuickAccess" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TeamMemberDisplayTimeFlag" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="TeamMemberDisplayTimeFormat" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TeamMemberLocale" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TeamMemberProjectFilter" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TeamMemberResourceFilter" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TeamMemberTaskStatusFilter" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TeamMemberTimeframeFilter" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TeamMemberWBSFilter" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TeamMemberWorkUnitType" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="Hour"/>
 *               &lt;enumeration value="Day"/>
 *               &lt;enumeration value="Week"/>
 *               &lt;enumeration value="Month"/>
 *               &lt;enumeration value="Year"/>
 *               &lt;enumeration value="Days Hours"/>
 *               &lt;enumeration value="Hours Minutes"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="UnitsPerTimeShowAsPercentage" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="UserInterfaceViewObjectId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ResourceRequests" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="ResourceRequest" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="FinishDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *                             &lt;element name="MatchAllCriteria" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *                             &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="RequestedUnits" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *                             &lt;element name="SequenceNumber" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                             &lt;element name="ShowOnlyLaborResources" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *                             &lt;element name="ShowOverallocatedResources" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *                             &lt;element name="SortResultsByAvailability" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *                             &lt;element name="StartDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *                             &lt;element name="UseActivityDates" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *                             &lt;element name="ResourceRequestCriterion" maxOccurs="unbounded" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="CriterionType">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                             &lt;enumeration value="Primary Role"/>
 *                                             &lt;enumeration value="Role"/>
 *                                             &lt;enumeration value="Resource"/>
 *                                             &lt;enumeration value="Resource Code"/>
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/element>
 *                                       &lt;element name="Proficiency" minOccurs="0">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                             &lt;enumeration value="1 - Master"/>
 *                                             &lt;enumeration value="2 - Expert"/>
 *                                             &lt;enumeration value="3 - Skilled"/>
 *                                             &lt;enumeration value="4 - Proficient"/>
 *                                             &lt;enumeration value="5 - Inexperienced"/>
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/element>
 *                                       &lt;element name="ValueObjectId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "User", propOrder = {
    "allResourceAccessFlag",
    "assignmentStaffingPreference",
    "createDate",
    "createUser",
    "currencyId",
    "currencyName",
    "currencyObjectId",
    "currencyShowDecimals",
    "currencyShowSymbol",
    "dateFormatType",
    "dateSeparator",
    "dateShowFourDigitYear",
    "dateShowMinutes",
    "dateTimeFormatType",
    "dateUseLeadingZero",
    "dateUseMonthName",
    "durationDecimalCount",
    "durationUnitType",
    "durationUseFraction",
    "emailAddress",
    "emailProtocol",
    "enableUserToModifyViewSettingsFlag",
    "financialPeriodEndObjectId",
    "financialPeriodStartObjectId",
    "guid",
    "globalProfileObjectId",
    "lastUpdateDate",
    "lastUpdateUser",
    "mailServerLoginName",
    "name",
    "newProjectDurationType",
    "objectId",
    "officePhone",
    "outgoingMailServer",
    "personalName",
    "rateSourcePreference",
    "reportingFlag",
    "respectActivityDurationType",
    "roleLimitDisplayOption",
    "showDurationTimeUnit",
    "showTimeUnit",
    "smallScaleDecimalCount",
    "smallScaleUnitType",
    "smallScaleUseFraction",
    "tmSelectedActivityFilters",
    "tmSelectedActivityFiltersJoin",
    "tmSelectedTimesheetFilters",
    "teamMemberActivityFilters",
    "teamMemberActivityFiltersJoin",
    "teamMemberActivitySortField",
    "teamMemberActivitySortOrder",
    "teamMemberApplicationTheme",
    "teamMemberDateFormat",
    "teamMemberDisplayQRQuickAccess",
    "teamMemberDisplayTimeFlag",
    "teamMemberDisplayTimeFormat",
    "teamMemberLocale",
    "teamMemberProjectFilter",
    "teamMemberResourceFilter",
    "teamMemberTaskStatusFilter",
    "teamMemberTimeframeFilter",
    "teamMemberWBSFilter",
    "teamMemberWorkUnitType",
    "unitsPerTimeShowAsPercentage",
    "userInterfaceViewObjectId",
    "resourceRequests"
})
public class User {

    @XmlElement(name = "AllResourceAccessFlag")
    protected Boolean allResourceAccessFlag;
    @XmlElement(name = "AssignmentStaffingPreference")
    protected String assignmentStaffingPreference;
    @XmlElementRef(name = "CreateDate", namespace = "http://xmlns.oracle.com/Primavera/P6/WS/User/V1", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> createDate;
    @XmlElement(name = "CreateUser")
    protected String createUser;
    @XmlElement(name = "CurrencyId")
    protected String currencyId;
    @XmlElement(name = "CurrencyName")
    protected String currencyName;
    @XmlElement(name = "CurrencyObjectId")
    protected Integer currencyObjectId;
    @XmlElementRef(name = "CurrencyShowDecimals", namespace = "http://xmlns.oracle.com/Primavera/P6/WS/User/V1", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> currencyShowDecimals;
    @XmlElementRef(name = "CurrencyShowSymbol", namespace = "http://xmlns.oracle.com/Primavera/P6/WS/User/V1", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> currencyShowSymbol;
    @XmlElement(name = "DateFormatType")
    protected String dateFormatType;
    @XmlElement(name = "DateSeparator")
    protected String dateSeparator;
    @XmlElementRef(name = "DateShowFourDigitYear", namespace = "http://xmlns.oracle.com/Primavera/P6/WS/User/V1", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> dateShowFourDigitYear;
    @XmlElementRef(name = "DateShowMinutes", namespace = "http://xmlns.oracle.com/Primavera/P6/WS/User/V1", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> dateShowMinutes;
    @XmlElement(name = "DateTimeFormatType")
    protected String dateTimeFormatType;
    @XmlElementRef(name = "DateUseLeadingZero", namespace = "http://xmlns.oracle.com/Primavera/P6/WS/User/V1", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> dateUseLeadingZero;
    @XmlElementRef(name = "DateUseMonthName", namespace = "http://xmlns.oracle.com/Primavera/P6/WS/User/V1", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> dateUseMonthName;
    @XmlElement(name = "DurationDecimalCount")
    protected String durationDecimalCount;
    @XmlElement(name = "DurationUnitType")
    protected String durationUnitType;
    @XmlElementRef(name = "DurationUseFraction", namespace = "http://xmlns.oracle.com/Primavera/P6/WS/User/V1", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> durationUseFraction;
    @XmlElement(name = "EmailAddress")
    protected String emailAddress;
    @XmlElement(name = "EmailProtocol")
    protected String emailProtocol;
    @XmlElementRef(name = "EnableUserToModifyViewSettingsFlag", namespace = "http://xmlns.oracle.com/Primavera/P6/WS/User/V1", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> enableUserToModifyViewSettingsFlag;
    @XmlElementRef(name = "FinancialPeriodEndObjectId", namespace = "http://xmlns.oracle.com/Primavera/P6/WS/User/V1", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> financialPeriodEndObjectId;
    @XmlElementRef(name = "FinancialPeriodStartObjectId", namespace = "http://xmlns.oracle.com/Primavera/P6/WS/User/V1", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> financialPeriodStartObjectId;
    @XmlElement(name = "GUID")
    protected String guid;
    @XmlElement(name = "GlobalProfileObjectId")
    protected Integer globalProfileObjectId;
    @XmlElementRef(name = "LastUpdateDate", namespace = "http://xmlns.oracle.com/Primavera/P6/WS/User/V1", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> lastUpdateDate;
    @XmlElement(name = "LastUpdateUser")
    protected String lastUpdateUser;
    @XmlElement(name = "MailServerLoginName")
    protected String mailServerLoginName;
    @XmlElement(name = "Name")
    protected String name;
    @XmlElement(name = "NewProjectDurationType")
    protected String newProjectDurationType;
    @XmlElement(name = "ObjectId")
    protected Integer objectId;
    @XmlElement(name = "OfficePhone")
    protected String officePhone;
    @XmlElement(name = "OutgoingMailServer")
    protected String outgoingMailServer;
    @XmlElement(name = "PersonalName")
    protected String personalName;
    @XmlElement(name = "RateSourcePreference")
    protected String rateSourcePreference;
    @XmlElementRef(name = "ReportingFlag", namespace = "http://xmlns.oracle.com/Primavera/P6/WS/User/V1", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> reportingFlag;
    @XmlElementRef(name = "RespectActivityDurationType", namespace = "http://xmlns.oracle.com/Primavera/P6/WS/User/V1", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> respectActivityDurationType;
    @XmlElement(name = "RoleLimitDisplayOption")
    protected String roleLimitDisplayOption;
    @XmlElementRef(name = "ShowDurationTimeUnit", namespace = "http://xmlns.oracle.com/Primavera/P6/WS/User/V1", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> showDurationTimeUnit;
    @XmlElementRef(name = "ShowTimeUnit", namespace = "http://xmlns.oracle.com/Primavera/P6/WS/User/V1", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> showTimeUnit;
    @XmlElement(name = "SmallScaleDecimalCount")
    protected String smallScaleDecimalCount;
    @XmlElement(name = "SmallScaleUnitType")
    protected String smallScaleUnitType;
    @XmlElementRef(name = "SmallScaleUseFraction", namespace = "http://xmlns.oracle.com/Primavera/P6/WS/User/V1", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> smallScaleUseFraction;
    @XmlElement(name = "TMSelectedActivityFilters")
    protected String tmSelectedActivityFilters;
    @XmlElement(name = "TMSelectedActivityFiltersJoin")
    protected String tmSelectedActivityFiltersJoin;
    @XmlElement(name = "TMSelectedTimesheetFilters")
    protected String tmSelectedTimesheetFilters;
    @XmlElement(name = "TeamMemberActivityFilters")
    protected String teamMemberActivityFilters;
    @XmlElement(name = "TeamMemberActivityFiltersJoin")
    protected String teamMemberActivityFiltersJoin;
    @XmlElement(name = "TeamMemberActivitySortField")
    protected String teamMemberActivitySortField;
    @XmlElement(name = "TeamMemberActivitySortOrder")
    protected String teamMemberActivitySortOrder;
    @XmlElement(name = "TeamMemberApplicationTheme")
    protected String teamMemberApplicationTheme;
    @XmlElement(name = "TeamMemberDateFormat")
    protected String teamMemberDateFormat;
    @XmlElement(name = "TeamMemberDisplayQRQuickAccess")
    protected String teamMemberDisplayQRQuickAccess;
    @XmlElement(name = "TeamMemberDisplayTimeFlag")
    protected Boolean teamMemberDisplayTimeFlag;
    @XmlElement(name = "TeamMemberDisplayTimeFormat")
    protected String teamMemberDisplayTimeFormat;
    @XmlElement(name = "TeamMemberLocale")
    protected String teamMemberLocale;
    @XmlElement(name = "TeamMemberProjectFilter")
    protected String teamMemberProjectFilter;
    @XmlElement(name = "TeamMemberResourceFilter")
    protected String teamMemberResourceFilter;
    @XmlElement(name = "TeamMemberTaskStatusFilter")
    protected String teamMemberTaskStatusFilter;
    @XmlElement(name = "TeamMemberTimeframeFilter")
    protected String teamMemberTimeframeFilter;
    @XmlElement(name = "TeamMemberWBSFilter")
    protected String teamMemberWBSFilter;
    @XmlElement(name = "TeamMemberWorkUnitType")
    protected String teamMemberWorkUnitType;
    @XmlElementRef(name = "UnitsPerTimeShowAsPercentage", namespace = "http://xmlns.oracle.com/Primavera/P6/WS/User/V1", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> unitsPerTimeShowAsPercentage;
    @XmlElementRef(name = "UserInterfaceViewObjectId", namespace = "http://xmlns.oracle.com/Primavera/P6/WS/User/V1", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> userInterfaceViewObjectId;
    @XmlElementRef(name = "ResourceRequests", namespace = "http://xmlns.oracle.com/Primavera/P6/WS/User/V1", type = JAXBElement.class, required = false)
    protected JAXBElement<User.ResourceRequests> resourceRequests;

    /**
     * 获取allResourceAccessFlag属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAllResourceAccessFlag() {
        return allResourceAccessFlag;
    }

    /**
     * 设置allResourceAccessFlag属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAllResourceAccessFlag(Boolean value) {
        this.allResourceAccessFlag = value;
    }

    /**
     * 获取assignmentStaffingPreference属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssignmentStaffingPreference() {
        return assignmentStaffingPreference;
    }

    /**
     * 设置assignmentStaffingPreference属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAssignmentStaffingPreference(String value) {
        this.assignmentStaffingPreference = value;
    }

    /**
     * 获取createDate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getCreateDate() {
        return createDate;
    }

    /**
     * 设置createDate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setCreateDate(JAXBElement<XMLGregorianCalendar> value) {
        this.createDate = value;
    }

    /**
     * 获取createUser属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreateUser() {
        return createUser;
    }

    /**
     * 设置createUser属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreateUser(String value) {
        this.createUser = value;
    }

    /**
     * 获取currencyId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrencyId() {
        return currencyId;
    }

    /**
     * 设置currencyId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrencyId(String value) {
        this.currencyId = value;
    }

    /**
     * 获取currencyName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrencyName() {
        return currencyName;
    }

    /**
     * 设置currencyName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrencyName(String value) {
        this.currencyName = value;
    }

    /**
     * 获取currencyObjectId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCurrencyObjectId() {
        return currencyObjectId;
    }

    /**
     * 设置currencyObjectId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCurrencyObjectId(Integer value) {
        this.currencyObjectId = value;
    }

    /**
     * 获取currencyShowDecimals属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getCurrencyShowDecimals() {
        return currencyShowDecimals;
    }

    /**
     * 设置currencyShowDecimals属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setCurrencyShowDecimals(JAXBElement<Boolean> value) {
        this.currencyShowDecimals = value;
    }

    /**
     * 获取currencyShowSymbol属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getCurrencyShowSymbol() {
        return currencyShowSymbol;
    }

    /**
     * 设置currencyShowSymbol属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setCurrencyShowSymbol(JAXBElement<Boolean> value) {
        this.currencyShowSymbol = value;
    }

    /**
     * 获取dateFormatType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDateFormatType() {
        return dateFormatType;
    }

    /**
     * 设置dateFormatType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDateFormatType(String value) {
        this.dateFormatType = value;
    }

    /**
     * 获取dateSeparator属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDateSeparator() {
        return dateSeparator;
    }

    /**
     * 设置dateSeparator属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDateSeparator(String value) {
        this.dateSeparator = value;
    }

    /**
     * 获取dateShowFourDigitYear属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getDateShowFourDigitYear() {
        return dateShowFourDigitYear;
    }

    /**
     * 设置dateShowFourDigitYear属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setDateShowFourDigitYear(JAXBElement<Boolean> value) {
        this.dateShowFourDigitYear = value;
    }

    /**
     * 获取dateShowMinutes属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getDateShowMinutes() {
        return dateShowMinutes;
    }

    /**
     * 设置dateShowMinutes属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setDateShowMinutes(JAXBElement<Boolean> value) {
        this.dateShowMinutes = value;
    }

    /**
     * 获取dateTimeFormatType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDateTimeFormatType() {
        return dateTimeFormatType;
    }

    /**
     * 设置dateTimeFormatType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDateTimeFormatType(String value) {
        this.dateTimeFormatType = value;
    }

    /**
     * 获取dateUseLeadingZero属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getDateUseLeadingZero() {
        return dateUseLeadingZero;
    }

    /**
     * 设置dateUseLeadingZero属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setDateUseLeadingZero(JAXBElement<Boolean> value) {
        this.dateUseLeadingZero = value;
    }

    /**
     * 获取dateUseMonthName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getDateUseMonthName() {
        return dateUseMonthName;
    }

    /**
     * 设置dateUseMonthName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setDateUseMonthName(JAXBElement<Boolean> value) {
        this.dateUseMonthName = value;
    }

    /**
     * 获取durationDecimalCount属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDurationDecimalCount() {
        return durationDecimalCount;
    }

    /**
     * 设置durationDecimalCount属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDurationDecimalCount(String value) {
        this.durationDecimalCount = value;
    }

    /**
     * 获取durationUnitType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDurationUnitType() {
        return durationUnitType;
    }

    /**
     * 设置durationUnitType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDurationUnitType(String value) {
        this.durationUnitType = value;
    }

    /**
     * 获取durationUseFraction属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getDurationUseFraction() {
        return durationUseFraction;
    }

    /**
     * 设置durationUseFraction属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setDurationUseFraction(JAXBElement<Boolean> value) {
        this.durationUseFraction = value;
    }

    /**
     * 获取emailAddress属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmailAddress() {
        return emailAddress;
    }

    /**
     * 设置emailAddress属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmailAddress(String value) {
        this.emailAddress = value;
    }

    /**
     * 获取emailProtocol属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmailProtocol() {
        return emailProtocol;
    }

    /**
     * 设置emailProtocol属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmailProtocol(String value) {
        this.emailProtocol = value;
    }

    /**
     * 获取enableUserToModifyViewSettingsFlag属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getEnableUserToModifyViewSettingsFlag() {
        return enableUserToModifyViewSettingsFlag;
    }

    /**
     * 设置enableUserToModifyViewSettingsFlag属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setEnableUserToModifyViewSettingsFlag(JAXBElement<Boolean> value) {
        this.enableUserToModifyViewSettingsFlag = value;
    }

    /**
     * 获取financialPeriodEndObjectId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getFinancialPeriodEndObjectId() {
        return financialPeriodEndObjectId;
    }

    /**
     * 设置financialPeriodEndObjectId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setFinancialPeriodEndObjectId(JAXBElement<Integer> value) {
        this.financialPeriodEndObjectId = value;
    }

    /**
     * 获取financialPeriodStartObjectId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getFinancialPeriodStartObjectId() {
        return financialPeriodStartObjectId;
    }

    /**
     * 设置financialPeriodStartObjectId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setFinancialPeriodStartObjectId(JAXBElement<Integer> value) {
        this.financialPeriodStartObjectId = value;
    }

    /**
     * 获取guid属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGUID() {
        return guid;
    }

    /**
     * 设置guid属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGUID(String value) {
        this.guid = value;
    }

    /**
     * 获取globalProfileObjectId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getGlobalProfileObjectId() {
        return globalProfileObjectId;
    }

    /**
     * 设置globalProfileObjectId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setGlobalProfileObjectId(Integer value) {
        this.globalProfileObjectId = value;
    }

    /**
     * 获取lastUpdateDate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getLastUpdateDate() {
        return lastUpdateDate;
    }

    /**
     * 设置lastUpdateDate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setLastUpdateDate(JAXBElement<XMLGregorianCalendar> value) {
        this.lastUpdateDate = value;
    }

    /**
     * 获取lastUpdateUser属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastUpdateUser() {
        return lastUpdateUser;
    }

    /**
     * 设置lastUpdateUser属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastUpdateUser(String value) {
        this.lastUpdateUser = value;
    }

    /**
     * 获取mailServerLoginName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMailServerLoginName() {
        return mailServerLoginName;
    }

    /**
     * 设置mailServerLoginName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMailServerLoginName(String value) {
        this.mailServerLoginName = value;
    }

    /**
     * 获取name属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * 设置name属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * 获取newProjectDurationType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNewProjectDurationType() {
        return newProjectDurationType;
    }

    /**
     * 设置newProjectDurationType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNewProjectDurationType(String value) {
        this.newProjectDurationType = value;
    }

    /**
     * 获取objectId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getObjectId() {
        return objectId;
    }

    /**
     * 设置objectId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setObjectId(Integer value) {
        this.objectId = value;
    }

    /**
     * 获取officePhone属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOfficePhone() {
        return officePhone;
    }

    /**
     * 设置officePhone属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOfficePhone(String value) {
        this.officePhone = value;
    }

    /**
     * 获取outgoingMailServer属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutgoingMailServer() {
        return outgoingMailServer;
    }

    /**
     * 设置outgoingMailServer属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutgoingMailServer(String value) {
        this.outgoingMailServer = value;
    }

    /**
     * 获取personalName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPersonalName() {
        return personalName;
    }

    /**
     * 设置personalName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPersonalName(String value) {
        this.personalName = value;
    }

    /**
     * 获取rateSourcePreference属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRateSourcePreference() {
        return rateSourcePreference;
    }

    /**
     * 设置rateSourcePreference属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRateSourcePreference(String value) {
        this.rateSourcePreference = value;
    }

    /**
     * 获取reportingFlag属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getReportingFlag() {
        return reportingFlag;
    }

    /**
     * 设置reportingFlag属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setReportingFlag(JAXBElement<Boolean> value) {
        this.reportingFlag = value;
    }

    /**
     * 获取respectActivityDurationType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getRespectActivityDurationType() {
        return respectActivityDurationType;
    }

    /**
     * 设置respectActivityDurationType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setRespectActivityDurationType(JAXBElement<Boolean> value) {
        this.respectActivityDurationType = value;
    }

    /**
     * 获取roleLimitDisplayOption属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRoleLimitDisplayOption() {
        return roleLimitDisplayOption;
    }

    /**
     * 设置roleLimitDisplayOption属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRoleLimitDisplayOption(String value) {
        this.roleLimitDisplayOption = value;
    }

    /**
     * 获取showDurationTimeUnit属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getShowDurationTimeUnit() {
        return showDurationTimeUnit;
    }

    /**
     * 设置showDurationTimeUnit属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setShowDurationTimeUnit(JAXBElement<Boolean> value) {
        this.showDurationTimeUnit = value;
    }

    /**
     * 获取showTimeUnit属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getShowTimeUnit() {
        return showTimeUnit;
    }

    /**
     * 设置showTimeUnit属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setShowTimeUnit(JAXBElement<Boolean> value) {
        this.showTimeUnit = value;
    }

    /**
     * 获取smallScaleDecimalCount属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSmallScaleDecimalCount() {
        return smallScaleDecimalCount;
    }

    /**
     * 设置smallScaleDecimalCount属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSmallScaleDecimalCount(String value) {
        this.smallScaleDecimalCount = value;
    }

    /**
     * 获取smallScaleUnitType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSmallScaleUnitType() {
        return smallScaleUnitType;
    }

    /**
     * 设置smallScaleUnitType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSmallScaleUnitType(String value) {
        this.smallScaleUnitType = value;
    }

    /**
     * 获取smallScaleUseFraction属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getSmallScaleUseFraction() {
        return smallScaleUseFraction;
    }

    /**
     * 设置smallScaleUseFraction属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setSmallScaleUseFraction(JAXBElement<Boolean> value) {
        this.smallScaleUseFraction = value;
    }

    /**
     * 获取tmSelectedActivityFilters属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTMSelectedActivityFilters() {
        return tmSelectedActivityFilters;
    }

    /**
     * 设置tmSelectedActivityFilters属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTMSelectedActivityFilters(String value) {
        this.tmSelectedActivityFilters = value;
    }

    /**
     * 获取tmSelectedActivityFiltersJoin属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTMSelectedActivityFiltersJoin() {
        return tmSelectedActivityFiltersJoin;
    }

    /**
     * 设置tmSelectedActivityFiltersJoin属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTMSelectedActivityFiltersJoin(String value) {
        this.tmSelectedActivityFiltersJoin = value;
    }

    /**
     * 获取tmSelectedTimesheetFilters属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTMSelectedTimesheetFilters() {
        return tmSelectedTimesheetFilters;
    }

    /**
     * 设置tmSelectedTimesheetFilters属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTMSelectedTimesheetFilters(String value) {
        this.tmSelectedTimesheetFilters = value;
    }

    /**
     * 获取teamMemberActivityFilters属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTeamMemberActivityFilters() {
        return teamMemberActivityFilters;
    }

    /**
     * 设置teamMemberActivityFilters属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTeamMemberActivityFilters(String value) {
        this.teamMemberActivityFilters = value;
    }

    /**
     * 获取teamMemberActivityFiltersJoin属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTeamMemberActivityFiltersJoin() {
        return teamMemberActivityFiltersJoin;
    }

    /**
     * 设置teamMemberActivityFiltersJoin属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTeamMemberActivityFiltersJoin(String value) {
        this.teamMemberActivityFiltersJoin = value;
    }

    /**
     * 获取teamMemberActivitySortField属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTeamMemberActivitySortField() {
        return teamMemberActivitySortField;
    }

    /**
     * 设置teamMemberActivitySortField属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTeamMemberActivitySortField(String value) {
        this.teamMemberActivitySortField = value;
    }

    /**
     * 获取teamMemberActivitySortOrder属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTeamMemberActivitySortOrder() {
        return teamMemberActivitySortOrder;
    }

    /**
     * 设置teamMemberActivitySortOrder属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTeamMemberActivitySortOrder(String value) {
        this.teamMemberActivitySortOrder = value;
    }

    /**
     * 获取teamMemberApplicationTheme属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTeamMemberApplicationTheme() {
        return teamMemberApplicationTheme;
    }

    /**
     * 设置teamMemberApplicationTheme属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTeamMemberApplicationTheme(String value) {
        this.teamMemberApplicationTheme = value;
    }

    /**
     * 获取teamMemberDateFormat属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTeamMemberDateFormat() {
        return teamMemberDateFormat;
    }

    /**
     * 设置teamMemberDateFormat属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTeamMemberDateFormat(String value) {
        this.teamMemberDateFormat = value;
    }

    /**
     * 获取teamMemberDisplayQRQuickAccess属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTeamMemberDisplayQRQuickAccess() {
        return teamMemberDisplayQRQuickAccess;
    }

    /**
     * 设置teamMemberDisplayQRQuickAccess属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTeamMemberDisplayQRQuickAccess(String value) {
        this.teamMemberDisplayQRQuickAccess = value;
    }

    /**
     * 获取teamMemberDisplayTimeFlag属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTeamMemberDisplayTimeFlag() {
        return teamMemberDisplayTimeFlag;
    }

    /**
     * 设置teamMemberDisplayTimeFlag属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTeamMemberDisplayTimeFlag(Boolean value) {
        this.teamMemberDisplayTimeFlag = value;
    }

    /**
     * 获取teamMemberDisplayTimeFormat属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTeamMemberDisplayTimeFormat() {
        return teamMemberDisplayTimeFormat;
    }

    /**
     * 设置teamMemberDisplayTimeFormat属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTeamMemberDisplayTimeFormat(String value) {
        this.teamMemberDisplayTimeFormat = value;
    }

    /**
     * 获取teamMemberLocale属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTeamMemberLocale() {
        return teamMemberLocale;
    }

    /**
     * 设置teamMemberLocale属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTeamMemberLocale(String value) {
        this.teamMemberLocale = value;
    }

    /**
     * 获取teamMemberProjectFilter属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTeamMemberProjectFilter() {
        return teamMemberProjectFilter;
    }

    /**
     * 设置teamMemberProjectFilter属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTeamMemberProjectFilter(String value) {
        this.teamMemberProjectFilter = value;
    }

    /**
     * 获取teamMemberResourceFilter属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTeamMemberResourceFilter() {
        return teamMemberResourceFilter;
    }

    /**
     * 设置teamMemberResourceFilter属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTeamMemberResourceFilter(String value) {
        this.teamMemberResourceFilter = value;
    }

    /**
     * 获取teamMemberTaskStatusFilter属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTeamMemberTaskStatusFilter() {
        return teamMemberTaskStatusFilter;
    }

    /**
     * 设置teamMemberTaskStatusFilter属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTeamMemberTaskStatusFilter(String value) {
        this.teamMemberTaskStatusFilter = value;
    }

    /**
     * 获取teamMemberTimeframeFilter属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTeamMemberTimeframeFilter() {
        return teamMemberTimeframeFilter;
    }

    /**
     * 设置teamMemberTimeframeFilter属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTeamMemberTimeframeFilter(String value) {
        this.teamMemberTimeframeFilter = value;
    }

    /**
     * 获取teamMemberWBSFilter属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTeamMemberWBSFilter() {
        return teamMemberWBSFilter;
    }

    /**
     * 设置teamMemberWBSFilter属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTeamMemberWBSFilter(String value) {
        this.teamMemberWBSFilter = value;
    }

    /**
     * 获取teamMemberWorkUnitType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTeamMemberWorkUnitType() {
        return teamMemberWorkUnitType;
    }

    /**
     * 设置teamMemberWorkUnitType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTeamMemberWorkUnitType(String value) {
        this.teamMemberWorkUnitType = value;
    }

    /**
     * 获取unitsPerTimeShowAsPercentage属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getUnitsPerTimeShowAsPercentage() {
        return unitsPerTimeShowAsPercentage;
    }

    /**
     * 设置unitsPerTimeShowAsPercentage属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setUnitsPerTimeShowAsPercentage(JAXBElement<Boolean> value) {
        this.unitsPerTimeShowAsPercentage = value;
    }

    /**
     * 获取userInterfaceViewObjectId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getUserInterfaceViewObjectId() {
        return userInterfaceViewObjectId;
    }

    /**
     * 设置userInterfaceViewObjectId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setUserInterfaceViewObjectId(JAXBElement<Integer> value) {
        this.userInterfaceViewObjectId = value;
    }

    /**
     * 获取resourceRequests属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link User.ResourceRequests }{@code >}
     *     
     */
    public JAXBElement<User.ResourceRequests> getResourceRequests() {
        return resourceRequests;
    }

    /**
     * 设置resourceRequests属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link User.ResourceRequests }{@code >}
     *     
     */
    public void setResourceRequests(JAXBElement<User.ResourceRequests> value) {
        this.resourceRequests = value;
    }


    /**
     * <p>anonymous complex type的 Java 类。
     * 
     * <p>以下模式片段指定包含在此类中的预期内容。
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="ResourceRequest" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="FinishDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
     *                   &lt;element name="MatchAllCriteria" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
     *                   &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="RequestedUnits" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
     *                   &lt;element name="SequenceNumber" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
     *                   &lt;element name="ShowOnlyLaborResources" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
     *                   &lt;element name="ShowOverallocatedResources" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
     *                   &lt;element name="SortResultsByAvailability" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
     *                   &lt;element name="StartDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
     *                   &lt;element name="UseActivityDates" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
     *                   &lt;element name="ResourceRequestCriterion" maxOccurs="unbounded" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="CriterionType">
     *                               &lt;simpleType>
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                   &lt;enumeration value="Primary Role"/>
     *                                   &lt;enumeration value="Role"/>
     *                                   &lt;enumeration value="Resource"/>
     *                                   &lt;enumeration value="Resource Code"/>
     *                                 &lt;/restriction>
     *                               &lt;/simpleType>
     *                             &lt;/element>
     *                             &lt;element name="Proficiency" minOccurs="0">
     *                               &lt;simpleType>
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                   &lt;enumeration value="1 - Master"/>
     *                                   &lt;enumeration value="2 - Expert"/>
     *                                   &lt;enumeration value="3 - Skilled"/>
     *                                   &lt;enumeration value="4 - Proficient"/>
     *                                   &lt;enumeration value="5 - Inexperienced"/>
     *                                 &lt;/restriction>
     *                               &lt;/simpleType>
     *                             &lt;/element>
     *                             &lt;element name="ValueObjectId" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "resourceRequest"
    })
    public static class ResourceRequests {

        @XmlElement(name = "ResourceRequest")
        protected List<User.ResourceRequests.ResourceRequest> resourceRequest;

        /**
         * Gets the value of the resourceRequest property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the resourceRequest property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getResourceRequest().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link User.ResourceRequests.ResourceRequest }
         * 
         * 
         */
        public List<User.ResourceRequests.ResourceRequest> getResourceRequest() {
            if (resourceRequest == null) {
                resourceRequest = new ArrayList<User.ResourceRequests.ResourceRequest>();
            }
            return this.resourceRequest;
        }


        /**
         * <p>anonymous complex type的 Java 类。
         * 
         * <p>以下模式片段指定包含在此类中的预期内容。
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="FinishDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
         *         &lt;element name="MatchAllCriteria" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
         *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="RequestedUnits" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
         *         &lt;element name="SequenceNumber" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
         *         &lt;element name="ShowOnlyLaborResources" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
         *         &lt;element name="ShowOverallocatedResources" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
         *         &lt;element name="SortResultsByAvailability" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
         *         &lt;element name="StartDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
         *         &lt;element name="UseActivityDates" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
         *         &lt;element name="ResourceRequestCriterion" maxOccurs="unbounded" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="CriterionType">
         *                     &lt;simpleType>
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                         &lt;enumeration value="Primary Role"/>
         *                         &lt;enumeration value="Role"/>
         *                         &lt;enumeration value="Resource"/>
         *                         &lt;enumeration value="Resource Code"/>
         *                       &lt;/restriction>
         *                     &lt;/simpleType>
         *                   &lt;/element>
         *                   &lt;element name="Proficiency" minOccurs="0">
         *                     &lt;simpleType>
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                         &lt;enumeration value="1 - Master"/>
         *                         &lt;enumeration value="2 - Expert"/>
         *                         &lt;enumeration value="3 - Skilled"/>
         *                         &lt;enumeration value="4 - Proficient"/>
         *                         &lt;enumeration value="5 - Inexperienced"/>
         *                       &lt;/restriction>
         *                     &lt;/simpleType>
         *                   &lt;/element>
         *                   &lt;element name="ValueObjectId" type="{http://www.w3.org/2001/XMLSchema}int"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "finishDate",
            "matchAllCriteria",
            "name",
            "requestedUnits",
            "sequenceNumber",
            "showOnlyLaborResources",
            "showOverallocatedResources",
            "sortResultsByAvailability",
            "startDate",
            "useActivityDates",
            "resourceRequestCriterion"
        })
        public static class ResourceRequest {

            @XmlElementRef(name = "FinishDate", namespace = "http://xmlns.oracle.com/Primavera/P6/WS/User/V1", type = JAXBElement.class, required = false)
            protected JAXBElement<XMLGregorianCalendar> finishDate;
            @XmlElement(name = "MatchAllCriteria")
            protected Boolean matchAllCriteria;
            @XmlElementRef(name = "Name", namespace = "http://xmlns.oracle.com/Primavera/P6/WS/User/V1", type = JAXBElement.class, required = false)
            protected JAXBElement<String> name;
            @XmlElementRef(name = "RequestedUnits", namespace = "http://xmlns.oracle.com/Primavera/P6/WS/User/V1", type = JAXBElement.class, required = false)
            protected JAXBElement<Double> requestedUnits;
            @XmlElement(name = "SequenceNumber")
            protected Integer sequenceNumber;
            @XmlElement(name = "ShowOnlyLaborResources")
            protected Boolean showOnlyLaborResources;
            @XmlElement(name = "ShowOverallocatedResources")
            protected Boolean showOverallocatedResources;
            @XmlElement(name = "SortResultsByAvailability")
            protected Boolean sortResultsByAvailability;
            @XmlElementRef(name = "StartDate", namespace = "http://xmlns.oracle.com/Primavera/P6/WS/User/V1", type = JAXBElement.class, required = false)
            protected JAXBElement<XMLGregorianCalendar> startDate;
            @XmlElement(name = "UseActivityDates")
            protected Boolean useActivityDates;
            @XmlElement(name = "ResourceRequestCriterion")
            protected List<User.ResourceRequests.ResourceRequest.ResourceRequestCriterion> resourceRequestCriterion;

            /**
             * 获取finishDate属性的值。
             * 
             * @return
             *     possible object is
             *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
             *     
             */
            public JAXBElement<XMLGregorianCalendar> getFinishDate() {
                return finishDate;
            }

            /**
             * 设置finishDate属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
             *     
             */
            public void setFinishDate(JAXBElement<XMLGregorianCalendar> value) {
                this.finishDate = value;
            }

            /**
             * 获取matchAllCriteria属性的值。
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isMatchAllCriteria() {
                return matchAllCriteria;
            }

            /**
             * 设置matchAllCriteria属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setMatchAllCriteria(Boolean value) {
                this.matchAllCriteria = value;
            }

            /**
             * 获取name属性的值。
             * 
             * @return
             *     possible object is
             *     {@link JAXBElement }{@code <}{@link String }{@code >}
             *     
             */
            public JAXBElement<String> getName() {
                return name;
            }

            /**
             * 设置name属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link JAXBElement }{@code <}{@link String }{@code >}
             *     
             */
            public void setName(JAXBElement<String> value) {
                this.name = value;
            }

            /**
             * 获取requestedUnits属性的值。
             * 
             * @return
             *     possible object is
             *     {@link JAXBElement }{@code <}{@link Double }{@code >}
             *     
             */
            public JAXBElement<Double> getRequestedUnits() {
                return requestedUnits;
            }

            /**
             * 设置requestedUnits属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link JAXBElement }{@code <}{@link Double }{@code >}
             *     
             */
            public void setRequestedUnits(JAXBElement<Double> value) {
                this.requestedUnits = value;
            }

            /**
             * 获取sequenceNumber属性的值。
             * 
             * @return
             *     possible object is
             *     {@link Integer }
             *     
             */
            public Integer getSequenceNumber() {
                return sequenceNumber;
            }

            /**
             * 设置sequenceNumber属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link Integer }
             *     
             */
            public void setSequenceNumber(Integer value) {
                this.sequenceNumber = value;
            }

            /**
             * 获取showOnlyLaborResources属性的值。
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isShowOnlyLaborResources() {
                return showOnlyLaborResources;
            }

            /**
             * 设置showOnlyLaborResources属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setShowOnlyLaborResources(Boolean value) {
                this.showOnlyLaborResources = value;
            }

            /**
             * 获取showOverallocatedResources属性的值。
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isShowOverallocatedResources() {
                return showOverallocatedResources;
            }

            /**
             * 设置showOverallocatedResources属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setShowOverallocatedResources(Boolean value) {
                this.showOverallocatedResources = value;
            }

            /**
             * 获取sortResultsByAvailability属性的值。
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isSortResultsByAvailability() {
                return sortResultsByAvailability;
            }

            /**
             * 设置sortResultsByAvailability属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setSortResultsByAvailability(Boolean value) {
                this.sortResultsByAvailability = value;
            }

            /**
             * 获取startDate属性的值。
             * 
             * @return
             *     possible object is
             *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
             *     
             */
            public JAXBElement<XMLGregorianCalendar> getStartDate() {
                return startDate;
            }

            /**
             * 设置startDate属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
             *     
             */
            public void setStartDate(JAXBElement<XMLGregorianCalendar> value) {
                this.startDate = value;
            }

            /**
             * 获取useActivityDates属性的值。
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isUseActivityDates() {
                return useActivityDates;
            }

            /**
             * 设置useActivityDates属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setUseActivityDates(Boolean value) {
                this.useActivityDates = value;
            }

            /**
             * Gets the value of the resourceRequestCriterion property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the resourceRequestCriterion property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getResourceRequestCriterion().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link User.ResourceRequests.ResourceRequest.ResourceRequestCriterion }
             * 
             * 
             */
            public List<User.ResourceRequests.ResourceRequest.ResourceRequestCriterion> getResourceRequestCriterion() {
                if (resourceRequestCriterion == null) {
                    resourceRequestCriterion = new ArrayList<User.ResourceRequests.ResourceRequest.ResourceRequestCriterion>();
                }
                return this.resourceRequestCriterion;
            }


            /**
             * <p>anonymous complex type的 Java 类。
             * 
             * <p>以下模式片段指定包含在此类中的预期内容。
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *         &lt;element name="CriterionType">
             *           &lt;simpleType>
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *               &lt;enumeration value="Primary Role"/>
             *               &lt;enumeration value="Role"/>
             *               &lt;enumeration value="Resource"/>
             *               &lt;enumeration value="Resource Code"/>
             *             &lt;/restriction>
             *           &lt;/simpleType>
             *         &lt;/element>
             *         &lt;element name="Proficiency" minOccurs="0">
             *           &lt;simpleType>
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *               &lt;enumeration value="1 - Master"/>
             *               &lt;enumeration value="2 - Expert"/>
             *               &lt;enumeration value="3 - Skilled"/>
             *               &lt;enumeration value="4 - Proficient"/>
             *               &lt;enumeration value="5 - Inexperienced"/>
             *             &lt;/restriction>
             *           &lt;/simpleType>
             *         &lt;/element>
             *         &lt;element name="ValueObjectId" type="{http://www.w3.org/2001/XMLSchema}int"/>
             *       &lt;/sequence>
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "criterionType",
                "proficiency",
                "valueObjectId"
            })
            public static class ResourceRequestCriterion {

                @XmlElement(name = "CriterionType", required = true)
                protected String criterionType;
                @XmlElement(name = "Proficiency")
                protected String proficiency;
                @XmlElement(name = "ValueObjectId")
                protected int valueObjectId;

                /**
                 * 获取criterionType属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getCriterionType() {
                    return criterionType;
                }

                /**
                 * 设置criterionType属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setCriterionType(String value) {
                    this.criterionType = value;
                }

                /**
                 * 获取proficiency属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getProficiency() {
                    return proficiency;
                }

                /**
                 * 设置proficiency属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setProficiency(String value) {
                    this.proficiency = value;
                }

                /**
                 * 获取valueObjectId属性的值。
                 * 
                 */
                public int getValueObjectId() {
                    return valueObjectId;
                }

                /**
                 * 设置valueObjectId属性的值。
                 * 
                 */
                public void setValueObjectId(int value) {
                    this.valueObjectId = value;
                }

            }

        }

    }

}
