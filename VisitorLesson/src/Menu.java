public class Menu implements Dish{

    Dish dishs[];

    public Menu(){
        this.dishs = new Dish[]{
                new Salad(),
                new Desert(),
                new Soup()
        };
    }

    @Override
    public void beCooking(Chef chef) {
        for(Dish dish: dishs){
            dish.beCooking(chef);
        }
    }
}
