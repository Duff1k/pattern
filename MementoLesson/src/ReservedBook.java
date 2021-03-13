import java.util.Date;

public class ReservedBook {
    private String name;
    private Date date;

    public void setNameAndDate(String name){
        this.name = name;
        this.date = new Date();
    }

    public SaveReserved saveReserved(){
        return new SaveReserved(name);
    }

    public void load(SaveReserved saveReserved){
        name = saveReserved.getName();
        date = saveReserved.getDate();
    }

    @Override
    public String toString() {
        return "Номер был забронирован " +
                "Имя='" + name + '\'' +
                ",Число= " + date +
                '}';
    }
}
