//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.12.05 at 09:49:12 AM CET 
//


package rechnerAufgabe4.jaxb;

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
 *         &lt;element ref="{genericNamespace}name-leistungs-empfaenger"/>
 *         &lt;element ref="{genericNamespace}adresse"/>
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
    "nameLeistungsEmpfaenger",
    "adresse"
})
@XmlRootElement(name = "anschrift-des-leistungs-empfaengers")
public class AnschriftDesLeistungsEmpfaengers {

    @XmlElement(name = "name-leistungs-empfaenger", required = true)
    protected NameLeistungsEmpfaenger nameLeistungsEmpfaenger;
    @XmlElement(required = true)
    protected Adresse adresse;

    /**
     * Gets the value of the nameLeistungsEmpfaenger property.
     * 
     * @return
     *     possible object is
     *     {@link NameLeistungsEmpfaenger }
     *     
     */
    public NameLeistungsEmpfaenger getNameLeistungsEmpfaenger() {
        return nameLeistungsEmpfaenger;
    }

    /**
     * Sets the value of the nameLeistungsEmpfaenger property.
     * 
     * @param value
     *     allowed object is
     *     {@link NameLeistungsEmpfaenger }
     *     
     */
    public void setNameLeistungsEmpfaenger(NameLeistungsEmpfaenger value) {
        this.nameLeistungsEmpfaenger = value;
    }

    /**
     * Gets the value of the adresse property.
     * 
     * @return
     *     possible object is
     *     {@link Adresse }
     *     
     */
    public Adresse getAdresse() {
        return adresse;
    }

    /**
     * Sets the value of the adresse property.
     * 
     * @param value
     *     allowed object is
     *     {@link Adresse }
     *     
     */
    public void setAdresse(Adresse value) {
        this.adresse = value;
    }

}
