public class HotelRunner {
    public static void main(String[] args) {
        Hotel hotel = new Hotel();
        
        Administation administation = new Administation(new PopulateFunction(hotel), new EvictFunction(hotel));

        administation.populateHuman();
        administation.evictHuman();
    }
}
