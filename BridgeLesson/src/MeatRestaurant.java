public class MeatRestaurant extends Restaurant{

    protected MeatRestaurant(Cooker cooker) {
        super(cooker);
    }

    @Override
    public void createRestorant() {
        System.out.println("Meat Restaurant started working");
        cooker.cook();
    }
}
