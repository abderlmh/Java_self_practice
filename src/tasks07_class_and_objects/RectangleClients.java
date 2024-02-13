package tasks07_class_and_objects;

public class RectangleClients {

    public static void main(String[] args) {

        Rectangle area1 = new Rectangle();
        area1.width = 2.56;
        area1.length=3.20;
        area1.calculateArea= area1.length+area1.width;
        area1.calculatePerimeter = (area1.length*area1.width)*2;
        System.out.println(area1);

        System.out.println("Calculate area 1 : "+ area1.calculateArea);
        System.out.println("Calculate Perimeter area 1 : "+area1.calculatePerimeter);

        System.out.println("---------------------------------------------");

        Rectangle area2 = new Rectangle();
        area2.length = 20.21;
        area2.width = 30.15;
        System.out.println(area2);
        area2.calculateArea= area2.length+area2.width;
        area2.calculatePerimeter = (area2.length*area2.width)*2;
        System.out.println("Calculate area2 = " + area2.calculateArea);
        System.out.println("Calculate Perimeter area2 = " + area2.calculatePerimeter);


    }
}
