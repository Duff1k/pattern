public abstract class Restaurant {
    protected Cooker cooker;

    protected Restaurant(Cooker cooker){
        this.cooker = cooker;
    }

    public abstract void createRestorant();
}
