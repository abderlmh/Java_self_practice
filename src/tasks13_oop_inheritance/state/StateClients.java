package tasks13_oop_inheritance.state;

public class StateClients {

    public static void main(String[] args) {

        Virginia virginia = new Virginia("Virginia","Ralph Northam","Tim Kaine",8);
        System.out.println(virginia);

        System.out.println("--------------------------------------------------------------------------------------------");

        Florida florida = new Florida("Florida"," Ron DeSantis","Marco Rubio", 22);
        System.out.println(florida);

        System.out.println("--------------------------------------------------------------------------------------------");

        California california = new California("California","Gavin Newsom","Dianne Feinstein",40);
        System.out.println(california);

        System.out.println("--------------------------------------------------------------------------------------------");

        Texas texas = new Texas("Texas","Greg Abbott","John Cornyn",30);
        System.out.println(texas);
    }

}
