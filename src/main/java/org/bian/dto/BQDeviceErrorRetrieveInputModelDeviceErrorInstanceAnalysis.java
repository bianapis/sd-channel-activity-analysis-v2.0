package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQDeviceErrorRetrieveInputModelDeviceErrorInstanceAnalysis
 */
public class BQDeviceErrorRetrieveInputModelDeviceErrorInstanceAnalysis   {
  private String deviceErrorInstanceAnalysisReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance analysis view 
   * @return deviceErrorInstanceAnalysisReference
  **/

  public String getDeviceErrorInstanceAnalysisReference() {
    return deviceErrorInstanceAnalysisReference;
  }

  public void setDeviceErrorInstanceAnalysisReference(String deviceErrorInstanceAnalysisReference) {
    this.deviceErrorInstanceAnalysisReference = deviceErrorInstanceAnalysisReference;
  }


}

