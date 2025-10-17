Report: E-Commerce Payment

In this project, we created an E-Commerce Checkout System that can process different payment types and apply extra features like discounts, cashback, and fraud detection.

We used Decorator and Facade patterns


## decorator pattern
The Decorator Pattern helps to add new features to payments without changing the main payment classes.

 Base Payment Types:

CreditCardPayment

PayPalPayment

**Decorators**
- DiscountDecorator - applies a percentage discount.
- CashbackDecorator - adds cashback points.
- FraudDetectionDecorator - checks and logs suspicious activity.

Example: 
CreditCardPayment can be wrapped with both Discount and Fraud Detection decorators.



## Facade pattern
The CheckoutFacade class gives one simple method to handle the checkout process.  
It applies all decorators, processes the payment, and sends a receipt.

Example:
`checkoutFacade.processOrder(cart, customer);`

## Demo
CreditCardPayment with Discount + Fraud Detection

PayPalPayment with Cashback

Checkout executed via CheckoutFacade



##  Result
The system works correctly and clearly shows how different payment methods and decorators can be combined.