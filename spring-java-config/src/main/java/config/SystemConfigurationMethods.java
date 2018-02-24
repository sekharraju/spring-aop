package config;

import com.jk.repository.DomainRepository;
import com.jk.service.DomianService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SystemConfigurationMethods {

	@Bean
	public DomianService domianService() {
		return new DomianService();
	}
	
	@Bean
	public DomainRepository domainRepository() {
		return new DomainRepository();
	}
	
}
