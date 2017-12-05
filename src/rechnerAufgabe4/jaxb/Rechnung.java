//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.12.04 at 09:23:54 PM CET 
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
 *         &lt;element ref="{genericNamespace}anschrift-des-leistenden-unternehmers"/>
 *         &lt;choice>
 *           &lt;element ref="{genericNamespace}steuer-nummer-des-leistenden-unternehmers"/>
 *           &lt;element ref="{genericNamespace}umsatzsteuer-identifikations-nummer"/>
 *         &lt;/choice>
 *         &lt;element ref="{genericNamespace}anschrift-des-leistungs-empfaengers"/>
 *         &lt;element ref="{genericNamespace}rechnungs-nummer"/>
 *         &lt;element ref="{genericNamespace}austellungs-datum"/>
 *         &lt;element ref="{genericNamespace}verwendete-waehrung"/>
 *         &lt;element ref="{genericNamespace}leistungen"/>
 *         &lt;element ref="{genericNamespace}entgelt"/>
 *         &lt;element ref="{genericNamespace}bezahl-moeglichkeiten"/>
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
    "anschriftDesLeistendenUnternehmers",
    "steuerNummerDesLeistendenUnternehmers",
    "umsatzsteuerIdentifikationsNummer",
    "anschriftDesLeistungsEmpfaengers",
    "rechnungsNummer",
    "austellungsDatum",
    "verwendeteWaehrung",
    "leistungen",
    "entgelt",
    "bezahlMoeglichkeiten"
})
@XmlRootElement(name = "rechnung")
public class Rechnung {

    @XmlElement(name = "anschrift-des-leistenden-unternehmers", required = true)
    protected AnschriftDesLeistendenUnternehmers anschriftDesLeistendenUnternehmers;
    @XmlElement(name = "steuer-nummer-des-leistenden-unternehmers")
    protected BigDecimal steuerNummerDesLeistendenUnternehmers;
    @XmlElement(name = "umsatzsteuer-identifikations-nummer")
    protected String umsatzsteuerIdentifikationsNummer;
    @XmlElement(name = "anschrift-des-leistungs-empfaengers", required = true)
    protected AnschriftDesLeistungsEmpfaengers anschriftDesLeistungsEmpfaengers;
    @XmlElement(name = "rechnungs-nummer", required = true)
    protected String rechnungsNummer;
    @XmlElement(name = "austellungs-datum", required = true)
    protected AustellungsDatum austellungsDatum;
    @XmlElement(name = "verwendete-waehrung", required = true)
    protected String verwendeteWaehrung;
    @XmlElement(required = true)
    protected Leistungen leistungen;
    @XmlElement(required = true)
    protected Entgelt entgelt;
    @XmlElement(name = "bezahl-moeglichkeiten", required = true)
    protected BezahlMoeglichkeiten bezahlMoeglichkeiten;

    /**
     * Gets the value of the anschriftDesLeistendenUnternehmers property.
     * 
     * @return
     *     possible object is
     *     {@link AnschriftDesLeistendenUnternehmers }
     *     
     */
    public AnschriftDesLeistendenUnternehmers getAnschriftDesLeistendenUnternehmers() {
        return anschriftDesLeistendenUnternehmers;
    }

    /**
     * Sets the value of the anschriftDesLeistendenUnternehmers property.
     * 
     * @param value
     *     allowed object is
     *     {@link AnschriftDesLeistendenUnternehmers }
     *     
     */
    public void setAnschriftDesLeistendenUnternehmers(AnschriftDesLeistendenUnternehmers value) {
        this.anschriftDesLeistendenUnternehmers = value;
    }

    /**
     * Gets the value of the steuerNummerDesLeistendenUnternehmers property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSteuerNummerDesLeistendenUnternehmers() {
        return steuerNummerDesLeistendenUnternehmers;
    }

    /**
     * Sets the value of the steuerNummerDesLeistendenUnternehmers property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSteuerNummerDesLeistendenUnternehmers(BigDecimal value) {
        this.steuerNummerDesLeistendenUnternehmers = value;
    }

    /**
     * Gets the value of the umsatzsteuerIdentifikationsNummer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUmsatzsteuerIdentifikationsNummer() {
        return umsatzsteuerIdentifikationsNummer;
    }

    /**
     * Sets the value of the umsatzsteuerIdentifikationsNummer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUmsatzsteuerIdentifikationsNummer(String value) {
        this.umsatzsteuerIdentifikationsNummer = value;
    }

    /**
     * Gets the value of the anschriftDesLeistungsEmpfaengers property.
     * 
     * @return
     *     possible object is
     *     {@link AnschriftDesLeistungsEmpfaengers }
     *     
     */
    public AnschriftDesLeistungsEmpfaengers getAnschriftDesLeistungsEmpfaengers() {
        return anschriftDesLeistungsEmpfaengers;
    }

    /**
     * Sets the value of the anschriftDesLeistungsEmpfaengers property.
     * 
     * @param value
     *     allowed object is
     *     {@link AnschriftDesLeistungsEmpfaengers }
     *     
     */
    public void setAnschriftDesLeistungsEmpfaengers(AnschriftDesLeistungsEmpfaengers value) {
        this.anschriftDesLeistungsEmpfaengers = value;
    }

    /**
     * Gets the value of the rechnungsNummer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRechnungsNummer() {
        return rechnungsNummer;
    }

    /**
     * Sets the value of the rechnungsNummer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRechnungsNummer(String value) {
        this.rechnungsNummer = value;
    }

    /**
     * Gets the value of the austellungsDatum property.
     * 
     * @return
     *     possible object is
     *     {@link AustellungsDatum }
     *     
     */
    public AustellungsDatum getAustellungsDatum() {
        return austellungsDatum;
    }

    /**
     * Sets the value of the austellungsDatum property.
     * 
     * @param value
     *     allowed object is
     *     {@link AustellungsDatum }
     *     
     */
    public void setAustellungsDatum(AustellungsDatum value) {
        this.austellungsDatum = value;
    }

    /**
     * Gets the value of the verwendeteWaehrung property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVerwendeteWaehrung() {
        return verwendeteWaehrung;
    }

    /**
     * Sets the value of the verwendeteWaehrung property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVerwendeteWaehrung(String value) {
        this.verwendeteWaehrung = value;
    }

    /**
     * Gets the value of the leistungen property.
     * 
     * @return
     *     possible object is
     *     {@link Leistungen }
     *     
     */
    public Leistungen getLeistungen() {
        return leistungen;
    }

    /**
     * Sets the value of the leistungen property.
     * 
     * @param value
     *     allowed object is
     *     {@link Leistungen }
     *     
     */
    public void setLeistungen(Leistungen value) {
        this.leistungen = value;
    }

    /**
     * Gets the value of the entgelt property.
     * 
     * @return
     *     possible object is
     *     {@link Entgelt }
     *     
     */
    public Entgelt getEntgelt() {
        return entgelt;
    }

    /**
     * Sets the value of the entgelt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Entgelt }
     *     
     */
    public void setEntgelt(Entgelt value) {
        this.entgelt = value;
    }

    /**
     * Gets the value of the bezahlMoeglichkeiten property.
     * 
     * @return
     *     possible object is
     *     {@link BezahlMoeglichkeiten }
     *     
     */
    public BezahlMoeglichkeiten getBezahlMoeglichkeiten() {
        return bezahlMoeglichkeiten;
    }

    /**
     * Sets the value of the bezahlMoeglichkeiten property.
     * 
     * @param value
     *     allowed object is
     *     {@link BezahlMoeglichkeiten }
     *     
     */
    public void setBezahlMoeglichkeiten(BezahlMoeglichkeiten value) {
        this.bezahlMoeglichkeiten = value;
    }

}