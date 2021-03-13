public class VisitorRunner {
    public static void main(String[] args) {
        String[] hotels = {"Raddison", "Aldemar", "FourSeason", "Chaika"};
        Visitor visitor = new Visitor("Alex", hotels);

        Iterator iterator = visitor.getIterator();
        System.out.println("Name " + visitor.getName());
        System.out.println("Hotel ");
        while(iterator.freeHotel()) {
            System.out.println(iterator.nextVisitor().toString() + " ");
        }

    }


}
