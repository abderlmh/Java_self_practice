package tasks13_oop_inheritance.state;

public class Florida extends State{
    public Florida(String politicalParty, String governor, String senator, int population) {
        super("FL", politicalParty, governor, senator, population);
    }
}
