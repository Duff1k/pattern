public class Restaurant {
    public static void main(String[] args) {
        Cooker cooker = new Chef(new SousChef(new JuniorChef()));
        System.out.println(cooker.makeJob());
    }

}
