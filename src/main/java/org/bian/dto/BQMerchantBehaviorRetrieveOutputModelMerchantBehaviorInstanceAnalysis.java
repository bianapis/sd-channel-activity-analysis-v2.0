package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQMerchantBehaviorRetrieveOutputModelMerchantBehaviorInstanceAnalysis
 */
public class BQMerchantBehaviorRetrieveOutputModelMerchantBehaviorInstanceAnalysis   {
  private Object merchantBehaviorInstanceAnalysisRecord = null;

  private String merchantBehaviorInstanceAnalysisReportType = null;

  private String merchantBehaviorInstanceAnalysisParameters = null;

  private Object merchantBehaviorInstanceAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return merchantBehaviorInstanceAnalysisRecord
  **/

  public Object getMerchantBehaviorInstanceAnalysisRecord() {
    return merchantBehaviorInstanceAnalysisRecord;
  }

  public void setMerchantBehaviorInstanceAnalysisRecord(Object merchantBehaviorInstanceAnalysisRecord) {
    this.merchantBehaviorInstanceAnalysisRecord = merchantBehaviorInstanceAnalysisRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return merchantBehaviorInstanceAnalysisReportType
  **/

  public String getMerchantBehaviorInstanceAnalysisReportType() {
    return merchantBehaviorInstanceAnalysisReportType;
  }

  public void setMerchantBehaviorInstanceAnalysisReportType(String merchantBehaviorInstanceAnalysisReportType) {
    this.merchantBehaviorInstanceAnalysisReportType = merchantBehaviorInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return merchantBehaviorInstanceAnalysisParameters
  **/

  public String getMerchantBehaviorInstanceAnalysisParameters() {
    return merchantBehaviorInstanceAnalysisParameters;
  }

  public void setMerchantBehaviorInstanceAnalysisParameters(String merchantBehaviorInstanceAnalysisParameters) {
    this.merchantBehaviorInstanceAnalysisParameters = merchantBehaviorInstanceAnalysisParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate 
   * @return merchantBehaviorInstanceAnalysisReport
  **/

  public Object getMerchantBehaviorInstanceAnalysisReport() {
    return merchantBehaviorInstanceAnalysisReport;
  }

  public void setMerchantBehaviorInstanceAnalysisReport(Object merchantBehaviorInstanceAnalysisReport) {
    this.merchantBehaviorInstanceAnalysisReport = merchantBehaviorInstanceAnalysisReport;
  }


}

