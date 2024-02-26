package com.rps.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import io.micrometer.core.instrument.Counter;
import io.micrometer.core.instrument.MeterRegistry;

@Component
public class CustomMetrics {
	
	private final Counter customCounter;
	
	@Autowired
	public CustomMetrics(MeterRegistry meterRegistry) {
		this.customCounter = Counter.builder("custom_counter")
				.description("Description of custom counter")
				.register(meterRegistry);
	}
	
	public void incrementCustomCounter() {
		customCounter.increment();
	}

}
