package com.asan.type;

public enum ProcessingCode {
    Payment(1),
    Purchase(2),
    Deposit(3),
    Balance(4),
    Transfer(5),
    Cashout(8),
    CashableBalance(9),
    Statement(10),
    CreditRemainedDebt(101),
    ;

    private final int value;

    ProcessingCode(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
