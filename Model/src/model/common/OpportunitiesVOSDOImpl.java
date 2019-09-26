package model.common;

import org.eclipse.persistence.sdo.SDODataObject;

@SuppressWarnings("serial")
public class OpportunitiesVOSDOImpl extends SDODataObject implements OpportunitiesVOSDO {

   public static final int START_PROPERTY_INDEX = 0;

   public static final int END_PROPERTY_INDEX = START_PROPERTY_INDEX + 19;

   public OpportunitiesVOSDOImpl() {}

   public java.math.BigDecimal getOppId() {
      return getBigDecimal(START_PROPERTY_INDEX + 0);
   }

   public void setOppId(java.math.BigDecimal value) {
      set(START_PROPERTY_INDEX + 0 , value);
   }

   public java.math.BigDecimal getWinProb() {
      return getBigDecimal(START_PROPERTY_INDEX + 1);
   }

   public void setWinProb(java.math.BigDecimal value) {
      set(START_PROPERTY_INDEX + 1 , value);
   }

   public java.sql.Timestamp getCloseDate() {
      return (java.sql.Timestamp)get(START_PROPERTY_INDEX + 2);
   }

   public void setCloseDate(java.sql.Timestamp value) {
      set(START_PROPERTY_INDEX + 2 , value);
   }

   public java.lang.String getPrimaryContact() {
      return getString(START_PROPERTY_INDEX + 3);
   }

   public void setPrimaryContact(java.lang.String value) {
      set(START_PROPERTY_INDEX + 3 , value);
   }

   public java.lang.String getSalesStage() {
      return getString(START_PROPERTY_INDEX + 4);
   }

   public void setSalesStage(java.lang.String value) {
      set(START_PROPERTY_INDEX + 4 , value);
   }

   public java.lang.String getSalesMeathod() {
      return getString(START_PROPERTY_INDEX + 5);
   }

   public void setSalesMeathod(java.lang.String value) {
      set(START_PROPERTY_INDEX + 5 , value);
   }

   public java.lang.String getSalesChannel() {
      return getString(START_PROPERTY_INDEX + 6);
   }

   public void setSalesChannel(java.lang.String value) {
      set(START_PROPERTY_INDEX + 6 , value);
   }

   public java.lang.String getBudgeted() {
      return getString(START_PROPERTY_INDEX + 7);
   }

   public void setBudgeted(java.lang.String value) {
      set(START_PROPERTY_INDEX + 7 , value);
   }

   public java.math.BigDecimal getBudgetAmount() {
      return getBigDecimal(START_PROPERTY_INDEX + 8);
   }

   public void setBudgetAmount(java.math.BigDecimal value) {
      set(START_PROPERTY_INDEX + 8 , value);
   }

   public java.lang.String getEstimatedDuration() {
      return getString(START_PROPERTY_INDEX + 9);
   }

   public void setEstimatedDuration(java.lang.String value) {
      set(START_PROPERTY_INDEX + 9 , value);
   }

   public java.lang.String getRiskLevel() {
      return getString(START_PROPERTY_INDEX + 10);
   }

   public void setRiskLevel(java.lang.String value) {
      set(START_PROPERTY_INDEX + 10 , value);
   }

   public java.lang.String getDecisionLevel() {
      return getString(START_PROPERTY_INDEX + 11);
   }

   public void setDecisionLevel(java.lang.String value) {
      set(START_PROPERTY_INDEX + 11 , value);
   }

   public javax.activation.DataHandler getOppDocument() {
      return (javax.activation.DataHandler)get(START_PROPERTY_INDEX + 12);
   }

   public void setOppDocument(javax.activation.DataHandler value) {
      set(START_PROPERTY_INDEX + 12 , value);
   }

   public java.lang.String getCreatedBy() {
      return getString(START_PROPERTY_INDEX + 13);
   }

   public void setCreatedBy(java.lang.String value) {
      set(START_PROPERTY_INDEX + 13 , value);
   }

   public java.sql.Timestamp getCreatedDate() {
      return (java.sql.Timestamp)get(START_PROPERTY_INDEX + 14);
   }

   public void setCreatedDate(java.sql.Timestamp value) {
      set(START_PROPERTY_INDEX + 14 , value);
   }

   public java.sql.Timestamp getModifiedDate() {
      return (java.sql.Timestamp)get(START_PROPERTY_INDEX + 15);
   }

   public void setModifiedDate(java.sql.Timestamp value) {
      set(START_PROPERTY_INDEX + 15 , value);
   }

   public java.math.BigDecimal getObjectVersion() {
      return getBigDecimal(START_PROPERTY_INDEX + 16);
   }

   public void setObjectVersion(java.math.BigDecimal value) {
      set(START_PROPERTY_INDEX + 16 , value);
   }

   public java.lang.String getLastModifiedBy() {
      return getString(START_PROPERTY_INDEX + 17);
   }

   public void setLastModifiedBy(java.lang.String value) {
      set(START_PROPERTY_INDEX + 17 , value);
   }

   public java.lang.String getOppName() {
      return getString(START_PROPERTY_INDEX + 18);
   }

   public void setOppName(java.lang.String value) {
      set(START_PROPERTY_INDEX + 18 , value);
   }

   public java.math.BigDecimal getAccountid() {
      return getBigDecimal(START_PROPERTY_INDEX + 19);
   }

   public void setAccountid(java.math.BigDecimal value) {
      set(START_PROPERTY_INDEX + 19 , value);
   }


}

