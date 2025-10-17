public class DiscountDecorator
        extends PaymentDecorator
{
    private double percent;

    public DiscountDecorator(Payment p,double percent)
    {
        super(p);
        this.percent=percent;
    }

    public boolean pay(double amount)
    {
        double discounted=amount*(1 - percent/100.0);
        System.out.println("[Discount] percent="+percent+" -> amount="+discounted);
        return super.pay(discounted);
    }

    public String getName()
    {
        return wrappee.getName()+"+Discount("+percent+"%)";
    }
}
