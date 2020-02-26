package com.oepp.oeppMobile.Utility;

class AccountSingleton
{
    private static final AccountSingleton ourInstance = new AccountSingleton();

    static AccountSingleton getInstance() {
        return ourInstance;
    }

    private AccountSingleton() {
    }
}
