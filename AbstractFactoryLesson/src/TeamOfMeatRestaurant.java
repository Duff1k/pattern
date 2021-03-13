public class TeamOfMeatRestaurant implements RestaurantTeamFactory {

    @Override
    public Administrator getAdministrator() {
        return new GuestAdministrator();
    }

    @Override
    public Chef getChef() {
        return new MeatChef();
    }

    @Override
    public Waiter getWaiter() {
        return new MeatWaiter();
    }
}
