package com.company;

import java.util.Date;

public class AuthorizedUser extends User{
    private Date login_time;

    public AuthorizedUser() {

    }

    public AuthorizedUser(Date login_time) {
        this.login_time = login_time;
    }

    public AuthorizedUser(Integer id, String username, String password, Date login_time) {
        super(id, username, password);
        this.login_time = login_time;
    }

    public AuthorizedUser(String username, String password, Date login_time) {
        super(username, password);
        this.login_time = login_time;
    }


    @Override
    public String toString() {
        return super.toString() + ", {login_time=" + login_time +
                '}';
    }

    public Date getLogin_time() {
        return login_time;
    }

    public void setLogin_time(Date login_time) {
        this.login_time = login_time;
    }
}
