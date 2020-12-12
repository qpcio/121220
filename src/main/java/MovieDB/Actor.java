package MovieDB;

public class Actor extends Staff{
    public Actor(String firstName, String lastName, double payment) {
        super(firstName, lastName, payment * 2);
    }
}
