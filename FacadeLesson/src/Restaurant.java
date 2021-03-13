public class Restaurant {
    public void doOrder(BugTracker bugTracker){
        if(bugTracker.isActiveOrder()){
            System.out.println("Restautant is prepares an order");
        } else {
            System.out.println("Restautant is nothing to do");
        }

    }
}
