package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRChannelActivityAnalysisRetrieveInputModelChannelActivityAnalysisInstanceAnalysis
 */
public class CRChannelActivityAnalysisRetrieveInputModelChannelActivityAnalysisInstanceAnalysis   {
  private String channelActivityAnalysisInstanceAnalysisReference = null;

  private String channelActivityAnalysisInstanceAnalysisReportType = null;

  private String channelActivityAnalysisInstanceAnalysisParameters = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance analysis view 
   * @return channelActivityAnalysisInstanceAnalysisReference
  **/

  public String getChannelActivityAnalysisInstanceAnalysisReference() {
    return channelActivityAnalysisInstanceAnalysisReference;
  }

  public void setChannelActivityAnalysisInstanceAnalysisReference(String channelActivityAnalysisInstanceAnalysisReference) {
    this.channelActivityAnalysisInstanceAnalysisReference = channelActivityAnalysisInstanceAnalysisReference;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return channelActivityAnalysisInstanceAnalysisParameters
  **/

  public String getChannelActivityAnalysisInstanceAnalysisParameters() {
    return channelActivityAnalysisInstanceAnalysisParameters;
  }

  public void setChannelActivityAnalysisInstanceAnalysisParameters(String channelActivityAnalysisInstanceAnalysisParameters) {
    this.channelActivityAnalysisInstanceAnalysisParameters = channelActivityAnalysisInstanceAnalysisParameters;
  }


}

