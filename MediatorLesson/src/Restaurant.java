public class Restaurant implements Client{
    Order order;
    String name;

    public Restaurant(Order order, String name) {
        this.order = order;
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
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
