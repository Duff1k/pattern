import java.util.ArrayList;
import java.util.List;

public class Brigade {
    private List<Cooker> cookers = new ArrayList<Cooker>();

    public void addChef(Cooker cooker){
        cookers.add(cooker);
    }

    public void removeChef(Cooker cooker) {
        cookers.remove(cooker);
    }

    public void startWorking(){
        for(Cooker cooker: cookers){
            cooker.cook();
        }
    }
}
