package me.ermias.demo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import java.net.URL;
import java.util.List;

@JsonIgnoreProperties
@Entity
public class User {

    private long id;
    private String login;

    private URL followers_url;
    private URL following_url;

    @ManyToMany
    private List<Repos_url> repos_url;

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

    public URL getFollowers_url() {
        return followers_url;
    }

    public void setFollowers_url(URL followers_url) {
        this.followers_url = followers_url;
    }

    public URL getFollowing_url() {
        return following_url;
    }

    public void setFollowing_url(URL following_url) {
        this.following_url = following_url;
    }

    public String toString() {
        return "User{" +
                "id=" + id +
                ",login=" + login +
                ",followers_url=" + followers_url +
                ",following_url=" + following_url + '\'' +
                '}';
    }


}
