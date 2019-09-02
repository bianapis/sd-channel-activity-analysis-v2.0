package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQMerchantBehaviorRetrieveOutputModelMerchantBehaviorInstanceReport
 */
public class BQMerchantBehaviorRetrieveOutputModelMerchantBehaviorInstanceReport   {
  private Object merchantBehaviorInstanceReportRecord = null;

  private String merchantBehaviorInstanceReportType = null;

  private String merchantBehaviorInstanceReportParameters = null;

  private Object merchantBehaviorInstanceReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected 
   * @return merchantBehaviorInstanceReportRecord
  **/

  public Object getMerchantBehaviorInstanceReportRecord() {
    return merchantBehaviorInstanceReportRecord;
  }

  public void setMerchantBehaviorInstanceReportRecord(Object merchantBehaviorInstanceReportRecord) {
    this.merchantBehaviorInstanceReportRecord = merchantBehaviorInstanceReportRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return merchantBehaviorInstanceReportType
  **/

  public String getMerchantBehaviorInstanceReportType() {
    return merchantBehaviorInstanceReportType;
  }

  public void setMerchantBehaviorInstanceReportType(String merchantBehaviorInstanceReportType) {
    this.merchantBehaviorInstanceReportType = merchantBehaviorInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) 
   * @return merchantBehaviorInstanceReportParameters
  **/

  public String getMerchantBehaviorInstanceReportParameters() {
    return merchantBehaviorInstanceReportParameters;
  }

  public void setMerchantBehaviorInstanceReportParameters(String merchantBehaviorInstanceReportParameters) {
    this.merchantBehaviorInstanceReportParameters = merchantBehaviorInstanceReportParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate 
   * @return merchantBehaviorInstanceReport
  **/

  public Object getMerchantBehaviorInstanceReport() {
    return merchantBehaviorInstanceReport;
  }

  public void setMerchantBehaviorInstanceReport(Object merchantBehaviorInstanceReport) {
    this.merchantBehaviorInstanceReport = merchantBehaviorInstanceReport;
  }


}

