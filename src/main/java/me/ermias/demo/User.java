package me.ermias.demo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import java.util.List;

@JsonIgnoreProperties
@Entity
public class User {

    private long id;
    private String login;

    private List<Long> followers_url;
    private List<Long> following_url;

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

    public List<Long> getFollowers_url() {
        return followers_url;
    }

    public void setFollowers_url(List<Long> followers_url) {
        this.followers_url = followers_url;
    }

    public List<Long> getFollowing_url() {
        return following_url;
    }

    public void setFollowing_url(List<Long> following_url) {
        this.following_url = following_url;
    }

    public List<Repos_url> getRepos_url() {
        return repos_url;
    }

    public void setRepos_url(List<Repos_url> repos_url) {
        this.repos_url = repos_url;
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
