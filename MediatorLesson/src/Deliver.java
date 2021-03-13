import java.util.List;

public class Deliver implements Order{

    Client client;
    List<Client> clients;

    public void setUser(Client client) {
        this.client = client;
    }

    public void addUserToDeliver(Client client){
        this.clients.add(client);
    }

    @Override
    public void createOrder(String order, Client client) {
        for(Client c: clients) {
            if(c!=client) {
                c.makeAnOrder(order);
            }
        }
        client.makeAnOrder(order);
    }
}
