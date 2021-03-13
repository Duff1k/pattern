import java.util.Date;

public class SaveReserved {
    private final String name;
    private final Date date;

    public SaveReserved(String name) {
        this.name = name;
        this.date = new Date();
    }

    public String getName() {
        return name;
    }

    public Date getDate() {
        return date;
    }
}
