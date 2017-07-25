//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.06.12 at 05:01:33 PM IST 
//


package org.cbio.gdcpipeline.model.gdc.nci.tcga.bcr.xml.clinical.brca.followup._2_7._4;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.cbio.gdcpipeline.model.gdc.nci.tcga.bcr.xml.clinical.brca.shared.new_tumor_event._2_7._1.NewTumorEvents;
import org.cbio.gdcpipeline.model.gdc.nci.tcga.bcr.xml.clinical.shared._2.BcrFollowupBarcode;
import org.cbio.gdcpipeline.model.gdc.nci.tcga.bcr.xml.clinical.shared._2.BcrFollowupUuid;
import org.cbio.gdcpipeline.model.gdc.nci.tcga.bcr.xml.clinical.shared._2.DayOfDeath;
import org.cbio.gdcpipeline.model.gdc.nci.tcga.bcr.xml.clinical.shared._2.DayOfFormCompletion;
import org.cbio.gdcpipeline.model.gdc.nci.tcga.bcr.xml.clinical.shared._2.DayOfLastFollowup;
import org.cbio.gdcpipeline.model.gdc.nci.tcga.bcr.xml.clinical.shared._2.DaysToDeath;
import org.cbio.gdcpipeline.model.gdc.nci.tcga.bcr.xml.clinical.shared._2.DaysToFormCompletion;
import org.cbio.gdcpipeline.model.gdc.nci.tcga.bcr.xml.clinical.shared._2.DaysToLastFollowup;
import org.cbio.gdcpipeline.model.gdc.nci.tcga.bcr.xml.clinical.shared._2.LostFollowUp;
import org.cbio.gdcpipeline.model.gdc.nci.tcga.bcr.xml.clinical.shared._2.MonthOfDeath;
import org.cbio.gdcpipeline.model.gdc.nci.tcga.bcr.xml.clinical.shared._2.MonthOfFormCompletion;
import org.cbio.gdcpipeline.model.gdc.nci.tcga.bcr.xml.clinical.shared._2.MonthOfLastFollowup;
import org.cbio.gdcpipeline.model.gdc.nci.tcga.bcr.xml.clinical.shared._2.PersonNeoplasmCancerStatus;
import org.cbio.gdcpipeline.model.gdc.nci.tcga.bcr.xml.clinical.shared._2.PostoperativeRxTx;
import org.cbio.gdcpipeline.model.gdc.nci.tcga.bcr.xml.clinical.shared._2.RadiationTherapy;
import org.cbio.gdcpipeline.model.gdc.nci.tcga.bcr.xml.clinical.shared._2.VitalStatus;
import org.cbio.gdcpipeline.model.gdc.nci.tcga.bcr.xml.clinical.shared._2.YearOfDeath;
import org.cbio.gdcpipeline.model.gdc.nci.tcga.bcr.xml.clinical.shared._2.YearOfFormCompletion;
import org.cbio.gdcpipeline.model.gdc.nci.tcga.bcr.xml.clinical.shared._2.YearOfLastFollowup;


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
 *         &lt;element ref="{http://tcga.nci/bcr/xml/clinical/shared/2.7}bcr_followup_barcode"/>
 *         &lt;element ref="{http://tcga.nci/bcr/xml/clinical/shared/2.7}bcr_followup_uuid"/>
 *         &lt;element ref="{http://tcga.nci/bcr/xml/clinical/shared/2.7}lost_follow_up"/>
 *         &lt;element ref="{http://tcga.nci/bcr/xml/clinical/shared/2.7}radiation_therapy"/>
 *         &lt;element ref="{http://tcga.nci/bcr/xml/clinical/shared/2.7}postoperative_rx_tx"/>
 *         &lt;element ref="{http://tcga.nci/bcr/xml/clinical/shared/2.7}person_neoplasm_cancer_status"/>
 *         &lt;element ref="{http://tcga.nci/bcr/xml/clinical/shared/2.7}vital_status"/>
 *         &lt;choice>
 *           &lt;sequence>
 *             &lt;element ref="{http://tcga.nci/bcr/xml/clinical/shared/2.7}day_of_last_followup"/>
 *             &lt;element ref="{http://tcga.nci/bcr/xml/clinical/shared/2.7}month_of_last_followup"/>
 *             &lt;element ref="{http://tcga.nci/bcr/xml/clinical/shared/2.7}year_of_last_followup"/>
 *           &lt;/sequence>
 *           &lt;element ref="{http://tcga.nci/bcr/xml/clinical/shared/2.7}days_to_last_followup"/>
 *         &lt;/choice>
 *         &lt;choice>
 *           &lt;sequence>
 *             &lt;element ref="{http://tcga.nci/bcr/xml/clinical/shared/2.7}day_of_death"/>
 *             &lt;element ref="{http://tcga.nci/bcr/xml/clinical/shared/2.7}month_of_death"/>
 *             &lt;element ref="{http://tcga.nci/bcr/xml/clinical/shared/2.7}year_of_death"/>
 *           &lt;/sequence>
 *           &lt;element ref="{http://tcga.nci/bcr/xml/clinical/shared/2.7}days_to_death"/>
 *         &lt;/choice>
 *         &lt;element ref="{http://tcga.nci/bcr/xml/clinical/brca/shared/new_tumor_event/2.7/1.0}new_tumor_events"/>
 *         &lt;choice>
 *           &lt;sequence>
 *             &lt;element ref="{http://tcga.nci/bcr/xml/clinical/shared/2.7}day_of_form_completion"/>
 *             &lt;element ref="{http://tcga.nci/bcr/xml/clinical/shared/2.7}month_of_form_completion"/>
 *             &lt;element ref="{http://tcga.nci/bcr/xml/clinical/shared/2.7}year_of_form_completion"/>
 *           &lt;/sequence>
 *           &lt;element ref="{http://tcga.nci/bcr/xml/clinical/shared/2.7}days_to_form_completion"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *       &lt;attribute name="version" type="{http://www.w3.org/2001/XMLSchema}string" default="4.0" />
 *       &lt;attribute name="sequence" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "bcrFollowupBarcode",
    "bcrFollowupUuid",
    "lostFollowUp",
    "radiationTherapy",
    "postoperativeRxTx",
    "personNeoplasmCancerStatus",
    "vitalStatus",
    "dayOfLastFollowup",
    "monthOfLastFollowup",
    "yearOfLastFollowup",
    "daysToLastFollowup",
    "dayOfDeath",
    "monthOfDeath",
    "yearOfDeath",
    "daysToDeath",
    "newTumorEvents",
    "dayOfFormCompletion",
    "monthOfFormCompletion",
    "yearOfFormCompletion",
    "daysToFormCompletion"
})
@XmlRootElement(name = "follow_up")
public class FollowUp {

    @XmlElement(name = "bcr_followup_barcode", namespace = "http://tcga.nci/bcr/xml/clinical/shared/2.7", required = true)
    protected BcrFollowupBarcode bcrFollowupBarcode;
    @XmlElement(name = "bcr_followup_uuid", namespace = "http://tcga.nci/bcr/xml/clinical/shared/2.7", required = true)
    protected BcrFollowupUuid bcrFollowupUuid;
    @XmlElement(name = "lost_follow_up", namespace = "http://tcga.nci/bcr/xml/clinical/shared/2.7", required = true)
    protected LostFollowUp lostFollowUp;
    @XmlElement(name = "radiation_therapy", namespace = "http://tcga.nci/bcr/xml/clinical/shared/2.7", required = true)
    protected RadiationTherapy radiationTherapy;
    @XmlElement(name = "postoperative_rx_tx", namespace = "http://tcga.nci/bcr/xml/clinical/shared/2.7", required = true, nillable = true)
    protected PostoperativeRxTx postoperativeRxTx;
    @XmlElement(name = "person_neoplasm_cancer_status", namespace = "http://tcga.nci/bcr/xml/clinical/shared/2.7", required = true, nillable = true)
    protected PersonNeoplasmCancerStatus personNeoplasmCancerStatus;
    @XmlElement(name = "vital_status", namespace = "http://tcga.nci/bcr/xml/clinical/shared/2.7", required = true)
    protected VitalStatus vitalStatus;
    @XmlElement(name = "day_of_last_followup", namespace = "http://tcga.nci/bcr/xml/clinical/shared/2.7", nillable = true)
    protected DayOfLastFollowup dayOfLastFollowup;
    @XmlElement(name = "month_of_last_followup", namespace = "http://tcga.nci/bcr/xml/clinical/shared/2.7", nillable = true)
    protected MonthOfLastFollowup monthOfLastFollowup;
    @XmlElement(name = "year_of_last_followup", namespace = "http://tcga.nci/bcr/xml/clinical/shared/2.7", nillable = true)
    protected YearOfLastFollowup yearOfLastFollowup;
    @XmlElement(name = "days_to_last_followup", namespace = "http://tcga.nci/bcr/xml/clinical/shared/2.7")
    protected DaysToLastFollowup daysToLastFollowup;
    @XmlElement(name = "day_of_death", namespace = "http://tcga.nci/bcr/xml/clinical/shared/2.7")
    protected DayOfDeath dayOfDeath;
    @XmlElement(name = "month_of_death", namespace = "http://tcga.nci/bcr/xml/clinical/shared/2.7")
    protected MonthOfDeath monthOfDeath;
    @XmlElement(name = "year_of_death", namespace = "http://tcga.nci/bcr/xml/clinical/shared/2.7")
    protected YearOfDeath yearOfDeath;
    @XmlElement(name = "days_to_death", namespace = "http://tcga.nci/bcr/xml/clinical/shared/2.7")
    protected DaysToDeath daysToDeath;
    @XmlElement(name = "new_tumor_events", namespace = "http://tcga.nci/bcr/xml/clinical/brca/shared/new_tumor_event/2.7/1.0", required = true)
    protected NewTumorEvents newTumorEvents;
    @XmlElement(name = "day_of_form_completion", namespace = "http://tcga.nci/bcr/xml/clinical/shared/2.7", nillable = true)
    protected DayOfFormCompletion dayOfFormCompletion;
    @XmlElement(name = "month_of_form_completion", namespace = "http://tcga.nci/bcr/xml/clinical/shared/2.7", nillable = true)
    protected MonthOfFormCompletion monthOfFormCompletion;
    @XmlElement(name = "year_of_form_completion", namespace = "http://tcga.nci/bcr/xml/clinical/shared/2.7", nillable = true)
    protected YearOfFormCompletion yearOfFormCompletion;
    @XmlElement(name = "days_to_form_completion", namespace = "http://tcga.nci/bcr/xml/clinical/shared/2.7")
    protected DaysToFormCompletion daysToFormCompletion;
    @XmlAttribute(name = "version")
    protected String version;
    @XmlAttribute(name = "sequence")
    protected BigInteger sequence;

    /**
     * Gets the value of the bcrFollowupBarcode property.
     * 
     * @return
     *     possible object is
     *     {@link BcrFollowupBarcode }
     *     
     */
    public BcrFollowupBarcode getBcrFollowupBarcode() {
        return bcrFollowupBarcode;
    }

    /**
     * Sets the value of the bcrFollowupBarcode property.
     * 
     * @param value
     *     allowed object is
     *     {@link BcrFollowupBarcode }
     *     
     */
    public void setBcrFollowupBarcode(BcrFollowupBarcode value) {
        this.bcrFollowupBarcode = value;
    }

    /**
     * Gets the value of the bcrFollowupUuid property.
     * 
     * @return
     *     possible object is
     *     {@link BcrFollowupUuid }
     *     
     */
    public BcrFollowupUuid getBcrFollowupUuid() {
        return bcrFollowupUuid;
    }

    /**
     * Sets the value of the bcrFollowupUuid property.
     * 
     * @param value
     *     allowed object is
     *     {@link BcrFollowupUuid }
     *     
     */
    public void setBcrFollowupUuid(BcrFollowupUuid value) {
        this.bcrFollowupUuid = value;
    }

    /**
     * Gets the value of the lostFollowUp property.
     * 
     * @return
     *     possible object is
     *     {@link LostFollowUp }
     *     
     */
    public LostFollowUp getLostFollowUp() {
        return lostFollowUp;
    }

    /**
     * Sets the value of the lostFollowUp property.
     * 
     * @param value
     *     allowed object is
     *     {@link LostFollowUp }
     *     
     */
    public void setLostFollowUp(LostFollowUp value) {
        this.lostFollowUp = value;
    }

    /**
     * Gets the value of the radiationTherapy property.
     * 
     * @return
     *     possible object is
     *     {@link RadiationTherapy }
     *     
     */
    public RadiationTherapy getRadiationTherapy() {
        return radiationTherapy;
    }

    /**
     * Sets the value of the radiationTherapy property.
     * 
     * @param value
     *     allowed object is
     *     {@link RadiationTherapy }
     *     
     */
    public void setRadiationTherapy(RadiationTherapy value) {
        this.radiationTherapy = value;
    }

    /**
     * Gets the value of the postoperativeRxTx property.
     * 
     * @return
     *     possible object is
     *     {@link PostoperativeRxTx }
     *     
     */
    public PostoperativeRxTx getPostoperativeRxTx() {
        return postoperativeRxTx;
    }

    /**
     * Sets the value of the postoperativeRxTx property.
     * 
     * @param value
     *     allowed object is
     *     {@link PostoperativeRxTx }
     *     
     */
    public void setPostoperativeRxTx(PostoperativeRxTx value) {
        this.postoperativeRxTx = value;
    }

    /**
     * Gets the value of the personNeoplasmCancerStatus property.
     * 
     * @return
     *     possible object is
     *     {@link PersonNeoplasmCancerStatus }
     *     
     */
    public PersonNeoplasmCancerStatus getPersonNeoplasmCancerStatus() {
        return personNeoplasmCancerStatus;
    }

    /**
     * Sets the value of the personNeoplasmCancerStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonNeoplasmCancerStatus }
     *     
     */
    public void setPersonNeoplasmCancerStatus(PersonNeoplasmCancerStatus value) {
        this.personNeoplasmCancerStatus = value;
    }

    /**
     * Gets the value of the vitalStatus property.
     * 
     * @return
     *     possible object is
     *     {@link VitalStatus }
     *     
     */
    public VitalStatus getVitalStatus() {
        return vitalStatus;
    }

    /**
     * Sets the value of the vitalStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link VitalStatus }
     *     
     */
    public void setVitalStatus(VitalStatus value) {
        this.vitalStatus = value;
    }

    /**
     * Gets the value of the dayOfLastFollowup property.
     * 
     * @return
     *     possible object is
     *     {@link DayOfLastFollowup }
     *     
     */
    public DayOfLastFollowup getDayOfLastFollowup() {
        return dayOfLastFollowup;
    }

    /**
     * Sets the value of the dayOfLastFollowup property.
     * 
     * @param value
     *     allowed object is
     *     {@link DayOfLastFollowup }
     *     
     */
    public void setDayOfLastFollowup(DayOfLastFollowup value) {
        this.dayOfLastFollowup = value;
    }

    /**
     * Gets the value of the monthOfLastFollowup property.
     * 
     * @return
     *     possible object is
     *     {@link MonthOfLastFollowup }
     *     
     */
    public MonthOfLastFollowup getMonthOfLastFollowup() {
        return monthOfLastFollowup;
    }

    /**
     * Sets the value of the monthOfLastFollowup property.
     * 
     * @param value
     *     allowed object is
     *     {@link MonthOfLastFollowup }
     *     
     */
    public void setMonthOfLastFollowup(MonthOfLastFollowup value) {
        this.monthOfLastFollowup = value;
    }

    /**
     * Gets the value of the yearOfLastFollowup property.
     * 
     * @return
     *     possible object is
     *     {@link YearOfLastFollowup }
     *     
     */
    public YearOfLastFollowup getYearOfLastFollowup() {
        return yearOfLastFollowup;
    }

    /**
     * Sets the value of the yearOfLastFollowup property.
     * 
     * @param value
     *     allowed object is
     *     {@link YearOfLastFollowup }
     *     
     */
    public void setYearOfLastFollowup(YearOfLastFollowup value) {
        this.yearOfLastFollowup = value;
    }

    /**
     * Gets the value of the daysToLastFollowup property.
     * 
     * @return
     *     possible object is
     *     {@link DaysToLastFollowup }
     *     
     */
    public DaysToLastFollowup getDaysToLastFollowup() {
        return daysToLastFollowup;
    }

    /**
     * Sets the value of the daysToLastFollowup property.
     * 
     * @param value
     *     allowed object is
     *     {@link DaysToLastFollowup }
     *     
     */
    public void setDaysToLastFollowup(DaysToLastFollowup value) {
        this.daysToLastFollowup = value;
    }

    /**
     * Gets the value of the dayOfDeath property.
     * 
     * @return
     *     possible object is
     *     {@link DayOfDeath }
     *     
     */
    public DayOfDeath getDayOfDeath() {
        return dayOfDeath;
    }

    /**
     * Sets the value of the dayOfDeath property.
     * 
     * @param value
     *     allowed object is
     *     {@link DayOfDeath }
     *     
     */
    public void setDayOfDeath(DayOfDeath value) {
        this.dayOfDeath = value;
    }

    /**
     * Gets the value of the monthOfDeath property.
     * 
     * @return
     *     possible object is
     *     {@link MonthOfDeath }
     *     
     */
    public MonthOfDeath getMonthOfDeath() {
        return monthOfDeath;
    }

    /**
     * Sets the value of the monthOfDeath property.
     * 
     * @param value
     *     allowed object is
     *     {@link MonthOfDeath }
     *     
     */
    public void setMonthOfDeath(MonthOfDeath value) {
        this.monthOfDeath = value;
    }

    /**
     * Gets the value of the yearOfDeath property.
     * 
     * @return
     *     possible object is
     *     {@link YearOfDeath }
     *     
     */
    public YearOfDeath getYearOfDeath() {
        return yearOfDeath;
    }

    /**
     * Sets the value of the yearOfDeath property.
     * 
     * @param value
     *     allowed object is
     *     {@link YearOfDeath }
     *     
     */
    public void setYearOfDeath(YearOfDeath value) {
        this.yearOfDeath = value;
    }

    /**
     * Gets the value of the daysToDeath property.
     * 
     * @return
     *     possible object is
     *     {@link DaysToDeath }
     *     
     */
    public DaysToDeath getDaysToDeath() {
        return daysToDeath;
    }

    /**
     * Sets the value of the daysToDeath property.
     * 
     * @param value
     *     allowed object is
     *     {@link DaysToDeath }
     *     
     */
    public void setDaysToDeath(DaysToDeath value) {
        this.daysToDeath = value;
    }

    /**
     * Gets the value of the newTumorEvents property.
     * 
     * @return
     *     possible object is
     *     {@link NewTumorEvents }
     *     
     */
    public NewTumorEvents getNewTumorEvents() {
        return newTumorEvents;
    }

    /**
     * Sets the value of the newTumorEvents property.
     * 
     * @param value
     *     allowed object is
     *     {@link NewTumorEvents }
     *     
     */
    public void setNewTumorEvents(NewTumorEvents value) {
        this.newTumorEvents = value;
    }

    /**
     * Gets the value of the dayOfFormCompletion property.
     * 
     * @return
     *     possible object is
     *     {@link DayOfFormCompletion }
     *     
     */
    public DayOfFormCompletion getDayOfFormCompletion() {
        return dayOfFormCompletion;
    }

    /**
     * Sets the value of the dayOfFormCompletion property.
     * 
     * @param value
     *     allowed object is
     *     {@link DayOfFormCompletion }
     *     
     */
    public void setDayOfFormCompletion(DayOfFormCompletion value) {
        this.dayOfFormCompletion = value;
    }

    /**
     * Gets the value of the monthOfFormCompletion property.
     * 
     * @return
     *     possible object is
     *     {@link MonthOfFormCompletion }
     *     
     */
    public MonthOfFormCompletion getMonthOfFormCompletion() {
        return monthOfFormCompletion;
    }

    /**
     * Sets the value of the monthOfFormCompletion property.
     * 
     * @param value
     *     allowed object is
     *     {@link MonthOfFormCompletion }
     *     
     */
    public void setMonthOfFormCompletion(MonthOfFormCompletion value) {
        this.monthOfFormCompletion = value;
    }

    /**
     * Gets the value of the yearOfFormCompletion property.
     * 
     * @return
     *     possible object is
     *     {@link YearOfFormCompletion }
     *     
     */
    public YearOfFormCompletion getYearOfFormCompletion() {
        return yearOfFormCompletion;
    }

    /**
     * Sets the value of the yearOfFormCompletion property.
     * 
     * @param value
     *     allowed object is
     *     {@link YearOfFormCompletion }
     *     
     */
    public void setYearOfFormCompletion(YearOfFormCompletion value) {
        this.yearOfFormCompletion = value;
    }

    /**
     * Gets the value of the daysToFormCompletion property.
     * 
     * @return
     *     possible object is
     *     {@link DaysToFormCompletion }
     *     
     */
    public DaysToFormCompletion getDaysToFormCompletion() {
        return daysToFormCompletion;
    }

    /**
     * Sets the value of the daysToFormCompletion property.
     * 
     * @param value
     *     allowed object is
     *     {@link DaysToFormCompletion }
     *     
     */
    public void setDaysToFormCompletion(DaysToFormCompletion value) {
        this.daysToFormCompletion = value;
    }

    /**
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersion() {
        if (version == null) {
            return "4.0";
        } else {
            return version;
        }
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersion(String value) {
        this.version = value;
    }

    /**
     * Gets the value of the sequence property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSequence() {
        return sequence;
    }

    /**
     * Sets the value of the sequence property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSequence(BigInteger value) {
        this.sequence = value;
    }

}