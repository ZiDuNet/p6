
package com.wushuo.p6.ActivityPortType;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>CopyActivityResponse complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="CopyActivityResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ObjectId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CopyActivityResponse", propOrder = {
    "objectId"
})
public class CopyActivityResponse {

    @XmlElement(name = "ObjectId")
    protected int objectId;

    /**
     * ��ȡobjectId���Ե�ֵ��
     * 
     */
    public int getObjectId() {
        return objectId;
    }

    /**
     * ����objectId���Ե�ֵ��
     * 
     */
    public void setObjectId(int value) {
        this.objectId = value;
    }

}
