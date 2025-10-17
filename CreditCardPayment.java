public class CreditCardPayment
        implements Payment
{
    private String cardNumber;

    public CreditCardPayment(String cardNumber)
    {
        this.cardNumber=cardNumber;
    }

    public boolean pay(double amount)
    {
        System.out.println("[CreditCard] processing card="+cardNumber+" amount="+amount);
        return true;
    }

    public String getName()
    {
        return "CreditCard";
    }
}
