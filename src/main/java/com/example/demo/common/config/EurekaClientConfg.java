package com.example.demo.common.config;

import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.SearchStrategy;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.netflix.discovery.DiscoveryClient.DiscoveryClientOptionalArgs;

//@Configuration
public class EurekaClientConfg {

	@Bean
	@ConditionalOnMissingBean(value = DiscoveryClientOptionalArgs.class, search = SearchStrategy.CURRENT)
	public DiscoveryClientOptionalArgs discoveryClientOptionalArgs() {
	  return new DiscoveryClientOptionalArgs();
	}
	
}
