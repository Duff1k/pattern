public class Dog {
    DogLive dogLive;

    public void setDogLive(DogLive dogLive) {
        this.dogLive = dogLive;
    }

    public void changeActivity(){
        if(dogLive instanceof Sleep) {
            setDogLive(new Eat());
        } else if(dogLive instanceof Eat) {
            setDogLive(new Bark());
        } else if(dogLive instanceof Bark) {
            setDogLive(new Sleep());
        }
    }

    public void activity(){
        dogLive.activity();
    }
}
