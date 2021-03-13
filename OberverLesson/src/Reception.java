import java.util.List;

public class Reception implements Observer {
    String name;

    public Reception(String name){
        this.name = name;
    }

    @Override
    public void handleEvent(List<String> rooms) {
        System.out.println("Dear " + name + "\nWe have " + rooms +  " free rooms");
    }
}
