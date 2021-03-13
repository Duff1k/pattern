public class JuniorChef implements Chef{
    @Override
    public void cook(Salad salad) {
        System.out.println("Нарезает овощи");
    }

    @Override
    public void cook(Desert desert) {
        System.out.println("Готовит десерт");
    }

    @Override
    public void cook(Soup soup) {
        System.out.println("Готовит суп");
    }
}
