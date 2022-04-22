package com.yeeframework.automate.test.keyword;

import com.yeeframework.automate.Actionable;
import com.yeeframework.automate.Keyword;
import com.yeeframework.automate.WebExchange;
import com.yeeframework.automate.exception.FailedTransactionException;
import com.yeeframework.automate.exception.ModalFailedException;
import com.yeeframework.automate.script.Keywords;
import com.yeeframework.automate.workflow.Workflow;
import com.yeeframework.automate.workflow.WorkflowConfig;
import com.yeeframework.automate.workflow.WorkflowEntry;

public class Login implements Keyword {

	@Override
	public String script() {
		return Keywords.LOGIN;
	}

	@Override
	public void run(WorkflowConfig wc, WorkflowEntry we, Workflow workflow) throws Exception {
		workflow.openPage("test...");
		workflow.action(new Actionable() {
			
			@Override
			public void submit(WebExchange webExchange) throws FailedTransactionException, ModalFailedException {
				// code stuff for login
			}
		});
		
	}

}
