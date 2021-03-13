public class SousChef extends CookerDecorator {

    public SousChef(Cooker cooker) {
        super(cooker);
    }

    public String additionalFunction(){
        return "Sous Chef function ";
    }

    @Override
    public String makeJob() {
        return super.makeJob() + additionalFunction();
    }
}
