package com.codeclan.example.UserFolderFiles;

import com.codeclan.example.UserFolderFiles.models.File;
import com.codeclan.example.UserFolderFiles.models.Folder;
import com.codeclan.example.UserFolderFiles.models.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserFolderFilesApplicationTests {

	@Test
	public void contextLoads() {
	}

	@Test
	public void userHasFolder(){
		User user = new User("Jane");
		Folder folder = new Folder("A folder", user);
		user.addFolders(folder);
		assertEquals(1, user.getFolders().size());
	}

	@Test
	public void folderHasFiles(){
		User user = new User("Jane");
		Folder folder = new Folder("A folder", user);
		File file = new File("A file", "txt", 44500, folder);
		folder.addFile(file);
		assertEquals(1, folder.getFiles().size());
	}

	@Test
	public void userHasFiles(){
		User user = new User("Jane");
		Folder folder = new Folder("A folder", user);
		File file = new File("A file", "txt", 44500, folder);
		folder.addFile(file);
		user.addFolders(folder);
		assertEquals(1, user.getFolders().get(0).getFiles().size());
	}

}
