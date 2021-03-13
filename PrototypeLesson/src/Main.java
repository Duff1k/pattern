public class Main {
    public static void main(String[] args) {
        Human human = new Human("Alex","Tytov", 27);

        System.out.println(human);


        HumanFactory humanFactory = new HumanFactory(human);
        Human clone = humanFactory.cloneHuman();

        System.out.println(clone);
    }
}
