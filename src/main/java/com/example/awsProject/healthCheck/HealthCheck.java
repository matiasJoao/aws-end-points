package com.example.awsProject.healthCheck;

import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.stereotype.Component;

@Component
public class HealthCheck implements HealthIndicator {

    public Health health(){
        long freeMemory = Runtime.getRuntime().freeMemory();
        long totalMemory = Runtime.getRuntime().totalMemory();
        double freeMemoryPercent = ((double) freeMemory / (double) totalMemory) *100;
        if(freeMemoryPercent > 25 ){
            return Health.up()
                    .withDetail("free memory", freeMemory + "bytes")
                    .withDetail("total memory", totalMemory+ "bytes")
                    .withDetail("free memory percent", freeMemoryPercent + "bytes")
                    .build();
        }
        else {
            return Health.down()
                    .withDetail("free memory", freeMemory + "bytes")
                    .withDetail("total memory", totalMemory+ "bytes")
                    .withDetail("free memory percent", freeMemoryPercent + "bytes")
                    .build();
        }
    }
}
