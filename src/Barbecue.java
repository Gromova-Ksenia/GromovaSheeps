public class Barbecue {
    public int meat;
    public int hair = 0;

    void dayPassed(int day, Flock flock) {
        if (this.meat < 30) flock.killSheep(flock.findFattest(), this);
        if (day % 5 == 0) flock.newSheep();
        flock.dayPassed();
    }
}
