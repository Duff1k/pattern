public abstract class Pet {
    public void live(){
        System.out.println("Eat");
        voice();
        System.out.println("Sleep");
    }

    public abstract void voice();

}
