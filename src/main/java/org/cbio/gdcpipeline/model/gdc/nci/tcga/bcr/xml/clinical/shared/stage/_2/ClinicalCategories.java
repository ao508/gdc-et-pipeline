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
 *         &lt;element ref="{http://tcga.nci/bcr/xml/clinical/shared/stage/2.7}clinical_T"/>
 *         &lt;element ref="{http://tcga.nci/bcr/xml/clinical/shared/stage/2.7}clinical_N"/>
 *         &lt;element ref="{http://tcga.nci/bcr/xml/clinical/shared/stage/2.7}clinical_M"/>
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
    "clinicalT",
    "clinicalN",
    "clinicalM"
})
@XmlRootElement(name = "clinical_categories")
public class ClinicalCategories {

    @XmlElement(name = "clinical_T", required = true)
    protected ClinicalT clinicalT;
    @XmlElement(name = "clinical_N", required = true)
    protected ClinicalN clinicalN;
    @XmlElement(name = "clinical_M", required = true)
    protected ClinicalM clinicalM;

    /**
     * Gets the value of the clinicalT property.
     * 
     * @return
     *     possible object is
     *     {@link ClinicalT }
     *     
     */
    public ClinicalT getClinicalT() {
        return clinicalT;
    }

    /**
     * Sets the value of the clinicalT property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClinicalT }
     *     
     */
    public void setClinicalT(ClinicalT value) {
        this.clinicalT = value;
    }

    /**
     * Gets the value of the clinicalN property.
     * 
     * @return
     *     possible object is
     *     {@link ClinicalN }
     *     
     */
    public ClinicalN getClinicalN() {
        return clinicalN;
    }

    /**
     * Sets the value of the clinicalN property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClinicalN }
     *     
     */
    public void setClinicalN(ClinicalN value) {
        this.clinicalN = value;
    }

    /**
     * Gets the value of the clinicalM property.
     * 
     * @return
     *     possible object is
     *     {@link ClinicalM }
     *     
     */
    public ClinicalM getClinicalM() {
        return clinicalM;
    }

    /**
     * Sets the value of the clinicalM property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClinicalM }
     *     
     */
    public void setClinicalM(ClinicalM value) {
        this.clinicalM = value;
    }

}
