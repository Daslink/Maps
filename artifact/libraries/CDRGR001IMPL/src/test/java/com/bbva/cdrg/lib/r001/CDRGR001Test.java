package com.bbva.cdrg.lib.r001;

import javax.annotation.Resource;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.aop.framework.Advised;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {
		"classpath:/META-INF/spring/CDRGR001-app.xml",
		"classpath:/META-INF/spring/CDRGR001-app-test.xml",
		"classpath:/META-INF/spring/CDRGR001-arc.xml",
		"classpath:/META-INF/spring/CDRGR001-arc-test.xml" })
public class CDRGR001Test {

	private static final Logger LOGGER = LoggerFactory
			.getLogger(CDRGR001.class);
	
	@Resource(name = "cdrgR001")
	private CDRGR001 cdrgR001;
	
	@Before
	public void setUp() throws Exception {		
		getObjectIntrospection();
	}
	
	private Object getObjectIntrospection() throws Exception{
		Object result = this.cdrgR001;
		if(this.cdrgR001 instanceof Advised){
			Advised advised = (Advised) this.cdrgR001;
			result = advised.getTargetSource().getTarget();
		}
		return result;
	}
	
	@Test
	public void executeTest(){
		LOGGER.info("Executing the test...");
		cdrgR001.execute("BOGOTA","SOACHA");
	}
	
}
