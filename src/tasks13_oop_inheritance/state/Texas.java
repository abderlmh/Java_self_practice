package tasks13_oop_inheritance.state;

public class Texas extends State{
    public Texas(String politicalParty, String governor, String senator, int population) {
        super("TX", politicalParty, governor, senator, population);
    }
}
