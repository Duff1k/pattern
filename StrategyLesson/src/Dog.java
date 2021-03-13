public class Dog {
    DogLive dogLive;


    public void setDogLive(DogLive dogLive) {
        this.dogLive = dogLive;
    }

    public void executeCommand(){
        dogLive.actions();
    }
}
