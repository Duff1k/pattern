public class TeamOfFishRestaurant implements RestaurantTeamFactory {
    @Override
    public Administrator getAdministrator() {
        return new ReserveAdministrator();
    }

    @Override
    public Chef getChef() {
        return new FishChef();
    }

    @Override
    public Waiter getWaiter() {
        return new FishWaiter();
    }
}
