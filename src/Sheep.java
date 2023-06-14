public class Sheep {
    private short weight;
    private int hair;

    public Sheep() {
        this.weight = (short) (40 + Math.random() * 51);
        this.hair = (short) (200 + Math.random() * 501);
    }

    void setWeight(short weight) {
        this.weight = weight;
    }

    void setHair(int hair) {
        this.hair = hair;
    }

    short getWeight() {
        return this.weight;
    }

    int getHair() {
        return this.hair;
    }

    void showSheep() {
        //System.out.println(String.format("%s = %i, %s = %i", "Вес", this.weight, "шерсть", this.hair));
        System.out.print("Вес = ");
        System.out.print(this.weight);
        System.out.print(", шерсть = ");
        System.out.println(this.hair);
    }

    void dayPassed() {
        this.weight += 1;
        this.hair += 100;
    }


}
