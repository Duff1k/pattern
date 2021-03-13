public class ClientRestaurant {
    public static void main(String[] args) {
        Restaurant restaurant = new ProxyRestaurant("Ovca");

        restaurant.start();
    }
}
