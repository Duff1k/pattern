public class ReserveAdministrator implements Administrator{
    @Override
    public void workWithGuest() {
        System.out.println("Administrator is reserving the table");
    }
}
