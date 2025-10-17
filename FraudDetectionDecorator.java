public class FraudDetectionDecorator
        extends PaymentDecorator
{
    public FraudDetectionDecorator(Payment p)
    {
        super(p);
    }

    public boolean pay(double amount)
    {
        if(amount>1000)
        {
            System.out.println("[FraudDetection] suspicious amount="+amount);
        }
        else
        {
            System.out.println("[FraudDetection] no issues");
        }

        return super.pay(amount);
    }

    public String getName()
    {
        return wrappee.getName()+"+FraudDetection";
    }
}
