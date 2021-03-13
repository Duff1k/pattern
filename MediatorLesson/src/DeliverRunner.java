public class DeliverRunner {
    public static void main(String[] args) {
       Deliver deliver = new Deliver();
       Client restaurant = new Restaurant(deliver, "Mcdonalds");
       Client client1 = new User(deliver, "Ваня");
       Client client2 = new User(deliver, "Петя");

       deliver.setUser(restaurant);
       deliver.addUserToDeliver(client1);
       deliver.addUserToDeliver(client2);

    }
}
