public class GuestAdministrator implements Administrator {

    @Override
    public void workWithGuest() {
        System.out.println("Administrator is bringing the guest");
    }
}
