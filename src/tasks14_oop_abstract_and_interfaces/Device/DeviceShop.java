package tasks14_oop_abstract_and_interfaces.Device;

public class DeviceShop {

    public static void main(String[] args) {

        Iphone iphone = new Iphone("Iphone","pro max 14",1099,"Black","6.5 inch",true,true);
        iphone.call(312_785_9808L);
        iphone.text(312_708_5485L);
        iphone.downloadApp();
        iphone.turnOn();
        iphone.turnOn();
        System.out.println(iphone);

        System.out.println("----------------------------------------------------------------------------------------------------------");

        Samsung samsung = new Samsung("Samsung","Galaxy S21",1199,"Red","6.1 inch",true,true);
        samsung.call(312_855_7596L);
        samsung.text(312_415_2123L);
        samsung.downloadApp();
        samsung.turnOn();
        samsung.turnOff();
        System.out.println(samsung);

        System.out.println("-----------------------------------------------------------------------------------------------------------");

        Google google = new Google("Google","Pixel 5",1200,"Gold","5.2 inches",true,true);
        google.call(214_152_2889L);
        google.text(415_231_8654L);
        google.downloadApp();
        google.turnOn();
        google.turnOff();
        System.out.println(google);

        System.out.println("-------------------------------------------------------------------------------------------------------------");

        Desktop desktop = new Desktop("Dell","Dell Alienware Aurora",1500,"Gray","18.9 inches",false,true);
        desktop.turnOn();
        desktop.turnOff();
        System.out.println(desktop);

        System.out.println("-------------------------------------------------------------------------------------------------------------");

        Laptop laptop = new Laptop("Apple","MacBook Pro",2499,"Gary","16 inch",true,true);
        laptop.turnOn();
        laptop.turnOff();
        System.out.println(laptop);

    }
}
