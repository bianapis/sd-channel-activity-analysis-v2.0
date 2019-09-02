package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQBotRetrieveInputModelBotInstanceAnalysis;
import org.bian.dto.BQBotRetrieveInputModelBotInstanceReport;

import javax.validation.Valid;
  
/**
 * BQBotRetrieveInputModel
 */
public class BQBotRetrieveInputModel   {
  private Object botRetrieveActionTaskRecord = null;

  private String botRetrieveActionRequest = null;

  private BQBotRetrieveInputModelBotInstanceReport botInstanceReport = null;

  private BQBotRetrieveInputModelBotInstanceAnalysis botInstanceAnalysis = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return botRetrieveActionTaskRecord
  **/

  public Object getBotRetrieveActionTaskRecord() {
    return botRetrieveActionTaskRecord;
  }

  public void setBotRetrieveActionTaskRecord(Object botRetrieveActionTaskRecord) {
    this.botRetrieveActionTaskRecord = botRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return botRetrieveActionRequest
  **/

  public String getBotRetrieveActionRequest() {
    return botRetrieveActionRequest;
  }

  public void setBotRetrieveActionRequest(String botRetrieveActionRequest) {
    this.botRetrieveActionRequest = botRetrieveActionRequest;
  }


  /**
   * Get botInstanceReport
   * @return botInstanceReport
  **/

  public BQBotRetrieveInputModelBotInstanceReport getBotInstanceReport() {
    return botInstanceReport;
  }

  public void setBotInstanceReport(BQBotRetrieveInputModelBotInstanceReport botInstanceReport) {
    this.botInstanceReport = botInstanceReport;
  }


  /**
   * Get botInstanceAnalysis
   * @return botInstanceAnalysis
  **/

  public BQBotRetrieveInputModelBotInstanceAnalysis getBotInstanceAnalysis() {
    return botInstanceAnalysis;
  }

  public void setBotInstanceAnalysis(BQBotRetrieveInputModelBotInstanceAnalysis botInstanceAnalysis) {
    this.botInstanceAnalysis = botInstanceAnalysis;
  }


}

