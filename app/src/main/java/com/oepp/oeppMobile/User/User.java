package com.oepp.oeppMobile.User;

public class User
{
    private String email;
    private String nameAndSurname;
    private String password;

    public User(String email, String nameAndSurname, String password) {
        this.email = email;
        this.nameAndSurname = nameAndSurname;
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNameAndSurname() {
        return nameAndSurname;
    }

    public void setNameAndSurname(String nameAndSurname) {
        this.nameAndSurname = nameAndSurname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
