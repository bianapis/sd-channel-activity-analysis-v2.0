package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQCustomerFraudRetrieveInputModelCustomerFraudInstanceReport
 */
public class BQCustomerFraudRetrieveInputModelCustomerFraudInstanceReport   {
  private String customerFraudInstanceReportReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance report 
   * @return customerFraudInstanceReportReference
  **/

  public String getCustomerFraudInstanceReportReference() {
    return customerFraudInstanceReportReference;
  }

  public void setCustomerFraudInstanceReportReference(String customerFraudInstanceReportReference) {
    this.customerFraudInstanceReportReference = customerFraudInstanceReportReference;
  }


}

