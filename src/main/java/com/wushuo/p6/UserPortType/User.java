
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
 * <p>User complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
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
     * ��ȡallResourceAccessFlag���Ե�ֵ��
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
     * ����allResourceAccessFlag���Ե�ֵ��
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
     * ��ȡassignmentStaffingPreference���Ե�ֵ��
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
     * ����assignmentStaffingPreference���Ե�ֵ��
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
     * ��ȡcreateDate���Ե�ֵ��
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
     * ����createDate���Ե�ֵ��
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
     * ��ȡcreateUser���Ե�ֵ��
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
     * ����createUser���Ե�ֵ��
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
     * ��ȡcurrencyId���Ե�ֵ��
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
     * ����currencyId���Ե�ֵ��
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
     * ��ȡcurrencyName���Ե�ֵ��
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
     * ����currencyName���Ե�ֵ��
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
     * ��ȡcurrencyObjectId���Ե�ֵ��
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
     * ����currencyObjectId���Ե�ֵ��
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
     * ��ȡcurrencyShowDecimals���Ե�ֵ��
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
     * ����currencyShowDecimals���Ե�ֵ��
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
     * ��ȡcurrencyShowSymbol���Ե�ֵ��
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
     * ����currencyShowSymbol���Ե�ֵ��
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
     * ��ȡdateFormatType���Ե�ֵ��
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
     * ����dateFormatType���Ե�ֵ��
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
     * ��ȡdateSeparator���Ե�ֵ��
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
     * ����dateSeparator���Ե�ֵ��
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
     * ��ȡdateShowFourDigitYear���Ե�ֵ��
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
     * ����dateShowFourDigitYear���Ե�ֵ��
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
     * ��ȡdateShowMinutes���Ե�ֵ��
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
     * ����dateShowMinutes���Ե�ֵ��
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
     * ��ȡdateTimeFormatType���Ե�ֵ��
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
     * ����dateTimeFormatType���Ե�ֵ��
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
     * ��ȡdateUseLeadingZero���Ե�ֵ��
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
     * ����dateUseLeadingZero���Ե�ֵ��
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
     * ��ȡdateUseMonthName���Ե�ֵ��
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
     * ����dateUseMonthName���Ե�ֵ��
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
     * ��ȡdurationDecimalCount���Ե�ֵ��
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
     * ����durationDecimalCount���Ե�ֵ��
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
     * ��ȡdurationUnitType���Ե�ֵ��
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
     * ����durationUnitType���Ե�ֵ��
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
     * ��ȡdurationUseFraction���Ե�ֵ��
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
     * ����durationUseFraction���Ե�ֵ��
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
     * ��ȡemailAddress���Ե�ֵ��
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
     * ����emailAddress���Ե�ֵ��
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
     * ��ȡemailProtocol���Ե�ֵ��
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
     * ����emailProtocol���Ե�ֵ��
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
     * ��ȡenableUserToModifyViewSettingsFlag���Ե�ֵ��
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
     * ����enableUserToModifyViewSettingsFlag���Ե�ֵ��
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
     * ��ȡfinancialPeriodEndObjectId���Ե�ֵ��
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
     * ����financialPeriodEndObjectId���Ե�ֵ��
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
     * ��ȡfinancialPeriodStartObjectId���Ե�ֵ��
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
     * ����financialPeriodStartObjectId���Ե�ֵ��
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
     * ��ȡguid���Ե�ֵ��
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
     * ����guid���Ե�ֵ��
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
     * ��ȡglobalProfileObjectId���Ե�ֵ��
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
     * ����globalProfileObjectId���Ե�ֵ��
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
     * ��ȡlastUpdateDate���Ե�ֵ��
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
     * ����lastUpdateDate���Ե�ֵ��
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
     * ��ȡlastUpdateUser���Ե�ֵ��
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
     * ����lastUpdateUser���Ե�ֵ��
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
     * ��ȡmailServerLoginName���Ե�ֵ��
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
     * ����mailServerLoginName���Ե�ֵ��
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
     * ��ȡname���Ե�ֵ��
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
     * ����name���Ե�ֵ��
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
     * ��ȡnewProjectDurationType���Ե�ֵ��
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
     * ����newProjectDurationType���Ե�ֵ��
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
     * ��ȡobjectId���Ե�ֵ��
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
     * ����objectId���Ե�ֵ��
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
     * ��ȡofficePhone���Ե�ֵ��
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
     * ����officePhone���Ե�ֵ��
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
     * ��ȡoutgoingMailServer���Ե�ֵ��
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
     * ����outgoingMailServer���Ե�ֵ��
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
     * ��ȡpersonalName���Ե�ֵ��
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
     * ����personalName���Ե�ֵ��
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
     * ��ȡrateSourcePreference���Ե�ֵ��
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
     * ����rateSourcePreference���Ե�ֵ��
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
     * ��ȡreportingFlag���Ե�ֵ��
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
     * ����reportingFlag���Ե�ֵ��
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
     * ��ȡrespectActivityDurationType���Ե�ֵ��
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
     * ����respectActivityDurationType���Ե�ֵ��
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
     * ��ȡroleLimitDisplayOption���Ե�ֵ��
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
     * ����roleLimitDisplayOption���Ե�ֵ��
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
     * ��ȡshowDurationTimeUnit���Ե�ֵ��
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
     * ����showDurationTimeUnit���Ե�ֵ��
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
     * ��ȡshowTimeUnit���Ե�ֵ��
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
     * ����showTimeUnit���Ե�ֵ��
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
     * ��ȡsmallScaleDecimalCount���Ե�ֵ��
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
     * ����smallScaleDecimalCount���Ե�ֵ��
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
     * ��ȡsmallScaleUnitType���Ե�ֵ��
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
     * ����smallScaleUnitType���Ե�ֵ��
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
     * ��ȡsmallScaleUseFraction���Ե�ֵ��
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
     * ����smallScaleUseFraction���Ե�ֵ��
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
     * ��ȡtmSelectedActivityFilters���Ե�ֵ��
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
     * ����tmSelectedActivityFilters���Ե�ֵ��
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
     * ��ȡtmSelectedActivityFiltersJoin���Ե�ֵ��
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
     * ����tmSelectedActivityFiltersJoin���Ե�ֵ��
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
     * ��ȡtmSelectedTimesheetFilters���Ե�ֵ��
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
     * ����tmSelectedTimesheetFilters���Ե�ֵ��
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
     * ��ȡteamMemberActivityFilters���Ե�ֵ��
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
     * ����teamMemberActivityFilters���Ե�ֵ��
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
     * ��ȡteamMemberActivityFiltersJoin���Ե�ֵ��
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
     * ����teamMemberActivityFiltersJoin���Ե�ֵ��
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
     * ��ȡteamMemberActivitySortField���Ե�ֵ��
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
     * ����teamMemberActivitySortField���Ե�ֵ��
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
     * ��ȡteamMemberActivitySortOrder���Ե�ֵ��
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
     * ����teamMemberActivitySortOrder���Ե�ֵ��
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
     * ��ȡteamMemberApplicationTheme���Ե�ֵ��
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
     * ����teamMemberApplicationTheme���Ե�ֵ��
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
     * ��ȡteamMemberDateFormat���Ե�ֵ��
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
     * ����teamMemberDateFormat���Ե�ֵ��
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
     * ��ȡteamMemberDisplayQRQuickAccess���Ե�ֵ��
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
     * ����teamMemberDisplayQRQuickAccess���Ե�ֵ��
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
     * ��ȡteamMemberDisplayTimeFlag���Ե�ֵ��
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
     * ����teamMemberDisplayTimeFlag���Ե�ֵ��
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
     * ��ȡteamMemberDisplayTimeFormat���Ե�ֵ��
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
     * ����teamMemberDisplayTimeFormat���Ե�ֵ��
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
     * ��ȡteamMemberLocale���Ե�ֵ��
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
     * ����teamMemberLocale���Ե�ֵ��
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
     * ��ȡteamMemberProjectFilter���Ե�ֵ��
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
     * ����teamMemberProjectFilter���Ե�ֵ��
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
     * ��ȡteamMemberResourceFilter���Ե�ֵ��
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
     * ����teamMemberResourceFilter���Ե�ֵ��
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
     * ��ȡteamMemberTaskStatusFilter���Ե�ֵ��
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
     * ����teamMemberTaskStatusFilter���Ե�ֵ��
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
     * ��ȡteamMemberTimeframeFilter���Ե�ֵ��
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
     * ����teamMemberTimeframeFilter���Ե�ֵ��
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
     * ��ȡteamMemberWBSFilter���Ե�ֵ��
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
     * ����teamMemberWBSFilter���Ե�ֵ��
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
     * ��ȡteamMemberWorkUnitType���Ե�ֵ��
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
     * ����teamMemberWorkUnitType���Ե�ֵ��
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
     * ��ȡunitsPerTimeShowAsPercentage���Ե�ֵ��
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
     * ����unitsPerTimeShowAsPercentage���Ե�ֵ��
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
     * ��ȡuserInterfaceViewObjectId���Ե�ֵ��
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
     * ����userInterfaceViewObjectId���Ե�ֵ��
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
     * ��ȡresourceRequests���Ե�ֵ��
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
     * ����resourceRequests���Ե�ֵ��
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
     * <p>anonymous complex type�� Java �ࡣ
     * 
     * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
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
         * <p>anonymous complex type�� Java �ࡣ
         * 
         * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
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
             * ��ȡfinishDate���Ե�ֵ��
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
             * ����finishDate���Ե�ֵ��
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
             * ��ȡmatchAllCriteria���Ե�ֵ��
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
             * ����matchAllCriteria���Ե�ֵ��
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
             * ��ȡname���Ե�ֵ��
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
             * ����name���Ե�ֵ��
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
             * ��ȡrequestedUnits���Ե�ֵ��
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
             * ����requestedUnits���Ե�ֵ��
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
             * ��ȡsequenceNumber���Ե�ֵ��
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
             * ����sequenceNumber���Ե�ֵ��
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
             * ��ȡshowOnlyLaborResources���Ե�ֵ��
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
             * ����showOnlyLaborResources���Ե�ֵ��
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
             * ��ȡshowOverallocatedResources���Ե�ֵ��
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
             * ����showOverallocatedResources���Ե�ֵ��
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
             * ��ȡsortResultsByAvailability���Ե�ֵ��
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
             * ����sortResultsByAvailability���Ե�ֵ��
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
             * ��ȡstartDate���Ե�ֵ��
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
             * ����startDate���Ե�ֵ��
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
             * ��ȡuseActivityDates���Ե�ֵ��
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
             * ����useActivityDates���Ե�ֵ��
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
             * <p>anonymous complex type�� Java �ࡣ
             * 
             * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
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
                 * ��ȡcriterionType���Ե�ֵ��
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
                 * ����criterionType���Ե�ֵ��
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
                 * ��ȡproficiency���Ե�ֵ��
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
                 * ����proficiency���Ե�ֵ��
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
                 * ��ȡvalueObjectId���Ե�ֵ��
                 * 
                 */
                public int getValueObjectId() {
                    return valueObjectId;
                }

                /**
                 * ����valueObjectId���Ե�ֵ��
                 * 
                 */
                public void setValueObjectId(int value) {
                    this.valueObjectId = value;
                }

            }

        }

    }

}
