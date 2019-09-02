package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQDeviceErrorRetrieveOutputModelDeviceErrorInstanceAnalysis
 */
public class BQDeviceErrorRetrieveOutputModelDeviceErrorInstanceAnalysis   {
  private Object deviceErrorInstanceAnalysisRecord = null;

  private String deviceErrorInstanceAnalysisReportType = null;

  private String deviceErrorInstanceAnalysisParameters = null;

  private Object deviceErrorInstanceAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return deviceErrorInstanceAnalysisRecord
  **/

  public Object getDeviceErrorInstanceAnalysisRecord() {
    return deviceErrorInstanceAnalysisRecord;
  }

  public void setDeviceErrorInstanceAnalysisRecord(Object deviceErrorInstanceAnalysisRecord) {
    this.deviceErrorInstanceAnalysisRecord = deviceErrorInstanceAnalysisRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return deviceErrorInstanceAnalysisReportType
  **/

  public String getDeviceErrorInstanceAnalysisReportType() {
    return deviceErrorInstanceAnalysisReportType;
  }

  public void setDeviceErrorInstanceAnalysisReportType(String deviceErrorInstanceAnalysisReportType) {
    this.deviceErrorInstanceAnalysisReportType = deviceErrorInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return deviceErrorInstanceAnalysisParameters
  **/

  public String getDeviceErrorInstanceAnalysisParameters() {
    return deviceErrorInstanceAnalysisParameters;
  }

  public void setDeviceErrorInstanceAnalysisParameters(String deviceErrorInstanceAnalysisParameters) {
    this.deviceErrorInstanceAnalysisParameters = deviceErrorInstanceAnalysisParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate 
   * @return deviceErrorInstanceAnalysisReport
  **/

  public Object getDeviceErrorInstanceAnalysisReport() {
    return deviceErrorInstanceAnalysisReport;
  }

  public void setDeviceErrorInstanceAnalysisReport(Object deviceErrorInstanceAnalysisReport) {
    this.deviceErrorInstanceAnalysisReport = deviceErrorInstanceAnalysisReport;
  }


}

