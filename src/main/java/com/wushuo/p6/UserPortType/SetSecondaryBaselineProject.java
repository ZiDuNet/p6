
package com.wushuo.p6.UserPortType;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>SetSecondaryBaselineProject complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="SetSecondaryBaselineProject">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="UserObjectId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ProjectObjectId" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
@XmlType(name = "SetSecondaryBaselineProject", propOrder = {
    "userObjectId",
    "projectObjectId",
    "secondaryBaselineObjectId"
})
public class SetSecondaryBaselineProject {

    @XmlElement(name = "UserObjectId")
    protected int userObjectId;
    @XmlElement(name = "ProjectObjectId")
    protected int projectObjectId;
    @XmlElementRef(name = "SecondaryBaselineObjectId", namespace = "http://xmlns.oracle.com/Primavera/P6/WS/User/V1", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> secondaryBaselineObjectId;

    /**
     * ��ȡuserObjectId���Ե�ֵ��
     * 
     */
    public int getUserObjectId() {
        return userObjectId;
    }

    /**
     * ����userObjectId���Ե�ֵ��
     * 
     */
    public void setUserObjectId(int value) {
        this.userObjectId = value;
    }

    /**
     * ��ȡprojectObjectId���Ե�ֵ��
     * 
     */
    public int getProjectObjectId() {
        return projectObjectId;
    }

    /**
     * ����projectObjectId���Ե�ֵ��
     * 
     */
    public void setProjectObjectId(int value) {
        this.projectObjectId = value;
    }

    /**
     * ��ȡsecondaryBaselineObjectId���Ե�ֵ��
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
     * ����secondaryBaselineObjectId���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setSecondaryBaselineObjectId(JAXBElement<Integer> value) {
        this.secondaryBaselineObjectId = value;
    }

}
