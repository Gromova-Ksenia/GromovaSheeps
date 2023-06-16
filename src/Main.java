public class Main {
    public static void main(String[] args) {
        Barbecue myBarbecue = new Barbecue();
        Flock myFlock = new Flock(10);
        myFlock.showFlock(0);

        for (int i = 0; i < 31; i++) {
            myBarbecue.dayPassed(i, myFlock);
            myFlock.showFlock(i + 1);
        }
        System.out.print("Собрано шерсти за месяц: ");
        System.out.print(myBarbecue.hair);
    }
}