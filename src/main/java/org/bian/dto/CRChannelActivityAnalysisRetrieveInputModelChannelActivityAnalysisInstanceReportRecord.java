package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRChannelActivityAnalysisRetrieveInputModelChannelActivityAnalysisInstanceReportRecord
 */
public class CRChannelActivityAnalysisRetrieveInputModelChannelActivityAnalysisInstanceReportRecord   {
  private String channelActivityAnalysisInstanceReportReference = null;

  private String channelActivityAnalysisInstanceReportType = null;

  private String channelActivityAnalysisInstanceReportParameters = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance report 
   * @return channelActivityAnalysisInstanceReportReference
  **/

  public String getChannelActivityAnalysisInstanceReportReference() {
    return channelActivityAnalysisInstanceReportReference;
  }

  public void setChannelActivityAnalysisInstanceReportReference(String channelActivityAnalysisInstanceReportReference) {
    this.channelActivityAnalysisInstanceReportReference = channelActivityAnalysisInstanceReportReference;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) 
   * @return channelActivityAnalysisInstanceReportParameters
  **/

  public String getChannelActivityAnalysisInstanceReportParameters() {
    return channelActivityAnalysisInstanceReportParameters;
  }

  public void setChannelActivityAnalysisInstanceReportParameters(String channelActivityAnalysisInstanceReportParameters) {
    this.channelActivityAnalysisInstanceReportParameters = channelActivityAnalysisInstanceReportParameters;
  }


}

