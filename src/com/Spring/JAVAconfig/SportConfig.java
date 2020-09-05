package com.Spring.JAVAconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration
@ComponentScan("com.Spring.JAVAconfig")
public class SportConfig {

    @Bean
    public HappyService happyService(){
        return new HappyServiceClass();
    }

    @Bean
    public Coach chessCoach() {
        return new ChessCoach(happyService());
    }
}
