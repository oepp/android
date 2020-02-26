package com.oepp.oeppMobile.Utility;

public class SignUtility
{
    public static SignUtility instance = new SignUtility();

    private SignUtility()
    {

    }

    //Kullanıcı kayıt için inputları dogru şekilde doldurmuşmu?
    public boolean canSignUp(String userName,String email,String password,String passwordRety)
    {
        return false;
    }

    //Kullanıcı giriş için inputları dogru şekilde doldurmuş mu?
    public boolean canSignIn(String email,String password)
    {
        return false;
    }
}
