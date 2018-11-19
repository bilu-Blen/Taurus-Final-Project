package me.ermias.demo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import java.util.ArrayList;
import java.util.List;

@JsonIgnoreProperties
@Entity
public class Repos_url {
    private long id;
    private String name;
    private String fullName;

    private ArrayList<String> languages_url;


    private List<String> collaborators_url;
    private List<String> pulls_url;
    private long forks;
    private int views;
    private int cloners;

    @ManyToMany
    private User owner;


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public ArrayList<String> getLanguages_url() {
        return languages_url;
    }

    public void setLanguages_url(ArrayList<String> languages_url) {
        this.languages_url = languages_url;
    }

    public List<String> getCollaborators_url() {
        return collaborators_url;
    }

    public void setCollaborators_url(List<String> collaborators_url) {
        this.collaborators_url = collaborators_url;
    }

    public List<String> getPulls_url() {
        return pulls_url;
    }

    public void setPulls_url(List<String> pulls_url) {
        this.pulls_url = pulls_url;
    }

    public long getForks() {
        return forks;
    }

    public void setForks(long forks) {
        this.forks = forks;
    }

    public int getViews() {
        return views;
    }

    public void setViews(int views) {
        this.views = views;
    }

    public int getCloners() {
        return cloners;
    }

    public void setCloners(int cloners) {
        this.cloners = cloners;
    }

    public User getOwner() {
        return owner;
    }

    public void setOwner(User owner) {
        this.owner = owner;
    }

    public String toString(){
        return "Repos_url{" +
                "id=" + id +
                ",name=" + name +
                ",fullName=" + fullName +
                ",languages_url=" + languages_url +
                ",collaborators_url=" + collaborators_url +
                ",pulls_url=" + pulls_url +
                ",forks=" + forks +
                ",views=" + views +
                "cloners='" + cloners + '\'' +
                '}';
    }
}
