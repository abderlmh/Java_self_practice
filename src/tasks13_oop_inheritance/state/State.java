package tasks13_oop_inheritance.state;

public class State {

    private String name , abbreviation , politicalParty , Governor , senator;
    private int population;

    public State( String abbreviation, String politicalParty, String governor, String senator, int population) {
        setName(getClass().getSimpleName());
        setAbbreviation(abbreviation);
        setPoliticalParty(politicalParty);
        setGovernor(governor);
        setSenator(senator);
        setPopulation(population);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name == null){
            System.err.println("Name can not be set to null");
            System.exit(1);
        }

        if(name.isEmpty() || name.isBlank()){
            System.err.println("Name can not be set to empty  or blank");
            System.exit(1);
        }
        this.name = name;
    }

    public String getAbbreviation() {
        return abbreviation;
    }

    public void setAbbreviation(String abbreviation) {
        if(abbreviation == null){
            System.err.println("abbreviation can not be set to null");
            System.exit(1);
        }

        if(abbreviation.isEmpty() || abbreviation.isBlank()){
            System.err.println("abbreviation can not be set to empty  or blank");
            System.exit(1);
        }
        this.abbreviation = abbreviation;
    }

    public String getPoliticalParty() {
        return politicalParty;
    }

    public void setPoliticalParty(String politicalParty) {
        if(politicalParty == null){
            System.err.println("politicalParty can not be set to null");
            System.exit(1);
        }

        if(politicalParty.isEmpty() || politicalParty.isBlank()){
            System.err.println("politicalParty can not be set to empty  or blank");
            System.exit(1);
        }
        this.politicalParty = politicalParty;
    }

    public String getGovernor() {
        return Governor;
    }

    public void setGovernor(String governor) {

        if(governor == null){
            System.err.println("governor can not be set to null ");
            System.exit(1);
        }

        if(governor.isEmpty() || governor.isBlank()){
            System.err.println("governor can not be set to empty  or blank");
            System.exit(1);
        }

        Governor = governor;
    }

    public String getSenator() {
        return senator;
    }

    public void setSenator(String senator) {

        if(senator == null){
            System.err.println("senator can not be set to null ");
            System.exit(1);
        }

        if(senator.isEmpty() || senator.isBlank()){
            System.err.println("senator can not be set to empty  or blank");
            System.exit(1);
        }

        this.senator = senator;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    @Override
    public String toString() {
        return    getName() + "{" +
                "abbreviation='" + abbreviation + '\'' +
                ", politicalParty='" + politicalParty + '\'' +
                ", Governor='" + Governor + '\'' +
                ", senator='" + senator + '\'' +
                ", population=" + population + "M"+
                '}';
    }
}
