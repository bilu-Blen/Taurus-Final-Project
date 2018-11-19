package me.ermias.demo;

import java.net.URL;
import java.util.HashSet;
import java.util.Set;

public class Orgs {

    private long id;
    private String login;
    private URL members_url;

    private Set<User> users;

    public Orgs() {
        this.users= new HashSet<>();
    }


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public URL getMembers_url() {
        return members_url;
    }

    public void setMembers_url(URL members_url) {
        this.members_url = members_url;
    }

    public Set<User> getUsers() {
        return users;
    }

    public void setUsers(Set<User> users) {
        this.users = users;
    }
}
