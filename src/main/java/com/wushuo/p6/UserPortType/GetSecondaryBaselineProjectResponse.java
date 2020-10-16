
package com.wushuo.p6.UserPortType;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>GetSecondaryBaselineProjectResponse complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="GetSecondaryBaselineProjectResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SecondaryBaselineObjectId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetSecondaryBaselineProjectResponse", propOrder = {
    "secondaryBaselineObjectId"
})
public class GetSecondaryBaselineProjectResponse {

    @XmlElement(name = "SecondaryBaselineObjectId")
    protected Integer secondaryBaselineObjectId;

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

}
