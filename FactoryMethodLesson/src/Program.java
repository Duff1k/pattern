public class Program {
    public static void main(String[] args) {
        AnimalFactory animalFactory = createAnimalbyName("Cat");
        Animal animal = animalFactory.createAnimal();

        animal.vote();

    }

    static AnimalFactory createAnimalbyName(String name){
        if(name.equalsIgnoreCase("dog")){
            return new DogAnimalFactory();
        } else if(name.equalsIgnoreCase("cat")) {
            return new CatAnimalFactory();
        } else {
            throw new RuntimeException(name + " is unknow Animal");
        }
    }
}
