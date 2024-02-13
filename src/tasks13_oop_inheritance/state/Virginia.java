package tasks13_oop_inheritance.state;

public class Virginia extends State {

    public Virginia(String politicalParty, String governor, String senator, int population) {
        super("VA", politicalParty, governor, senator, population);
    }
}
