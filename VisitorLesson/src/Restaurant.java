public class Restaurant {
    public static void main(String[] args) {
        Menu menu = new Menu();

        Chef chef1 = new JuniorChef();
        Chef chef2 = new SeniorChef();

        menu.beCooking(chef1);

        System.out.println("\n==========================\n");

        menu.beCooking(chef2);
    }
}
