package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQBotRetrieveInputModelBotInstanceReport
 */
public class BQBotRetrieveInputModelBotInstanceReport   {
  private String botInstanceReportReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance report 
   * @return botInstanceReportReference
  **/

  public String getBotInstanceReportReference() {
    return botInstanceReportReference;
  }

  public void setBotInstanceReportReference(String botInstanceReportReference) {
    this.botInstanceReportReference = botInstanceReportReference;
  }


}

