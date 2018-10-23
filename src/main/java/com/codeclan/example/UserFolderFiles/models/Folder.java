package com.codeclan.example.UserFolderFiles.models;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.ArrayList;
import java.util.List;

public class Folder {
    private String title;
    private List<File> files;
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