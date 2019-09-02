package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQMerchantBehaviorExecuteInputModelMerchantBehaviorInstanceRecord;
import org.bian.dto.CRChannelActivityAnalysisExecuteInputModelExecuteRecordType;
import org.bian.dto.CRChannelActivityAnalysisRetrieveOutputModelChannelActivityAnalysisInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQMerchantBehaviorExecuteInputModel
 */
public class BQMerchantBehaviorExecuteInputModel   {
  private CRChannelActivityAnalysisRetrieveOutputModelChannelActivityAnalysisInstanceRecord channelActivityAnalysisInstanceRecord = null;

  private String channelActivityAnalysisInstanceReference = null;

  private String merchantBehaviorInstanceReference = null;

  private BQMerchantBehaviorExecuteInputModelMerchantBehaviorInstanceRecord merchantBehaviorInstanceRecord = null;

  private Object merchantBehaviorExecuteActionTaskRecord = null;

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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Merchant Behavior instance 
   * @return merchantBehaviorInstanceReference
  **/

  public String getMerchantBehaviorInstanceReference() {
    return merchantBehaviorInstanceReference;
  }

  public void setMerchantBehaviorInstanceReference(String merchantBehaviorInstanceReference) {
    this.merchantBehaviorInstanceReference = merchantBehaviorInstanceReference;
  }


  /**
   * Get merchantBehaviorInstanceRecord
   * @return merchantBehaviorInstanceRecord
  **/

  public BQMerchantBehaviorExecuteInputModelMerchantBehaviorInstanceRecord getMerchantBehaviorInstanceRecord() {
    return merchantBehaviorInstanceRecord;
  }

  public void setMerchantBehaviorInstanceRecord(BQMerchantBehaviorExecuteInputModelMerchantBehaviorInstanceRecord merchantBehaviorInstanceRecord) {
    this.merchantBehaviorInstanceRecord = merchantBehaviorInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The execute service call consolidated processing record 
   * @return merchantBehaviorExecuteActionTaskRecord
  **/

  public Object getMerchantBehaviorExecuteActionTaskRecord() {
    return merchantBehaviorExecuteActionTaskRecord;
  }

  public void setMerchantBehaviorExecuteActionTaskRecord(Object merchantBehaviorExecuteActionTaskRecord) {
    this.merchantBehaviorExecuteActionTaskRecord = merchantBehaviorExecuteActionTaskRecord;
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

