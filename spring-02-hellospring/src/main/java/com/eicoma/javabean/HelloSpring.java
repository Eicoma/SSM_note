package com.eicoma.javabean;

public class HelloSpring {
    private String str;

    public String getStr() {
        return str;
    }

    //此处通过set方法进行依赖注入DI
    public void setStr(String str) {
        this.str = str;
    }

    @Override
    public String toString() {
        return "HelloSpring{" +
                "str='" + str + '\'' +
                '}';
    }
}
