package tasks13_oop_inheritance.state;

public class California extends State{
    public California(String politicalParty, String governor, String senator, int population) {
        super("CA", politicalParty, governor, senator, population);
    }
}
