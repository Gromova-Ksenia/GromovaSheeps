public class Flock {
    private Sheep[] flock;
    private int flockSize;

    public Flock() {
        this.flockSize = 10;
        this.flock = new Sheep[this.flockSize];
        for (int i = 0; i < this.flockSize; i++) {
            flock[i] = new Sheep();
        }
    }

    public Flock(int size) {
        this.flockSize = size;
        this.flock = new Sheep[this.flockSize];
        for (int i = 0; i < this.flockSize; i++) {
            flock[i] = new Sheep();
        }
    }

    void showFlock() {
        for (int i = 0; i < this.flockSize; i++) this.flock[i].showSheep();
    }

    int findFattest() {
        int max = this.flock[0].getWeight();
        int maxIndex = 0;
        for (int i = 1; i < this.flockSize; i++) {
            if (this.flock[i].getWeight() > max) {
                max = this.flock[i].getWeight();
                maxIndex = i;
            }
        }
        return maxIndex;
    }

    void killSheep(int index, Barbecue barbecue) {
        Sheep temp[] = new Sheep[this.flockSize - 1];
        for (int i = 0, j = 0; i < this.flockSize; i++) {
            if (i != index) {
                temp[j] = this.flock[i];
                j++;
            }
        }
        barbecue.meat += this.flock[index].getWeight();
        barbecue.hair += this.flock[index].getHair();
        this.flockSize--;
        this.flock = temp;
    }

    void newSheep() {
        Sheep temp[] = new Sheep[this.flockSize + 1];
        System.arraycopy(this.flock, 0, temp, 0, this.flockSize);
        temp[this.flockSize] = new Sheep();
        this.flockSize++;
    }

    void dayPassed() {
        for (int i = 0; i < this.flockSize; i++) {
            this.flock[i].dayPassed();
        }
    }
}
