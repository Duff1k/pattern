public class Main {
    public static void main(String[] args) {
        Pet cat = new Cat();
        Pet dog = new Dog();

        cat.live();
        System.out.println("\n===================\n");
        dog.live();
    }
}
