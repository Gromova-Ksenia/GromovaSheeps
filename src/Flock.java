public class Flock {
    private Sheep[] flock;
    private int flockSize;

    void createFlock(int size){
        this.flockSize = size;
        this.flock = new Sheep [this.flockSize];
        for (int i=0; i<this.flockSize; i++){
            this.flock[i].setWeight((short)(20 + Math.random()*51));
        }
    }

    void showFlock(){
        for (int i=0; i< this.flockSize; i++){
            this.flock[i].showSheep();
        }
    }
}
