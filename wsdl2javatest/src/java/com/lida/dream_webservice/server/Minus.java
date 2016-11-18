
package com.lida.dream_webservice.server;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>minus complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="minus"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="secondA" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="secondB" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "minus", propOrder = {
    "secondA",
    "secondB"
})
public class Minus {

    protected int secondA;
    protected int secondB;

    /**
     * 获取secondA属性的值。
     * 
     */
    public int getSecondA() {
        return secondA;
    }

    /**
     * 设置secondA属性的值。
     * 
     */
    public void setSecondA(int value) {
        this.secondA = value;
    }

    /**
     * 获取secondB属性的值。
     * 
     */
    public int getSecondB() {
        return secondB;
    }

    /**
     * 设置secondB属性的值。
     * 
     */
    public void setSecondB(int value) {
        this.secondB = value;
    }

}
