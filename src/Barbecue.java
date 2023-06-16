public class Barbecue {
    public int meat;
    public int hair;

    public Barbecue() {
        this.meat = 0;
        this.hair = 0;
    }

    void gotCorpse(Sheep corpse){
        this.hair+=corpse.getHair();
        this.meat+=corpse.getWeight();
    }

    void dayPassed(int day, Flock flock) {
        if (this.meat < 30) gotCorpse(flock.killSheep(flock.findFattest()));
        if (day % 5 == 0 && day != 0) flock.newSheep();
        flock.dayPassed();
        this.meat -= 30;
    }


}
