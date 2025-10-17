public class CashbackDecorator
        extends PaymentDecorator
{
    private int pointsPerDollar;
    private int totalPoints=0;

    public CashbackDecorator(Payment p,int pointsPerDollar)
    {
        super(p);
        this.pointsPerDollar=pointsPerDollar;
    }

    public boolean pay(double amount)
    {
        int earned=(int)Math.floor(amount)*pointsPerDollar;
        totalPoints+=earned;
        System.out.println("[Cashback] earned="+earned+" totalPoints="+totalPoints);
        return super.pay(amount);
    }

    public String getName()
    {
        return wrappee.getName()+"+Cashback";
    }
}
