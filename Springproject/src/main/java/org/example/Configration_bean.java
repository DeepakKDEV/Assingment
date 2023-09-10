package org.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class Configration_bean {

    @Bean
    @Primary
    public  Billi getbilli(){
       return  new Billi("black");
    }
    @Bean
    public  Billi getbilli0(){
        return  new Billi("white");
    }


    @Bean Billi getbilli2(){
        return new Billi("orage");
    }

}
