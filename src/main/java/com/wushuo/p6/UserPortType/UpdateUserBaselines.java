
package com.wushuo.p6.UserPortType;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>UpdateUserBaselines complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="UpdateUserBaselines">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ProjectObjectId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="UserObjectId" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
@XmlType(name = "UpdateUserBaselines", propOrder = {
    "projectObjectId",
    "userObjectId",
    "primaryBaselineObjectId",
    "secondaryBaselineObjectId",
    "tertiaryBaselineObjectId"
})
public class UpdateUserBaselines {

    @XmlElement(name = "ProjectObjectId")
    protected int projectObjectId;
    @XmlElement(name = "UserObjectId")
    protected int userObjectId;
    @XmlElementRef(name = "PrimaryBaselineObjectId", namespace = "http://xmlns.oracle.com/Primavera/P6/WS/User/V1", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> primaryBaselineObjectId;
    @XmlElementRef(name = "SecondaryBaselineObjectId", namespace = "http://xmlns.oracle.com/Primavera/P6/WS/User/V1", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> secondaryBaselineObjectId;
    @XmlElementRef(name = "TertiaryBaselineObjectId", namespace = "http://xmlns.oracle.com/Primavera/P6/WS/User/V1", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> tertiaryBaselineObjectId;

    /**
     * 获取projectObjectId属性的值。
     * 
     */
    public int getProjectObjectId() {
        return projectObjectId;
    }

    /**
     * 设置projectObjectId属性的值。
     * 
     */
    public void setProjectObjectId(int value) {
        this.projectObjectId = value;
    }

    /**
     * 获取userObjectId属性的值。
     * 
     */
    public int getUserObjectId() {
        return userObjectId;
    }

    /**
     * 设置userObjectId属性的值。
     * 
     */
    public void setUserObjectId(int value) {
        this.userObjectId = value;
    }

    /**
     * 获取primaryBaselineObjectId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getPrimaryBaselineObjectId() {
        return primaryBaselineObjectId;
    }

    /**
     * 设置primaryBaselineObjectId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setPrimaryBaselineObjectId(JAXBElement<Integer> value) {
        this.primaryBaselineObjectId = value;
    }

    /**
     * 获取secondaryBaselineObjectId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getSecondaryBaselineObjectId() {
        return secondaryBaselineObjectId;
    }

    /**
     * 设置secondaryBaselineObjectId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setSecondaryBaselineObjectId(JAXBElement<Integer> value) {
        this.secondaryBaselineObjectId = value;
    }

    /**
     * 获取tertiaryBaselineObjectId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getTertiaryBaselineObjectId() {
        return tertiaryBaselineObjectId;
    }

    /**
     * 设置tertiaryBaselineObjectId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setTertiaryBaselineObjectId(JAXBElement<Integer> value) {
        this.tertiaryBaselineObjectId = value;
    }

}
