public class CheckoutFacade
{
    // Обеспечивает единый API: применить декораторы уже должен вызывающий код
    public static boolean processOrder(Cart cart,Customer cust,Payment payment)
    {
        System.out.println("=== Checkout for "+cust.getName()+" ===");
        double total=cart.getTotal();
        System.out.println("Cart total="+total);
        System.out.println("Payment strategy="+payment.getName());
        boolean ok=payment.pay(total);
        if(ok)
        {
            sendReceipt(cust,total);
            sendNotification(cust);
            System.out.println("Order status=SUCCESS");
        }
        else
        {
            System.out.println("Order status=FAILED");
        }
        System.out.println("____________");
        return ok;
    }

    private static void sendReceipt(Customer c,double total)
    {
        System.out.println("[Receipt] to="+c.getEmail()+" total="+total);
    }

    private static void sendNotification(Customer c)
    {
        System.out.println("[Notify] sent to "+c.getName());
    }
}
