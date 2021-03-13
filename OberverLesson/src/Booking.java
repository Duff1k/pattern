import java.util.ArrayList;
import java.util.List;

public class Booking implements Observed{

    List<String> rooms = new ArrayList<>();
    List<Observer> guest = new ArrayList<>();

    public void reservedRoom(String room){
        this.rooms.add(room);
        notifyObservers();
    }

    public void freeRoom(String room){
        this.rooms.remove(room);
        notifyObservers();
    }


    @Override
    public void addObserver(Observer obserever) {
        this.guest.add(obserever);
    }

    @Override
    public void removeObserver(Observer obserever) {
        this.guest.add(obserever);
    }

    @Override
    public void notifyObservers() {
        for(Observer observer: guest) {
            observer.handleEvent(this.rooms);
        }
    }
}
