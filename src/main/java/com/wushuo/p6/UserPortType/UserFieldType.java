
package com.wushuo.p6.UserPortType;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>UserFieldType的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="UserFieldType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="AllResourceAccessFlag"/>
 *     &lt;enumeration value="AssignmentStaffingPreference"/>
 *     &lt;enumeration value="CreateDate"/>
 *     &lt;enumeration value="CreateUser"/>
 *     &lt;enumeration value="CurrencyId"/>
 *     &lt;enumeration value="CurrencyName"/>
 *     &lt;enumeration value="CurrencyObjectId"/>
 *     &lt;enumeration value="CurrencyShowDecimals"/>
 *     &lt;enumeration value="CurrencyShowSymbol"/>
 *     &lt;enumeration value="DateFormatType"/>
 *     &lt;enumeration value="DateSeparator"/>
 *     &lt;enumeration value="DateShowFourDigitYear"/>
 *     &lt;enumeration value="DateShowMinutes"/>
 *     &lt;enumeration value="DateTimeFormatType"/>
 *     &lt;enumeration value="DateUseLeadingZero"/>
 *     &lt;enumeration value="DateUseMonthName"/>
 *     &lt;enumeration value="DurationDecimalCount"/>
 *     &lt;enumeration value="DurationUnitType"/>
 *     &lt;enumeration value="DurationUseFraction"/>
 *     &lt;enumeration value="EmailAddress"/>
 *     &lt;enumeration value="EmailProtocol"/>
 *     &lt;enumeration value="EnableUserToModifyViewSettingsFlag"/>
 *     &lt;enumeration value="FinancialPeriodEndObjectId"/>
 *     &lt;enumeration value="FinancialPeriodStartObjectId"/>
 *     &lt;enumeration value="GUID"/>
 *     &lt;enumeration value="GlobalProfileObjectId"/>
 *     &lt;enumeration value="LastUpdateDate"/>
 *     &lt;enumeration value="LastUpdateUser"/>
 *     &lt;enumeration value="MailServerLoginName"/>
 *     &lt;enumeration value="Name"/>
 *     &lt;enumeration value="NewProjectDurationType"/>
 *     &lt;enumeration value="ObjectId"/>
 *     &lt;enumeration value="OfficePhone"/>
 *     &lt;enumeration value="OutgoingMailServer"/>
 *     &lt;enumeration value="PersonalName"/>
 *     &lt;enumeration value="RateSourcePreference"/>
 *     &lt;enumeration value="ReportingFlag"/>
 *     &lt;enumeration value="ResourceRequests"/>
 *     &lt;enumeration value="RespectActivityDurationType"/>
 *     &lt;enumeration value="RoleLimitDisplayOption"/>
 *     &lt;enumeration value="ShowDurationTimeUnit"/>
 *     &lt;enumeration value="ShowTimeUnit"/>
 *     &lt;enumeration value="SmallScaleDecimalCount"/>
 *     &lt;enumeration value="SmallScaleUnitType"/>
 *     &lt;enumeration value="SmallScaleUseFraction"/>
 *     &lt;enumeration value="TMSelectedActivityFilters"/>
 *     &lt;enumeration value="TMSelectedActivityFiltersJoin"/>
 *     &lt;enumeration value="TMSelectedTimesheetFilters"/>
 *     &lt;enumeration value="TeamMemberActivityFilters"/>
 *     &lt;enumeration value="TeamMemberActivityFiltersJoin"/>
 *     &lt;enumeration value="TeamMemberActivitySortField"/>
 *     &lt;enumeration value="TeamMemberActivitySortOrder"/>
 *     &lt;enumeration value="TeamMemberApplicationTheme"/>
 *     &lt;enumeration value="TeamMemberDateFormat"/>
 *     &lt;enumeration value="TeamMemberDisplayQRQuickAccess"/>
 *     &lt;enumeration value="TeamMemberDisplayTimeFlag"/>
 *     &lt;enumeration value="TeamMemberDisplayTimeFormat"/>
 *     &lt;enumeration value="TeamMemberLocale"/>
 *     &lt;enumeration value="TeamMemberProjectFilter"/>
 *     &lt;enumeration value="TeamMemberResourceFilter"/>
 *     &lt;enumeration value="TeamMemberTaskStatusFilter"/>
 *     &lt;enumeration value="TeamMemberTimeframeFilter"/>
 *     &lt;enumeration value="TeamMemberWBSFilter"/>
 *     &lt;enumeration value="TeamMemberWorkUnitType"/>
 *     &lt;enumeration value="UnitsPerTimeShowAsPercentage"/>
 *     &lt;enumeration value="UserInterfaceViewObjectId"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "UserFieldType")
@XmlEnum
public enum UserFieldType {

    @XmlEnumValue("AllResourceAccessFlag")
    ALL_RESOURCE_ACCESS_FLAG("AllResourceAccessFlag"),
    @XmlEnumValue("AssignmentStaffingPreference")
    ASSIGNMENT_STAFFING_PREFERENCE("AssignmentStaffingPreference"),
    @XmlEnumValue("CreateDate")
    CREATE_DATE("CreateDate"),
    @XmlEnumValue("CreateUser")
    CREATE_USER("CreateUser"),
    @XmlEnumValue("CurrencyId")
    CURRENCY_ID("CurrencyId"),
    @XmlEnumValue("CurrencyName")
    CURRENCY_NAME("CurrencyName"),
    @XmlEnumValue("CurrencyObjectId")
    CURRENCY_OBJECT_ID("CurrencyObjectId"),
    @XmlEnumValue("CurrencyShowDecimals")
    CURRENCY_SHOW_DECIMALS("CurrencyShowDecimals"),
    @XmlEnumValue("CurrencyShowSymbol")
    CURRENCY_SHOW_SYMBOL("CurrencyShowSymbol"),
    @XmlEnumValue("DateFormatType")
    DATE_FORMAT_TYPE("DateFormatType"),
    @XmlEnumValue("DateSeparator")
    DATE_SEPARATOR("DateSeparator"),
    @XmlEnumValue("DateShowFourDigitYear")
    DATE_SHOW_FOUR_DIGIT_YEAR("DateShowFourDigitYear"),
    @XmlEnumValue("DateShowMinutes")
    DATE_SHOW_MINUTES("DateShowMinutes"),
    @XmlEnumValue("DateTimeFormatType")
    DATE_TIME_FORMAT_TYPE("DateTimeFormatType"),
    @XmlEnumValue("DateUseLeadingZero")
    DATE_USE_LEADING_ZERO("DateUseLeadingZero"),
    @XmlEnumValue("DateUseMonthName")
    DATE_USE_MONTH_NAME("DateUseMonthName"),
    @XmlEnumValue("DurationDecimalCount")
    DURATION_DECIMAL_COUNT("DurationDecimalCount"),
    @XmlEnumValue("DurationUnitType")
    DURATION_UNIT_TYPE("DurationUnitType"),
    @XmlEnumValue("DurationUseFraction")
    DURATION_USE_FRACTION("DurationUseFraction"),
    @XmlEnumValue("EmailAddress")
    EMAIL_ADDRESS("EmailAddress"),
    @XmlEnumValue("EmailProtocol")
    EMAIL_PROTOCOL("EmailProtocol"),
    @XmlEnumValue("EnableUserToModifyViewSettingsFlag")
    ENABLE_USER_TO_MODIFY_VIEW_SETTINGS_FLAG("EnableUserToModifyViewSettingsFlag"),
    @XmlEnumValue("FinancialPeriodEndObjectId")
    FINANCIAL_PERIOD_END_OBJECT_ID("FinancialPeriodEndObjectId"),
    @XmlEnumValue("FinancialPeriodStartObjectId")
    FINANCIAL_PERIOD_START_OBJECT_ID("FinancialPeriodStartObjectId"),
    GUID("GUID"),
    @XmlEnumValue("GlobalProfileObjectId")
    GLOBAL_PROFILE_OBJECT_ID("GlobalProfileObjectId"),
    @XmlEnumValue("LastUpdateDate")
    LAST_UPDATE_DATE("LastUpdateDate"),
    @XmlEnumValue("LastUpdateUser")
    LAST_UPDATE_USER("LastUpdateUser"),
    @XmlEnumValue("MailServerLoginName")
    MAIL_SERVER_LOGIN_NAME("MailServerLoginName"),
    @XmlEnumValue("Name")
    NAME("Name"),
    @XmlEnumValue("NewProjectDurationType")
    NEW_PROJECT_DURATION_TYPE("NewProjectDurationType"),
    @XmlEnumValue("ObjectId")
    OBJECT_ID("ObjectId"),
    @XmlEnumValue("OfficePhone")
    OFFICE_PHONE("OfficePhone"),
    @XmlEnumValue("OutgoingMailServer")
    OUTGOING_MAIL_SERVER("OutgoingMailServer"),
    @XmlEnumValue("PersonalName")
    PERSONAL_NAME("PersonalName"),
    @XmlEnumValue("RateSourcePreference")
    RATE_SOURCE_PREFERENCE("RateSourcePreference"),
    @XmlEnumValue("ReportingFlag")
    REPORTING_FLAG("ReportingFlag"),
    @XmlEnumValue("ResourceRequests")
    RESOURCE_REQUESTS("ResourceRequests"),
    @XmlEnumValue("RespectActivityDurationType")
    RESPECT_ACTIVITY_DURATION_TYPE("RespectActivityDurationType"),
    @XmlEnumValue("RoleLimitDisplayOption")
    ROLE_LIMIT_DISPLAY_OPTION("RoleLimitDisplayOption"),
    @XmlEnumValue("ShowDurationTimeUnit")
    SHOW_DURATION_TIME_UNIT("ShowDurationTimeUnit"),
    @XmlEnumValue("ShowTimeUnit")
    SHOW_TIME_UNIT("ShowTimeUnit"),
    @XmlEnumValue("SmallScaleDecimalCount")
    SMALL_SCALE_DECIMAL_COUNT("SmallScaleDecimalCount"),
    @XmlEnumValue("SmallScaleUnitType")
    SMALL_SCALE_UNIT_TYPE("SmallScaleUnitType"),
    @XmlEnumValue("SmallScaleUseFraction")
    SMALL_SCALE_USE_FRACTION("SmallScaleUseFraction"),
    @XmlEnumValue("TMSelectedActivityFilters")
    TM_SELECTED_ACTIVITY_FILTERS("TMSelectedActivityFilters"),
    @XmlEnumValue("TMSelectedActivityFiltersJoin")
    TM_SELECTED_ACTIVITY_FILTERS_JOIN("TMSelectedActivityFiltersJoin"),
    @XmlEnumValue("TMSelectedTimesheetFilters")
    TM_SELECTED_TIMESHEET_FILTERS("TMSelectedTimesheetFilters"),
    @XmlEnumValue("TeamMemberActivityFilters")
    TEAM_MEMBER_ACTIVITY_FILTERS("TeamMemberActivityFilters"),
    @XmlEnumValue("TeamMemberActivityFiltersJoin")
    TEAM_MEMBER_ACTIVITY_FILTERS_JOIN("TeamMemberActivityFiltersJoin"),
    @XmlEnumValue("TeamMemberActivitySortField")
    TEAM_MEMBER_ACTIVITY_SORT_FIELD("TeamMemberActivitySortField"),
    @XmlEnumValue("TeamMemberActivitySortOrder")
    TEAM_MEMBER_ACTIVITY_SORT_ORDER("TeamMemberActivitySortOrder"),
    @XmlEnumValue("TeamMemberApplicationTheme")
    TEAM_MEMBER_APPLICATION_THEME("TeamMemberApplicationTheme"),
    @XmlEnumValue("TeamMemberDateFormat")
    TEAM_MEMBER_DATE_FORMAT("TeamMemberDateFormat"),
    @XmlEnumValue("TeamMemberDisplayQRQuickAccess")
    TEAM_MEMBER_DISPLAY_QR_QUICK_ACCESS("TeamMemberDisplayQRQuickAccess"),
    @XmlEnumValue("TeamMemberDisplayTimeFlag")
    TEAM_MEMBER_DISPLAY_TIME_FLAG("TeamMemberDisplayTimeFlag"),
    @XmlEnumValue("TeamMemberDisplayTimeFormat")
    TEAM_MEMBER_DISPLAY_TIME_FORMAT("TeamMemberDisplayTimeFormat"),
    @XmlEnumValue("TeamMemberLocale")
    TEAM_MEMBER_LOCALE("TeamMemberLocale"),
    @XmlEnumValue("TeamMemberProjectFilter")
    TEAM_MEMBER_PROJECT_FILTER("TeamMemberProjectFilter"),
    @XmlEnumValue("TeamMemberResourceFilter")
    TEAM_MEMBER_RESOURCE_FILTER("TeamMemberResourceFilter"),
    @XmlEnumValue("TeamMemberTaskStatusFilter")
    TEAM_MEMBER_TASK_STATUS_FILTER("TeamMemberTaskStatusFilter"),
    @XmlEnumValue("TeamMemberTimeframeFilter")
    TEAM_MEMBER_TIMEFRAME_FILTER("TeamMemberTimeframeFilter"),
    @XmlEnumValue("TeamMemberWBSFilter")
    TEAM_MEMBER_WBS_FILTER("TeamMemberWBSFilter"),
    @XmlEnumValue("TeamMemberWorkUnitType")
    TEAM_MEMBER_WORK_UNIT_TYPE("TeamMemberWorkUnitType"),
    @XmlEnumValue("UnitsPerTimeShowAsPercentage")
    UNITS_PER_TIME_SHOW_AS_PERCENTAGE("UnitsPerTimeShowAsPercentage"),
    @XmlEnumValue("UserInterfaceViewObjectId")
    USER_INTERFACE_VIEW_OBJECT_ID("UserInterfaceViewObjectId");
    private final String value;

    UserFieldType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static UserFieldType fromValue(String v) {
        for (UserFieldType c: UserFieldType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
