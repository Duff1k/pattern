public class SeniorChef implements Chef{
    @Override
    public void cook(Salad salad) {
        System.out.println("Подбирает овощи, разрешает салат на вынос");
    }

    @Override
    public void cook(Desert desert) {
        System.out.println("Разрешает десерт на вынос");
    }

    @Override
    public void cook(Soup soup) {
        System.out.println("Подибирает ингредиенты, солит/перчит, разрешает суп на вынос");
    }
}
