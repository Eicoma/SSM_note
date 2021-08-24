package com.eicoma.demo02;

public class Client {
    public static void main(String[] args) {
//        UserService userService = new UserServiceImpl();
//        userService.add();
        UserServiceImpl userService = new UserServiceImpl();
        UserServiceProxy userServiceProxy = new UserServiceProxy();

        userServiceProxy.setUserService( userService);

        userServiceProxy.add();
    }
}
