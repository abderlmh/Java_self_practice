package tasks13_oop_inheritance.phone;

public class PhoneClients {

    public static void main(String[] args) {

        Iphone iphone = new Iphone("iphone","iphone 12 pro ","6.5",1000,"black");
        System.out.println();
        iphone.text("+1 205-200-8457");
        iphone.call("+1 205-652-70855");
        iphone.faceTime("+1 250-452-8998");
        System.out.println(iphone);
        System.out.println();
        System.out.println("---------------------------------------------------------------------------------");

        Samsung samsung = new Samsung("Samsung","Galaxy Plus","5.0",999.99,"White");
        System.out.println();
        samsung.text("+1 205-200-8457");
        samsung.call("+1 205-652-70855");
    //  samsung.faceTime("+1 250-452-8998"); because facetime method is not created in samsung class .
        System.out.println(samsung);
        System.out.println("----------------------------------------------------------------------------------");

        Nokia nokia = new Nokia("Nokia","Nokia note 10","5.9",1200.50,"Red");
        System.out.println();
        nokia.call("+1 205-200-8457");
        nokia.text("+1 205-652-70855");

    }
}
