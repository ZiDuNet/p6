
package com.wushuo.p6.UserPortType;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>GetPrimaryBaselineProjectResponse complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="GetPrimaryBaselineProjectResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PrimaryBaselineObjectId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetPrimaryBaselineProjectResponse", propOrder = {
    "primaryBaselineObjectId"
})
public class GetPrimaryBaselineProjectResponse {

    @XmlElement(name = "PrimaryBaselineObjectId")
    protected Integer primaryBaselineObjectId;

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

}
