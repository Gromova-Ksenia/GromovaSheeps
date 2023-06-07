public class Sheep {
    private short weight;
    private int hair;

    void setWeight(short weight){
        this.weight = weight;
    }

    void setHair(int hair){
        this.hair = hair;
    }

    short getWeight(){
        return this.weight;
    }

    int getHair(){
        return this.hair;
    }

    void showSheep(){
        System.out.println(String.format("%s = %i, %s = %i", "Вес", this.weight, "шерсть", this.hair));
    }

    void dayPassed(){
        this.weight += 1;
        this.hair += 100;
    }
}
