//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.06.13 at 06:01:48 AM IST 
//


package org.cbio.gdcpipeline.model.gdc.nci.tcga.bcr.xml.clinical.shared.stage._2;

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
 *         &lt;element ref="{http://tcga.nci/bcr/xml/clinical/shared/stage/2.7}gleason_score" minOccurs="0"/>
 *         &lt;element ref="{http://tcga.nci/bcr/xml/clinical/shared/stage/2.7}primary_pattern" minOccurs="0"/>
 *         &lt;element ref="{http://tcga.nci/bcr/xml/clinical/shared/stage/2.7}secondary_pattern" minOccurs="0"/>
 *         &lt;element ref="{http://tcga.nci/bcr/xml/clinical/shared/stage/2.7}tertiary_pattern" minOccurs="0"/>
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
    "gleasonScore",
    "primaryPattern",
    "secondaryPattern",
    "tertiaryPattern"
})
@XmlRootElement(name = "gleason_grading")
public class GleasonGrading {

    @XmlElement(name = "gleason_score")
    protected GleasonScore gleasonScore;
    @XmlElement(name = "primary_pattern")
    protected PrimaryPattern primaryPattern;
    @XmlElement(name = "secondary_pattern")
    protected SecondaryPattern secondaryPattern;
    @XmlElement(name = "tertiary_pattern")
    protected TertiaryPattern tertiaryPattern;

    /**
     * Gets the value of the gleasonScore property.
     * 
     * @return
     *     possible object is
     *     {@link GleasonScore }
     *     
     */
    public GleasonScore getGleasonScore() {
        return gleasonScore;
    }

    /**
     * Sets the value of the gleasonScore property.
     * 
     * @param value
     *     allowed object is
     *     {@link GleasonScore }
     *     
     */
    public void setGleasonScore(GleasonScore value) {
        this.gleasonScore = value;
    }

    /**
     * Gets the value of the primaryPattern property.
     * 
     * @return
     *     possible object is
     *     {@link PrimaryPattern }
     *     
     */
    public PrimaryPattern getPrimaryPattern() {
        return primaryPattern;
    }

    /**
     * Sets the value of the primaryPattern property.
     * 
     * @param value
     *     allowed object is
     *     {@link PrimaryPattern }
     *     
     */
    public void setPrimaryPattern(PrimaryPattern value) {
        this.primaryPattern = value;
    }

    /**
     * Gets the value of the secondaryPattern property.
     * 
     * @return
     *     possible object is
     *     {@link SecondaryPattern }
     *     
     */
    public SecondaryPattern getSecondaryPattern() {
        return secondaryPattern;
    }

    /**
     * Sets the value of the secondaryPattern property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecondaryPattern }
     *     
     */
    public void setSecondaryPattern(SecondaryPattern value) {
        this.secondaryPattern = value;
    }

    /**
     * Gets the value of the tertiaryPattern property.
     * 
     * @return
     *     possible object is
     *     {@link TertiaryPattern }
     *     
     */
    public TertiaryPattern getTertiaryPattern() {
        return tertiaryPattern;
    }

    /**
     * Sets the value of the tertiaryPattern property.
     * 
     * @param value
     *     allowed object is
     *     {@link TertiaryPattern }
     *     
     */
    public void setTertiaryPattern(TertiaryPattern value) {
        this.tertiaryPattern = value;
    }

}
