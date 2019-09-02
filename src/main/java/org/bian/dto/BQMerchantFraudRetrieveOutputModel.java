package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQMerchantFraudRetrieveOutputModelMerchantFraudInstanceAnalysis;
import org.bian.dto.BQMerchantFraudRetrieveOutputModelMerchantFraudInstanceRecord;
import org.bian.dto.BQMerchantFraudRetrieveOutputModelMerchantFraudInstanceReport;
import org.bian.dto.CRChannelActivityAnalysisRetrieveOutputModelChannelActivityAnalysisInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQMerchantFraudRetrieveOutputModel
 */
public class BQMerchantFraudRetrieveOutputModel   {
  private CRChannelActivityAnalysisRetrieveOutputModelChannelActivityAnalysisInstanceRecord channelActivityAnalysisInstanceRecord = null;

  private BQMerchantFraudRetrieveOutputModelMerchantFraudInstanceRecord merchantFraudInstanceRecord = null;

  private String merchantFraudRetrieveActionTaskReference = null;

  private Object merchantFraudRetrieveActionTaskRecord = null;

  private String merchantFraudRetrieveActionResponse = null;

  private BQMerchantFraudRetrieveOutputModelMerchantFraudInstanceReport merchantFraudInstanceReport = null;

  private BQMerchantFraudRetrieveOutputModelMerchantFraudInstanceAnalysis merchantFraudInstanceAnalysis = null;


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
   * Get merchantFraudInstanceRecord
   * @return merchantFraudInstanceRecord
  **/

  public BQMerchantFraudRetrieveOutputModelMerchantFraudInstanceRecord getMerchantFraudInstanceRecord() {
    return merchantFraudInstanceRecord;
  }

  public void setMerchantFraudInstanceRecord(BQMerchantFraudRetrieveOutputModelMerchantFraudInstanceRecord merchantFraudInstanceRecord) {
    this.merchantFraudInstanceRecord = merchantFraudInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Merchant Fraud instance retrieve service call 
   * @return merchantFraudRetrieveActionTaskReference
  **/

  public String getMerchantFraudRetrieveActionTaskReference() {
    return merchantFraudRetrieveActionTaskReference;
  }

  public void setMerchantFraudRetrieveActionTaskReference(String merchantFraudRetrieveActionTaskReference) {
    this.merchantFraudRetrieveActionTaskReference = merchantFraudRetrieveActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return merchantFraudRetrieveActionTaskRecord
  **/

  public Object getMerchantFraudRetrieveActionTaskRecord() {
    return merchantFraudRetrieveActionTaskRecord;
  }

  public void setMerchantFraudRetrieveActionTaskRecord(Object merchantFraudRetrieveActionTaskRecord) {
    this.merchantFraudRetrieveActionTaskRecord = merchantFraudRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) 
   * @return merchantFraudRetrieveActionResponse
  **/

  public String getMerchantFraudRetrieveActionResponse() {
    return merchantFraudRetrieveActionResponse;
  }

  public void setMerchantFraudRetrieveActionResponse(String merchantFraudRetrieveActionResponse) {
    this.merchantFraudRetrieveActionResponse = merchantFraudRetrieveActionResponse;
  }


  /**
   * Get merchantFraudInstanceReport
   * @return merchantFraudInstanceReport
  **/

  public BQMerchantFraudRetrieveOutputModelMerchantFraudInstanceReport getMerchantFraudInstanceReport() {
    return merchantFraudInstanceReport;
  }

  public void setMerchantFraudInstanceReport(BQMerchantFraudRetrieveOutputModelMerchantFraudInstanceReport merchantFraudInstanceReport) {
    this.merchantFraudInstanceReport = merchantFraudInstanceReport;
  }


  /**
   * Get merchantFraudInstanceAnalysis
   * @return merchantFraudInstanceAnalysis
  **/

  public BQMerchantFraudRetrieveOutputModelMerchantFraudInstanceAnalysis getMerchantFraudInstanceAnalysis() {
    return merchantFraudInstanceAnalysis;
  }

  public void setMerchantFraudInstanceAnalysis(BQMerchantFraudRetrieveOutputModelMerchantFraudInstanceAnalysis merchantFraudInstanceAnalysis) {
    this.merchantFraudInstanceAnalysis = merchantFraudInstanceAnalysis;
  }


}

