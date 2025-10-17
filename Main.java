public class Main
{
    public static void main(String[] args)
    {
        demoCreditCard();
        demoPayPal();
    }

    static void demoCreditCard()
    {
        Cart cart=new Cart();
        cart.addItem(new Item("Laptop",1200.0));
        Customer c=new Customer("a","a@mail.com");

        Payment base=new CreditCardPayment("4111111111111111");
        Payment decorated=new DiscountDecorator(new FraudDetectionDecorator(base),10.0);

        CheckoutFacade.processOrder(cart,c,decorated);
    }

    static void demoPayPal()
    {
        Cart cart=new Cart();
        cart.addItem(new Item("Book",25.0));
        Customer c=new Customer("b","b@mail.com");

        Payment base=new PayPalPayment("b@paypal.com");
        Payment decorated=new CashbackDecorator(base,1);

        CheckoutFacade.processOrder(cart,c,decorated);
    }
}
