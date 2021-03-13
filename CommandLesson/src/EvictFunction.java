public class EvictFunction implements Function{

    Hotel hotel;

    public EvictFunction(Hotel hotel) {
        this.hotel = hotel;
    }

    @Override
    public void execute() {
        hotel.evict();
    }
}
