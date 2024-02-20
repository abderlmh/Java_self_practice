package tasks14_oop_abstract_and_interfaces.Car;

public class CarClients {

    public static void main(String[] args) {

        Honda honda = new Honda("honda Accord",2010,8000,"Black");
        System.out.println(honda);
        honda.drive();
        honda.start();

        System.out.println("-----------------------------------------------------------");

        Toyota toyota = new Toyota("Toyota corolla ",2020,12_000,"Red");
        System.out.println(toyota);
        toyota.drive();
        toyota.start();

        System.out.println("------------------------------------------------------------");

        BMW bmw = new BMW("ALPINA XB7",2022,55_000,"white");
        System.out.println(bmw);
        bmw.start();
        bmw.drive();
        System.out.println("--------------------------------------------------------------");

        Mercedes mercedes = new Mercedes("C-Class",2022,42_000,"Black");
        System.out.println(mercedes);
        mercedes.start();
        mercedes.drive();
        mercedes.AutoPark();

        System.out.println("----------------------------------------------------------------");

        Audi audi = new Audi(" A3",2022,40_000,"Black");
        System.out.println(audi);
        audi.start();
        audi.drive();
        audi.AutoPark();

        System.out.println("----------------------------------------------------------------");

        Nio nio = new Nio("ES8",2022,38_000,"Red");
        System.out.println(nio);
        nio.start();
        nio.drive();
        nio.AutoPark();
        nio.selfDrive();

        System.out.println("-----------------------------------------------------------------");

        Tesla tesla = new Tesla("Tesla Model S",2020,55_000,"White");
        System.out.println(tesla);
        tesla.start();
        tesla.drive();
        tesla.AutoPark();
        tesla.selfDrive();
        System.out.println("---------------------------------------------------------------");

        CydeoCar cydeoCar = new CydeoCar("CydeoG4",2024,100_000,"Blue");
        System.out.println(cydeoCar);
        cydeoCar.start();
        cydeoCar.drive();
        cydeoCar.AutoPark();
        cydeoCar.selfDrive();
        cydeoCar.fly();

    }
}
