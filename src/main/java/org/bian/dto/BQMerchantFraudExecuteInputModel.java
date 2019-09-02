package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQMerchantFraudExecuteInputModelMerchantFraudInstanceRecord;
import org.bian.dto.CRChannelActivityAnalysisExecuteInputModelExecuteRecordType;
import org.bian.dto.CRChannelActivityAnalysisRetrieveOutputModelChannelActivityAnalysisInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQMerchantFraudExecuteInputModel
 */
public class BQMerchantFraudExecuteInputModel   {
  private CRChannelActivityAnalysisRetrieveOutputModelChannelActivityAnalysisInstanceRecord channelActivityAnalysisInstanceRecord = null;

  private String channelActivityAnalysisInstanceReference = null;

  private String merchantFraudInstanceReference = null;

  private BQMerchantFraudExecuteInputModelMerchantFraudInstanceRecord merchantFraudInstanceRecord = null;

  private Object merchantFraudExecuteActionTaskRecord = null;

  private CRChannelActivityAnalysisExecuteInputModelExecuteRecordType executeRecordType = null;


  /**
   * Get channelActivityAnalysisInstanceRecord
   * @return channelActivityAnalysisInstanceRecord
  **/

  public CRChannelActivityAnalysisRetrieveOutputModelChannelActivityAnalysisInstanceRecord getChannelActivityAnalysisInstanceRecord() {
    return channelActivityAnalysisInstanceRecord;
  }

  public void setChannelActivityAnalysisInstanceRecord(CRChannelActivityAnalysisRetrieveOutputModelChannelActivityAnalysisInstanceRecord channelActivityAnalysisInstanceRecord) {
    this.channelActivityAnalysisInstanceRecord = channelActivityAnalysisInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the parent Channel Activity Analysis instance 
   * @return channelActivityAnalysisInstanceReference
  **/

  public String getChannelActivityAnalysisInstanceReference() {
    return channelActivityAnalysisInstanceReference;
  }

  public void setChannelActivityAnalysisInstanceReference(String channelActivityAnalysisInstanceReference) {
    this.channelActivityAnalysisInstanceReference = channelActivityAnalysisInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Merchant Fraud instance 
   * @return merchantFraudInstanceReference
  **/

  public String getMerchantFraudInstanceReference() {
    return merchantFraudInstanceReference;
  }

  public void setMerchantFraudInstanceReference(String merchantFraudInstanceReference) {
    this.merchantFraudInstanceReference = merchantFraudInstanceReference;
  }


  /**
   * Get merchantFraudInstanceRecord
   * @return merchantFraudInstanceRecord
  **/

  public BQMerchantFraudExecuteInputModelMerchantFraudInstanceRecord getMerchantFraudInstanceRecord() {
    return merchantFraudInstanceRecord;
  }

  public void setMerchantFraudInstanceRecord(BQMerchantFraudExecuteInputModelMerchantFraudInstanceRecord merchantFraudInstanceRecord) {
    this.merchantFraudInstanceRecord = merchantFraudInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The execute service call consolidated processing record 
   * @return merchantFraudExecuteActionTaskRecord
  **/

  public Object getMerchantFraudExecuteActionTaskRecord() {
    return merchantFraudExecuteActionTaskRecord;
  }

  public void setMerchantFraudExecuteActionTaskRecord(Object merchantFraudExecuteActionTaskRecord) {
    this.merchantFraudExecuteActionTaskRecord = merchantFraudExecuteActionTaskRecord;
  }


  /**
   * Get executeRecordType
   * @return executeRecordType
  **/

  public CRChannelActivityAnalysisExecuteInputModelExecuteRecordType getExecuteRecordType() {
    return executeRecordType;
  }

  public void setExecuteRecordType(CRChannelActivityAnalysisExecuteInputModelExecuteRecordType executeRecordType) {
    this.executeRecordType = executeRecordType;
  }


}

