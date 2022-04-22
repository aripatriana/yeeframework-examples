package com.yeeframework.automate.test.keyword.action;

import com.yeeframework.automate.Action;
import com.yeeframework.automate.util.ReflectionUtils;
import com.yeeframework.automate.workflow.Workflow;
import com.yeeframework.automate.workflow.WorkflowEntry;

public class Confirm implements Action {

	private static final String CONFIRM = "confirm";

	@Override
	public String script() {
		return CONFIRM;
	}

	@Override
	public void run(Object handler, WorkflowEntry we, Workflow workflow) throws Exception {
		ReflectionUtils.invokeMethod(handler, CONFIRM, Workflow.class, workflow);
	}
	


}
