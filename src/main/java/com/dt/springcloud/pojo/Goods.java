package com.dt.springcloud.pojo;

import lombok.Data;

@Data
public class Goods {

    private int id;
    private String name;
    private double price;
    private String serverPort;// 端口号

    public Goods() {
    }

    public Goods(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }
}
