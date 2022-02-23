package com.dcpear.main;

import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;

import com.dcpear.model.Location;

public class DroolsTest {

	public static final void main(String[] args) {
		KieServices ks = KieServices.Factory.get();
		KieContainer kContainer = ks.getKieClasspathContainer();
		KieSession ksession = kContainer.newKieSession("ksession-rule");

		ksession.insert(new Location("Europe", "World"));
		ksession.insert(new Location("France", "Europe"));
		ksession.insert(new Location("Paris", "France"));
		ksession.insert(new Location("Eiffel tower", "Paris"));

		ksession.fireAllRules();
	}

}
