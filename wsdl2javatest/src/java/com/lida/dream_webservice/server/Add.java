
package com.lida.dream_webservice.server;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>add complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="add"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="firstA" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="firstB" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "add", propOrder = {
    "firstA",
    "firstB"
})
public class Add {

    protected int firstA;
    protected int firstB;

    /**
     * 获取firstA属性的值。
     * 
     */
    public int getFirstA() {
        return firstA;
    }

    /**
     * 设置firstA属性的值。
     * 
     */
    public void setFirstA(int value) {
        this.firstA = value;
    }

    /**
     * 获取firstB属性的值。
     * 
     */
    public int getFirstB() {
        return firstB;
    }

    /**
     * 设置firstB属性的值。
     * 
     */
    public void setFirstB(int value) {
        this.firstB = value;
    }

}
