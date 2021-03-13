import java.util.HashMap;
import java.util.Map;

public class CookerFactory {
    private static final Map<String, Cooker> cookers = new HashMap<>();

    public Cooker getCookerByExp(String exp){
        Cooker cooker = cookers.get(exp);

        if(cooker == null){
            switch (exp){
                case "junior":
                    cooker = new JuniorChef();
                case "sous":
                    cooker = new SousChef();
            }
            cookers.put(exp, cooker);
        }
        return cooker;
    }

}
