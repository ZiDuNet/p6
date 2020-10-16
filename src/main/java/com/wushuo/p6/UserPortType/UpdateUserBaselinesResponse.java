
package com.wushuo.p6.UserPortType;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>UpdateUserBaselinesResponse complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
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
     * 获取primaryBaselineObjectId属性的值。
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
     * 设置primaryBaselineObjectId属性的值。
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
     * 获取secondaryBaselineObjectId属性的值。
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
     * 设置secondaryBaselineObjectId属性的值。
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
     * 获取tertiaryBaselineObjectId属性的值。
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
     * 设置tertiaryBaselineObjectId属性的值。
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
