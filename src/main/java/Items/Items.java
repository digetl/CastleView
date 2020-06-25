package Items;

public abstract class Items {
    private String name;
    private int attackPoints;
    private int healPoints;

    public Items(String name, int attackPoints, int healPoints){
        this.name = name;
        this.attackPoints = attackPoints;
        this.healPoints = healPoints;
    }

    public String getName(){
        return name;
    }
}
