package com.eicoma.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//等价于<bean id="user" class="com.eicoma.pojo.User"/>
//@Component组件
@Component
@Scope("singleton")
public class User {
//    public String name = "晴明";

   //相当于<property name="name" value="晴明"/>
    @Value("晴明")
    public String name;
}
