
package com.wushuo.p6.UserPortType;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>IntegrationFaultCodeType�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * <p>
 * <pre>
 * &lt;simpleType name="IntegrationFaultCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="General"/>
 *     &lt;enumeration value="Presentation"/>
 *     &lt;enumeration value="Network"/>
 *     &lt;enumeration value="Server"/>
 *     &lt;enumeration value="Business Rules"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "IntegrationFaultCodeType", namespace = "http://xmlns.oracle.com/Primavera/P6/WS/IntegrationFaultType/V1")
@XmlEnum
public enum IntegrationFaultCodeType {

    @XmlEnumValue("General")
    GENERAL("General"),
    @XmlEnumValue("Presentation")
    PRESENTATION("Presentation"),
    @XmlEnumValue("Network")
    NETWORK("Network"),
    @XmlEnumValue("Server")
    SERVER("Server"),
    @XmlEnumValue("Business Rules")
    BUSINESS_RULES("Business Rules");
    private final String value;

    IntegrationFaultCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static IntegrationFaultCodeType fromValue(String v) {
        for (IntegrationFaultCodeType c: IntegrationFaultCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
