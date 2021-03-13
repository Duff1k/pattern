import java.util.ArrayList;
import java.util.List;

public class RestaurantRunner {
    public static void main(String[] args) {
        CookerFactory cookerFactory = new CookerFactory();

        List<Cooker> cookers = new ArrayList<>();

        cookers.add(cookerFactory.getCookerByExp("junior"));
        cookers.add(cookerFactory.getCookerByExp("junior"));


        cookers.add(cookerFactory.getCookerByExp("sous"));
        cookers.add(cookerFactory.getCookerByExp("sous"));

        for(Cooker cooker: cookers){
            cooker.cook();
        }

    }
}
