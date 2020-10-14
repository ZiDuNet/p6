
package com.wushuo.p6.ActivityPortType;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>CopyActivity complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="CopyActivity">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ObjectId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="TargetProjectObjectId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="TargetWBSObjectId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="TargetActivityId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CopyResourceAndRoleAssignments" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="CopyRelationships" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="CopyActivityCodes" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="CopyActivityNotes" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="CopyActivityExpenses" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="CopyActivitySteps" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="CopyProjectDocuments" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="CopyPastPeriodActuals" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CopyActivity", propOrder = {
    "objectId",
    "targetProjectObjectId",
    "targetWBSObjectId",
    "targetActivityId",
    "copyResourceAndRoleAssignments",
    "copyRelationships",
    "copyActivityCodes",
    "copyActivityNotes",
    "copyActivityExpenses",
    "copyActivitySteps",
    "copyProjectDocuments",
    "copyPastPeriodActuals"
})
public class CopyActivity {

    @XmlElement(name = "ObjectId")
    protected int objectId;
    @XmlElement(name = "TargetProjectObjectId")
    protected Integer targetProjectObjectId;
    @XmlElement(name = "TargetWBSObjectId")
    protected Integer targetWBSObjectId;
    @XmlElement(name = "TargetActivityId")
    protected String targetActivityId;
    @XmlElement(name = "CopyResourceAndRoleAssignments")
    protected Boolean copyResourceAndRoleAssignments;
    @XmlElement(name = "CopyRelationships")
    protected Boolean copyRelationships;
    @XmlElement(name = "CopyActivityCodes")
    protected Boolean copyActivityCodes;
    @XmlElement(name = "CopyActivityNotes")
    protected Boolean copyActivityNotes;
    @XmlElement(name = "CopyActivityExpenses")
    protected Boolean copyActivityExpenses;
    @XmlElement(name = "CopyActivitySteps")
    protected Boolean copyActivitySteps;
    @XmlElement(name = "CopyProjectDocuments")
    protected Boolean copyProjectDocuments;
    @XmlElement(name = "CopyPastPeriodActuals")
    protected Boolean copyPastPeriodActuals;

    /**
     * ��ȡobjectId���Ե�ֵ��
     * 
     */
    public int getObjectId() {
        return objectId;
    }

    /**
     * ����objectId���Ե�ֵ��
     * 
     */
    public void setObjectId(int value) {
        this.objectId = value;
    }

    /**
     * ��ȡtargetProjectObjectId���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTargetProjectObjectId() {
        return targetProjectObjectId;
    }

    /**
     * ����targetProjectObjectId���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTargetProjectObjectId(Integer value) {
        this.targetProjectObjectId = value;
    }

    /**
     * ��ȡtargetWBSObjectId���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTargetWBSObjectId() {
        return targetWBSObjectId;
    }

    /**
     * ����targetWBSObjectId���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTargetWBSObjectId(Integer value) {
        this.targetWBSObjectId = value;
    }

    /**
     * ��ȡtargetActivityId���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTargetActivityId() {
        return targetActivityId;
    }

    /**
     * ����targetActivityId���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTargetActivityId(String value) {
        this.targetActivityId = value;
    }

    /**
     * ��ȡcopyResourceAndRoleAssignments���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCopyResourceAndRoleAssignments() {
        return copyResourceAndRoleAssignments;
    }

    /**
     * ����copyResourceAndRoleAssignments���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCopyResourceAndRoleAssignments(Boolean value) {
        this.copyResourceAndRoleAssignments = value;
    }

    /**
     * ��ȡcopyRelationships���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCopyRelationships() {
        return copyRelationships;
    }

    /**
     * ����copyRelationships���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCopyRelationships(Boolean value) {
        this.copyRelationships = value;
    }

    /**
     * ��ȡcopyActivityCodes���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCopyActivityCodes() {
        return copyActivityCodes;
    }

    /**
     * ����copyActivityCodes���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCopyActivityCodes(Boolean value) {
        this.copyActivityCodes = value;
    }

    /**
     * ��ȡcopyActivityNotes���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCopyActivityNotes() {
        return copyActivityNotes;
    }

    /**
     * ����copyActivityNotes���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCopyActivityNotes(Boolean value) {
        this.copyActivityNotes = value;
    }

    /**
     * ��ȡcopyActivityExpenses���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCopyActivityExpenses() {
        return copyActivityExpenses;
    }

    /**
     * ����copyActivityExpenses���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCopyActivityExpenses(Boolean value) {
        this.copyActivityExpenses = value;
    }

    /**
     * ��ȡcopyActivitySteps���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCopyActivitySteps() {
        return copyActivitySteps;
    }

    /**
     * ����copyActivitySteps���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCopyActivitySteps(Boolean value) {
        this.copyActivitySteps = value;
    }

    /**
     * ��ȡcopyProjectDocuments���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCopyProjectDocuments() {
        return copyProjectDocuments;
    }

    /**
     * ����copyProjectDocuments���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCopyProjectDocuments(Boolean value) {
        this.copyProjectDocuments = value;
    }

    /**
     * ��ȡcopyPastPeriodActuals���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCopyPastPeriodActuals() {
        return copyPastPeriodActuals;
    }

    /**
     * ����copyPastPeriodActuals���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCopyPastPeriodActuals(Boolean value) {
        this.copyPastPeriodActuals = value;
    }

}
