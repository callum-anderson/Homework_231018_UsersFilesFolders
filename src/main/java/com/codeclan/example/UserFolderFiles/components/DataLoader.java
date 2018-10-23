package com.codeclan.example.UserFolderFiles.components;


import com.codeclan.example.UserFolderFiles.models.User;
import com.codeclan.example.UserFolderFiles.models.Folder;
import com.codeclan.example.UserFolderFiles.models.File;
import com.codeclan.example.UserFolderFiles.repositories.UserRepository;
import com.codeclan.example.UserFolderFiles.repositories.FileRepository;
import com.codeclan.example.UserFolderFiles.repositories.FolderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    UserRepository userRepository;

    @Autowired
    FileRepository fileRepository;

    @Autowired
    FolderRepository folderRepository;


    public DataLoader() {

    }

    public void run(ApplicationArguments args) {
        User user1 = new User("Jane");
        userRepository.save(user1);
        User user2 = new User("Steve");
        userRepository.save(user2);
        Folder folder1 = new Folder("Folder1", user1);
        folderRepository.save(folder1);
        Folder folder2 = new Folder("Folder2", user1);
        folderRepository.save(folder2);
        Folder folder3 = new Folder("Folder3", user2);
        folderRepository.save(folder3);
        Folder folder4 = new Folder("Folder4", user2);
        folderRepository.save(folder4);
        File file1 = new File("File1", "txt", 44500, folder1);
        fileRepository.save(file1);
        File file2 = new File("File2", "doc", 144500, folder2);
        fileRepository.save(file2);
        File file3 = new File("File3", "avi", 13544500, folder3);
        fileRepository.save(file3);
        File file4 = new File("File4", "pdf", 344500, folder4);
        fileRepository.save(file4);

        user1.addFolders(folder1);
        user1.addFolders(folder2);
        user2.addFolders(folder3);
        user2.addFolders(folder4);

        folder1.addFile(file1);
        folder2.addFile(file2);
        folder3.addFile(file3);
        folder4.addFile(file4);

//        userRepository.save(user1);
//        userRepository.save(user2);
//        folderRepository.save(folder1);
//        folderRepository.save(folder2);
//        folderRepository.save(folder3);
//        folderRepository.save(folder4);
//        fileRepository.save(file1);
//        fileRepository.save(file2);
//        fileRepository.save(file3);
//        fileRepository.save(file4);


    }
}