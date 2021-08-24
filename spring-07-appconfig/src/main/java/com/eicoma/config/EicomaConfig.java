package com.eicoma.config;

import com.eicoma.pojo.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

//使用这个注解后，该类也会被注册到Spring容器中，@Configuration也属于一个@Component
//使用@Configuration代表这是一个配置类，类似applicationContext.xml
@Configuration
//@ComponentScan("com.eicoma.pojo")的功能和Configuration一致
//@ComponentScan("com.eicoma.pojo")
public class EicomaConfig {

    //@Bean  该注解可注册一个Bean
    //该方法的名字，相当于xml中bean的id
    //该方法的返回值，相当于xml中bean的class
    @Bean
    public User getUser(){
        //返回要注入到Spring容器中的对象
        return new User();
    }
}
