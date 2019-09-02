/**
 * @author Virtusa
 */
package org.bian.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.bian.dto.*;
import org.bian.util.JsonReader;
import com.fasterxml.jackson.core.type.TypeReference;

@Service
public class ChannelActivityAnalysisApiServiceImpl implements ChannelActivityAnalysisApiService {

	public SDChannelActivityAnalysisActivateOutputModel activate(SDChannelActivityAnalysisActivateInputModel request){
		return JsonReader.read("activate-SDChannelActivityAnalysisActivateOutputModel.json",new TypeReference<SDChannelActivityAnalysisActivateOutputModel>(){});
	}
	
	public SDChannelActivityAnalysisConfigureOutputModel configure(String sdReferenceId, SDChannelActivityAnalysisConfigureInputModel request){
		return JsonReader.read("configure-SDChannelActivityAnalysisConfigureOutputModel.json",new TypeReference<SDChannelActivityAnalysisConfigureOutputModel>(){});
	}
	
	public CRChannelActivityAnalysisEvaluateOutputModel evaluate(String sdReferenceId, CRChannelActivityAnalysisEvaluateInputModel request){
		return JsonReader.read("evaluate-CRChannelActivityAnalysisEvaluateOutputModel.json",new TypeReference<CRChannelActivityAnalysisEvaluateOutputModel>(){});
	}
	
	public BQBotExecuteOutputModel executeBot(String sdReferenceId, String crReferenceId, String bqReferenceId, BQBotExecuteInputModel request){
		return JsonReader.read("execute-BQBotExecuteOutputModel.json",new TypeReference<BQBotExecuteOutputModel>(){});
	}
	
	public BQCustomerBehaviorExecuteOutputModel executeCustomerbehavior(String sdReferenceId, String crReferenceId, String bqReferenceId, BQCustomerBehaviorExecuteInputModel request){
		return JsonReader.read("execute-BQCustomerBehaviorExecuteOutputModel.json",new TypeReference<BQCustomerBehaviorExecuteOutputModel>(){});
	}
	
	public BQCustomerFraudExecuteOutputModel executeCustomerfraud(String sdReferenceId, String crReferenceId, String bqReferenceId, BQCustomerFraudExecuteInputModel request){
		return JsonReader.read("execute-BQCustomerFraudExecuteOutputModel.json",new TypeReference<BQCustomerFraudExecuteOutputModel>(){});
	}
	
	public BQDeviceErrorExecuteOutputModel executeDeviceerror(String sdReferenceId, String crReferenceId, String bqReferenceId, BQDeviceErrorExecuteInputModel request){
		return JsonReader.read("execute-BQDeviceErrorExecuteOutputModel.json",new TypeReference<BQDeviceErrorExecuteOutputModel>(){});
	}
	
	public BQMerchantBehaviorExecuteOutputModel executeMerchantbehavior(String sdReferenceId, String crReferenceId, String bqReferenceId, BQMerchantBehaviorExecuteInputModel request){
		return JsonReader.read("execute-BQMerchantBehaviorExecuteOutputModel.json",new TypeReference<BQMerchantBehaviorExecuteOutputModel>(){});
	}
	
	public BQMerchantFraudExecuteOutputModel executeMerchantfraud(String sdReferenceId, String crReferenceId, String bqReferenceId, BQMerchantFraudExecuteInputModel request){
		return JsonReader.read("execute-BQMerchantFraudExecuteOutputModel.json",new TypeReference<BQMerchantFraudExecuteOutputModel>(){});
	}
	
	public CRChannelActivityAnalysisExecuteOutputModel execute(String sdReferenceId, String crReferenceId, CRChannelActivityAnalysisExecuteInputModel request){
		return JsonReader.read("execute-CRChannelActivityAnalysisExecuteOutputModel.json",new TypeReference<CRChannelActivityAnalysisExecuteOutputModel>(){});
	}
	
	public SDChannelActivityAnalysisFeedbackOutputModel feedback(String sdReferenceId, SDChannelActivityAnalysisFeedbackInputModel request){
		return JsonReader.read("feedback-SDChannelActivityAnalysisFeedbackOutputModel.json",new TypeReference<SDChannelActivityAnalysisFeedbackOutputModel>(){});
	}
	
	public CRChannelActivityAnalysisRequestOutputModel request(String sdReferenceId, String crReferenceId, CRChannelActivityAnalysisRequestInputModel request){
		return JsonReader.read("request-CRChannelActivityAnalysisRequestOutputModel.json",new TypeReference<CRChannelActivityAnalysisRequestOutputModel>(){});
	}
	
	public CRChannelActivityAnalysisRetrieveOutputModel retrieve(String sdReferenceId, String crReferenceId){
		return JsonReader.read("retrieve-CRChannelActivityAnalysisRetrieveOutputModel.json",new TypeReference<CRChannelActivityAnalysisRetrieveOutputModel>(){});
	}
	
	public List<String> retrieveBQIds(String sdReferenceId, String crReferenceId, String behaviorQualifier){
		return JsonReader.read("retrieveBQIds-String.json",new TypeReference<List<String>>(){});
	}
	
	public List<String> retrieveBQs(){
		return JsonReader.read("retrieveBQs-String.json",new TypeReference<List<String>>(){});
	}
	
	public BQBotRetrieveOutputModel retrieveBot(String sdReferenceId, String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-BQBotRetrieveOutputModel.json",new TypeReference<BQBotRetrieveOutputModel>(){});
	}
	
	public BQCustomerBehaviorRetrieveOutputModel retrieveCustomerbehavior(String sdReferenceId, String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-BQCustomerBehaviorRetrieveOutputModel.json",new TypeReference<BQCustomerBehaviorRetrieveOutputModel>(){});
	}
	
	public BQCustomerFraudRetrieveOutputModel retrieveCustomerfraud(String sdReferenceId, String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-BQCustomerFraudRetrieveOutputModel.json",new TypeReference<BQCustomerFraudRetrieveOutputModel>(){});
	}
	
	public BQDeviceErrorRetrieveOutputModel retrieveDeviceerror(String sdReferenceId, String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-BQDeviceErrorRetrieveOutputModel.json",new TypeReference<BQDeviceErrorRetrieveOutputModel>(){});
	}
	
	public BQMerchantBehaviorRetrieveOutputModel retrieveMerchantbehavior(String sdReferenceId, String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-BQMerchantBehaviorRetrieveOutputModel.json",new TypeReference<BQMerchantBehaviorRetrieveOutputModel>(){});
	}
	
	public BQMerchantFraudRetrieveOutputModel retrieveMerchantfraud(String sdReferenceId, String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-BQMerchantFraudRetrieveOutputModel.json",new TypeReference<BQMerchantFraudRetrieveOutputModel>(){});
	}
	
	public List<String> retrieveRefIds(String sdReferenceId){
		return JsonReader.read("retrieveRefIds-String.json",new TypeReference<List<String>>(){});
	}
	
	public SDChannelActivityAnalysisRetrieveOutputModel retrieveSD(String sdReferenceId){
		return JsonReader.read("retrieveSD-SDChannelActivityAnalysisRetrieveOutputModel.json",new TypeReference<SDChannelActivityAnalysisRetrieveOutputModel>(){});
	}
	
}
