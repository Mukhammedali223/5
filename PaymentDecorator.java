public abstract class PaymentDecorator
        implements Payment
{
    protected Payment wrappee;

    public PaymentDecorator(Payment p)
    {
        this.wrappee=p;
    }

    public boolean pay(double amount)
    {
        return wrappee.pay(amount);
    }

    public String getName()
    {
        return wrappee.getName();
    }
}
