public class SavedRoomRunner {
    public static void main(String[] args) {
        ReservedBook reservedBook = new ReservedBook();
        RoomReserved roomReserved = new RoomReserved();

        reservedBook.setNameAndDate("Александр");
        System.out.println(reservedBook);

        roomReserved.setSaveReserved(reservedBook.saveReserved());


        reservedBook.setNameAndDate("Давид");
        System.out.println(reservedBook);

        roomReserved.setSaveReserved(reservedBook.saveReserved());



    }
}
