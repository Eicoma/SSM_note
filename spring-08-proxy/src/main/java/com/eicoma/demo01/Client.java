package com.eicoma.demo01;

public class Client {
    public static void main(String[] args) {
        Host host = new Host();
        //代理帮助房东出租房子
        Proxy proxy = new Proxy(host);

        //租客直接面代理，无需直接面对房东
        proxy.rent();
    }
}
