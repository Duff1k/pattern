public class BugTracker {
    private boolean activeOrder;

    public boolean isActiveOrder(){
        return activeOrder;
    }

    public void startOrder(){
        activeOrder = true;
        System.out.println("Order is starting");
    }

    public void finishOrder(){
        activeOrder = false;
        System.out.println("Order is finishing");
    }
}
