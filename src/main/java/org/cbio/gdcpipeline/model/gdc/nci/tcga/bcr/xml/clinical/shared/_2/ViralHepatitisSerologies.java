//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.06.13 at 06:01:48 AM IST 
//


package org.cbio.gdcpipeline.model.gdc.nci.tcga.bcr.xml.clinical.shared._2;

import java.util.ArrayList;
import java.util.List;
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
 *         &lt;element ref="{http://tcga.nci/bcr/xml/clinical/shared/2.7}viral_hepatitis_serology" maxOccurs="unbounded"/>
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
    "viralHepatitisSerology"
})
@XmlRootElement(name = "viral_hepatitis_serologies")
public class ViralHepatitisSerologies {

    @XmlElement(name = "viral_hepatitis_serology", required = true, nillable = true)
    protected List<ViralHepatitisSerology> viralHepatitisSerology;

    /**
     * Gets the value of the viralHepatitisSerology property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the viralHepatitisSerology property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getViralHepatitisSerology().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ViralHepatitisSerology }
     * 
     * 
     */
    public List<ViralHepatitisSerology> getViralHepatitisSerology() {
        if (viralHepatitisSerology == null) {
            viralHepatitisSerology = new ArrayList<ViralHepatitisSerology>();
        }
        return this.viralHepatitisSerology;
    }

}