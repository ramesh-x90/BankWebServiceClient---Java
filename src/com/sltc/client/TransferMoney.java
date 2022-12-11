
package com.sltc.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for transferMoney complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="transferMoney">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="transferAccountId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="receiverAccountId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="passCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="transferAmount" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "transferMoney", propOrder = {
    "transferAccountId",
    "receiverAccountId",
    "passCode",
    "transferAmount"
})
public class TransferMoney {

    protected String transferAccountId;
    protected String receiverAccountId;
    protected String passCode;
    protected double transferAmount;

    /**
     * Gets the value of the transferAccountId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransferAccountId() {
        return transferAccountId;
    }

    /**
     * Sets the value of the transferAccountId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransferAccountId(String value) {
        this.transferAccountId = value;
    }

    /**
     * Gets the value of the receiverAccountId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReceiverAccountId() {
        return receiverAccountId;
    }

    /**
     * Sets the value of the receiverAccountId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReceiverAccountId(String value) {
        this.receiverAccountId = value;
    }

    /**
     * Gets the value of the passCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPassCode() {
        return passCode;
    }

    /**
     * Sets the value of the passCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPassCode(String value) {
        this.passCode = value;
    }

    /**
     * Gets the value of the transferAmount property.
     * 
     */
    public double getTransferAmount() {
        return transferAmount;
    }

    /**
     * Sets the value of the transferAmount property.
     * 
     */
    public void setTransferAmount(double value) {
        this.transferAmount = value;
    }

}
