package com.jk;

import com.jk.domain.Domain;
import com.jk.service.DomianService;
import config.SystemConfigurationComponentScanning;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertThat;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = SystemConfigurationComponentScanning.class)
public class ConfigurationComponentScanningTest {

	@Autowired
	private DomianService domainService;

	@Test
	public void dependencyInjectionShouldWork() {
		assertNotNull(domainService);
	}

	@Test
	public void serviceShouldReturnDomainObject() {
		assertThat(domainService.service(), equalTo(new Domain()));
	}

}
