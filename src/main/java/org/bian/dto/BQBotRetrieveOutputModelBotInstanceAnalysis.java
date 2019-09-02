package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQBotRetrieveOutputModelBotInstanceAnalysis
 */
public class BQBotRetrieveOutputModelBotInstanceAnalysis   {
  private Object botInstanceAnalysisRecord = null;

  private String botInstanceAnalysisReportType = null;

  private String botInstanceAnalysisParameters = null;

  private Object botInstanceAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return botInstanceAnalysisRecord
  **/

  public Object getBotInstanceAnalysisRecord() {
    return botInstanceAnalysisRecord;
  }

  public void setBotInstanceAnalysisRecord(Object botInstanceAnalysisRecord) {
    this.botInstanceAnalysisRecord = botInstanceAnalysisRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return botInstanceAnalysisReportType
  **/

  public String getBotInstanceAnalysisReportType() {
    return botInstanceAnalysisReportType;
  }

  public void setBotInstanceAnalysisReportType(String botInstanceAnalysisReportType) {
    this.botInstanceAnalysisReportType = botInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return botInstanceAnalysisParameters
  **/

  public String getBotInstanceAnalysisParameters() {
    return botInstanceAnalysisParameters;
  }

  public void setBotInstanceAnalysisParameters(String botInstanceAnalysisParameters) {
    this.botInstanceAnalysisParameters = botInstanceAnalysisParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate 
   * @return botInstanceAnalysisReport
  **/

  public Object getBotInstanceAnalysisReport() {
    return botInstanceAnalysisReport;
  }

  public void setBotInstanceAnalysisReport(Object botInstanceAnalysisReport) {
    this.botInstanceAnalysisReport = botInstanceAnalysisReport;
  }


}

