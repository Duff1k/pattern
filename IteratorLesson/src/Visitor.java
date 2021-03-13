public class Visitor implements Rooms {
    public String name;
    public String[] hotels;

    public Visitor(String name, String[] hotels) {
        this.name = name;
        this.hotels = hotels;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHotels(String[] hotels) {
        this.hotels = hotels;
    }

    public String getName() {
        return name;
    }

    public String[] getHotels() {
        return hotels;
    }

    @Override
    public Iterator getIterator() {
        return new SkillIterator();
    }

    public class SkillIterator implements Iterator{
        int index;

        @Override
        public boolean freeHotel() {
            if(index < hotels.length) {
                return true;
            }
            return false;
        }

        @Override
        public Object nextVisitor() {
            return hotels[index++];
        }
    }
}
