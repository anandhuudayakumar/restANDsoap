package model;

import java.math.BigDecimal;

import java.sql.Timestamp;

import oracle.jbo.AttributeList;
import oracle.jbo.Key;
import oracle.jbo.RowIterator;
import oracle.jbo.domain.BlobDomain;
import oracle.jbo.server.EntityDefImpl;
import oracle.jbo.server.EntityImpl;
import oracle.jbo.server.SequenceImpl;
import oracle.jbo.server.TransactionEvent;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Thu Sep 26 13:54:15 IST 2019
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class OpportunitiesEOImpl extends EntityImpl {
    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. DO NOT MODIFY.
     */
    protected enum AttributesEnum {
        OppId,
        WinProb,
        CloseDate,
        PrimaryContact,
        SalesStage,
        SalesMeathod,
        SalesChannel,
        Budgeted,
        BudgetAmount,
        EstimatedDuration,
        RiskLevel,
        DecisionLevel,
        OppDocument,
        CreatedBy,
        CreatedDate,
        ModifiedDate,
        ObjectVersion,
        LastModifiedBy,
        OppName,
        Accountid,
        Contacts,
        ContactOppurtunity;
        private static AttributesEnum[] vals = null;
        private static final int firstIndex = 0;

        protected int index() {
            return AttributesEnum.firstIndex() + ordinal();
        }

        protected static final int firstIndex() {
            return firstIndex;
        }

        protected static int count() {
            return AttributesEnum.firstIndex() + AttributesEnum.staticValues().length;
        }

        protected static final AttributesEnum[] staticValues() {
            if (vals == null) {
                vals = AttributesEnum.values();
            }
            return vals;
        }
    }
    public static final int OPPID = AttributesEnum.OppId.index();
    public static final int WINPROB = AttributesEnum.WinProb.index();
    public static final int CLOSEDATE = AttributesEnum.CloseDate.index();
    public static final int PRIMARYCONTACT = AttributesEnum.PrimaryContact.index();
    public static final int SALESSTAGE = AttributesEnum.SalesStage.index();
    public static final int SALESMEATHOD = AttributesEnum.SalesMeathod.index();
    public static final int SALESCHANNEL = AttributesEnum.SalesChannel.index();
    public static final int BUDGETED = AttributesEnum.Budgeted.index();
    public static final int BUDGETAMOUNT = AttributesEnum.BudgetAmount.index();
    public static final int ESTIMATEDDURATION = AttributesEnum.EstimatedDuration.index();
    public static final int RISKLEVEL = AttributesEnum.RiskLevel.index();
    public static final int DECISIONLEVEL = AttributesEnum.DecisionLevel.index();
    public static final int OPPDOCUMENT = AttributesEnum.OppDocument.index();
    public static final int CREATEDBY = AttributesEnum.CreatedBy.index();
    public static final int CREATEDDATE = AttributesEnum.CreatedDate.index();
    public static final int MODIFIEDDATE = AttributesEnum.ModifiedDate.index();
    public static final int OBJECTVERSION = AttributesEnum.ObjectVersion.index();
    public static final int LASTMODIFIEDBY = AttributesEnum.LastModifiedBy.index();
    public static final int OPPNAME = AttributesEnum.OppName.index();
    public static final int ACCOUNTID = AttributesEnum.Accountid.index();
    public static final int CONTACTS = AttributesEnum.Contacts.index();
    public static final int CONTACTOPPURTUNITY = AttributesEnum.ContactOppurtunity.index();

    /**
     * This is the default constructor (do not remove).
     */
    public OpportunitiesEOImpl() {
    }

    /**
     * Gets the attribute value for OppId, using the alias name OppId.
     * @return the value of OppId
     */
    public BigDecimal getOppId() {
        return (BigDecimal) getAttributeInternal(OPPID);
    }

    /**
     * Sets <code>value</code> as the attribute value for OppId.
     * @param value value to set the OppId
     */
    public void setOppId(BigDecimal value) {
        setAttributeInternal(OPPID, value);
    }

    /**
     * Gets the attribute value for WinProb, using the alias name WinProb.
     * @return the value of WinProb
     */
    public BigDecimal getWinProb() {
        return (BigDecimal) getAttributeInternal(WINPROB);
    }

    /**
     * Sets <code>value</code> as the attribute value for WinProb.
     * @param value value to set the WinProb
     */
    public void setWinProb(BigDecimal value) {
        setAttributeInternal(WINPROB, value);
    }

    /**
     * Gets the attribute value for CloseDate, using the alias name CloseDate.
     * @return the value of CloseDate
     */
    public Timestamp getCloseDate() {
        return (Timestamp) getAttributeInternal(CLOSEDATE);
    }

    /**
     * Sets <code>value</code> as the attribute value for CloseDate.
     * @param value value to set the CloseDate
     */
    public void setCloseDate(Timestamp value) {
        setAttributeInternal(CLOSEDATE, value);
    }

    /**
     * Gets the attribute value for PrimaryContact, using the alias name PrimaryContact.
     * @return the value of PrimaryContact
     */
    public String getPrimaryContact() {
        return (String) getAttributeInternal(PRIMARYCONTACT);
    }

    /**
     * Sets <code>value</code> as the attribute value for PrimaryContact.
     * @param value value to set the PrimaryContact
     */
    public void setPrimaryContact(String value) {
        setAttributeInternal(PRIMARYCONTACT, value);
    }

    /**
     * Gets the attribute value for SalesStage, using the alias name SalesStage.
     * @return the value of SalesStage
     */
    public String getSalesStage() {
        return (String) getAttributeInternal(SALESSTAGE);
    }

    /**
     * Sets <code>value</code> as the attribute value for SalesStage.
     * @param value value to set the SalesStage
     */
    public void setSalesStage(String value) {
        setAttributeInternal(SALESSTAGE, value);
    }

    /**
     * Gets the attribute value for SalesMeathod, using the alias name SalesMeathod.
     * @return the value of SalesMeathod
     */
    public String getSalesMeathod() {
        return (String) getAttributeInternal(SALESMEATHOD);
    }

    /**
     * Sets <code>value</code> as the attribute value for SalesMeathod.
     * @param value value to set the SalesMeathod
     */
    public void setSalesMeathod(String value) {
        setAttributeInternal(SALESMEATHOD, value);
    }

    /**
     * Gets the attribute value for SalesChannel, using the alias name SalesChannel.
     * @return the value of SalesChannel
     */
    public String getSalesChannel() {
        return (String) getAttributeInternal(SALESCHANNEL);
    }

    /**
     * Sets <code>value</code> as the attribute value for SalesChannel.
     * @param value value to set the SalesChannel
     */
    public void setSalesChannel(String value) {
        setAttributeInternal(SALESCHANNEL, value);
    }

    /**
     * Gets the attribute value for Budgeted, using the alias name Budgeted.
     * @return the value of Budgeted
     */
    public String getBudgeted() {
        return (String) getAttributeInternal(BUDGETED);
    }

    /**
     * Sets <code>value</code> as the attribute value for Budgeted.
     * @param value value to set the Budgeted
     */
    public void setBudgeted(String value) {
        setAttributeInternal(BUDGETED, value);
    }

    /**
     * Gets the attribute value for BudgetAmount, using the alias name BudgetAmount.
     * @return the value of BudgetAmount
     */
    public BigDecimal getBudgetAmount() {
        return (BigDecimal) getAttributeInternal(BUDGETAMOUNT);
    }

    /**
     * Sets <code>value</code> as the attribute value for BudgetAmount.
     * @param value value to set the BudgetAmount
     */
    public void setBudgetAmount(BigDecimal value) {
        setAttributeInternal(BUDGETAMOUNT, value);
    }

    /**
     * Gets the attribute value for EstimatedDuration, using the alias name EstimatedDuration.
     * @return the value of EstimatedDuration
     */
    public String getEstimatedDuration() {
        return (String) getAttributeInternal(ESTIMATEDDURATION);
    }

    /**
     * Sets <code>value</code> as the attribute value for EstimatedDuration.
     * @param value value to set the EstimatedDuration
     */
    public void setEstimatedDuration(String value) {
        setAttributeInternal(ESTIMATEDDURATION, value);
    }

    /**
     * Gets the attribute value for RiskLevel, using the alias name RiskLevel.
     * @return the value of RiskLevel
     */
    public String getRiskLevel() {
        return (String) getAttributeInternal(RISKLEVEL);
    }

    /**
     * Sets <code>value</code> as the attribute value for RiskLevel.
     * @param value value to set the RiskLevel
     */
    public void setRiskLevel(String value) {
        setAttributeInternal(RISKLEVEL, value);
    }

    /**
     * Gets the attribute value for DecisionLevel, using the alias name DecisionLevel.
     * @return the value of DecisionLevel
     */
    public String getDecisionLevel() {
        return (String) getAttributeInternal(DECISIONLEVEL);
    }

    /**
     * Sets <code>value</code> as the attribute value for DecisionLevel.
     * @param value value to set the DecisionLevel
     */
    public void setDecisionLevel(String value) {
        setAttributeInternal(DECISIONLEVEL, value);
    }

    /**
     * Gets the attribute value for OppDocument, using the alias name OppDocument.
     * @return the value of OppDocument
     */
    public BlobDomain getOppDocument() {
        return (BlobDomain) getAttributeInternal(OPPDOCUMENT);
    }

    /**
     * Sets <code>value</code> as the attribute value for OppDocument.
     * @param value value to set the OppDocument
     */
    public void setOppDocument(BlobDomain value) {
        setAttributeInternal(OPPDOCUMENT, value);
    }

    /**
     * Gets the attribute value for CreatedBy, using the alias name CreatedBy.
     * @return the value of CreatedBy
     */
    public String getCreatedBy() {
        return (String) getAttributeInternal(CREATEDBY);
    }

    /**
     * Sets <code>value</code> as the attribute value for CreatedBy.
     * @param value value to set the CreatedBy
     */
    public void setCreatedBy(String value) {
        setAttributeInternal(CREATEDBY, value);
    }

    /**
     * Gets the attribute value for CreatedDate, using the alias name CreatedDate.
     * @return the value of CreatedDate
     */
    public Timestamp getCreatedDate() {
        return (Timestamp) getAttributeInternal(CREATEDDATE);
    }

    /**
     * Sets <code>value</code> as the attribute value for CreatedDate.
     * @param value value to set the CreatedDate
     */
    public void setCreatedDate(Timestamp value) {
        setAttributeInternal(CREATEDDATE, value);
    }

    /**
     * Gets the attribute value for ModifiedDate, using the alias name ModifiedDate.
     * @return the value of ModifiedDate
     */
    public Timestamp getModifiedDate() {
        return (Timestamp) getAttributeInternal(MODIFIEDDATE);
    }

    /**
     * Sets <code>value</code> as the attribute value for ModifiedDate.
     * @param value value to set the ModifiedDate
     */
    public void setModifiedDate(Timestamp value) {
        setAttributeInternal(MODIFIEDDATE, value);
    }

    /**
     * Gets the attribute value for ObjectVersion, using the alias name ObjectVersion.
     * @return the value of ObjectVersion
     */
    public BigDecimal getObjectVersion() {
        return (BigDecimal) getAttributeInternal(OBJECTVERSION);
    }

    /**
     * Sets <code>value</code> as the attribute value for ObjectVersion.
     * @param value value to set the ObjectVersion
     */
    public void setObjectVersion(BigDecimal value) {
        setAttributeInternal(OBJECTVERSION, value);
    }

    /**
     * Gets the attribute value for LastModifiedBy, using the alias name LastModifiedBy.
     * @return the value of LastModifiedBy
     */
    public String getLastModifiedBy() {
        return (String) getAttributeInternal(LASTMODIFIEDBY);
    }

    /**
     * Sets <code>value</code> as the attribute value for LastModifiedBy.
     * @param value value to set the LastModifiedBy
     */
    public void setLastModifiedBy(String value) {
        setAttributeInternal(LASTMODIFIEDBY, value);
    }

    /**
     * Gets the attribute value for OppName, using the alias name OppName.
     * @return the value of OppName
     */
    public String getOppName() {
        return (String) getAttributeInternal(OPPNAME);
    }

    /**
     * Sets <code>value</code> as the attribute value for OppName.
     * @param value value to set the OppName
     */
    public void setOppName(String value) {
        setAttributeInternal(OPPNAME, value);
    }

    /**
     * Gets the attribute value for Accountid, using the alias name Accountid.
     * @return the value of Accountid
     */
    public BigDecimal getAccountid() {
        return (BigDecimal) getAttributeInternal(ACCOUNTID);
    }

    /**
     * Sets <code>value</code> as the attribute value for Accountid.
     * @param value value to set the Accountid
     */
    public void setAccountid(BigDecimal value) {
        setAttributeInternal(ACCOUNTID, value);
    }

    /**
     * @return the associated entity oracle.jbo.RowIterator.
     */
    public RowIterator getContacts() {
        return (RowIterator) getAttributeInternal(CONTACTS);
    }

    /**
     * @return the associated entity oracle.jbo.RowIterator.
     */
    public RowIterator getContactOppurtunity() {
        return (RowIterator) getAttributeInternal(CONTACTOPPURTUNITY);
    }

    /**
     * @param oppId key constituent

     * @return a Key object based on given key constituents.
     */
    public static Key createPrimaryKey(BigDecimal oppId) {
        return new Key(new Object[] { oppId });
    }

    /**
     * @return the definition object for this instance class.
     */
    public static synchronized EntityDefImpl getDefinitionObject() {
        return EntityDefImpl.findDefObject("model.OpportunitiesEO");
    }

    /**
     * Add attribute defaulting logic in this method.
     * @param attributeList list of attribute names/values to initialize the row
     */
    protected void create(AttributeList attributeList) {
        
        //things that to be done before create 
        super.create(attributeList);
        SequenceImpl seq=new SequenceImpl("OPP_SEQ",getDBTransaction());
        setOppId(new BigDecimal(seq.getSequenceNumber().toString()));
        
        //tings that to be done after create 
        
        
        
    }

    /**
     * Add entity remove logic in this method.
     */
    public void remove() {
        super.remove();
    }

    /**
     * Add locking logic here.
     */
    public void lock() {
        super.lock();
    }

    /**
     * Custom DML update/insert/delete logic here.
     * @param operation the operation type
     * @param e the transaction event
     */
    protected void doDML(int operation, TransactionEvent e) {
        super.doDML(operation, e);
    }
}

