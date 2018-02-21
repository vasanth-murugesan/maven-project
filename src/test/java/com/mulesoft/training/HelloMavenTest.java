package com.mulesoft.training;

import static org.junit.Assert.*;

import org.junit.Rule;
import org.junit.Test;
import org.mule.tck.junit4.FunctionalTestCase;
import org.mule.tck.junit4.rule.DynamicPort;

public class HelloMavenTest extends FunctionalTestCase {

	@Rule
	public DynamicPort myPort = new DynamicPort("http.port");
	
    @Test
    public void mavenFlowReturnsHelloMaven() throws Exception {
        runFlowAndExpect("mavenFlow", "Hello World");
        System.out.println("\n\nTestcase-1 dynamic port -------> " + myPort.getNumber());
    }
    
    @Override
    protected String[] getConfigFiles() {
        return new String[]{"maven-project.xml","global.xml"};
    }

}
