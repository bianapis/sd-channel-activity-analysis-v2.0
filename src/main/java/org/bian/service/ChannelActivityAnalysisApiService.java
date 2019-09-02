/**
 * @author Virtusa
 */
package org.bian.service;

import java.util.List;

import org.bian.dto.*;

public interface ChannelActivityAnalysisApiService {

	SDChannelActivityAnalysisActivateOutputModel activate(SDChannelActivityAnalysisActivateInputModel request);
	
	SDChannelActivityAnalysisConfigureOutputModel configure(String sdReferenceId, SDChannelActivityAnalysisConfigureInputModel request);
	
	CRChannelActivityAnalysisEvaluateOutputModel evaluate(String sdReferenceId, CRChannelActivityAnalysisEvaluateInputModel request);
	
	BQBotExecuteOutputModel executeBot(String sdReferenceId, String crReferenceId, String bqReferenceId, BQBotExecuteInputModel request);
	
	BQCustomerBehaviorExecuteOutputModel executeCustomerbehavior(String sdReferenceId, String crReferenceId, String bqReferenceId, BQCustomerBehaviorExecuteInputModel request);
	
	BQCustomerFraudExecuteOutputModel executeCustomerfraud(String sdReferenceId, String crReferenceId, String bqReferenceId, BQCustomerFraudExecuteInputModel request);
	
	BQDeviceErrorExecuteOutputModel executeDeviceerror(String sdReferenceId, String crReferenceId, String bqReferenceId, BQDeviceErrorExecuteInputModel request);
	
	BQMerchantBehaviorExecuteOutputModel executeMerchantbehavior(String sdReferenceId, String crReferenceId, String bqReferenceId, BQMerchantBehaviorExecuteInputModel request);
	
	BQMerchantFraudExecuteOutputModel executeMerchantfraud(String sdReferenceId, String crReferenceId, String bqReferenceId, BQMerchantFraudExecuteInputModel request);
	
	CRChannelActivityAnalysisExecuteOutputModel execute(String sdReferenceId, String crReferenceId, CRChannelActivityAnalysisExecuteInputModel request);
	
	SDChannelActivityAnalysisFeedbackOutputModel feedback(String sdReferenceId, SDChannelActivityAnalysisFeedbackInputModel request);
	
	CRChannelActivityAnalysisRequestOutputModel request(String sdReferenceId, String crReferenceId, CRChannelActivityAnalysisRequestInputModel request);
	
	CRChannelActivityAnalysisRetrieveOutputModel retrieve(String sdReferenceId, String crReferenceId);
	
	List<String> retrieveBQIds(String sdReferenceId, String crReferenceId, String behaviorQualifier);
	
	List<String> retrieveBQs();
	
	BQBotRetrieveOutputModel retrieveBot(String sdReferenceId, String crReferenceId, String bqReferenceId);
	
	BQCustomerBehaviorRetrieveOutputModel retrieveCustomerbehavior(String sdReferenceId, String crReferenceId, String bqReferenceId);
	
	BQCustomerFraudRetrieveOutputModel retrieveCustomerfraud(String sdReferenceId, String crReferenceId, String bqReferenceId);
	
	BQDeviceErrorRetrieveOutputModel retrieveDeviceerror(String sdReferenceId, String crReferenceId, String bqReferenceId);
	
	BQMerchantBehaviorRetrieveOutputModel retrieveMerchantbehavior(String sdReferenceId, String crReferenceId, String bqReferenceId);
	
	BQMerchantFraudRetrieveOutputModel retrieveMerchantfraud(String sdReferenceId, String crReferenceId, String bqReferenceId);
	
	List<String> retrieveRefIds(String sdReferenceId);
	
	SDChannelActivityAnalysisRetrieveOutputModel retrieveSD(String sdReferenceId);
	
}
