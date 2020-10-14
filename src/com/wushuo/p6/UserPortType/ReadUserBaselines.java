
package com.wushuo.p6.UserPortType;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ReadUserBaselines complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
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

}
