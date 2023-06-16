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

    void showFlock(int day) {
        System.out.print("День ");
        System.out.println(day);
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

    Sheep killSheep(int index) {
        Sheep corpse = this.flock[index];
        Sheep temp[] = new Sheep[this.flockSize - 1];
        for (int i = 0, j = 0; i < this.flockSize; i++) {
            if (i != index) {
                temp[j] = this.flock[i];
                j++;
            }
        }
        this.flockSize--;
        this.flock = temp;
        return corpse;
    }

    void newSheep() {
        Sheep temp[] = new Sheep[this.flockSize + 1];
        System.arraycopy(this.flock, 0, temp, 0, this.flockSize);
        temp[this.flockSize] = new Sheep();
        this.flock = temp;
        this.flockSize++;
    }

    void dayPassed() {
        for (int i = 0; i < this.flockSize; i++) {
            this.flock[i].dayPassed();
        }
    }
}
