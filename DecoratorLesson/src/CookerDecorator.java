public class CookerDecorator implements Cooker{

    Cooker cooker;

    public CookerDecorator(Cooker cooker) {
        this.cooker = cooker;
    }

    @Override
    public String makeJob() {
        return cooker.makeJob();
    }
}
