package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRChannelActivityAnalysisRetrieveOutputModelChannelActivityAnalysisInstanceReportRecord
 */
public class CRChannelActivityAnalysisRetrieveOutputModelChannelActivityAnalysisInstanceReportRecord   {
  private String channelActivityAnalysisInstanceReportData = null;

  private String channelActivityAnalysisInstanceReportType = null;

  private Object channelActivityAnalysisInstanceReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected 
   * @return channelActivityAnalysisInstanceReportData
  **/

  public String getChannelActivityAnalysisInstanceReportData() {
    return channelActivityAnalysisInstanceReportData;
  }

  public void setChannelActivityAnalysisInstanceReportData(String channelActivityAnalysisInstanceReportData) {
    this.channelActivityAnalysisInstanceReportData = channelActivityAnalysisInstanceReportData;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return channelActivityAnalysisInstanceReportType
  **/

  public String getChannelActivityAnalysisInstanceReportType() {
    return channelActivityAnalysisInstanceReportType;
  }

  public void setChannelActivityAnalysisInstanceReportType(String channelActivityAnalysisInstanceReportType) {
    this.channelActivityAnalysisInstanceReportType = channelActivityAnalysisInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate 
   * @return channelActivityAnalysisInstanceReport
  **/

  public Object getChannelActivityAnalysisInstanceReport() {
    return channelActivityAnalysisInstanceReport;
  }

  public void setChannelActivityAnalysisInstanceReport(Object channelActivityAnalysisInstanceReport) {
    this.channelActivityAnalysisInstanceReport = channelActivityAnalysisInstanceReport;
  }


}

