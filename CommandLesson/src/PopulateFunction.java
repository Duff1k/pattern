public class PopulateFunction implements Function {
    Hotel hotel;

    public PopulateFunction(Hotel hotel) {
        this.hotel = hotel;
    }

    @Override
    public void execute() {
        hotel.populate();
    }
}
