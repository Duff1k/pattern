public class RestaurantCreator {
    public static void main(String[] args) {
        Restaurant [] restaurants = {
                new FishRestaurant(new FishMeat()),
                new MeatRestaurant(new MeatChef())
        };

        for(Restaurant restaurant: restaurants){
            restaurant.createRestorant();
        }
    }

}
