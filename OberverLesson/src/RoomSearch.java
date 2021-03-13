public class RoomSearch {
    public static void main(String[] args) {
        Booking booking = new Booking();
        booking.reservedRoom("1st Room is reserved");
        booking.reservedRoom("2st Room is reserved");

        Observer observer1 = new Reception("Alexandra Krotyuk");
        Observer observer2 = new Reception("David Sigalov");

        booking.addObserver(observer1);
        booking.addObserver(observer2);

    }
}
