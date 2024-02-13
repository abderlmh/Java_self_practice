package tasks13_oop_inheritance.phone;

public class Iphone extends Phone {
    public Iphone(String brand, String model, String size, double price, String color) {
        super(brand, model, size, price, color);
    }

    public void faceTime(String phoneNumber){
        System.out.println(getBrand()+" face-timing with the number [" + phoneNumber + "]");
    }



    }




