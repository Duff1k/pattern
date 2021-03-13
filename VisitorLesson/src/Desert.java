public class Desert implements Dish{
    @Override
    public void beCooking(Chef chef) {
        chef.cook(this);
    }
}
