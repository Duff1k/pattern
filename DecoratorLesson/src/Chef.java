public class Chef extends CookerDecorator {

    public Chef(Cooker cooker) {
        super(cooker);
    }

    public String additionalFunction(){
        return "Chef function ";
    }

    @Override
    public String makeJob() {
        return super.makeJob() + additionalFunction();
    }
}
