public class FishTorg {
    public static void main(String[] args) {
        RestaurantTeamFactory restaurantTeamFactory = new TeamOfFishRestaurant();

        Chef chef = restaurantTeamFactory.getChef();
        Waiter waiter = restaurantTeamFactory.getWaiter();
        Administrator administrator = restaurantTeamFactory.getAdministrator();

        chef.cook();
        waiter.bring();
        administrator.workWithGuest();
    }
}
