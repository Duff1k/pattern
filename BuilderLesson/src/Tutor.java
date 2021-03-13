public class Tutor {
    private String name;
    private int price;
    private Lesson lesson;

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setLesson(Lesson lesson) {
        this.lesson = lesson;
    }

    @Override
    public String toString() {
        return "Tutor{" +
                "name='" + name + '\'' +
                ", price='" + price + '\'' +
                ", lesson=" + lesson +
                '}';
    }
}

