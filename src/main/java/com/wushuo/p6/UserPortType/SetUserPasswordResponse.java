
package com.wushuo.p6.UserPortType;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>SetUserPasswordResponse complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="SetUserPasswordResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Success" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SetUserPasswordResponse", propOrder = {
    "success"
})
public class SetUserPasswordResponse {

    @XmlElement(name = "Success")
    protected boolean success;

    /**
     * ��ȡsuccess���Ե�ֵ��
     * 
     */
    public boolean isSuccess() {
        return success;
    }

    /**
     * ����success���Ե�ֵ��
     * 
     */
    public void setSuccess(boolean value) {
        this.success = value;
    }

}
