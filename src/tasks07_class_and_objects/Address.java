package tasks07_class_and_objects;

public class Address {

    public int buildingNumber ;
    public String street ;
    public String city ;
    public String state ;
    public String zipCode;

    public void address(){
        System.out.println(buildingNumber +" "+street+"\n"+city+" "+state+", "+zipCode );
    }
}
