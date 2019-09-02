package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQCustomerFraudExecuteOutputModelChannelActivityAnalysisInstanceRecord;
import org.bian.dto.BQMerchantBehaviorExecuteOutputModelMerchantBehaviorInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQMerchantBehaviorExecuteOutputModel
 */
public class BQMerchantBehaviorExecuteOutputModel   {
  private BQCustomerFraudExecuteOutputModelChannelActivityAnalysisInstanceRecord channelActivityAnalysisInstanceRecord = null;

  private BQMerchantBehaviorExecuteOutputModelMerchantBehaviorInstanceRecord merchantBehaviorInstanceRecord = null;

  private String merchantBehaviorExecuteActionTaskReference = null;

  private Object merchantBehaviorExecuteActionTaskRecord = null;

  private String merchantBehaviorExecuteRecordReference = null;

  private Object executeResponseRecord = null;


  /**
   * Get channelActivityAnalysisInstanceRecord
   * @return channelActivityAnalysisInstanceRecord
  **/

  public BQCustomerFraudExecuteOutputModelChannelActivityAnalysisInstanceRecord getChannelActivityAnalysisInstanceRecord() {
    return channelActivityAnalysisInstanceRecord;
  }

  public void setChannelActivityAnalysisInstanceRecord(BQCustomerFraudExecuteOutputModelChannelActivityAnalysisInstanceRecord channelActivityAnalysisInstanceRecord) {
    this.channelActivityAnalysisInstanceRecord = channelActivityAnalysisInstanceRecord;
  }


  /**
   * Get merchantBehaviorInstanceRecord
   * @return merchantBehaviorInstanceRecord
  **/

  public BQMerchantBehaviorExecuteOutputModelMerchantBehaviorInstanceRecord getMerchantBehaviorInstanceRecord() {
    return merchantBehaviorInstanceRecord;
  }

  public void setMerchantBehaviorInstanceRecord(BQMerchantBehaviorExecuteOutputModelMerchantBehaviorInstanceRecord merchantBehaviorInstanceRecord) {
    this.merchantBehaviorInstanceRecord = merchantBehaviorInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Merchant Behavior instance execute service call 
   * @return merchantBehaviorExecuteActionTaskReference
  **/

  public String getMerchantBehaviorExecuteActionTaskReference() {
    return merchantBehaviorExecuteActionTaskReference;
  }

  public void setMerchantBehaviorExecuteActionTaskReference(String merchantBehaviorExecuteActionTaskReference) {
    this.merchantBehaviorExecuteActionTaskReference = merchantBehaviorExecuteActionTaskReference;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Merchant Behavior execute transaction/record 
   * @return merchantBehaviorExecuteRecordReference
  **/

  public String getMerchantBehaviorExecuteRecordReference() {
    return merchantBehaviorExecuteRecordReference;
  }

  public void setMerchantBehaviorExecuteRecordReference(String merchantBehaviorExecuteRecordReference) {
    this.merchantBehaviorExecuteRecordReference = merchantBehaviorExecuteRecordReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Details of the execute action service response 
   * @return executeResponseRecord
  **/

  public Object getExecuteResponseRecord() {
    return executeResponseRecord;
  }

  public void setExecuteResponseRecord(Object executeResponseRecord) {
    this.executeResponseRecord = executeResponseRecord;
  }


}

