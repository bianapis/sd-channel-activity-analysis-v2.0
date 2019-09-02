package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQMerchantBehaviorRetrieveInputModelMerchantBehaviorInstanceAnalysis;
import org.bian.dto.BQMerchantBehaviorRetrieveInputModelMerchantBehaviorInstanceReport;

import javax.validation.Valid;
  
/**
 * BQMerchantBehaviorRetrieveInputModel
 */
public class BQMerchantBehaviorRetrieveInputModel   {
  private Object merchantBehaviorRetrieveActionTaskRecord = null;

  private String merchantBehaviorRetrieveActionRequest = null;

  private BQMerchantBehaviorRetrieveInputModelMerchantBehaviorInstanceReport merchantBehaviorInstanceReport = null;

  private BQMerchantBehaviorRetrieveInputModelMerchantBehaviorInstanceAnalysis merchantBehaviorInstanceAnalysis = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return merchantBehaviorRetrieveActionRequest
  **/

  public String getMerchantBehaviorRetrieveActionRequest() {
    return merchantBehaviorRetrieveActionRequest;
  }

  public void setMerchantBehaviorRetrieveActionRequest(String merchantBehaviorRetrieveActionRequest) {
    this.merchantBehaviorRetrieveActionRequest = merchantBehaviorRetrieveActionRequest;
  }


  /**
   * Get merchantBehaviorInstanceReport
   * @return merchantBehaviorInstanceReport
  **/

  public BQMerchantBehaviorRetrieveInputModelMerchantBehaviorInstanceReport getMerchantBehaviorInstanceReport() {
    return merchantBehaviorInstanceReport;
  }

  public void setMerchantBehaviorInstanceReport(BQMerchantBehaviorRetrieveInputModelMerchantBehaviorInstanceReport merchantBehaviorInstanceReport) {
    this.merchantBehaviorInstanceReport = merchantBehaviorInstanceReport;
  }


  /**
   * Get merchantBehaviorInstanceAnalysis
   * @return merchantBehaviorInstanceAnalysis
  **/

  public BQMerchantBehaviorRetrieveInputModelMerchantBehaviorInstanceAnalysis getMerchantBehaviorInstanceAnalysis() {
    return merchantBehaviorInstanceAnalysis;
  }

  public void setMerchantBehaviorInstanceAnalysis(BQMerchantBehaviorRetrieveInputModelMerchantBehaviorInstanceAnalysis merchantBehaviorInstanceAnalysis) {
    this.merchantBehaviorInstanceAnalysis = merchantBehaviorInstanceAnalysis;
  }


}

