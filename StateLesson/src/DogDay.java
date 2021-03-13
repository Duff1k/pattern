public class DogDay {
    public static void main(String[] args) {
        DogLive dogLive = new Eat();
        Dog dog = new Dog();

        dog.setDogLive(dogLive);

        for(int i = 0; i < 10; i++) {
            dog.activity();
            dog.changeActivity();
        }
    }
}

