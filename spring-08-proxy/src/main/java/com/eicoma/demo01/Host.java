package com.eicoma.demo01;

public class Host implements Rent{

    public void rent() {
        //房东只需考虑交出房子，其他的一切交给代理
        System.out.println("房东出租房子！");
    }
}
