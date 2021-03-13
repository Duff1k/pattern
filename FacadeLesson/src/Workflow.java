public class Workflow {
    Restaurant restaurant = new Restaurant();
    Job job = new Job();
    BugTracker bugTracker = new BugTracker();

    public void solvedProbmlems(){
        job.doJob();
        bugTracker.startOrder();
        restaurant.doOrder(bugTracker);
    }
}
