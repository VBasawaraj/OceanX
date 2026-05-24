package com.example.oceanxassignment;

public class OrderModel {

    String vehicleName;
    String date;
    String price;
    String status;

    public OrderModel(String vehicleName, String date,
                      String price, String status) {

        this.vehicleName = vehicleName;
        this.date = date;
        this.price = price;
        this.status = status;
    }

    public String getVehicleName() {
        return vehicleName;
    }

    public String getDate() {
        return date;
    }

    public String getPrice() {
        return price;
    }

    public String getStatus() {
        return status;
    }
}
