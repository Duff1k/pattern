public class User implements Client {

    Order order;
    String name;


    public User(Order order, String name) {
        this.order = order;
        this.name = name;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Order getOrder() {
        return order;
    }

    public String getName() {
        return name;
    }

    @Override
    public void makeAnOrder(String nameOrder) {
        order.createOrder(nameOrder, this);
    }

    @Override
    public void getOrder(String order) {
        System.out.println(this.name + "получил заказ");
    }
}
