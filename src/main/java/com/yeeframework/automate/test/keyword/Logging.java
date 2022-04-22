package com.yeeframework.automate.test.keyword;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.yeeframework.automate.Actionable;
import com.yeeframework.automate.Keyword;
import com.yeeframework.automate.WebExchange;
import com.yeeframework.automate.exception.FailedTransactionException;
import com.yeeframework.automate.exception.ModalFailedException;
import com.yeeframework.automate.workflow.Workflow;
import com.yeeframework.automate.workflow.WorkflowConfig;
import com.yeeframework.automate.workflow.WorkflowEntry;

public class Logging implements Keyword {

	private Logger log = LoggerFactory.getLogger(Logging.class);
	public static final String LOG = "log";
	
	@Override
	public String script() {
		return LOG;
	}

	@Override
	public void run(WorkflowConfig wc, WorkflowEntry we, Workflow workflow) throws Exception {
		workflow.action(new Actionable() {
			
			@Override
			public void submit(WebExchange webExchange) throws FailedTransactionException, ModalFailedException {
				log.info("log " + we.getVariable());
			}
		});
	}

}
