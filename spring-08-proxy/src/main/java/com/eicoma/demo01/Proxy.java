package com.eicoma.demo01;

public class Proxy implements Rent{
    private Host host;

    public Proxy(){

    }

    public Proxy(Host host){
        this.host = host;
    }

    //代理租房的一切动作
    public void rent() {
        host.rent();
        seeHose();
        qianHeTong();
        shouFei();
    }

    //看房
    private void seeHose(){
        System.out.println("看房子！");
    }

    //签合同
    private void qianHeTong(){
        System.out.println("签合同！");
    }

    //收费
    private void shouFei(){
        System.out.println("收取中介费！");
    }
}
