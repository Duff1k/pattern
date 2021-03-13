public class ProxyRestaurant implements Restaurant{

    private String name;

    private RealRestaurant realRestaurant;

    public ProxyRestaurant(String name) {
        this.name = name;
    }

    @Override
    public void start() {
        if(realRestaurant == null) {
            realRestaurant = new RealRestaurant(name);

        }
        realRestaurant.start();
    }
}
