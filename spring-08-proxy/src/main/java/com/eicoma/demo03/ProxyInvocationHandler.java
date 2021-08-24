package com.eicoma.demo03;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyInvocationHandler implements InvocationHandler {

    //UserService2 userService2可替换为Object target（通用类型）
    private UserService2 userService2;

    public void setUserService2(UserService2 userService2) {
        this.userService2 = userService2;
    }

    public Object getProxy(){
        return Proxy.newProxyInstance(this.getClass().getClassLoader(),userService2.getClass().getInterfaces(),this);
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        //log()为扩展的方法
        //method.getName()返回了当前在Client层所调用的方法的名称
        log(method.getName());
        //这个invoke()返回了接口实现类对象UserService2Impl内部方法的所有结果----【重点！！！】
        Object result = method.invoke(userService2,args);
        return result;
    }

    public void log(String msg){
        System.out.println("当前使用了"+msg+"方法");
    }
}
