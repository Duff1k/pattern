public class DogRunner {
    public static void main(String[] args) {
        Dog dog = new Dog();

        dog.setDogLive(new Bark());
        dog.executeCommand();

        dog.setDogLive(new Eat());
        dog.executeCommand();

        dog.setDogLive(new Play());
        dog.executeCommand();

        dog.setDogLive(new Sleep());
        dog.executeCommand();

    }
}
