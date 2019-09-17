package com.codeclan.fileservice.fileservice;

import com.codeclan.fileservice.fileservice.models.File;
import com.codeclan.fileservice.fileservice.models.Folder;
import com.codeclan.fileservice.fileservice.models.User;
import com.codeclan.fileservice.fileservice.repository.FileRepository;
import com.codeclan.fileservice.fileservice.repository.FolderRepository;
import com.codeclan.fileservice.fileservice.repository.UserRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class FileserviceApplicationTests {

	@Autowired
	UserRepository userRepository;

	@Autowired
	FolderRepository folderRepository;

	@Autowired
	FileRepository fileRepository;

	@Test
	public void contextLoads() {
	}

	@Test
	public void createUserAndFolder(){
		User user1 = new User("Trish");
		userRepository.save(user1);
		Folder folder1 = new Folder("Work", user1);
		folderRepository.save(folder1);
	}

	@Test
	public void createUserFolderAndFile(){
		User user2 = new User("Eloise");
		userRepository.save(user2);
		Folder folder2 = new Folder("Jobs", user2);
		folderRepository.save(folder2);
		File file1 = new File("CV", ".pdf", 65, folder2);
		fileRepository.save(file1);
	}

}
