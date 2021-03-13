public class RealRestaurant implements Restaurant {
    private String name;

    public RealRestaurant(String name) {
        this.name = name;
        openRestaurant();
    }

    public void openRestaurant(){
        System.out.println("Restaurant " + name + " is open");
    }


    @Override
    public void start() {
        System.out.println("Restaurant " + name + " is starting");
    }
}
