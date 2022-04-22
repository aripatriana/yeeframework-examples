package com.yeeframework.automate.test;

import com.yeeframework.automate.RunTestApplication;
import com.yeeframework.automate.test.keyword.Logging;
import com.yeeframework.automate.test.keyword.Login;
import com.yeeframework.automate.test.keyword.action.Confirm;
import com.yeeframework.automate.workflow.RunTestWorkflowExecutable;
import com.yeeframework.automate.workflow.WorkflowConfig;
import com.yeeframework.automate.workflow.WorkflowConfigInitializer;

public class ApplicationTest extends RunTestWorkflowExecutable implements WorkflowConfigInitializer {

	public static void main(String[] args) {
		RunTestApplication.run(ApplicationTest.class, args);
	}
	
	@Override
	public void configure(WorkflowConfig workflowConfig) {
		// setup action baru
		workflowConfig.addAction(Confirm.class);
		
		// setup new keyword
		workflowConfig.addKeyword(Logging.class);
		
		// setup overriding keyword
		workflowConfig.addKeyword(Login.class);
		
		
	}

}
