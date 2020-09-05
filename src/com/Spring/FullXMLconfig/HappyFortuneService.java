package com.Spring.FullXMLconfig;

import com.Spring.FullXMLconfig.FortuneService;

public class HappyFortuneService implements FortuneService {
    @Override
    public String getFortuneService() {
        return "Happy service by fortune";
    }
}
