
package com.wushuo.p6.UserPortType;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>SetPrimaryBaselineProject complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="SetPrimaryBaselineProject">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="UserObjectId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ProjectObjectId" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
@XmlType(name = "SetPrimaryBaselineProject", propOrder = {
    "userObjectId",
    "projectObjectId",
    "primaryBaselineObjectId"
})
public class SetPrimaryBaselineProject {

    @XmlElement(name = "UserObjectId")
    protected int userObjectId;
    @XmlElement(name = "ProjectObjectId")
    protected int projectObjectId;
    @XmlElementRef(name = "PrimaryBaselineObjectId", namespace = "http://xmlns.oracle.com/Primavera/P6/WS/User/V1", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> primaryBaselineObjectId;

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

}
