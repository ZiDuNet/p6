
package com.wushuo.p6.UserPortType;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>GetTertiaryBaselineProjectResponse complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="GetTertiaryBaselineProjectResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
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
@XmlType(name = "GetTertiaryBaselineProjectResponse", propOrder = {
    "tertiaryBaselineObjectId"
})
public class GetTertiaryBaselineProjectResponse {

    @XmlElement(name = "TertiaryBaselineObjectId")
    protected Integer tertiaryBaselineObjectId;

    /**
     * ��ȡtertiaryBaselineObjectId���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTertiaryBaselineObjectId() {
        return tertiaryBaselineObjectId;
    }

    /**
     * ����tertiaryBaselineObjectId���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTertiaryBaselineObjectId(Integer value) {
        this.tertiaryBaselineObjectId = value;
    }

}
