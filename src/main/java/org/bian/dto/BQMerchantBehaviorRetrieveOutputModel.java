package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQMerchantBehaviorRetrieveOutputModelMerchantBehaviorInstanceAnalysis;
import org.bian.dto.BQMerchantBehaviorRetrieveOutputModelMerchantBehaviorInstanceRecord;
import org.bian.dto.BQMerchantBehaviorRetrieveOutputModelMerchantBehaviorInstanceReport;
import org.bian.dto.CRChannelActivityAnalysisRetrieveOutputModelChannelActivityAnalysisInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQMerchantBehaviorRetrieveOutputModel
 */
public class BQMerchantBehaviorRetrieveOutputModel   {
  private CRChannelActivityAnalysisRetrieveOutputModelChannelActivityAnalysisInstanceRecord channelActivityAnalysisInstanceRecord = null;

  private BQMerchantBehaviorRetrieveOutputModelMerchantBehaviorInstanceRecord merchantBehaviorInstanceRecord = null;

  private String merchantBehaviorRetrieveActionTaskReference = null;

  private Object merchantBehaviorRetrieveActionTaskRecord = null;

  private String merchantBehaviorRetrieveActionResponse = null;

  private BQMerchantBehaviorRetrieveOutputModelMerchantBehaviorInstanceReport merchantBehaviorInstanceReport = null;

  private BQMerchantBehaviorRetrieveOutputModelMerchantBehaviorInstanceAnalysis merchantBehaviorInstanceAnalysis = null;


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
   * Get merchantBehaviorInstanceRecord
   * @return merchantBehaviorInstanceRecord
  **/

  public BQMerchantBehaviorRetrieveOutputModelMerchantBehaviorInstanceRecord getMerchantBehaviorInstanceRecord() {
    return merchantBehaviorInstanceRecord;
  }

  public void setMerchantBehaviorInstanceRecord(BQMerchantBehaviorRetrieveOutputModelMerchantBehaviorInstanceRecord merchantBehaviorInstanceRecord) {
    this.merchantBehaviorInstanceRecord = merchantBehaviorInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Merchant Behavior instance retrieve service call 
   * @return merchantBehaviorRetrieveActionTaskReference
  **/

  public String getMerchantBehaviorRetrieveActionTaskReference() {
    return merchantBehaviorRetrieveActionTaskReference;
  }

  public void setMerchantBehaviorRetrieveActionTaskReference(String merchantBehaviorRetrieveActionTaskReference) {
    this.merchantBehaviorRetrieveActionTaskReference = merchantBehaviorRetrieveActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return merchantBehaviorRetrieveActionTaskRecord
  **/

  public Object getMerchantBehaviorRetrieveActionTaskRecord() {
    return merchantBehaviorRetrieveActionTaskRecord;
  }

  public void setMerchantBehaviorRetrieveActionTaskRecord(Object merchantBehaviorRetrieveActionTaskRecord) {
    this.merchantBehaviorRetrieveActionTaskRecord = merchantBehaviorRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) 
   * @return merchantBehaviorRetrieveActionResponse
  **/

  public String getMerchantBehaviorRetrieveActionResponse() {
    return merchantBehaviorRetrieveActionResponse;
  }

  public void setMerchantBehaviorRetrieveActionResponse(String merchantBehaviorRetrieveActionResponse) {
    this.merchantBehaviorRetrieveActionResponse = merchantBehaviorRetrieveActionResponse;
  }


  /**
   * Get merchantBehaviorInstanceReport
   * @return merchantBehaviorInstanceReport
  **/

  public BQMerchantBehaviorRetrieveOutputModelMerchantBehaviorInstanceReport getMerchantBehaviorInstanceReport() {
    return merchantBehaviorInstanceReport;
  }

  public void setMerchantBehaviorInstanceReport(BQMerchantBehaviorRetrieveOutputModelMerchantBehaviorInstanceReport merchantBehaviorInstanceReport) {
    this.merchantBehaviorInstanceReport = merchantBehaviorInstanceReport;
  }


  /**
   * Get merchantBehaviorInstanceAnalysis
   * @return merchantBehaviorInstanceAnalysis
  **/

  public BQMerchantBehaviorRetrieveOutputModelMerchantBehaviorInstanceAnalysis getMerchantBehaviorInstanceAnalysis() {
    return merchantBehaviorInstanceAnalysis;
  }

  public void setMerchantBehaviorInstanceAnalysis(BQMerchantBehaviorRetrieveOutputModelMerchantBehaviorInstanceAnalysis merchantBehaviorInstanceAnalysis) {
    this.merchantBehaviorInstanceAnalysis = merchantBehaviorInstanceAnalysis;
  }


}

