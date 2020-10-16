
package com.wushuo.p6.UserPortType;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>UpdateUserBaselinesResponse complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="UpdateUserBaselinesResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PrimaryBaselineObjectId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="SecondaryBaselineObjectId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="TertiaryBaselineObjectId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UpdateUserBaselinesResponse", propOrder = {
    "primaryBaselineObjectId",
    "secondaryBaselineObjectId",
    "tertiaryBaselineObjectId"
})
public class UpdateUserBaselinesResponse {

    @XmlElement(name = "PrimaryBaselineObjectId")
    protected Integer primaryBaselineObjectId;
    @XmlElement(name = "SecondaryBaselineObjectId")
    protected Integer secondaryBaselineObjectId;
    @XmlElement(name = "TertiaryBaselineObjectId")
    protected Integer tertiaryBaselineObjectId;

    /**
     * ��ȡprimaryBaselineObjectId���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPrimaryBaselineObjectId() {
        return primaryBaselineObjectId;
    }

    /**
     * ����primaryBaselineObjectId���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPrimaryBaselineObjectId(Integer value) {
        this.primaryBaselineObjectId = value;
    }

    /**
     * ��ȡsecondaryBaselineObjectId���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSecondaryBaselineObjectId() {
        return secondaryBaselineObjectId;
    }

    /**
     * ����secondaryBaselineObjectId���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSecondaryBaselineObjectId(Integer value) {
        this.secondaryBaselineObjectId = value;
    }

    /**
     * ��ȡtertiaryBaselineObjectId���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTertiaryBaselineObjectId() {
        return tertiaryBaselineObjectId;
    }

    /**
     * ����tertiaryBaselineObjectId���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTertiaryBaselineObjectId(Integer value) {
        this.tertiaryBaselineObjectId = value;
    }

}
