package com.rps.config;

import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.stereotype.Component;

@Component
public class CustomHealthIndicator implements HealthIndicator {

	@Override
	public Health health() {
		//Implement your custom health check 

			if(isCustomComponentHealthy()) {
				return Health.up().build();
			}
			else {
				return Health.down().build();
			}
	}
	
	private boolean isCustomComponentHealthy() {
		//Implement logic to check health of custom component
		return false;
	}

}
