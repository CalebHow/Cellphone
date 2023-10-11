package com.pluralsight;

public class Cellphone {

    private int serialNumber;
    private String model;
    private String Carrier;
    private String phoneNumber;
    private String owner;

    public Cellphone(){
        this.serialNumber = 0;
        this.model = "";
        this.Carrier = "";
        this.phoneNumber = "";
        this.owner = "";

    }
public int getSerialNumber(){
        return serialNumber;

}
public String getModel(){
        return model;
   }
public String getCarrierCarrier(){
        return Carrier;
}

public String getPhoneNumber(){
    return phoneNumber;

    }
public String getOwner(){
        return owner;


    }

    public void setSerialNumber(int serialNumber) {
        this.serialNumber = serialNumber;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setCarrier(String carrier) {
        Carrier = carrier;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    }

