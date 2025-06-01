public class Player {
    private String name;
    private String representation;
    private int position;
    private int money;

    Player(String name, String representation, int position, int money) {
        this.name = name;
        this.representation = representation;
        this.position = position;
        this.money = money;
    }

    public String getName() {
        return name;
    }

    public String getRepresentation() {
        return representation;
    }

    public int getPosition() {
        return position;
    }

    public int getMoney() {
        return money;
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setRepresentation(String representation) {
        this.representation = representation;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public void setMoney(int money) {
        this.money = money;
    }

}