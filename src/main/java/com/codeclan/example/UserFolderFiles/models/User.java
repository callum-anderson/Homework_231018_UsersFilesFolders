package com.codeclan.example.UserFolderFiles.models;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.ArrayList;
import java.util.List;

public class User {
    private String name;
    private List<Folder> folders;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    public User(){

    }
    public User(String name){
        this.name = name;
        this.folders = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Folder> getFolders() {
        return folders;
    }

    public void setFolders(List<Folder> folders) {
        this.folders = folders;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void addFolders(Folder folder) {
        this.folders.add(folder);
    }
}
