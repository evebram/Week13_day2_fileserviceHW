package com.codeclan.fileservice.fileservice.components;

import com.codeclan.fileservice.fileservice.models.File;
import com.codeclan.fileservice.fileservice.models.Folder;
import com.codeclan.fileservice.fileservice.models.User;
import com.codeclan.fileservice.fileservice.repository.FileRepository;
import com.codeclan.fileservice.fileservice.repository.FolderRepository;
import com.codeclan.fileservice.fileservice.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    UserRepository userRepository;

    @Autowired
    FolderRepository folderRepository;

    @Autowired
    FileRepository fileRepository;

    public void run(ApplicationArguments args){

        User user1 = new User("Ben");
        userRepository.save(user1);

        User user2 = new User("Fidelma");
        userRepository.save(user2);

        User user3 = new User("Chris");
        userRepository.save(user3);

        Folder folder1 = new Folder("Jobs", user1);
        folderRepository.save(folder1);
        Folder folder2 = new Folder("Finances", user1);
        folderRepository.save(folder2);

        Folder folder3 = new Folder("Class_Work", user2);
        folderRepository.save(folder3);
        Folder folder4 = new Folder("Research", user2);
        folderRepository.save(folder4);

        Folder folder5 = new Folder("Recipes", user3);
        folderRepository.save(folder5);

        File file1 = new File("CV", ".pdf", 64, folder1);
        fileRepository.save(file1);
        File file2 = new File("Cover_Letter", ".pages", 61, folder1);
        fileRepository.save(file2);
        File file3 = new File("Payments", ".pdf", 113, folder2);
        fileRepository.save(file3);

        File file4 = new File("Homework", ".pages", 78, folder3);
        fileRepository.save(file4);
        File file5 = new File("Springdocs", ".pages", 112, folder4);
        fileRepository.save(file5);
        File file6 = new File("Javadocs", ".pages", 240, folder4);
        fileRepository.save(file6);

        File file7 = new File("ApplePie", ".pdf", 39, folder5);
        fileRepository.save(file7);
        File file8 = new File("RoastLamb", ".pdf", 45, folder5);
        fileRepository.save(file8);

    }

}
