package fr.synaptix.toast.examples.test.service;

import com.synaptix.toast.runtime.AbstractScenarioRunner;

public class ServiceExampleRunner extends AbstractScenarioRunner {

	@Override
	public void tearDownEnvironment() {
	}

	@Override
	public void beginTest() {
	}

	@Override
	public void endTest() {
	}

	@Override
	public void initEnvironment() {
	}

	public static void main(String[] args) throws Exception {
		ServiceExampleRunner testRunner = new ServiceExampleRunner();
		testRunner.run("./scripts/service.example.script");
	}

}
