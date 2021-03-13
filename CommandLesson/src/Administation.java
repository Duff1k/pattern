public class Administation {
    Function populate;
    Function evict;

    public Administation(Function populate, Function evict) {
        this.populate = populate;
        this.evict = evict;
    }

    public void populateHuman(){
        populate.execute();
    }

    public void evictHuman(){
        evict.execute();
    }
}
