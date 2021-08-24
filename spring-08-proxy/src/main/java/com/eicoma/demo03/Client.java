package com.eicoma.demo03;

public class Client {
    public static void main(String[] args) {
        //获取接口对象（抽象角色）
        UserService2 userService2 = new UserService2Impl();
        //获取动态代理生成器类对象
        ProxyInvocationHandler pih = new ProxyInvocationHandler();

        //将接口对象传入pih对象中
        pih.setUserService2(userService2);

        //动态获取Proxy代理
        //此处getProxy()返回的是Object对象，需要强转
        UserService2 proxy= (UserService2) pih.getProxy();

        //现在就能通过proxy代理调用方法啦！
        proxy.add();
    }
}
