package com.codeclan.example.UserFolderFiles.models;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "folders")
public class Folder {
    @Column(name = "title")
    private String title;
    @JsonIgnore
    @OneToMany(mappedBy="folder", fetch = FetchType.LAZY)
    private List<File> files;
    @JsonIgnore
    @ManyToOne
    @JoinColumn(name="user_id", nullable=false)
    private User user;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    public Folder(){

    }
    public Folder(String title, User user){
        this.title = title;
        this.user = user;
        this.files = new ArrayList<>();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<File> getFiles() {
        return files;
    }

    public void setFiles(List<File> files) {
        this.files = files;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void addFile(File file) {
        this.files.add(file);
    }
}