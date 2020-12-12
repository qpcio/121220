package MovieDB;

public class Director extends Staff {

    public Director(String firstName, String lastName, double payment) {
        super(firstName, lastName, payment);
        setPayment(payment);
    }

    @Override
    public void setPayment(double payment) {
        this.payment = payment * 3;
    }
}
