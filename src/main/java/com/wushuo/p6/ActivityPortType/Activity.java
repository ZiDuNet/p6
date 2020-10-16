
package com.wushuo.p6.ActivityPortType;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Activity complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="Activity">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AccountingVariance" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="AccountingVarianceLaborUnits" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="ActivityOwnerUserId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ActualDuration" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}double">
 *               &lt;minInclusive value="0.0"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ActualExpenseCost" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="ActualFinishDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="ActualLaborCost" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="ActualLaborUnits" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="ActualMaterialCost" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="ActualNonLaborCost" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="ActualNonLaborUnits" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="ActualStartDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="ActualThisPeriodLaborCost" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="ActualThisPeriodLaborUnits" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="ActualThisPeriodMaterialCost" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="ActualThisPeriodNonLaborCost" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="ActualThisPeriodNonLaborUnits" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="ActualTotalCost" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="ActualTotalUnits" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="AtCompletionDuration" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}double">
 *               &lt;minInclusive value="0.0"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="AtCompletionExpenseCost" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="AtCompletionLaborCost" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="AtCompletionLaborUnits" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="AtCompletionLaborUnitsVariance" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="AtCompletionMaterialCost" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="AtCompletionNonLaborCost" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="AtCompletionNonLaborUnits" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="AtCompletionTotalCost" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="AtCompletionTotalUnits" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="AtCompletionVariance" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="AutoComputeActuals" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Baseline1Duration" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="Baseline1FinishDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="Baseline1PlannedDuration" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="Baseline1PlannedExpenseCost" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="Baseline1PlannedLaborCost" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="Baseline1PlannedLaborUnits" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="Baseline1PlannedMaterialCost" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="Baseline1PlannedNonLaborCost" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="Baseline1PlannedNonLaborUnits" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="Baseline1PlannedTotalCost" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="Baseline1StartDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="BaselineDuration" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="BaselineFinishDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="BaselinePlannedDuration" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="BaselinePlannedExpenseCost" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="BaselinePlannedLaborCost" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="BaselinePlannedLaborUnits" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="BaselinePlannedMaterialCost" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="BaselinePlannedNonLaborCost" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="BaselinePlannedNonLaborUnits" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="BaselinePlannedTotalCost" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="BaselineStartDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="BudgetAtCompletion" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="CBSCode" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="1024"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="CBSId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="CBSObjectId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="CalendarName" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="255"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="CalendarObjectId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="CostPercentComplete" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="CostPercentOfPlanned" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="CostPerformanceIndex" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="CostPerformanceIndexLaborUnits" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="CostVariance" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="CostVarianceIndex" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="CostVarianceIndexLaborUnits" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="CostVarianceLaborUnits" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="CreateDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="CreateUser" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="255"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="DataDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="Duration1Variance" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="DurationPercentComplete" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}double">
 *               &lt;minInclusive value="0.0"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="DurationPercentOfPlanned" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="DurationType" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="Fixed Units/Time"/>
 *               &lt;enumeration value="Fixed Duration and Units/Time"/>
 *               &lt;enumeration value="Fixed Units"/>
 *               &lt;enumeration value="Fixed Duration and Units"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="DurationVariance" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="EarlyFinishDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="EarlyStartDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="EarnedValueCost" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="EarnedValueLaborUnits" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="EstimateAtCompletionCost" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="EstimateAtCompletionLaborUnits" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="EstimateToComplete" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="EstimateToCompleteLaborUnits" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="EstimatedWeight" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="ExpectedFinishDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="ExpenseCost1Variance" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="ExpenseCostPercentComplete" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="ExpenseCostVariance" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="ExternalEarlyStartDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="ExternalLateFinishDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="Feedback" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FinishDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="FinishDate1Variance" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="FinishDateVariance" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="FloatPath" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="FloatPathOrder" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="FreeFloat" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="GUID" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;pattern value="\{[0-9a-fA-F]{8}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{12}\}|"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="HasFutureBucketData" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Id" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="40"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="IsBaseline" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsCritical" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsLongestPath" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsNewFeedback" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsStarred" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsTemplate" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsWorkPackage" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="LaborCost1Variance" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="LaborCostPercentComplete" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="LaborCostVariance" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="LaborUnits1Variance" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="LaborUnitsPercentComplete" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="LaborUnitsVariance" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="LastUpdateDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="LastUpdateUser" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="255"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="LateFinishDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="LateStartDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="LevelingPriority" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="Top"/>
 *               &lt;enumeration value="High"/>
 *               &lt;enumeration value="Normal"/>
 *               &lt;enumeration value="Low"/>
 *               &lt;enumeration value="Lowest"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="LocationName" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="100"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="LocationObjectId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="MaterialCost1Variance" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="MaterialCostPercentComplete" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="MaterialCostVariance" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="MaximumDuration" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}double">
 *               &lt;minInclusive value="0.0"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="MinimumDuration" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}double">
 *               &lt;minInclusive value="0.0"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="MostLikelyDuration" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}double">
 *               &lt;minInclusive value="0.0"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Name" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="120"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="NonLaborCost1Variance" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="NonLaborCostPercentComplete" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="NonLaborCostVariance" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="NonLaborUnits1Variance" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="NonLaborUnitsPercentComplete" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="NonLaborUnitsVariance" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="NotesToResources" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ObjectId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="OwnerIDArray" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OwnerNamesArray" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PercentComplete" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="PercentCompleteType" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="Physical"/>
 *               &lt;enumeration value="Duration"/>
 *               &lt;enumeration value="Units"/>
 *               &lt;enumeration value="Scope"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="PerformancePercentComplete" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="PerformancePercentCompleteByLaborUnits" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="PhysicalPercentComplete" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="PlannedDuration" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}double">
 *               &lt;minInclusive value="0.0"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="PlannedExpenseCost" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="PlannedFinishDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="PlannedLaborCost" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="PlannedLaborUnits" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="PlannedMaterialCost" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="PlannedNonLaborCost" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="PlannedNonLaborUnits" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="PlannedStartDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="PlannedTotalCost" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="PlannedTotalUnits" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="PlannedValueCost" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="PlannedValueLaborUnits" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="PostRespCriticalityIndex" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="PostResponsePessimisticFinish" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="PostResponsePessimisticStart" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="PreRespCriticalityIndex" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="PreResponsePessimisticFinish" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="PreResponsePessimisticStart" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="PrimaryConstraintDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="PrimaryConstraintType" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value=""/>
 *               &lt;enumeration value="Start On"/>
 *               &lt;enumeration value="Start On or Before"/>
 *               &lt;enumeration value="Start On or After"/>
 *               &lt;enumeration value="Finish On"/>
 *               &lt;enumeration value="Finish On or Before"/>
 *               &lt;enumeration value="Finish On or After"/>
 *               &lt;enumeration value="As Late As Possible"/>
 *               &lt;enumeration value="Mandatory Start"/>
 *               &lt;enumeration value="Mandatory Finish"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="PrimaryResourceId" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="255"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="PrimaryResourceName" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="255"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="PrimaryResourceObjectId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ProjectFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ProjectId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ProjectName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ProjectObjectId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ProjectProjectFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RemainingDuration" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}double">
 *               &lt;minInclusive value="0.0"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="RemainingEarlyFinishDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="RemainingEarlyStartDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="RemainingExpenseCost" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="RemainingFloat" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="RemainingLaborCost" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="RemainingLaborUnits" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="RemainingLateFinishDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="RemainingLateStartDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="RemainingMaterialCost" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="RemainingNonLaborCost" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="RemainingNonLaborUnits" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="RemainingTotalCost" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="RemainingTotalUnits" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="ResumeDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="ReviewFinishDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="ReviewRequired" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ReviewStatus" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="OK"/>
 *               &lt;enumeration value="For Review"/>
 *               &lt;enumeration value="Rejected"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="SchedulePercentComplete" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="SchedulePerformanceIndex" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="SchedulePerformanceIndexLaborUnits" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="ScheduleVariance" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="ScheduleVarianceIndex" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="ScheduleVarianceIndexLaborUnits" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="ScheduleVarianceLaborUnits" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="ScopePercentComplete" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="SecondaryConstraintDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="SecondaryConstraintType" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value=""/>
 *               &lt;enumeration value="Start On"/>
 *               &lt;enumeration value="Start On or Before"/>
 *               &lt;enumeration value="Start On or After"/>
 *               &lt;enumeration value="Finish On"/>
 *               &lt;enumeration value="Finish On or Before"/>
 *               &lt;enumeration value="Finish On or After"/>
 *               &lt;enumeration value="As Late As Possible"/>
 *               &lt;enumeration value="Mandatory Start"/>
 *               &lt;enumeration value="Mandatory Finish"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="StartDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="StartDate1Variance" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="StartDateVariance" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="Status" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="Not Started"/>
 *               &lt;enumeration value="In Progress"/>
 *               &lt;enumeration value="Completed"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="StatusCode" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value=""/>
 *               &lt;enumeration value="Planned"/>
 *               &lt;enumeration value="Active"/>
 *               &lt;enumeration value="Inactive"/>
 *               &lt;enumeration value="What-If"/>
 *               &lt;enumeration value="Requested"/>
 *               &lt;enumeration value="Template"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="SuspendDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="TaskStatusCompletion" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value=""/>
 *               &lt;enumeration value="BOTH_NOT_COMPLETE"/>
 *               &lt;enumeration value="TASKS_COMPLETE_ACTIVITY_NOT"/>
 *               &lt;enumeration value="ACTIVITY_COMPLETE_TASKS_NOT"/>
 *               &lt;enumeration value="BOTH_COMPLETE"/>
 *               &lt;enumeration value="NO_TASKS"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="TaskStatusDates" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value=""/>
 *               &lt;enumeration value="AT_LEAST_ONE_OUTSIDE"/>
 *               &lt;enumeration value="ALL_WITHIN"/>
 *               &lt;enumeration value="NO_TASK_DATES"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="TaskStatusIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ToCompletePerformanceIndex" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="TotalCost1Variance" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="TotalCostVariance" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="TotalFloat" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="Type" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="Task Dependent"/>
 *               &lt;enumeration value="Resource Dependent"/>
 *               &lt;enumeration value="Level of Effort"/>
 *               &lt;enumeration value="Start Milestone"/>
 *               &lt;enumeration value="Finish Milestone"/>
 *               &lt;enumeration value="WBS Summary"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="UnitsPercentComplete" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="UnreadCommentCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="WBSCode" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="40"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="WBSName" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="100"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="WBSNamePath" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="WBSObjectId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="WBSPath" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="WorkPackageId" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="255"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="WorkPackageName" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="255"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
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
@XmlType(name = "Activity", propOrder = {
    "accountingVariance",
    "accountingVarianceLaborUnits",
    "activityOwnerUserId",
    "actualDuration",
    "actualExpenseCost",
    "actualFinishDate",
    "actualLaborCost",
    "actualLaborUnits",
    "actualMaterialCost",
    "actualNonLaborCost",
    "actualNonLaborUnits",
    "actualStartDate",
    "actualThisPeriodLaborCost",
    "actualThisPeriodLaborUnits",
    "actualThisPeriodMaterialCost",
    "actualThisPeriodNonLaborCost",
    "actualThisPeriodNonLaborUnits",
    "actualTotalCost",
    "actualTotalUnits",
    "atCompletionDuration",
    "atCompletionExpenseCost",
    "atCompletionLaborCost",
    "atCompletionLaborUnits",
    "atCompletionLaborUnitsVariance",
    "atCompletionMaterialCost",
    "atCompletionNonLaborCost",
    "atCompletionNonLaborUnits",
    "atCompletionTotalCost",
    "atCompletionTotalUnits",
    "atCompletionVariance",
    "autoComputeActuals",
    "baseline1Duration",
    "baseline1FinishDate",
    "baseline1PlannedDuration",
    "baseline1PlannedExpenseCost",
    "baseline1PlannedLaborCost",
    "baseline1PlannedLaborUnits",
    "baseline1PlannedMaterialCost",
    "baseline1PlannedNonLaborCost",
    "baseline1PlannedNonLaborUnits",
    "baseline1PlannedTotalCost",
    "baseline1StartDate",
    "baselineDuration",
    "baselineFinishDate",
    "baselinePlannedDuration",
    "baselinePlannedExpenseCost",
    "baselinePlannedLaborCost",
    "baselinePlannedLaborUnits",
    "baselinePlannedMaterialCost",
    "baselinePlannedNonLaborCost",
    "baselinePlannedNonLaborUnits",
    "baselinePlannedTotalCost",
    "baselineStartDate",
    "budgetAtCompletion",
    "cbsCode",
    "cbsId",
    "cbsObjectId",
    "calendarName",
    "calendarObjectId",
    "costPercentComplete",
    "costPercentOfPlanned",
    "costPerformanceIndex",
    "costPerformanceIndexLaborUnits",
    "costVariance",
    "costVarianceIndex",
    "costVarianceIndexLaborUnits",
    "costVarianceLaborUnits",
    "createDate",
    "createUser",
    "dataDate",
    "duration1Variance",
    "durationPercentComplete",
    "durationPercentOfPlanned",
    "durationType",
    "durationVariance",
    "earlyFinishDate",
    "earlyStartDate",
    "earnedValueCost",
    "earnedValueLaborUnits",
    "estimateAtCompletionCost",
    "estimateAtCompletionLaborUnits",
    "estimateToComplete",
    "estimateToCompleteLaborUnits",
    "estimatedWeight",
    "expectedFinishDate",
    "expenseCost1Variance",
    "expenseCostPercentComplete",
    "expenseCostVariance",
    "externalEarlyStartDate",
    "externalLateFinishDate",
    "feedback",
    "finishDate",
    "finishDate1Variance",
    "finishDateVariance",
    "floatPath",
    "floatPathOrder",
    "freeFloat",
    "guid",
    "hasFutureBucketData",
    "id",
    "isBaseline",
    "isCritical",
    "isLongestPath",
    "isNewFeedback",
    "isStarred",
    "isTemplate",
    "isWorkPackage",
    "laborCost1Variance",
    "laborCostPercentComplete",
    "laborCostVariance",
    "laborUnits1Variance",
    "laborUnitsPercentComplete",
    "laborUnitsVariance",
    "lastUpdateDate",
    "lastUpdateUser",
    "lateFinishDate",
    "lateStartDate",
    "levelingPriority",
    "locationName",
    "locationObjectId",
    "materialCost1Variance",
    "materialCostPercentComplete",
    "materialCostVariance",
    "maximumDuration",
    "minimumDuration",
    "mostLikelyDuration",
    "name",
    "nonLaborCost1Variance",
    "nonLaborCostPercentComplete",
    "nonLaborCostVariance",
    "nonLaborUnits1Variance",
    "nonLaborUnitsPercentComplete",
    "nonLaborUnitsVariance",
    "notesToResources",
    "objectId",
    "ownerIDArray",
    "ownerNamesArray",
    "percentComplete",
    "percentCompleteType",
    "performancePercentComplete",
    "performancePercentCompleteByLaborUnits",
    "physicalPercentComplete",
    "plannedDuration",
    "plannedExpenseCost",
    "plannedFinishDate",
    "plannedLaborCost",
    "plannedLaborUnits",
    "plannedMaterialCost",
    "plannedNonLaborCost",
    "plannedNonLaborUnits",
    "plannedStartDate",
    "plannedTotalCost",
    "plannedTotalUnits",
    "plannedValueCost",
    "plannedValueLaborUnits",
    "postRespCriticalityIndex",
    "postResponsePessimisticFinish",
    "postResponsePessimisticStart",
    "preRespCriticalityIndex",
    "preResponsePessimisticFinish",
    "preResponsePessimisticStart",
    "primaryConstraintDate",
    "primaryConstraintType",
    "primaryResourceId",
    "primaryResourceName",
    "primaryResourceObjectId",
    "projectFlag",
    "projectId",
    "projectName",
    "projectObjectId",
    "projectProjectFlag",
    "remainingDuration",
    "remainingEarlyFinishDate",
    "remainingEarlyStartDate",
    "remainingExpenseCost",
    "remainingFloat",
    "remainingLaborCost",
    "remainingLaborUnits",
    "remainingLateFinishDate",
    "remainingLateStartDate",
    "remainingMaterialCost",
    "remainingNonLaborCost",
    "remainingNonLaborUnits",
    "remainingTotalCost",
    "remainingTotalUnits",
    "resumeDate",
    "reviewFinishDate",
    "reviewRequired",
    "reviewStatus",
    "schedulePercentComplete",
    "schedulePerformanceIndex",
    "schedulePerformanceIndexLaborUnits",
    "scheduleVariance",
    "scheduleVarianceIndex",
    "scheduleVarianceIndexLaborUnits",
    "scheduleVarianceLaborUnits",
    "scopePercentComplete",
    "secondaryConstraintDate",
    "secondaryConstraintType",
    "startDate",
    "startDate1Variance",
    "startDateVariance",
    "status",
    "statusCode",
    "suspendDate",
    "taskStatusCompletion",
    "taskStatusDates",
    "taskStatusIndicator",
    "toCompletePerformanceIndex",
    "totalCost1Variance",
    "totalCostVariance",
    "totalFloat",
    "type",
    "unitsPercentComplete",
    "unreadCommentCount",
    "wbsCode",
    "wbsName",
    "wbsNamePath",
    "wbsObjectId",
    "wbsPath",
    "workPackageId",
    "workPackageName"
})
public class Activity {

    @XmlElementRef(name = "AccountingVariance", namespace = "http://xmlns.oracle.com/Primavera/P6/WS/Activity/V1", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> accountingVariance;
    @XmlElementRef(name = "AccountingVarianceLaborUnits", namespace = "http://xmlns.oracle.com/Primavera/P6/WS/Activity/V1", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> accountingVarianceLaborUnits;
    @XmlElement(name = "ActivityOwnerUserId")
    protected Integer activityOwnerUserId;
    @XmlElementRef(name = "ActualDuration", namespace = "http://xmlns.oracle.com/Primavera/P6/WS/Activity/V1", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> actualDuration;
    @XmlElementRef(name = "ActualExpenseCost", namespace = "http://xmlns.oracle.com/Primavera/P6/WS/Activity/V1", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> actualExpenseCost;
    @XmlElementRef(name = "ActualFinishDate", namespace = "http://xmlns.oracle.com/Primavera/P6/WS/Activity/V1", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> actualFinishDate;
    @XmlElement(name = "ActualLaborCost")
    protected Double actualLaborCost;
    @XmlElement(name = "ActualLaborUnits")
    protected Double actualLaborUnits;
    @XmlElementRef(name = "ActualMaterialCost", namespace = "http://xmlns.oracle.com/Primavera/P6/WS/Activity/V1", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> actualMaterialCost;
    @XmlElement(name = "ActualNonLaborCost")
    protected Double actualNonLaborCost;
    @XmlElement(name = "ActualNonLaborUnits")
    protected Double actualNonLaborUnits;
    @XmlElementRef(name = "ActualStartDate", namespace = "http://xmlns.oracle.com/Primavera/P6/WS/Activity/V1", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> actualStartDate;
    @XmlElement(name = "ActualThisPeriodLaborCost")
    protected Double actualThisPeriodLaborCost;
    @XmlElementRef(name = "ActualThisPeriodLaborUnits", namespace = "http://xmlns.oracle.com/Primavera/P6/WS/Activity/V1", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> actualThisPeriodLaborUnits;
    @XmlElementRef(name = "ActualThisPeriodMaterialCost", namespace = "http://xmlns.oracle.com/Primavera/P6/WS/Activity/V1", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> actualThisPeriodMaterialCost;
    @XmlElement(name = "ActualThisPeriodNonLaborCost")
    protected Double actualThisPeriodNonLaborCost;
    @XmlElementRef(name = "ActualThisPeriodNonLaborUnits", namespace = "http://xmlns.oracle.com/Primavera/P6/WS/Activity/V1", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> actualThisPeriodNonLaborUnits;
    @XmlElementRef(name = "ActualTotalCost", namespace = "http://xmlns.oracle.com/Primavera/P6/WS/Activity/V1", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> actualTotalCost;
    @XmlElementRef(name = "ActualTotalUnits", namespace = "http://xmlns.oracle.com/Primavera/P6/WS/Activity/V1", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> actualTotalUnits;
    @XmlElement(name = "AtCompletionDuration")
    protected Double atCompletionDuration;
    @XmlElementRef(name = "AtCompletionExpenseCost", namespace = "http://xmlns.oracle.com/Primavera/P6/WS/Activity/V1", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> atCompletionExpenseCost;
    @XmlElement(name = "AtCompletionLaborCost")
    protected Double atCompletionLaborCost;
    @XmlElement(name = "AtCompletionLaborUnits")
    protected Double atCompletionLaborUnits;
    @XmlElementRef(name = "AtCompletionLaborUnitsVariance", namespace = "http://xmlns.oracle.com/Primavera/P6/WS/Activity/V1", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> atCompletionLaborUnitsVariance;
    @XmlElementRef(name = "AtCompletionMaterialCost", namespace = "http://xmlns.oracle.com/Primavera/P6/WS/Activity/V1", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> atCompletionMaterialCost;
    @XmlElement(name = "AtCompletionNonLaborCost")
    protected Double atCompletionNonLaborCost;
    @XmlElement(name = "AtCompletionNonLaborUnits")
    protected Double atCompletionNonLaborUnits;
    @XmlElementRef(name = "AtCompletionTotalCost", namespace = "http://xmlns.oracle.com/Primavera/P6/WS/Activity/V1", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> atCompletionTotalCost;
    @XmlElementRef(name = "AtCompletionTotalUnits", namespace = "http://xmlns.oracle.com/Primavera/P6/WS/Activity/V1", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> atCompletionTotalUnits;
    @XmlElementRef(name = "AtCompletionVariance", namespace = "http://xmlns.oracle.com/Primavera/P6/WS/Activity/V1", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> atCompletionVariance;
    @XmlElement(name = "AutoComputeActuals")
    protected Boolean autoComputeActuals;
    @XmlElementRef(name = "Baseline1Duration", namespace = "http://xmlns.oracle.com/Primavera/P6/WS/Activity/V1", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> baseline1Duration;
    @XmlElementRef(name = "Baseline1FinishDate", namespace = "http://xmlns.oracle.com/Primavera/P6/WS/Activity/V1", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> baseline1FinishDate;
    @XmlElementRef(name = "Baseline1PlannedDuration", namespace = "http://xmlns.oracle.com/Primavera/P6/WS/Activity/V1", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> baseline1PlannedDuration;
    @XmlElementRef(name = "Baseline1PlannedExpenseCost", namespace = "http://xmlns.oracle.com/Primavera/P6/WS/Activity/V1", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> baseline1PlannedExpenseCost;
    @XmlElementRef(name = "Baseline1PlannedLaborCost", namespace = "http://xmlns.oracle.com/Primavera/P6/WS/Activity/V1", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> baseline1PlannedLaborCost;
    @XmlElementRef(name = "Baseline1PlannedLaborUnits", namespace = "http://xmlns.oracle.com/Primavera/P6/WS/Activity/V1", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> baseline1PlannedLaborUnits;
    @XmlElementRef(name = "Baseline1PlannedMaterialCost", namespace = "http://xmlns.oracle.com/Primavera/P6/WS/Activity/V1", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> baseline1PlannedMaterialCost;
    @XmlElementRef(name = "Baseline1PlannedNonLaborCost", namespace = "http://xmlns.oracle.com/Primavera/P6/WS/Activity/V1", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> baseline1PlannedNonLaborCost;
    @XmlElementRef(name = "Baseline1PlannedNonLaborUnits", namespace = "http://xmlns.oracle.com/Primavera/P6/WS/Activity/V1", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> baseline1PlannedNonLaborUnits;
    @XmlElementRef(name = "Baseline1PlannedTotalCost", namespace = "http://xmlns.oracle.com/Primavera/P6/WS/Activity/V1", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> baseline1PlannedTotalCost;
    @XmlElementRef(name = "Baseline1StartDate", namespace = "http://xmlns.oracle.com/Primavera/P6/WS/Activity/V1", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> baseline1StartDate;
    @XmlElementRef(name = "BaselineDuration", namespace = "http://xmlns.oracle.com/Primavera/P6/WS/Activity/V1", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> baselineDuration;
    @XmlElementRef(name = "BaselineFinishDate", namespace = "http://xmlns.oracle.com/Primavera/P6/WS/Activity/V1", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> baselineFinishDate;
    @XmlElementRef(name = "BaselinePlannedDuration", namespace = "http://xmlns.oracle.com/Primavera/P6/WS/Activity/V1", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> baselinePlannedDuration;
    @XmlElementRef(name = "BaselinePlannedExpenseCost", namespace = "http://xmlns.oracle.com/Primavera/P6/WS/Activity/V1", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> baselinePlannedExpenseCost;
    @XmlElementRef(name = "BaselinePlannedLaborCost", namespace = "http://xmlns.oracle.com/Primavera/P6/WS/Activity/V1", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> baselinePlannedLaborCost;
    @XmlElementRef(name = "BaselinePlannedLaborUnits", namespace = "http://xmlns.oracle.com/Primavera/P6/WS/Activity/V1", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> baselinePlannedLaborUnits;
    @XmlElementRef(name = "BaselinePlannedMaterialCost", namespace = "http://xmlns.oracle.com/Primavera/P6/WS/Activity/V1", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> baselinePlannedMaterialCost;
    @XmlElementRef(name = "BaselinePlannedNonLaborCost", namespace = "http://xmlns.oracle.com/Primavera/P6/WS/Activity/V1", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> baselinePlannedNonLaborCost;
    @XmlElementRef(name = "BaselinePlannedNonLaborUnits", namespace = "http://xmlns.oracle.com/Primavera/P6/WS/Activity/V1", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> baselinePlannedNonLaborUnits;
    @XmlElementRef(name = "BaselinePlannedTotalCost", namespace = "http://xmlns.oracle.com/Primavera/P6/WS/Activity/V1", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> baselinePlannedTotalCost;
    @XmlElementRef(name = "BaselineStartDate", namespace = "http://xmlns.oracle.com/Primavera/P6/WS/Activity/V1", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> baselineStartDate;
    @XmlElementRef(name = "BudgetAtCompletion", namespace = "http://xmlns.oracle.com/Primavera/P6/WS/Activity/V1", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> budgetAtCompletion;
    @XmlElement(name = "CBSCode")
    protected String cbsCode;
    @XmlElementRef(name = "CBSId", namespace = "http://xmlns.oracle.com/Primavera/P6/WS/Activity/V1", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> cbsId;
    @XmlElementRef(name = "CBSObjectId", namespace = "http://xmlns.oracle.com/Primavera/P6/WS/Activity/V1", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> cbsObjectId;
    @XmlElement(name = "CalendarName")
    protected String calendarName;
    @XmlElement(name = "CalendarObjectId")
    protected Integer calendarObjectId;
    @XmlElementRef(name = "CostPercentComplete", namespace = "http://xmlns.oracle.com/Primavera/P6/WS/Activity/V1", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> costPercentComplete;
    @XmlElementRef(name = "CostPercentOfPlanned", namespace = "http://xmlns.oracle.com/Primavera/P6/WS/Activity/V1", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> costPercentOfPlanned;
    @XmlElementRef(name = "CostPerformanceIndex", namespace = "http://xmlns.oracle.com/Primavera/P6/WS/Activity/V1", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> costPerformanceIndex;
    @XmlElementRef(name = "CostPerformanceIndexLaborUnits", namespace = "http://xmlns.oracle.com/Primavera/P6/WS/Activity/V1", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> costPerformanceIndexLaborUnits;
    @XmlElementRef(name = "CostVariance", namespace = "http://xmlns.oracle.com/Primavera/P6/WS/Activity/V1", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> costVariance;
    @XmlElementRef(name = "CostVarianceIndex", namespace = "http://xmlns.oracle.com/Primavera/P6/WS/Activity/V1", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> costVarianceIndex;
    @XmlElementRef(name = "CostVarianceIndexLaborUnits", namespace = "http://xmlns.oracle.com/Primavera/P6/WS/Activity/V1", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> costVarianceIndexLaborUnits;
    @XmlElementRef(name = "CostVarianceLaborUnits", namespace = "http://xmlns.oracle.com/Primavera/P6/WS/Activity/V1", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> costVarianceLaborUnits;
    @XmlElementRef(name = "CreateDate", namespace = "http://xmlns.oracle.com/Primavera/P6/WS/Activity/V1", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> createDate;
    @XmlElement(name = "CreateUser")
    protected String createUser;
    @XmlElementRef(name = "DataDate", namespace = "http://xmlns.oracle.com/Primavera/P6/WS/Activity/V1", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> dataDate;
    @XmlElementRef(name = "Duration1Variance", namespace = "http://xmlns.oracle.com/Primavera/P6/WS/Activity/V1", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> duration1Variance;
    @XmlElementRef(name = "DurationPercentComplete", namespace = "http://xmlns.oracle.com/Primavera/P6/WS/Activity/V1", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> durationPercentComplete;
    @XmlElementRef(name = "DurationPercentOfPlanned", namespace = "http://xmlns.oracle.com/Primavera/P6/WS/Activity/V1", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> durationPercentOfPlanned;
    @XmlElement(name = "DurationType")
    protected String durationType;
    @XmlElementRef(name = "DurationVariance", namespace = "http://xmlns.oracle.com/Primavera/P6/WS/Activity/V1", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> durationVariance;
    @XmlElementRef(name = "EarlyFinishDate", namespace = "http://xmlns.oracle.com/Primavera/P6/WS/Activity/V1", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> earlyFinishDate;
    @XmlElementRef(name = "EarlyStartDate", namespace = "http://xmlns.oracle.com/Primavera/P6/WS/Activity/V1", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> earlyStartDate;
    @XmlElementRef(name = "EarnedValueCost", namespace = "http://xmlns.oracle.com/Primavera/P6/WS/Activity/V1", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> earnedValueCost;
    @XmlElementRef(name = "EarnedValueLaborUnits", namespace = "http://xmlns.oracle.com/Primavera/P6/WS/Activity/V1", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> earnedValueLaborUnits;
    @XmlElementRef(name = "EstimateAtCompletionCost", namespace = "http://xmlns.oracle.com/Primavera/P6/WS/Activity/V1", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> estimateAtCompletionCost;
    @XmlElementRef(name = "EstimateAtCompletionLaborUnits", namespace = "http://xmlns.oracle.com/Primavera/P6/WS/Activity/V1", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> estimateAtCompletionLaborUnits;
    @XmlElementRef(name = "EstimateToComplete", namespace = "http://xmlns.oracle.com/Primavera/P6/WS/Activity/V1", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> estimateToComplete;
    @XmlElementRef(name = "EstimateToCompleteLaborUnits", namespace = "http://xmlns.oracle.com/Primavera/P6/WS/Activity/V1", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> estimateToCompleteLaborUnits;
    @XmlElement(name = "EstimatedWeight")
    protected Double estimatedWeight;
    @XmlElementRef(name = "ExpectedFinishDate", namespace = "http://xmlns.oracle.com/Primavera/P6/WS/Activity/V1", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> expectedFinishDate;
    @XmlElementRef(name = "ExpenseCost1Variance", namespace = "http://xmlns.oracle.com/Primavera/P6/WS/Activity/V1", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> expenseCost1Variance;
    @XmlElementRef(name = "ExpenseCostPercentComplete", namespace = "http://xmlns.oracle.com/Primavera/P6/WS/Activity/V1", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> expenseCostPercentComplete;
    @XmlElementRef(name = "ExpenseCostVariance", namespace = "http://xmlns.oracle.com/Primavera/P6/WS/Activity/V1", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> expenseCostVariance;
    @XmlElementRef(name = "ExternalEarlyStartDate", namespace = "http://xmlns.oracle.com/Primavera/P6/WS/Activity/V1", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> externalEarlyStartDate;
    @XmlElementRef(name = "ExternalLateFinishDate", namespace = "http://xmlns.oracle.com/Primavera/P6/WS/Activity/V1", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> externalLateFinishDate;
    @XmlElement(name = "Feedback")
    protected String feedback;
    @XmlElement(name = "FinishDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar finishDate;
    @XmlElementRef(name = "FinishDate1Variance", namespace = "http://xmlns.oracle.com/Primavera/P6/WS/Activity/V1", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> finishDate1Variance;
    @XmlElementRef(name = "FinishDateVariance", namespace = "http://xmlns.oracle.com/Primavera/P6/WS/Activity/V1", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> finishDateVariance;
    @XmlElementRef(name = "FloatPath", namespace = "http://xmlns.oracle.com/Primavera/P6/WS/Activity/V1", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> floatPath;
    @XmlElementRef(name = "FloatPathOrder", namespace = "http://xmlns.oracle.com/Primavera/P6/WS/Activity/V1", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> floatPathOrder;
    @XmlElementRef(name = "FreeFloat", namespace = "http://xmlns.oracle.com/Primavera/P6/WS/Activity/V1", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> freeFloat;
    @XmlElement(name = "GUID")
    protected String guid;
    @XmlElementRef(name = "HasFutureBucketData", namespace = "http://xmlns.oracle.com/Primavera/P6/WS/Activity/V1", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> hasFutureBucketData;
    @XmlElement(name = "Id")
    protected String id;
    @XmlElement(name = "IsBaseline")
    protected Boolean isBaseline;
    @XmlElementRef(name = "IsCritical", namespace = "http://xmlns.oracle.com/Primavera/P6/WS/Activity/V1", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> isCritical;
    @XmlElementRef(name = "IsLongestPath", namespace = "http://xmlns.oracle.com/Primavera/P6/WS/Activity/V1", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> isLongestPath;
    @XmlElement(name = "IsNewFeedback")
    protected Boolean isNewFeedback;
    @XmlElementRef(name = "IsStarred", namespace = "http://xmlns.oracle.com/Primavera/P6/WS/Activity/V1", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> isStarred;
    @XmlElement(name = "IsTemplate")
    protected Boolean isTemplate;
    @XmlElementRef(name = "IsWorkPackage", namespace = "http://xmlns.oracle.com/Primavera/P6/WS/Activity/V1", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> isWorkPackage;
    @XmlElementRef(name = "LaborCost1Variance", namespace = "http://xmlns.oracle.com/Primavera/P6/WS/Activity/V1", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> laborCost1Variance;
    @XmlElementRef(name = "LaborCostPercentComplete", namespace = "http://xmlns.oracle.com/Primavera/P6/WS/Activity/V1", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> laborCostPercentComplete;
    @XmlElementRef(name = "LaborCostVariance", namespace = "http://xmlns.oracle.com/Primavera/P6/WS/Activity/V1", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> laborCostVariance;
    @XmlElementRef(name = "LaborUnits1Variance", namespace = "http://xmlns.oracle.com/Primavera/P6/WS/Activity/V1", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> laborUnits1Variance;
    @XmlElementRef(name = "LaborUnitsPercentComplete", namespace = "http://xmlns.oracle.com/Primavera/P6/WS/Activity/V1", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> laborUnitsPercentComplete;
    @XmlElementRef(name = "LaborUnitsVariance", namespace = "http://xmlns.oracle.com/Primavera/P6/WS/Activity/V1", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> laborUnitsVariance;
    @XmlElementRef(name = "LastUpdateDate", namespace = "http://xmlns.oracle.com/Primavera/P6/WS/Activity/V1", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> lastUpdateDate;
    @XmlElement(name = "LastUpdateUser")
    protected String lastUpdateUser;
    @XmlElementRef(name = "LateFinishDate", namespace = "http://xmlns.oracle.com/Primavera/P6/WS/Activity/V1", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> lateFinishDate;
    @XmlElementRef(name = "LateStartDate", namespace = "http://xmlns.oracle.com/Primavera/P6/WS/Activity/V1", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> lateStartDate;
    @XmlElement(name = "LevelingPriority")
    protected String levelingPriority;
    @XmlElement(name = "LocationName")
    protected String locationName;
    @XmlElementRef(name = "LocationObjectId", namespace = "http://xmlns.oracle.com/Primavera/P6/WS/Activity/V1", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> locationObjectId;
    @XmlElementRef(name = "MaterialCost1Variance", namespace = "http://xmlns.oracle.com/Primavera/P6/WS/Activity/V1", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> materialCost1Variance;
    @XmlElementRef(name = "MaterialCostPercentComplete", namespace = "http://xmlns.oracle.com/Primavera/P6/WS/Activity/V1", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> materialCostPercentComplete;
    @XmlElementRef(name = "MaterialCostVariance", namespace = "http://xmlns.oracle.com/Primavera/P6/WS/Activity/V1", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> materialCostVariance;
    @XmlElementRef(name = "MaximumDuration", namespace = "http://xmlns.oracle.com/Primavera/P6/WS/Activity/V1", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> maximumDuration;
    @XmlElementRef(name = "MinimumDuration", namespace = "http://xmlns.oracle.com/Primavera/P6/WS/Activity/V1", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> minimumDuration;
    @XmlElementRef(name = "MostLikelyDuration", namespace = "http://xmlns.oracle.com/Primavera/P6/WS/Activity/V1", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> mostLikelyDuration;
    @XmlElement(name = "Name")
    protected String name;
    @XmlElementRef(name = "NonLaborCost1Variance", namespace = "http://xmlns.oracle.com/Primavera/P6/WS/Activity/V1", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> nonLaborCost1Variance;
    @XmlElementRef(name = "NonLaborCostPercentComplete", namespace = "http://xmlns.oracle.com/Primavera/P6/WS/Activity/V1", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> nonLaborCostPercentComplete;
    @XmlElementRef(name = "NonLaborCostVariance", namespace = "http://xmlns.oracle.com/Primavera/P6/WS/Activity/V1", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> nonLaborCostVariance;
    @XmlElementRef(name = "NonLaborUnits1Variance", namespace = "http://xmlns.oracle.com/Primavera/P6/WS/Activity/V1", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> nonLaborUnits1Variance;
    @XmlElementRef(name = "NonLaborUnitsPercentComplete", namespace = "http://xmlns.oracle.com/Primavera/P6/WS/Activity/V1", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> nonLaborUnitsPercentComplete;
    @XmlElementRef(name = "NonLaborUnitsVariance", namespace = "http://xmlns.oracle.com/Primavera/P6/WS/Activity/V1", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> nonLaborUnitsVariance;
    @XmlElement(name = "NotesToResources")
    protected String notesToResources;
    @XmlElement(name = "ObjectId")
    protected Integer objectId;
    @XmlElement(name = "OwnerIDArray")
    protected String ownerIDArray;
    @XmlElement(name = "OwnerNamesArray")
    protected String ownerNamesArray;
    @XmlElementRef(name = "PercentComplete", namespace = "http://xmlns.oracle.com/Primavera/P6/WS/Activity/V1", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> percentComplete;
    @XmlElement(name = "PercentCompleteType")
    protected String percentCompleteType;
    @XmlElementRef(name = "PerformancePercentComplete", namespace = "http://xmlns.oracle.com/Primavera/P6/WS/Activity/V1", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> performancePercentComplete;
    @XmlElementRef(name = "PerformancePercentCompleteByLaborUnits", namespace = "http://xmlns.oracle.com/Primavera/P6/WS/Activity/V1", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> performancePercentCompleteByLaborUnits;
    @XmlElement(name = "PhysicalPercentComplete")
    protected Double physicalPercentComplete;
    @XmlElement(name = "PlannedDuration")
    protected Double plannedDuration;
    @XmlElementRef(name = "PlannedExpenseCost", namespace = "http://xmlns.oracle.com/Primavera/P6/WS/Activity/V1", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> plannedExpenseCost;
    @XmlElement(name = "PlannedFinishDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar plannedFinishDate;
    @XmlElement(name = "PlannedLaborCost")
    protected Double plannedLaborCost;
    @XmlElement(name = "PlannedLaborUnits")
    protected Double plannedLaborUnits;
    @XmlElementRef(name = "PlannedMaterialCost", namespace = "http://xmlns.oracle.com/Primavera/P6/WS/Activity/V1", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> plannedMaterialCost;
    @XmlElement(name = "PlannedNonLaborCost")
    protected Double plannedNonLaborCost;
    @XmlElement(name = "PlannedNonLaborUnits")
    protected Double plannedNonLaborUnits;
    @XmlElement(name = "PlannedStartDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar plannedStartDate;
    @XmlElementRef(name = "PlannedTotalCost", namespace = "http://xmlns.oracle.com/Primavera/P6/WS/Activity/V1", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> plannedTotalCost;
    @XmlElementRef(name = "PlannedTotalUnits", namespace = "http://xmlns.oracle.com/Primavera/P6/WS/Activity/V1", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> plannedTotalUnits;
    @XmlElementRef(name = "PlannedValueCost", namespace = "http://xmlns.oracle.com/Primavera/P6/WS/Activity/V1", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> plannedValueCost;
    @XmlElementRef(name = "PlannedValueLaborUnits", namespace = "http://xmlns.oracle.com/Primavera/P6/WS/Activity/V1", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> plannedValueLaborUnits;
    @XmlElementRef(name = "PostRespCriticalityIndex", namespace = "http://xmlns.oracle.com/Primavera/P6/WS/Activity/V1", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> postRespCriticalityIndex;
    @XmlElementRef(name = "PostResponsePessimisticFinish", namespace = "http://xmlns.oracle.com/Primavera/P6/WS/Activity/V1", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> postResponsePessimisticFinish;
    @XmlElementRef(name = "PostResponsePessimisticStart", namespace = "http://xmlns.oracle.com/Primavera/P6/WS/Activity/V1", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> postResponsePessimisticStart;
    @XmlElementRef(name = "PreRespCriticalityIndex", namespace = "http://xmlns.oracle.com/Primavera/P6/WS/Activity/V1", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> preRespCriticalityIndex;
    @XmlElementRef(name = "PreResponsePessimisticFinish", namespace = "http://xmlns.oracle.com/Primavera/P6/WS/Activity/V1", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> preResponsePessimisticFinish;
    @XmlElementRef(name = "PreResponsePessimisticStart", namespace = "http://xmlns.oracle.com/Primavera/P6/WS/Activity/V1", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> preResponsePessimisticStart;
    @XmlElementRef(name = "PrimaryConstraintDate", namespace = "http://xmlns.oracle.com/Primavera/P6/WS/Activity/V1", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> primaryConstraintDate;
    @XmlElement(name = "PrimaryConstraintType")
    protected String primaryConstraintType;
    @XmlElement(name = "PrimaryResourceId")
    protected String primaryResourceId;
    @XmlElement(name = "PrimaryResourceName")
    protected String primaryResourceName;
    @XmlElementRef(name = "PrimaryResourceObjectId", namespace = "http://xmlns.oracle.com/Primavera/P6/WS/Activity/V1", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> primaryResourceObjectId;
    @XmlElement(name = "ProjectFlag")
    protected String projectFlag;
    @XmlElement(name = "ProjectId")
    protected String projectId;
    @XmlElement(name = "ProjectName")
    protected String projectName;
    @XmlElement(name = "ProjectObjectId")
    protected Integer projectObjectId;
    @XmlElement(name = "ProjectProjectFlag")
    protected String projectProjectFlag;
    @XmlElementRef(name = "RemainingDuration", namespace = "http://xmlns.oracle.com/Primavera/P6/WS/Activity/V1", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> remainingDuration;
    @XmlElementRef(name = "RemainingEarlyFinishDate", namespace = "http://xmlns.oracle.com/Primavera/P6/WS/Activity/V1", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> remainingEarlyFinishDate;
    @XmlElementRef(name = "RemainingEarlyStartDate", namespace = "http://xmlns.oracle.com/Primavera/P6/WS/Activity/V1", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> remainingEarlyStartDate;
    @XmlElementRef(name = "RemainingExpenseCost", namespace = "http://xmlns.oracle.com/Primavera/P6/WS/Activity/V1", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> remainingExpenseCost;
    @XmlElementRef(name = "RemainingFloat", namespace = "http://xmlns.oracle.com/Primavera/P6/WS/Activity/V1", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> remainingFloat;
    @XmlElementRef(name = "RemainingLaborCost", namespace = "http://xmlns.oracle.com/Primavera/P6/WS/Activity/V1", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> remainingLaborCost;
    @XmlElement(name = "RemainingLaborUnits")
    protected Double remainingLaborUnits;
    @XmlElementRef(name = "RemainingLateFinishDate", namespace = "http://xmlns.oracle.com/Primavera/P6/WS/Activity/V1", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> remainingLateFinishDate;
    @XmlElementRef(name = "RemainingLateStartDate", namespace = "http://xmlns.oracle.com/Primavera/P6/WS/Activity/V1", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> remainingLateStartDate;
    @XmlElementRef(name = "RemainingMaterialCost", namespace = "http://xmlns.oracle.com/Primavera/P6/WS/Activity/V1", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> remainingMaterialCost;
    @XmlElementRef(name = "RemainingNonLaborCost", namespace = "http://xmlns.oracle.com/Primavera/P6/WS/Activity/V1", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> remainingNonLaborCost;
    @XmlElement(name = "RemainingNonLaborUnits")
    protected Double remainingNonLaborUnits;
    @XmlElementRef(name = "RemainingTotalCost", namespace = "http://xmlns.oracle.com/Primavera/P6/WS/Activity/V1", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> remainingTotalCost;
    @XmlElementRef(name = "RemainingTotalUnits", namespace = "http://xmlns.oracle.com/Primavera/P6/WS/Activity/V1", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> remainingTotalUnits;
    @XmlElementRef(name = "ResumeDate", namespace = "http://xmlns.oracle.com/Primavera/P6/WS/Activity/V1", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> resumeDate;
    @XmlElementRef(name = "ReviewFinishDate", namespace = "http://xmlns.oracle.com/Primavera/P6/WS/Activity/V1", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> reviewFinishDate;
    @XmlElement(name = "ReviewRequired")
    protected Boolean reviewRequired;
    @XmlElement(name = "ReviewStatus")
    protected String reviewStatus;
    @XmlElementRef(name = "SchedulePercentComplete", namespace = "http://xmlns.oracle.com/Primavera/P6/WS/Activity/V1", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> schedulePercentComplete;
    @XmlElementRef(name = "SchedulePerformanceIndex", namespace = "http://xmlns.oracle.com/Primavera/P6/WS/Activity/V1", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> schedulePerformanceIndex;
    @XmlElementRef(name = "SchedulePerformanceIndexLaborUnits", namespace = "http://xmlns.oracle.com/Primavera/P6/WS/Activity/V1", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> schedulePerformanceIndexLaborUnits;
    @XmlElementRef(name = "ScheduleVariance", namespace = "http://xmlns.oracle.com/Primavera/P6/WS/Activity/V1", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> scheduleVariance;
    @XmlElementRef(name = "ScheduleVarianceIndex", namespace = "http://xmlns.oracle.com/Primavera/P6/WS/Activity/V1", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> scheduleVarianceIndex;
    @XmlElementRef(name = "ScheduleVarianceIndexLaborUnits", namespace = "http://xmlns.oracle.com/Primavera/P6/WS/Activity/V1", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> scheduleVarianceIndexLaborUnits;
    @XmlElementRef(name = "ScheduleVarianceLaborUnits", namespace = "http://xmlns.oracle.com/Primavera/P6/WS/Activity/V1", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> scheduleVarianceLaborUnits;
    @XmlElement(name = "ScopePercentComplete")
    protected Double scopePercentComplete;
    @XmlElementRef(name = "SecondaryConstraintDate", namespace = "http://xmlns.oracle.com/Primavera/P6/WS/Activity/V1", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> secondaryConstraintDate;
    @XmlElement(name = "SecondaryConstraintType")
    protected String secondaryConstraintType;
    @XmlElement(name = "StartDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar startDate;
    @XmlElementRef(name = "StartDate1Variance", namespace = "http://xmlns.oracle.com/Primavera/P6/WS/Activity/V1", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> startDate1Variance;
    @XmlElementRef(name = "StartDateVariance", namespace = "http://xmlns.oracle.com/Primavera/P6/WS/Activity/V1", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> startDateVariance;
    @XmlElement(name = "Status")
    protected String status;
    @XmlElement(name = "StatusCode")
    protected String statusCode;
    @XmlElementRef(name = "SuspendDate", namespace = "http://xmlns.oracle.com/Primavera/P6/WS/Activity/V1", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> suspendDate;
    @XmlElement(name = "TaskStatusCompletion")
    protected String taskStatusCompletion;
    @XmlElement(name = "TaskStatusDates")
    protected String taskStatusDates;
    @XmlElementRef(name = "TaskStatusIndicator", namespace = "http://xmlns.oracle.com/Primavera/P6/WS/Activity/V1", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> taskStatusIndicator;
    @XmlElementRef(name = "ToCompletePerformanceIndex", namespace = "http://xmlns.oracle.com/Primavera/P6/WS/Activity/V1", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> toCompletePerformanceIndex;
    @XmlElementRef(name = "TotalCost1Variance", namespace = "http://xmlns.oracle.com/Primavera/P6/WS/Activity/V1", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> totalCost1Variance;
    @XmlElementRef(name = "TotalCostVariance", namespace = "http://xmlns.oracle.com/Primavera/P6/WS/Activity/V1", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> totalCostVariance;
    @XmlElementRef(name = "TotalFloat", namespace = "http://xmlns.oracle.com/Primavera/P6/WS/Activity/V1", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> totalFloat;
    @XmlElement(name = "Type")
    protected String type;
    @XmlElementRef(name = "UnitsPercentComplete", namespace = "http://xmlns.oracle.com/Primavera/P6/WS/Activity/V1", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> unitsPercentComplete;
    @XmlElementRef(name = "UnreadCommentCount", namespace = "http://xmlns.oracle.com/Primavera/P6/WS/Activity/V1", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> unreadCommentCount;
    @XmlElement(name = "WBSCode")
    protected String wbsCode;
    @XmlElement(name = "WBSName")
    protected String wbsName;
    @XmlElement(name = "WBSNamePath")
    protected String wbsNamePath;
    @XmlElementRef(name = "WBSObjectId", namespace = "http://xmlns.oracle.com/Primavera/P6/WS/Activity/V1", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> wbsObjectId;
    @XmlElement(name = "WBSPath")
    protected String wbsPath;
    @XmlElement(name = "WorkPackageId")
    protected String workPackageId;
    @XmlElement(name = "WorkPackageName")
    protected String workPackageName;

    /**
     * ��ȡaccountingVariance���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getAccountingVariance() {
        return accountingVariance;
    }

    /**
     * ����accountingVariance���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setAccountingVariance(JAXBElement<Double> value) {
        this.accountingVariance = value;
    }

    /**
     * ��ȡaccountingVarianceLaborUnits���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getAccountingVarianceLaborUnits() {
        return accountingVarianceLaborUnits;
    }

    /**
     * ����accountingVarianceLaborUnits���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setAccountingVarianceLaborUnits(JAXBElement<Double> value) {
        this.accountingVarianceLaborUnits = value;
    }

    /**
     * ��ȡactivityOwnerUserId���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getActivityOwnerUserId() {
        return activityOwnerUserId;
    }

    /**
     * ����activityOwnerUserId���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setActivityOwnerUserId(Integer value) {
        this.activityOwnerUserId = value;
    }

    /**
     * ��ȡactualDuration���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getActualDuration() {
        return actualDuration;
    }

    /**
     * ����actualDuration���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setActualDuration(JAXBElement<Double> value) {
        this.actualDuration = value;
    }

    /**
     * ��ȡactualExpenseCost���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getActualExpenseCost() {
        return actualExpenseCost;
    }

    /**
     * ����actualExpenseCost���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setActualExpenseCost(JAXBElement<Double> value) {
        this.actualExpenseCost = value;
    }

    /**
     * ��ȡactualFinishDate���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getActualFinishDate() {
        return actualFinishDate;
    }

    /**
     * ����actualFinishDate���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setActualFinishDate(JAXBElement<XMLGregorianCalendar> value) {
        this.actualFinishDate = value;
    }

    /**
     * ��ȡactualLaborCost���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getActualLaborCost() {
        return actualLaborCost;
    }

    /**
     * ����actualLaborCost���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setActualLaborCost(Double value) {
        this.actualLaborCost = value;
    }

    /**
     * ��ȡactualLaborUnits���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getActualLaborUnits() {
        return actualLaborUnits;
    }

    /**
     * ����actualLaborUnits���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setActualLaborUnits(Double value) {
        this.actualLaborUnits = value;
    }

    /**
     * ��ȡactualMaterialCost���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getActualMaterialCost() {
        return actualMaterialCost;
    }

    /**
     * ����actualMaterialCost���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setActualMaterialCost(JAXBElement<Double> value) {
        this.actualMaterialCost = value;
    }

    /**
     * ��ȡactualNonLaborCost���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getActualNonLaborCost() {
        return actualNonLaborCost;
    }

    /**
     * ����actualNonLaborCost���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setActualNonLaborCost(Double value) {
        this.actualNonLaborCost = value;
    }

    /**
     * ��ȡactualNonLaborUnits���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getActualNonLaborUnits() {
        return actualNonLaborUnits;
    }

    /**
     * ����actualNonLaborUnits���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setActualNonLaborUnits(Double value) {
        this.actualNonLaborUnits = value;
    }

    /**
     * ��ȡactualStartDate���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getActualStartDate() {
        return actualStartDate;
    }

    /**
     * ����actualStartDate���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setActualStartDate(JAXBElement<XMLGregorianCalendar> value) {
        this.actualStartDate = value;
    }

    /**
     * ��ȡactualThisPeriodLaborCost���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getActualThisPeriodLaborCost() {
        return actualThisPeriodLaborCost;
    }

    /**
     * ����actualThisPeriodLaborCost���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setActualThisPeriodLaborCost(Double value) {
        this.actualThisPeriodLaborCost = value;
    }

    /**
     * ��ȡactualThisPeriodLaborUnits���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getActualThisPeriodLaborUnits() {
        return actualThisPeriodLaborUnits;
    }

    /**
     * ����actualThisPeriodLaborUnits���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setActualThisPeriodLaborUnits(JAXBElement<Double> value) {
        this.actualThisPeriodLaborUnits = value;
    }

    /**
     * ��ȡactualThisPeriodMaterialCost���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getActualThisPeriodMaterialCost() {
        return actualThisPeriodMaterialCost;
    }

    /**
     * ����actualThisPeriodMaterialCost���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setActualThisPeriodMaterialCost(JAXBElement<Double> value) {
        this.actualThisPeriodMaterialCost = value;
    }

    /**
     * ��ȡactualThisPeriodNonLaborCost���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getActualThisPeriodNonLaborCost() {
        return actualThisPeriodNonLaborCost;
    }

    /**
     * ����actualThisPeriodNonLaborCost���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setActualThisPeriodNonLaborCost(Double value) {
        this.actualThisPeriodNonLaborCost = value;
    }

    /**
     * ��ȡactualThisPeriodNonLaborUnits���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getActualThisPeriodNonLaborUnits() {
        return actualThisPeriodNonLaborUnits;
    }

    /**
     * ����actualThisPeriodNonLaborUnits���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setActualThisPeriodNonLaborUnits(JAXBElement<Double> value) {
        this.actualThisPeriodNonLaborUnits = value;
    }

    /**
     * ��ȡactualTotalCost���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getActualTotalCost() {
        return actualTotalCost;
    }

    /**
     * ����actualTotalCost���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setActualTotalCost(JAXBElement<Double> value) {
        this.actualTotalCost = value;
    }

    /**
     * ��ȡactualTotalUnits���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getActualTotalUnits() {
        return actualTotalUnits;
    }

    /**
     * ����actualTotalUnits���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setActualTotalUnits(JAXBElement<Double> value) {
        this.actualTotalUnits = value;
    }

    /**
     * ��ȡatCompletionDuration���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getAtCompletionDuration() {
        return atCompletionDuration;
    }

    /**
     * ����atCompletionDuration���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setAtCompletionDuration(Double value) {
        this.atCompletionDuration = value;
    }

    /**
     * ��ȡatCompletionExpenseCost���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getAtCompletionExpenseCost() {
        return atCompletionExpenseCost;
    }

    /**
     * ����atCompletionExpenseCost���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setAtCompletionExpenseCost(JAXBElement<Double> value) {
        this.atCompletionExpenseCost = value;
    }

    /**
     * ��ȡatCompletionLaborCost���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getAtCompletionLaborCost() {
        return atCompletionLaborCost;
    }

    /**
     * ����atCompletionLaborCost���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setAtCompletionLaborCost(Double value) {
        this.atCompletionLaborCost = value;
    }

    /**
     * ��ȡatCompletionLaborUnits���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getAtCompletionLaborUnits() {
        return atCompletionLaborUnits;
    }

    /**
     * ����atCompletionLaborUnits���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setAtCompletionLaborUnits(Double value) {
        this.atCompletionLaborUnits = value;
    }

    /**
     * ��ȡatCompletionLaborUnitsVariance���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getAtCompletionLaborUnitsVariance() {
        return atCompletionLaborUnitsVariance;
    }

    /**
     * ����atCompletionLaborUnitsVariance���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setAtCompletionLaborUnitsVariance(JAXBElement<Double> value) {
        this.atCompletionLaborUnitsVariance = value;
    }

    /**
     * ��ȡatCompletionMaterialCost���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getAtCompletionMaterialCost() {
        return atCompletionMaterialCost;
    }

    /**
     * ����atCompletionMaterialCost���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setAtCompletionMaterialCost(JAXBElement<Double> value) {
        this.atCompletionMaterialCost = value;
    }

    /**
     * ��ȡatCompletionNonLaborCost���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getAtCompletionNonLaborCost() {
        return atCompletionNonLaborCost;
    }

    /**
     * ����atCompletionNonLaborCost���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setAtCompletionNonLaborCost(Double value) {
        this.atCompletionNonLaborCost = value;
    }

    /**
     * ��ȡatCompletionNonLaborUnits���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getAtCompletionNonLaborUnits() {
        return atCompletionNonLaborUnits;
    }

    /**
     * ����atCompletionNonLaborUnits���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setAtCompletionNonLaborUnits(Double value) {
        this.atCompletionNonLaborUnits = value;
    }

    /**
     * ��ȡatCompletionTotalCost���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getAtCompletionTotalCost() {
        return atCompletionTotalCost;
    }

    /**
     * ����atCompletionTotalCost���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setAtCompletionTotalCost(JAXBElement<Double> value) {
        this.atCompletionTotalCost = value;
    }

    /**
     * ��ȡatCompletionTotalUnits���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getAtCompletionTotalUnits() {
        return atCompletionTotalUnits;
    }

    /**
     * ����atCompletionTotalUnits���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setAtCompletionTotalUnits(JAXBElement<Double> value) {
        this.atCompletionTotalUnits = value;
    }

    /**
     * ��ȡatCompletionVariance���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getAtCompletionVariance() {
        return atCompletionVariance;
    }

    /**
     * ����atCompletionVariance���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setAtCompletionVariance(JAXBElement<Double> value) {
        this.atCompletionVariance = value;
    }

    /**
     * ��ȡautoComputeActuals���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAutoComputeActuals() {
        return autoComputeActuals;
    }

    /**
     * ����autoComputeActuals���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAutoComputeActuals(Boolean value) {
        this.autoComputeActuals = value;
    }

    /**
     * ��ȡbaseline1Duration���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getBaseline1Duration() {
        return baseline1Duration;
    }

    /**
     * ����baseline1Duration���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setBaseline1Duration(JAXBElement<Double> value) {
        this.baseline1Duration = value;
    }

    /**
     * ��ȡbaseline1FinishDate���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getBaseline1FinishDate() {
        return baseline1FinishDate;
    }

    /**
     * ����baseline1FinishDate���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setBaseline1FinishDate(JAXBElement<XMLGregorianCalendar> value) {
        this.baseline1FinishDate = value;
    }

    /**
     * ��ȡbaseline1PlannedDuration���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getBaseline1PlannedDuration() {
        return baseline1PlannedDuration;
    }

    /**
     * ����baseline1PlannedDuration���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setBaseline1PlannedDuration(JAXBElement<Double> value) {
        this.baseline1PlannedDuration = value;
    }

    /**
     * ��ȡbaseline1PlannedExpenseCost���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getBaseline1PlannedExpenseCost() {
        return baseline1PlannedExpenseCost;
    }

    /**
     * ����baseline1PlannedExpenseCost���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setBaseline1PlannedExpenseCost(JAXBElement<Double> value) {
        this.baseline1PlannedExpenseCost = value;
    }

    /**
     * ��ȡbaseline1PlannedLaborCost���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getBaseline1PlannedLaborCost() {
        return baseline1PlannedLaborCost;
    }

    /**
     * ����baseline1PlannedLaborCost���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setBaseline1PlannedLaborCost(JAXBElement<Double> value) {
        this.baseline1PlannedLaborCost = value;
    }

    /**
     * ��ȡbaseline1PlannedLaborUnits���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getBaseline1PlannedLaborUnits() {
        return baseline1PlannedLaborUnits;
    }

    /**
     * ����baseline1PlannedLaborUnits���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setBaseline1PlannedLaborUnits(JAXBElement<Double> value) {
        this.baseline1PlannedLaborUnits = value;
    }

    /**
     * ��ȡbaseline1PlannedMaterialCost���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getBaseline1PlannedMaterialCost() {
        return baseline1PlannedMaterialCost;
    }

    /**
     * ����baseline1PlannedMaterialCost���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setBaseline1PlannedMaterialCost(JAXBElement<Double> value) {
        this.baseline1PlannedMaterialCost = value;
    }

    /**
     * ��ȡbaseline1PlannedNonLaborCost���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getBaseline1PlannedNonLaborCost() {
        return baseline1PlannedNonLaborCost;
    }

    /**
     * ����baseline1PlannedNonLaborCost���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setBaseline1PlannedNonLaborCost(JAXBElement<Double> value) {
        this.baseline1PlannedNonLaborCost = value;
    }

    /**
     * ��ȡbaseline1PlannedNonLaborUnits���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getBaseline1PlannedNonLaborUnits() {
        return baseline1PlannedNonLaborUnits;
    }

    /**
     * ����baseline1PlannedNonLaborUnits���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setBaseline1PlannedNonLaborUnits(JAXBElement<Double> value) {
        this.baseline1PlannedNonLaborUnits = value;
    }

    /**
     * ��ȡbaseline1PlannedTotalCost���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getBaseline1PlannedTotalCost() {
        return baseline1PlannedTotalCost;
    }

    /**
     * ����baseline1PlannedTotalCost���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setBaseline1PlannedTotalCost(JAXBElement<Double> value) {
        this.baseline1PlannedTotalCost = value;
    }

    /**
     * ��ȡbaseline1StartDate���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getBaseline1StartDate() {
        return baseline1StartDate;
    }

    /**
     * ����baseline1StartDate���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setBaseline1StartDate(JAXBElement<XMLGregorianCalendar> value) {
        this.baseline1StartDate = value;
    }

    /**
     * ��ȡbaselineDuration���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getBaselineDuration() {
        return baselineDuration;
    }

    /**
     * ����baselineDuration���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setBaselineDuration(JAXBElement<Double> value) {
        this.baselineDuration = value;
    }

    /**
     * ��ȡbaselineFinishDate���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getBaselineFinishDate() {
        return baselineFinishDate;
    }

    /**
     * ����baselineFinishDate���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setBaselineFinishDate(JAXBElement<XMLGregorianCalendar> value) {
        this.baselineFinishDate = value;
    }

    /**
     * ��ȡbaselinePlannedDuration���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getBaselinePlannedDuration() {
        return baselinePlannedDuration;
    }

    /**
     * ����baselinePlannedDuration���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setBaselinePlannedDuration(JAXBElement<Double> value) {
        this.baselinePlannedDuration = value;
    }

    /**
     * ��ȡbaselinePlannedExpenseCost���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getBaselinePlannedExpenseCost() {
        return baselinePlannedExpenseCost;
    }

    /**
     * ����baselinePlannedExpenseCost���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setBaselinePlannedExpenseCost(JAXBElement<Double> value) {
        this.baselinePlannedExpenseCost = value;
    }

    /**
     * ��ȡbaselinePlannedLaborCost���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getBaselinePlannedLaborCost() {
        return baselinePlannedLaborCost;
    }

    /**
     * ����baselinePlannedLaborCost���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setBaselinePlannedLaborCost(JAXBElement<Double> value) {
        this.baselinePlannedLaborCost = value;
    }

    /**
     * ��ȡbaselinePlannedLaborUnits���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getBaselinePlannedLaborUnits() {
        return baselinePlannedLaborUnits;
    }

    /**
     * ����baselinePlannedLaborUnits���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setBaselinePlannedLaborUnits(JAXBElement<Double> value) {
        this.baselinePlannedLaborUnits = value;
    }

    /**
     * ��ȡbaselinePlannedMaterialCost���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getBaselinePlannedMaterialCost() {
        return baselinePlannedMaterialCost;
    }

    /**
     * ����baselinePlannedMaterialCost���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setBaselinePlannedMaterialCost(JAXBElement<Double> value) {
        this.baselinePlannedMaterialCost = value;
    }

    /**
     * ��ȡbaselinePlannedNonLaborCost���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getBaselinePlannedNonLaborCost() {
        return baselinePlannedNonLaborCost;
    }

    /**
     * ����baselinePlannedNonLaborCost���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setBaselinePlannedNonLaborCost(JAXBElement<Double> value) {
        this.baselinePlannedNonLaborCost = value;
    }

    /**
     * ��ȡbaselinePlannedNonLaborUnits���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getBaselinePlannedNonLaborUnits() {
        return baselinePlannedNonLaborUnits;
    }

    /**
     * ����baselinePlannedNonLaborUnits���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setBaselinePlannedNonLaborUnits(JAXBElement<Double> value) {
        this.baselinePlannedNonLaborUnits = value;
    }

    /**
     * ��ȡbaselinePlannedTotalCost���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getBaselinePlannedTotalCost() {
        return baselinePlannedTotalCost;
    }

    /**
     * ����baselinePlannedTotalCost���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setBaselinePlannedTotalCost(JAXBElement<Double> value) {
        this.baselinePlannedTotalCost = value;
    }

    /**
     * ��ȡbaselineStartDate���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getBaselineStartDate() {
        return baselineStartDate;
    }

    /**
     * ����baselineStartDate���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setBaselineStartDate(JAXBElement<XMLGregorianCalendar> value) {
        this.baselineStartDate = value;
    }

    /**
     * ��ȡbudgetAtCompletion���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getBudgetAtCompletion() {
        return budgetAtCompletion;
    }

    /**
     * ����budgetAtCompletion���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setBudgetAtCompletion(JAXBElement<Double> value) {
        this.budgetAtCompletion = value;
    }

    /**
     * ��ȡcbsCode���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCBSCode() {
        return cbsCode;
    }

    /**
     * ����cbsCode���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCBSCode(String value) {
        this.cbsCode = value;
    }

    /**
     * ��ȡcbsId���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getCBSId() {
        return cbsId;
    }

    /**
     * ����cbsId���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setCBSId(JAXBElement<Integer> value) {
        this.cbsId = value;
    }

    /**
     * ��ȡcbsObjectId���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getCBSObjectId() {
        return cbsObjectId;
    }

    /**
     * ����cbsObjectId���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setCBSObjectId(JAXBElement<Integer> value) {
        this.cbsObjectId = value;
    }

    /**
     * ��ȡcalendarName���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCalendarName() {
        return calendarName;
    }

    /**
     * ����calendarName���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCalendarName(String value) {
        this.calendarName = value;
    }

    /**
     * ��ȡcalendarObjectId���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCalendarObjectId() {
        return calendarObjectId;
    }

    /**
     * ����calendarObjectId���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCalendarObjectId(Integer value) {
        this.calendarObjectId = value;
    }

    /**
     * ��ȡcostPercentComplete���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getCostPercentComplete() {
        return costPercentComplete;
    }

    /**
     * ����costPercentComplete���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setCostPercentComplete(JAXBElement<Double> value) {
        this.costPercentComplete = value;
    }

    /**
     * ��ȡcostPercentOfPlanned���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getCostPercentOfPlanned() {
        return costPercentOfPlanned;
    }

    /**
     * ����costPercentOfPlanned���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setCostPercentOfPlanned(JAXBElement<Double> value) {
        this.costPercentOfPlanned = value;
    }

    /**
     * ��ȡcostPerformanceIndex���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getCostPerformanceIndex() {
        return costPerformanceIndex;
    }

    /**
     * ����costPerformanceIndex���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setCostPerformanceIndex(JAXBElement<Double> value) {
        this.costPerformanceIndex = value;
    }

    /**
     * ��ȡcostPerformanceIndexLaborUnits���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getCostPerformanceIndexLaborUnits() {
        return costPerformanceIndexLaborUnits;
    }

    /**
     * ����costPerformanceIndexLaborUnits���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setCostPerformanceIndexLaborUnits(JAXBElement<Double> value) {
        this.costPerformanceIndexLaborUnits = value;
    }

    /**
     * ��ȡcostVariance���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getCostVariance() {
        return costVariance;
    }

    /**
     * ����costVariance���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setCostVariance(JAXBElement<Double> value) {
        this.costVariance = value;
    }

    /**
     * ��ȡcostVarianceIndex���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getCostVarianceIndex() {
        return costVarianceIndex;
    }

    /**
     * ����costVarianceIndex���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setCostVarianceIndex(JAXBElement<Double> value) {
        this.costVarianceIndex = value;
    }

    /**
     * ��ȡcostVarianceIndexLaborUnits���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getCostVarianceIndexLaborUnits() {
        return costVarianceIndexLaborUnits;
    }

    /**
     * ����costVarianceIndexLaborUnits���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setCostVarianceIndexLaborUnits(JAXBElement<Double> value) {
        this.costVarianceIndexLaborUnits = value;
    }

    /**
     * ��ȡcostVarianceLaborUnits���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getCostVarianceLaborUnits() {
        return costVarianceLaborUnits;
    }

    /**
     * ����costVarianceLaborUnits���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setCostVarianceLaborUnits(JAXBElement<Double> value) {
        this.costVarianceLaborUnits = value;
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
     * ��ȡdataDate���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getDataDate() {
        return dataDate;
    }

    /**
     * ����dataDate���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setDataDate(JAXBElement<XMLGregorianCalendar> value) {
        this.dataDate = value;
    }

    /**
     * ��ȡduration1Variance���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getDuration1Variance() {
        return duration1Variance;
    }

    /**
     * ����duration1Variance���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setDuration1Variance(JAXBElement<Double> value) {
        this.duration1Variance = value;
    }

    /**
     * ��ȡdurationPercentComplete���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getDurationPercentComplete() {
        return durationPercentComplete;
    }

    /**
     * ����durationPercentComplete���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setDurationPercentComplete(JAXBElement<Double> value) {
        this.durationPercentComplete = value;
    }

    /**
     * ��ȡdurationPercentOfPlanned���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getDurationPercentOfPlanned() {
        return durationPercentOfPlanned;
    }

    /**
     * ����durationPercentOfPlanned���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setDurationPercentOfPlanned(JAXBElement<Double> value) {
        this.durationPercentOfPlanned = value;
    }

    /**
     * ��ȡdurationType���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDurationType() {
        return durationType;
    }

    /**
     * ����durationType���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDurationType(String value) {
        this.durationType = value;
    }

    /**
     * ��ȡdurationVariance���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getDurationVariance() {
        return durationVariance;
    }

    /**
     * ����durationVariance���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setDurationVariance(JAXBElement<Double> value) {
        this.durationVariance = value;
    }

    /**
     * ��ȡearlyFinishDate���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getEarlyFinishDate() {
        return earlyFinishDate;
    }

    /**
     * ����earlyFinishDate���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setEarlyFinishDate(JAXBElement<XMLGregorianCalendar> value) {
        this.earlyFinishDate = value;
    }

    /**
     * ��ȡearlyStartDate���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getEarlyStartDate() {
        return earlyStartDate;
    }

    /**
     * ����earlyStartDate���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setEarlyStartDate(JAXBElement<XMLGregorianCalendar> value) {
        this.earlyStartDate = value;
    }

    /**
     * ��ȡearnedValueCost���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getEarnedValueCost() {
        return earnedValueCost;
    }

    /**
     * ����earnedValueCost���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setEarnedValueCost(JAXBElement<Double> value) {
        this.earnedValueCost = value;
    }

    /**
     * ��ȡearnedValueLaborUnits���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getEarnedValueLaborUnits() {
        return earnedValueLaborUnits;
    }

    /**
     * ����earnedValueLaborUnits���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setEarnedValueLaborUnits(JAXBElement<Double> value) {
        this.earnedValueLaborUnits = value;
    }

    /**
     * ��ȡestimateAtCompletionCost���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getEstimateAtCompletionCost() {
        return estimateAtCompletionCost;
    }

    /**
     * ����estimateAtCompletionCost���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setEstimateAtCompletionCost(JAXBElement<Double> value) {
        this.estimateAtCompletionCost = value;
    }

    /**
     * ��ȡestimateAtCompletionLaborUnits���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getEstimateAtCompletionLaborUnits() {
        return estimateAtCompletionLaborUnits;
    }

    /**
     * ����estimateAtCompletionLaborUnits���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setEstimateAtCompletionLaborUnits(JAXBElement<Double> value) {
        this.estimateAtCompletionLaborUnits = value;
    }

    /**
     * ��ȡestimateToComplete���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getEstimateToComplete() {
        return estimateToComplete;
    }

    /**
     * ����estimateToComplete���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setEstimateToComplete(JAXBElement<Double> value) {
        this.estimateToComplete = value;
    }

    /**
     * ��ȡestimateToCompleteLaborUnits���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getEstimateToCompleteLaborUnits() {
        return estimateToCompleteLaborUnits;
    }

    /**
     * ����estimateToCompleteLaborUnits���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setEstimateToCompleteLaborUnits(JAXBElement<Double> value) {
        this.estimateToCompleteLaborUnits = value;
    }

    /**
     * ��ȡestimatedWeight���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getEstimatedWeight() {
        return estimatedWeight;
    }

    /**
     * ����estimatedWeight���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setEstimatedWeight(Double value) {
        this.estimatedWeight = value;
    }

    /**
     * ��ȡexpectedFinishDate���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getExpectedFinishDate() {
        return expectedFinishDate;
    }

    /**
     * ����expectedFinishDate���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setExpectedFinishDate(JAXBElement<XMLGregorianCalendar> value) {
        this.expectedFinishDate = value;
    }

    /**
     * ��ȡexpenseCost1Variance���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getExpenseCost1Variance() {
        return expenseCost1Variance;
    }

    /**
     * ����expenseCost1Variance���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setExpenseCost1Variance(JAXBElement<Double> value) {
        this.expenseCost1Variance = value;
    }

    /**
     * ��ȡexpenseCostPercentComplete���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getExpenseCostPercentComplete() {
        return expenseCostPercentComplete;
    }

    /**
     * ����expenseCostPercentComplete���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setExpenseCostPercentComplete(JAXBElement<Double> value) {
        this.expenseCostPercentComplete = value;
    }

    /**
     * ��ȡexpenseCostVariance���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getExpenseCostVariance() {
        return expenseCostVariance;
    }

    /**
     * ����expenseCostVariance���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setExpenseCostVariance(JAXBElement<Double> value) {
        this.expenseCostVariance = value;
    }

    /**
     * ��ȡexternalEarlyStartDate���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getExternalEarlyStartDate() {
        return externalEarlyStartDate;
    }

    /**
     * ����externalEarlyStartDate���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setExternalEarlyStartDate(JAXBElement<XMLGregorianCalendar> value) {
        this.externalEarlyStartDate = value;
    }

    /**
     * ��ȡexternalLateFinishDate���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getExternalLateFinishDate() {
        return externalLateFinishDate;
    }

    /**
     * ����externalLateFinishDate���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setExternalLateFinishDate(JAXBElement<XMLGregorianCalendar> value) {
        this.externalLateFinishDate = value;
    }

    /**
     * ��ȡfeedback���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFeedback() {
        return feedback;
    }

    /**
     * ����feedback���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFeedback(String value) {
        this.feedback = value;
    }

    /**
     * ��ȡfinishDate���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFinishDate() {
        return finishDate;
    }

    /**
     * ����finishDate���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFinishDate(XMLGregorianCalendar value) {
        this.finishDate = value;
    }

    /**
     * ��ȡfinishDate1Variance���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getFinishDate1Variance() {
        return finishDate1Variance;
    }

    /**
     * ����finishDate1Variance���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setFinishDate1Variance(JAXBElement<Double> value) {
        this.finishDate1Variance = value;
    }

    /**
     * ��ȡfinishDateVariance���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getFinishDateVariance() {
        return finishDateVariance;
    }

    /**
     * ����finishDateVariance���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setFinishDateVariance(JAXBElement<Double> value) {
        this.finishDateVariance = value;
    }

    /**
     * ��ȡfloatPath���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getFloatPath() {
        return floatPath;
    }

    /**
     * ����floatPath���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setFloatPath(JAXBElement<Integer> value) {
        this.floatPath = value;
    }

    /**
     * ��ȡfloatPathOrder���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getFloatPathOrder() {
        return floatPathOrder;
    }

    /**
     * ����floatPathOrder���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setFloatPathOrder(JAXBElement<Integer> value) {
        this.floatPathOrder = value;
    }

    /**
     * ��ȡfreeFloat���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getFreeFloat() {
        return freeFloat;
    }

    /**
     * ����freeFloat���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setFreeFloat(JAXBElement<Double> value) {
        this.freeFloat = value;
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
     * ��ȡhasFutureBucketData���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getHasFutureBucketData() {
        return hasFutureBucketData;
    }

    /**
     * ����hasFutureBucketData���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setHasFutureBucketData(JAXBElement<Boolean> value) {
        this.hasFutureBucketData = value;
    }

    /**
     * ��ȡid���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * ����id���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * ��ȡisBaseline���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsBaseline() {
        return isBaseline;
    }

    /**
     * ����isBaseline���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsBaseline(Boolean value) {
        this.isBaseline = value;
    }

    /**
     * ��ȡisCritical���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getIsCritical() {
        return isCritical;
    }

    /**
     * ����isCritical���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setIsCritical(JAXBElement<Boolean> value) {
        this.isCritical = value;
    }

    /**
     * ��ȡisLongestPath���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getIsLongestPath() {
        return isLongestPath;
    }

    /**
     * ����isLongestPath���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setIsLongestPath(JAXBElement<Boolean> value) {
        this.isLongestPath = value;
    }

    /**
     * ��ȡisNewFeedback���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsNewFeedback() {
        return isNewFeedback;
    }

    /**
     * ����isNewFeedback���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsNewFeedback(Boolean value) {
        this.isNewFeedback = value;
    }

    /**
     * ��ȡisStarred���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getIsStarred() {
        return isStarred;
    }

    /**
     * ����isStarred���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setIsStarred(JAXBElement<Boolean> value) {
        this.isStarred = value;
    }

    /**
     * ��ȡisTemplate���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsTemplate() {
        return isTemplate;
    }

    /**
     * ����isTemplate���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsTemplate(Boolean value) {
        this.isTemplate = value;
    }

    /**
     * ��ȡisWorkPackage���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getIsWorkPackage() {
        return isWorkPackage;
    }

    /**
     * ����isWorkPackage���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setIsWorkPackage(JAXBElement<Boolean> value) {
        this.isWorkPackage = value;
    }

    /**
     * ��ȡlaborCost1Variance���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getLaborCost1Variance() {
        return laborCost1Variance;
    }

    /**
     * ����laborCost1Variance���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setLaborCost1Variance(JAXBElement<Double> value) {
        this.laborCost1Variance = value;
    }

    /**
     * ��ȡlaborCostPercentComplete���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getLaborCostPercentComplete() {
        return laborCostPercentComplete;
    }

    /**
     * ����laborCostPercentComplete���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setLaborCostPercentComplete(JAXBElement<Double> value) {
        this.laborCostPercentComplete = value;
    }

    /**
     * ��ȡlaborCostVariance���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getLaborCostVariance() {
        return laborCostVariance;
    }

    /**
     * ����laborCostVariance���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setLaborCostVariance(JAXBElement<Double> value) {
        this.laborCostVariance = value;
    }

    /**
     * ��ȡlaborUnits1Variance���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getLaborUnits1Variance() {
        return laborUnits1Variance;
    }

    /**
     * ����laborUnits1Variance���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setLaborUnits1Variance(JAXBElement<Double> value) {
        this.laborUnits1Variance = value;
    }

    /**
     * ��ȡlaborUnitsPercentComplete���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getLaborUnitsPercentComplete() {
        return laborUnitsPercentComplete;
    }

    /**
     * ����laborUnitsPercentComplete���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setLaborUnitsPercentComplete(JAXBElement<Double> value) {
        this.laborUnitsPercentComplete = value;
    }

    /**
     * ��ȡlaborUnitsVariance���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getLaborUnitsVariance() {
        return laborUnitsVariance;
    }

    /**
     * ����laborUnitsVariance���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setLaborUnitsVariance(JAXBElement<Double> value) {
        this.laborUnitsVariance = value;
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
     * ��ȡlateFinishDate���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getLateFinishDate() {
        return lateFinishDate;
    }

    /**
     * ����lateFinishDate���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setLateFinishDate(JAXBElement<XMLGregorianCalendar> value) {
        this.lateFinishDate = value;
    }

    /**
     * ��ȡlateStartDate���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getLateStartDate() {
        return lateStartDate;
    }

    /**
     * ����lateStartDate���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setLateStartDate(JAXBElement<XMLGregorianCalendar> value) {
        this.lateStartDate = value;
    }

    /**
     * ��ȡlevelingPriority���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLevelingPriority() {
        return levelingPriority;
    }

    /**
     * ����levelingPriority���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLevelingPriority(String value) {
        this.levelingPriority = value;
    }

    /**
     * ��ȡlocationName���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocationName() {
        return locationName;
    }

    /**
     * ����locationName���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocationName(String value) {
        this.locationName = value;
    }

    /**
     * ��ȡlocationObjectId���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getLocationObjectId() {
        return locationObjectId;
    }

    /**
     * ����locationObjectId���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setLocationObjectId(JAXBElement<Integer> value) {
        this.locationObjectId = value;
    }

    /**
     * ��ȡmaterialCost1Variance���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getMaterialCost1Variance() {
        return materialCost1Variance;
    }

    /**
     * ����materialCost1Variance���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setMaterialCost1Variance(JAXBElement<Double> value) {
        this.materialCost1Variance = value;
    }

    /**
     * ��ȡmaterialCostPercentComplete���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getMaterialCostPercentComplete() {
        return materialCostPercentComplete;
    }

    /**
     * ����materialCostPercentComplete���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setMaterialCostPercentComplete(JAXBElement<Double> value) {
        this.materialCostPercentComplete = value;
    }

    /**
     * ��ȡmaterialCostVariance���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getMaterialCostVariance() {
        return materialCostVariance;
    }

    /**
     * ����materialCostVariance���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setMaterialCostVariance(JAXBElement<Double> value) {
        this.materialCostVariance = value;
    }

    /**
     * ��ȡmaximumDuration���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getMaximumDuration() {
        return maximumDuration;
    }

    /**
     * ����maximumDuration���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setMaximumDuration(JAXBElement<Double> value) {
        this.maximumDuration = value;
    }

    /**
     * ��ȡminimumDuration���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getMinimumDuration() {
        return minimumDuration;
    }

    /**
     * ����minimumDuration���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setMinimumDuration(JAXBElement<Double> value) {
        this.minimumDuration = value;
    }

    /**
     * ��ȡmostLikelyDuration���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getMostLikelyDuration() {
        return mostLikelyDuration;
    }

    /**
     * ����mostLikelyDuration���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setMostLikelyDuration(JAXBElement<Double> value) {
        this.mostLikelyDuration = value;
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
     * ��ȡnonLaborCost1Variance���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getNonLaborCost1Variance() {
        return nonLaborCost1Variance;
    }

    /**
     * ����nonLaborCost1Variance���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setNonLaborCost1Variance(JAXBElement<Double> value) {
        this.nonLaborCost1Variance = value;
    }

    /**
     * ��ȡnonLaborCostPercentComplete���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getNonLaborCostPercentComplete() {
        return nonLaborCostPercentComplete;
    }

    /**
     * ����nonLaborCostPercentComplete���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setNonLaborCostPercentComplete(JAXBElement<Double> value) {
        this.nonLaborCostPercentComplete = value;
    }

    /**
     * ��ȡnonLaborCostVariance���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getNonLaborCostVariance() {
        return nonLaborCostVariance;
    }

    /**
     * ����nonLaborCostVariance���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setNonLaborCostVariance(JAXBElement<Double> value) {
        this.nonLaborCostVariance = value;
    }

    /**
     * ��ȡnonLaborUnits1Variance���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getNonLaborUnits1Variance() {
        return nonLaborUnits1Variance;
    }

    /**
     * ����nonLaborUnits1Variance���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setNonLaborUnits1Variance(JAXBElement<Double> value) {
        this.nonLaborUnits1Variance = value;
    }

    /**
     * ��ȡnonLaborUnitsPercentComplete���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getNonLaborUnitsPercentComplete() {
        return nonLaborUnitsPercentComplete;
    }

    /**
     * ����nonLaborUnitsPercentComplete���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setNonLaborUnitsPercentComplete(JAXBElement<Double> value) {
        this.nonLaborUnitsPercentComplete = value;
    }

    /**
     * ��ȡnonLaborUnitsVariance���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getNonLaborUnitsVariance() {
        return nonLaborUnitsVariance;
    }

    /**
     * ����nonLaborUnitsVariance���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setNonLaborUnitsVariance(JAXBElement<Double> value) {
        this.nonLaborUnitsVariance = value;
    }

    /**
     * ��ȡnotesToResources���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNotesToResources() {
        return notesToResources;
    }

    /**
     * ����notesToResources���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNotesToResources(String value) {
        this.notesToResources = value;
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
     * ��ȡownerIDArray���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOwnerIDArray() {
        return ownerIDArray;
    }

    /**
     * ����ownerIDArray���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOwnerIDArray(String value) {
        this.ownerIDArray = value;
    }

    /**
     * ��ȡownerNamesArray���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOwnerNamesArray() {
        return ownerNamesArray;
    }

    /**
     * ����ownerNamesArray���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOwnerNamesArray(String value) {
        this.ownerNamesArray = value;
    }

    /**
     * ��ȡpercentComplete���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getPercentComplete() {
        return percentComplete;
    }

    /**
     * ����percentComplete���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setPercentComplete(JAXBElement<Double> value) {
        this.percentComplete = value;
    }

    /**
     * ��ȡpercentCompleteType���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPercentCompleteType() {
        return percentCompleteType;
    }

    /**
     * ����percentCompleteType���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPercentCompleteType(String value) {
        this.percentCompleteType = value;
    }

    /**
     * ��ȡperformancePercentComplete���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getPerformancePercentComplete() {
        return performancePercentComplete;
    }

    /**
     * ����performancePercentComplete���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setPerformancePercentComplete(JAXBElement<Double> value) {
        this.performancePercentComplete = value;
    }

    /**
     * ��ȡperformancePercentCompleteByLaborUnits���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getPerformancePercentCompleteByLaborUnits() {
        return performancePercentCompleteByLaborUnits;
    }

    /**
     * ����performancePercentCompleteByLaborUnits���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setPerformancePercentCompleteByLaborUnits(JAXBElement<Double> value) {
        this.performancePercentCompleteByLaborUnits = value;
    }

    /**
     * ��ȡphysicalPercentComplete���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getPhysicalPercentComplete() {
        return physicalPercentComplete;
    }

    /**
     * ����physicalPercentComplete���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setPhysicalPercentComplete(Double value) {
        this.physicalPercentComplete = value;
    }

    /**
     * ��ȡplannedDuration���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getPlannedDuration() {
        return plannedDuration;
    }

    /**
     * ����plannedDuration���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setPlannedDuration(Double value) {
        this.plannedDuration = value;
    }

    /**
     * ��ȡplannedExpenseCost���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getPlannedExpenseCost() {
        return plannedExpenseCost;
    }

    /**
     * ����plannedExpenseCost���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setPlannedExpenseCost(JAXBElement<Double> value) {
        this.plannedExpenseCost = value;
    }

    /**
     * ��ȡplannedFinishDate���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPlannedFinishDate() {
        return plannedFinishDate;
    }

    /**
     * ����plannedFinishDate���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPlannedFinishDate(XMLGregorianCalendar value) {
        this.plannedFinishDate = value;
    }

    /**
     * ��ȡplannedLaborCost���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getPlannedLaborCost() {
        return plannedLaborCost;
    }

    /**
     * ����plannedLaborCost���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setPlannedLaborCost(Double value) {
        this.plannedLaborCost = value;
    }

    /**
     * ��ȡplannedLaborUnits���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getPlannedLaborUnits() {
        return plannedLaborUnits;
    }

    /**
     * ����plannedLaborUnits���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setPlannedLaborUnits(Double value) {
        this.plannedLaborUnits = value;
    }

    /**
     * ��ȡplannedMaterialCost���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getPlannedMaterialCost() {
        return plannedMaterialCost;
    }

    /**
     * ����plannedMaterialCost���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setPlannedMaterialCost(JAXBElement<Double> value) {
        this.plannedMaterialCost = value;
    }

    /**
     * ��ȡplannedNonLaborCost���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getPlannedNonLaborCost() {
        return plannedNonLaborCost;
    }

    /**
     * ����plannedNonLaborCost���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setPlannedNonLaborCost(Double value) {
        this.plannedNonLaborCost = value;
    }

    /**
     * ��ȡplannedNonLaborUnits���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getPlannedNonLaborUnits() {
        return plannedNonLaborUnits;
    }

    /**
     * ����plannedNonLaborUnits���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setPlannedNonLaborUnits(Double value) {
        this.plannedNonLaborUnits = value;
    }

    /**
     * ��ȡplannedStartDate���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPlannedStartDate() {
        return plannedStartDate;
    }

    /**
     * ����plannedStartDate���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPlannedStartDate(XMLGregorianCalendar value) {
        this.plannedStartDate = value;
    }

    /**
     * ��ȡplannedTotalCost���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getPlannedTotalCost() {
        return plannedTotalCost;
    }

    /**
     * ����plannedTotalCost���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setPlannedTotalCost(JAXBElement<Double> value) {
        this.plannedTotalCost = value;
    }

    /**
     * ��ȡplannedTotalUnits���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getPlannedTotalUnits() {
        return plannedTotalUnits;
    }

    /**
     * ����plannedTotalUnits���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setPlannedTotalUnits(JAXBElement<Double> value) {
        this.plannedTotalUnits = value;
    }

    /**
     * ��ȡplannedValueCost���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getPlannedValueCost() {
        return plannedValueCost;
    }

    /**
     * ����plannedValueCost���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setPlannedValueCost(JAXBElement<Double> value) {
        this.plannedValueCost = value;
    }

    /**
     * ��ȡplannedValueLaborUnits���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getPlannedValueLaborUnits() {
        return plannedValueLaborUnits;
    }

    /**
     * ����plannedValueLaborUnits���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setPlannedValueLaborUnits(JAXBElement<Double> value) {
        this.plannedValueLaborUnits = value;
    }

    /**
     * ��ȡpostRespCriticalityIndex���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getPostRespCriticalityIndex() {
        return postRespCriticalityIndex;
    }

    /**
     * ����postRespCriticalityIndex���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setPostRespCriticalityIndex(JAXBElement<Double> value) {
        this.postRespCriticalityIndex = value;
    }

    /**
     * ��ȡpostResponsePessimisticFinish���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getPostResponsePessimisticFinish() {
        return postResponsePessimisticFinish;
    }

    /**
     * ����postResponsePessimisticFinish���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setPostResponsePessimisticFinish(JAXBElement<XMLGregorianCalendar> value) {
        this.postResponsePessimisticFinish = value;
    }

    /**
     * ��ȡpostResponsePessimisticStart���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getPostResponsePessimisticStart() {
        return postResponsePessimisticStart;
    }

    /**
     * ����postResponsePessimisticStart���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setPostResponsePessimisticStart(JAXBElement<XMLGregorianCalendar> value) {
        this.postResponsePessimisticStart = value;
    }

    /**
     * ��ȡpreRespCriticalityIndex���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getPreRespCriticalityIndex() {
        return preRespCriticalityIndex;
    }

    /**
     * ����preRespCriticalityIndex���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setPreRespCriticalityIndex(JAXBElement<Double> value) {
        this.preRespCriticalityIndex = value;
    }

    /**
     * ��ȡpreResponsePessimisticFinish���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getPreResponsePessimisticFinish() {
        return preResponsePessimisticFinish;
    }

    /**
     * ����preResponsePessimisticFinish���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setPreResponsePessimisticFinish(JAXBElement<XMLGregorianCalendar> value) {
        this.preResponsePessimisticFinish = value;
    }

    /**
     * ��ȡpreResponsePessimisticStart���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getPreResponsePessimisticStart() {
        return preResponsePessimisticStart;
    }

    /**
     * ����preResponsePessimisticStart���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setPreResponsePessimisticStart(JAXBElement<XMLGregorianCalendar> value) {
        this.preResponsePessimisticStart = value;
    }

    /**
     * ��ȡprimaryConstraintDate���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getPrimaryConstraintDate() {
        return primaryConstraintDate;
    }

    /**
     * ����primaryConstraintDate���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setPrimaryConstraintDate(JAXBElement<XMLGregorianCalendar> value) {
        this.primaryConstraintDate = value;
    }

    /**
     * ��ȡprimaryConstraintType���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrimaryConstraintType() {
        return primaryConstraintType;
    }

    /**
     * ����primaryConstraintType���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrimaryConstraintType(String value) {
        this.primaryConstraintType = value;
    }

    /**
     * ��ȡprimaryResourceId���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrimaryResourceId() {
        return primaryResourceId;
    }

    /**
     * ����primaryResourceId���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrimaryResourceId(String value) {
        this.primaryResourceId = value;
    }

    /**
     * ��ȡprimaryResourceName���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrimaryResourceName() {
        return primaryResourceName;
    }

    /**
     * ����primaryResourceName���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrimaryResourceName(String value) {
        this.primaryResourceName = value;
    }

    /**
     * ��ȡprimaryResourceObjectId���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getPrimaryResourceObjectId() {
        return primaryResourceObjectId;
    }

    /**
     * ����primaryResourceObjectId���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setPrimaryResourceObjectId(JAXBElement<Integer> value) {
        this.primaryResourceObjectId = value;
    }

    /**
     * ��ȡprojectFlag���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProjectFlag() {
        return projectFlag;
    }

    /**
     * ����projectFlag���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProjectFlag(String value) {
        this.projectFlag = value;
    }

    /**
     * ��ȡprojectId���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProjectId() {
        return projectId;
    }

    /**
     * ����projectId���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProjectId(String value) {
        this.projectId = value;
    }

    /**
     * ��ȡprojectName���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProjectName() {
        return projectName;
    }

    /**
     * ����projectName���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProjectName(String value) {
        this.projectName = value;
    }

    /**
     * ��ȡprojectObjectId���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getProjectObjectId() {
        return projectObjectId;
    }

    /**
     * ����projectObjectId���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setProjectObjectId(Integer value) {
        this.projectObjectId = value;
    }

    /**
     * ��ȡprojectProjectFlag���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProjectProjectFlag() {
        return projectProjectFlag;
    }

    /**
     * ����projectProjectFlag���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProjectProjectFlag(String value) {
        this.projectProjectFlag = value;
    }

    /**
     * ��ȡremainingDuration���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getRemainingDuration() {
        return remainingDuration;
    }

    /**
     * ����remainingDuration���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setRemainingDuration(JAXBElement<Double> value) {
        this.remainingDuration = value;
    }

    /**
     * ��ȡremainingEarlyFinishDate���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getRemainingEarlyFinishDate() {
        return remainingEarlyFinishDate;
    }

    /**
     * ����remainingEarlyFinishDate���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setRemainingEarlyFinishDate(JAXBElement<XMLGregorianCalendar> value) {
        this.remainingEarlyFinishDate = value;
    }

    /**
     * ��ȡremainingEarlyStartDate���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getRemainingEarlyStartDate() {
        return remainingEarlyStartDate;
    }

    /**
     * ����remainingEarlyStartDate���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setRemainingEarlyStartDate(JAXBElement<XMLGregorianCalendar> value) {
        this.remainingEarlyStartDate = value;
    }

    /**
     * ��ȡremainingExpenseCost���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getRemainingExpenseCost() {
        return remainingExpenseCost;
    }

    /**
     * ����remainingExpenseCost���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setRemainingExpenseCost(JAXBElement<Double> value) {
        this.remainingExpenseCost = value;
    }

    /**
     * ��ȡremainingFloat���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getRemainingFloat() {
        return remainingFloat;
    }

    /**
     * ����remainingFloat���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setRemainingFloat(JAXBElement<Double> value) {
        this.remainingFloat = value;
    }

    /**
     * ��ȡremainingLaborCost���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getRemainingLaborCost() {
        return remainingLaborCost;
    }

    /**
     * ����remainingLaborCost���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setRemainingLaborCost(JAXBElement<Double> value) {
        this.remainingLaborCost = value;
    }

    /**
     * ��ȡremainingLaborUnits���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getRemainingLaborUnits() {
        return remainingLaborUnits;
    }

    /**
     * ����remainingLaborUnits���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setRemainingLaborUnits(Double value) {
        this.remainingLaborUnits = value;
    }

    /**
     * ��ȡremainingLateFinishDate���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getRemainingLateFinishDate() {
        return remainingLateFinishDate;
    }

    /**
     * ����remainingLateFinishDate���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setRemainingLateFinishDate(JAXBElement<XMLGregorianCalendar> value) {
        this.remainingLateFinishDate = value;
    }

    /**
     * ��ȡremainingLateStartDate���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getRemainingLateStartDate() {
        return remainingLateStartDate;
    }

    /**
     * ����remainingLateStartDate���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setRemainingLateStartDate(JAXBElement<XMLGregorianCalendar> value) {
        this.remainingLateStartDate = value;
    }

    /**
     * ��ȡremainingMaterialCost���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getRemainingMaterialCost() {
        return remainingMaterialCost;
    }

    /**
     * ����remainingMaterialCost���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setRemainingMaterialCost(JAXBElement<Double> value) {
        this.remainingMaterialCost = value;
    }

    /**
     * ��ȡremainingNonLaborCost���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getRemainingNonLaborCost() {
        return remainingNonLaborCost;
    }

    /**
     * ����remainingNonLaborCost���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setRemainingNonLaborCost(JAXBElement<Double> value) {
        this.remainingNonLaborCost = value;
    }

    /**
     * ��ȡremainingNonLaborUnits���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getRemainingNonLaborUnits() {
        return remainingNonLaborUnits;
    }

    /**
     * ����remainingNonLaborUnits���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setRemainingNonLaborUnits(Double value) {
        this.remainingNonLaborUnits = value;
    }

    /**
     * ��ȡremainingTotalCost���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getRemainingTotalCost() {
        return remainingTotalCost;
    }

    /**
     * ����remainingTotalCost���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setRemainingTotalCost(JAXBElement<Double> value) {
        this.remainingTotalCost = value;
    }

    /**
     * ��ȡremainingTotalUnits���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getRemainingTotalUnits() {
        return remainingTotalUnits;
    }

    /**
     * ����remainingTotalUnits���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setRemainingTotalUnits(JAXBElement<Double> value) {
        this.remainingTotalUnits = value;
    }

    /**
     * ��ȡresumeDate���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getResumeDate() {
        return resumeDate;
    }

    /**
     * ����resumeDate���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setResumeDate(JAXBElement<XMLGregorianCalendar> value) {
        this.resumeDate = value;
    }

    /**
     * ��ȡreviewFinishDate���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getReviewFinishDate() {
        return reviewFinishDate;
    }

    /**
     * ����reviewFinishDate���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setReviewFinishDate(JAXBElement<XMLGregorianCalendar> value) {
        this.reviewFinishDate = value;
    }

    /**
     * ��ȡreviewRequired���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isReviewRequired() {
        return reviewRequired;
    }

    /**
     * ����reviewRequired���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setReviewRequired(Boolean value) {
        this.reviewRequired = value;
    }

    /**
     * ��ȡreviewStatus���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReviewStatus() {
        return reviewStatus;
    }

    /**
     * ����reviewStatus���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReviewStatus(String value) {
        this.reviewStatus = value;
    }

    /**
     * ��ȡschedulePercentComplete���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getSchedulePercentComplete() {
        return schedulePercentComplete;
    }

    /**
     * ����schedulePercentComplete���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setSchedulePercentComplete(JAXBElement<Double> value) {
        this.schedulePercentComplete = value;
    }

    /**
     * ��ȡschedulePerformanceIndex���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getSchedulePerformanceIndex() {
        return schedulePerformanceIndex;
    }

    /**
     * ����schedulePerformanceIndex���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setSchedulePerformanceIndex(JAXBElement<Double> value) {
        this.schedulePerformanceIndex = value;
    }

    /**
     * ��ȡschedulePerformanceIndexLaborUnits���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getSchedulePerformanceIndexLaborUnits() {
        return schedulePerformanceIndexLaborUnits;
    }

    /**
     * ����schedulePerformanceIndexLaborUnits���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setSchedulePerformanceIndexLaborUnits(JAXBElement<Double> value) {
        this.schedulePerformanceIndexLaborUnits = value;
    }

    /**
     * ��ȡscheduleVariance���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getScheduleVariance() {
        return scheduleVariance;
    }

    /**
     * ����scheduleVariance���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setScheduleVariance(JAXBElement<Double> value) {
        this.scheduleVariance = value;
    }

    /**
     * ��ȡscheduleVarianceIndex���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getScheduleVarianceIndex() {
        return scheduleVarianceIndex;
    }

    /**
     * ����scheduleVarianceIndex���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setScheduleVarianceIndex(JAXBElement<Double> value) {
        this.scheduleVarianceIndex = value;
    }

    /**
     * ��ȡscheduleVarianceIndexLaborUnits���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getScheduleVarianceIndexLaborUnits() {
        return scheduleVarianceIndexLaborUnits;
    }

    /**
     * ����scheduleVarianceIndexLaborUnits���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setScheduleVarianceIndexLaborUnits(JAXBElement<Double> value) {
        this.scheduleVarianceIndexLaborUnits = value;
    }

    /**
     * ��ȡscheduleVarianceLaborUnits���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getScheduleVarianceLaborUnits() {
        return scheduleVarianceLaborUnits;
    }

    /**
     * ����scheduleVarianceLaborUnits���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setScheduleVarianceLaborUnits(JAXBElement<Double> value) {
        this.scheduleVarianceLaborUnits = value;
    }

    /**
     * ��ȡscopePercentComplete���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getScopePercentComplete() {
        return scopePercentComplete;
    }

    /**
     * ����scopePercentComplete���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setScopePercentComplete(Double value) {
        this.scopePercentComplete = value;
    }

    /**
     * ��ȡsecondaryConstraintDate���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getSecondaryConstraintDate() {
        return secondaryConstraintDate;
    }

    /**
     * ����secondaryConstraintDate���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setSecondaryConstraintDate(JAXBElement<XMLGregorianCalendar> value) {
        this.secondaryConstraintDate = value;
    }

    /**
     * ��ȡsecondaryConstraintType���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSecondaryConstraintType() {
        return secondaryConstraintType;
    }

    /**
     * ����secondaryConstraintType���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSecondaryConstraintType(String value) {
        this.secondaryConstraintType = value;
    }

    /**
     * ��ȡstartDate���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStartDate() {
        return startDate;
    }

    /**
     * ����startDate���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStartDate(XMLGregorianCalendar value) {
        this.startDate = value;
    }

    /**
     * ��ȡstartDate1Variance���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getStartDate1Variance() {
        return startDate1Variance;
    }

    /**
     * ����startDate1Variance���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setStartDate1Variance(JAXBElement<Double> value) {
        this.startDate1Variance = value;
    }

    /**
     * ��ȡstartDateVariance���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getStartDateVariance() {
        return startDateVariance;
    }

    /**
     * ����startDateVariance���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setStartDateVariance(JAXBElement<Double> value) {
        this.startDateVariance = value;
    }

    /**
     * ��ȡstatus���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * ����status���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
    }

    /**
     * ��ȡstatusCode���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatusCode() {
        return statusCode;
    }

    /**
     * ����statusCode���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatusCode(String value) {
        this.statusCode = value;
    }

    /**
     * ��ȡsuspendDate���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getSuspendDate() {
        return suspendDate;
    }

    /**
     * ����suspendDate���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setSuspendDate(JAXBElement<XMLGregorianCalendar> value) {
        this.suspendDate = value;
    }

    /**
     * ��ȡtaskStatusCompletion���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaskStatusCompletion() {
        return taskStatusCompletion;
    }

    /**
     * ����taskStatusCompletion���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaskStatusCompletion(String value) {
        this.taskStatusCompletion = value;
    }

    /**
     * ��ȡtaskStatusDates���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaskStatusDates() {
        return taskStatusDates;
    }

    /**
     * ����taskStatusDates���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaskStatusDates(String value) {
        this.taskStatusDates = value;
    }

    /**
     * ��ȡtaskStatusIndicator���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getTaskStatusIndicator() {
        return taskStatusIndicator;
    }

    /**
     * ����taskStatusIndicator���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setTaskStatusIndicator(JAXBElement<Boolean> value) {
        this.taskStatusIndicator = value;
    }

    /**
     * ��ȡtoCompletePerformanceIndex���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getToCompletePerformanceIndex() {
        return toCompletePerformanceIndex;
    }

    /**
     * ����toCompletePerformanceIndex���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setToCompletePerformanceIndex(JAXBElement<Double> value) {
        this.toCompletePerformanceIndex = value;
    }

    /**
     * ��ȡtotalCost1Variance���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getTotalCost1Variance() {
        return totalCost1Variance;
    }

    /**
     * ����totalCost1Variance���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setTotalCost1Variance(JAXBElement<Double> value) {
        this.totalCost1Variance = value;
    }

    /**
     * ��ȡtotalCostVariance���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getTotalCostVariance() {
        return totalCostVariance;
    }

    /**
     * ����totalCostVariance���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setTotalCostVariance(JAXBElement<Double> value) {
        this.totalCostVariance = value;
    }

    /**
     * ��ȡtotalFloat���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getTotalFloat() {
        return totalFloat;
    }

    /**
     * ����totalFloat���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setTotalFloat(JAXBElement<Double> value) {
        this.totalFloat = value;
    }

    /**
     * ��ȡtype���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * ����type���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

    /**
     * ��ȡunitsPercentComplete���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getUnitsPercentComplete() {
        return unitsPercentComplete;
    }

    /**
     * ����unitsPercentComplete���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setUnitsPercentComplete(JAXBElement<Double> value) {
        this.unitsPercentComplete = value;
    }

    /**
     * ��ȡunreadCommentCount���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getUnreadCommentCount() {
        return unreadCommentCount;
    }

    /**
     * ����unreadCommentCount���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setUnreadCommentCount(JAXBElement<Integer> value) {
        this.unreadCommentCount = value;
    }

    /**
     * ��ȡwbsCode���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWBSCode() {
        return wbsCode;
    }

    /**
     * ����wbsCode���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWBSCode(String value) {
        this.wbsCode = value;
    }

    /**
     * ��ȡwbsName���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWBSName() {
        return wbsName;
    }

    /**
     * ����wbsName���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWBSName(String value) {
        this.wbsName = value;
    }

    /**
     * ��ȡwbsNamePath���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWBSNamePath() {
        return wbsNamePath;
    }

    /**
     * ����wbsNamePath���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWBSNamePath(String value) {
        this.wbsNamePath = value;
    }

    /**
     * ��ȡwbsObjectId���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getWBSObjectId() {
        return wbsObjectId;
    }

    /**
     * ����wbsObjectId���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setWBSObjectId(JAXBElement<Integer> value) {
        this.wbsObjectId = value;
    }

    /**
     * ��ȡwbsPath���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWBSPath() {
        return wbsPath;
    }

    /**
     * ����wbsPath���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWBSPath(String value) {
        this.wbsPath = value;
    }

    /**
     * ��ȡworkPackageId���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWorkPackageId() {
        return workPackageId;
    }

    /**
     * ����workPackageId���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWorkPackageId(String value) {
        this.workPackageId = value;
    }

    /**
     * ��ȡworkPackageName���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWorkPackageName() {
        return workPackageName;
    }

    /**
     * ����workPackageName���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWorkPackageName(String value) {
        this.workPackageName = value;
    }

}
