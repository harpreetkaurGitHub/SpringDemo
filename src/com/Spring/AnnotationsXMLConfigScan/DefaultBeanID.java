package com.Spring.AnnotationsXMLConfigScan;

import org.springframework.stereotype.Component;

@Component
public class DefaultBeanID implements Coach {

    @Override
    public String getDailyWorkout() {
        return "this is default bean id";
    }
}
