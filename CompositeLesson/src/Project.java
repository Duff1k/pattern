public class Project {
    public static void main(String[] args) {
        Brigade brigade = new Brigade();

        Cooker meatChef = new MeatChef();
        Cooker fishChef = new FishChef();

        brigade.addChef(meatChef);
        brigade.addChef(fishChef);
        brigade.removeChef(meatChef);

        brigade.startWorking();
    }
}
