# Secure Payment Activity Diagram

The activity diagram below outlines the steps involved in the secure payment process:

1. **User initiates payment**: The user selects a product and clicks on the checkout button.
2. **Payment Details Entry**: The user is redirected to a payment form where they enter their payment details (e.g., credit card info).
3. **Validation**: The system validates the payment information.
   - If valid, proceed to the next step.
   - If invalid, display error and allow retry.
4. **Payment Processing**: The system communicates with the payment gateway for processing the payment.
5. **Payment Gateway Response**: The payment gateway returns success or failure information.
   - If successful, proceed to confirmation step.
   - If failed, display error and allow retry.
6. **Confirmation**: The user is shown a confirmation screen with the details of their transaction.
7. **Notification**: The system sends a notification to the user and the merchant regarding the transaction.
8. **End Process**: The user may choose to continue shopping or logout.

## Diagram Visualization
[Insert Diagram Here]  

*Note: This is a textual representation. The actual diagram should be created using a diagram tool and inserted accordingly.*