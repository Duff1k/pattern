public class Human implements Copyable {
    private String Name;
    private String Surname;
    private int Age;

    public Human(String Name, String Surname, int Age) {
        this.Name = Name;
        this.Surname = Surname;
        this.Age = Age;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getSurname() {
        return Surname;
    }

    public void setSurname(String surname) {
        Surname = surname;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        Age = age;
    }

    @Override
    public Object copy() {
        Human human = new Human(Name, Surname, Age);
        return human;
    }

    @Override
    public String toString() {
        return "Human{" +
                "Name='" + Name + '\'' +
                ", Surname='" + Surname + '\'' +
                ", Age=" + Age +
                '}';
    }
}
