package ru.mirea.lab4;

public class User {
    private String login, password;
    public String[] purchase;


    public void setLogin(String login) {
        this.login = login;
    }

    public String getLogin(){
        return login;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPassword(){
        return password;
    }
    public User(String login, String password)
    {
        this.login = login;
        this.password = password;
    }

    public boolean IsAuth(String login, String password) {
        if (login == this.login & password == this.password)
            return true;
        else
            return false;
    }
}
