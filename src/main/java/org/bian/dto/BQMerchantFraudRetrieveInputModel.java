package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQMerchantFraudRetrieveInputModelMerchantFraudInstanceAnalysis;
import org.bian.dto.BQMerchantFraudRetrieveInputModelMerchantFraudInstanceReport;

import javax.validation.Valid;
  
/**
 * BQMerchantFraudRetrieveInputModel
 */
public class BQMerchantFraudRetrieveInputModel   {
  private Object merchantFraudRetrieveActionTaskRecord = null;

  private String merchantFraudRetrieveActionRequest = null;

  private BQMerchantFraudRetrieveInputModelMerchantFraudInstanceReport merchantFraudInstanceReport = null;

  private BQMerchantFraudRetrieveInputModelMerchantFraudInstanceAnalysis merchantFraudInstanceAnalysis = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return merchantFraudRetrieveActionRequest
  **/

  public String getMerchantFraudRetrieveActionRequest() {
    return merchantFraudRetrieveActionRequest;
  }

  public void setMerchantFraudRetrieveActionRequest(String merchantFraudRetrieveActionRequest) {
    this.merchantFraudRetrieveActionRequest = merchantFraudRetrieveActionRequest;
  }


  /**
   * Get merchantFraudInstanceReport
   * @return merchantFraudInstanceReport
  **/

  public BQMerchantFraudRetrieveInputModelMerchantFraudInstanceReport getMerchantFraudInstanceReport() {
    return merchantFraudInstanceReport;
  }

  public void setMerchantFraudInstanceReport(BQMerchantFraudRetrieveInputModelMerchantFraudInstanceReport merchantFraudInstanceReport) {
    this.merchantFraudInstanceReport = merchantFraudInstanceReport;
  }


  /**
   * Get merchantFraudInstanceAnalysis
   * @return merchantFraudInstanceAnalysis
  **/

  public BQMerchantFraudRetrieveInputModelMerchantFraudInstanceAnalysis getMerchantFraudInstanceAnalysis() {
    return merchantFraudInstanceAnalysis;
  }

  public void setMerchantFraudInstanceAnalysis(BQMerchantFraudRetrieveInputModelMerchantFraudInstanceAnalysis merchantFraudInstanceAnalysis) {
    this.merchantFraudInstanceAnalysis = merchantFraudInstanceAnalysis;
  }


}

