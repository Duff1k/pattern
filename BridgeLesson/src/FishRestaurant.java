public class FishRestaurant extends Restaurant{

    protected FishRestaurant(Cooker cooker) {
        super(cooker);
    }

    @Override
    public void createRestorant() {
        System.out.println("Fish restaurant started working");
        cooker.cook();
    }
}
