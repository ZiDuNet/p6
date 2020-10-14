
package com.wushuo.p6.UserPortType;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ReadUserBaselines complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="ReadUserBaselines">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ProjectObjectId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="UserObjectId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReadUserBaselines", propOrder = {
    "projectObjectId",
    "userObjectId"
})
public class ReadUserBaselines {

    @XmlElement(name = "ProjectObjectId")
    protected int projectObjectId;
    @XmlElement(name = "UserObjectId")
    protected int userObjectId;

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

}
