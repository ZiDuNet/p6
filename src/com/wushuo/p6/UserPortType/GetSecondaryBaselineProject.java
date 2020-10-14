
package com.wushuo.p6.UserPortType;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>GetSecondaryBaselineProject complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="GetSecondaryBaselineProject">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="UserObjectId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ProjectObjectId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetSecondaryBaselineProject", propOrder = {
    "userObjectId",
    "projectObjectId"
})
public class GetSecondaryBaselineProject {

    @XmlElement(name = "UserObjectId")
    protected int userObjectId;
    @XmlElement(name = "ProjectObjectId")
    protected int projectObjectId;

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

}
