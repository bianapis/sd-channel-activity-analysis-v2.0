package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRChannelActivityAnalysisRetrieveOutputModelChannelActivityAnalysisInstanceAnalysis
 */
public class CRChannelActivityAnalysisRetrieveOutputModelChannelActivityAnalysisInstanceAnalysis   {
  private String channelActivityAnalysisInstanceAnalysisData = null;

  private String channelActivityAnalysisInstanceAnalysisReportType = null;

  private Object channelActivityAnalysisInstanceAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return channelActivityAnalysisInstanceAnalysisData
  **/

  public String getChannelActivityAnalysisInstanceAnalysisData() {
    return channelActivityAnalysisInstanceAnalysisData;
  }

  public void setChannelActivityAnalysisInstanceAnalysisData(String channelActivityAnalysisInstanceAnalysisData) {
    this.channelActivityAnalysisInstanceAnalysisData = channelActivityAnalysisInstanceAnalysisData;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return channelActivityAnalysisInstanceAnalysisReportType
  **/

  public String getChannelActivityAnalysisInstanceAnalysisReportType() {
    return channelActivityAnalysisInstanceAnalysisReportType;
  }

  public void setChannelActivityAnalysisInstanceAnalysisReportType(String channelActivityAnalysisInstanceAnalysisReportType) {
    this.channelActivityAnalysisInstanceAnalysisReportType = channelActivityAnalysisInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate 
   * @return channelActivityAnalysisInstanceAnalysisReport
  **/

  public Object getChannelActivityAnalysisInstanceAnalysisReport() {
    return channelActivityAnalysisInstanceAnalysisReport;
  }

  public void setChannelActivityAnalysisInstanceAnalysisReport(Object channelActivityAnalysisInstanceAnalysisReport) {
    this.channelActivityAnalysisInstanceAnalysisReport = channelActivityAnalysisInstanceAnalysisReport;
  }


}

