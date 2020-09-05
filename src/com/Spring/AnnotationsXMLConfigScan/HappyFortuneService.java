package com.Spring.AnnotationsXMLConfigScan;

import org.springframework.stereotype.Component;

@Component
public class HappyFortuneService implements FortuneService {
    @Override
    public String getFortune() {
        return "Happy Fortune service";
    }



    // @PostConstruct  to use this download jar file
    public String addToMyStartUpStuff(){
        return "Hey I am THe lucky who stared at first";
    }
    // @PreDestroy  to use this download jar file
    public String addToMyEndUpStuff(){
        return "Hey I'LL run at last";
    }
}
