//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.12.05 at 09:49:12 AM CET 
//


package rechnerAufgabe4.jaxb;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{genericNamespace}gesamt-betrag"/>
 *         &lt;element ref="{genericNamespace}netto-betrag"/>
 *         &lt;element ref="{genericNamespace}mehrwert-steuer-betrag"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "gesamtBetrag",
    "nettoBetrag",
    "mehrwertSteuerBetrag"
})
@XmlRootElement(name = "entgelt")
public class Entgelt {

    @XmlElement(name = "gesamt-betrag", required = true)
    protected BigDecimal gesamtBetrag;
    @XmlElement(name = "netto-betrag", required = true)
    protected BigDecimal nettoBetrag;
    @XmlElement(name = "mehrwert-steuer-betrag", required = true)
    protected BigDecimal mehrwertSteuerBetrag;

    /**
     * Gets the value of the gesamtBetrag property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getGesamtBetrag() {
        return gesamtBetrag;
    }

    /**
     * Sets the value of the gesamtBetrag property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setGesamtBetrag(BigDecimal value) {
        this.gesamtBetrag = value;
    }

    /**
     * Gets the value of the nettoBetrag property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNettoBetrag() {
        return nettoBetrag;
    }

    /**
     * Sets the value of the nettoBetrag property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setNettoBetrag(BigDecimal value) {
        this.nettoBetrag = value;
    }

    /**
     * Gets the value of the mehrwertSteuerBetrag property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMehrwertSteuerBetrag() {
        return mehrwertSteuerBetrag;
    }

    /**
     * Sets the value of the mehrwertSteuerBetrag property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMehrwertSteuerBetrag(BigDecimal value) {
        this.mehrwertSteuerBetrag = value;
    }

}
