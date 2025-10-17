public class PayPalPayment
        implements Payment
{
    private String email;

    public PayPalPayment(String email)
    {
        this.email=email;
    }

    public boolean pay(double amount)
    {
        System.out.println("[PayPal] processing email="+email+" amount="+amount);
        return true;
    }

    public String getName()
    {
        return "PayPal";
    }
}
