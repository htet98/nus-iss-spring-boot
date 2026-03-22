```mermaid
    %%{ init : { "theme" : "default" } }%%
    graph TD
        A[Cashier (Amy)] -->|Initiate Payment| B[GenFreshFood System]
        B -->|Send Payment Request| C[Bank API]
        C -->|Authorize Payment| D{Is Payment Authorized?}
        D -->|Yes| E[Payment Successful]
        E --> F[Notify Cashier]
        F --> G[Update Order Status]
        D -->|No| H[Payment Declined]
        H --> F[Notify Cashier]
        E -->|Wait for Delivery Confirmation| I[Delivery Confirmation]
        I --> J[Complete Transaction]
        J --> K[Notify Cashier]
        C -->|Send Error| L[Handle Error]
        L --> M[Notify Cashier of Issue]
```

This diagram illustrates the secure payment sync process with three swimlanes: Cashier (Amy), GetFreshFood System, and Bank API. It includes all actions, decision points, wait states, and error handling flows accordingly.