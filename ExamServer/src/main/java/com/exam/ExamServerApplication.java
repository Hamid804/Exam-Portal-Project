package com.exam;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.exam.model.Role;
import com.exam.model.User;
import com.exam.model.UserRole;
import com.exam.service.UserService;

@SpringBootApplication
public class ExamServerApplication implements CommandLineRunner {
	
	@Autowired
	private UserService userService;

	public static void main(String[] args) {
		SpringApplication.run(ExamServerApplication.class, args);
		System.out.println("Heelo Hamid");
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("starting code");
		
//		User user = new User();
//		user.setFirstname("Hamid");
//		user.setLastname("Hussain");
//		user.setUsername("Hamid805");
//		user.setPassword("abc");
//		user.setPhone("9354804504");
//		user.setEmail("hamid123@gmail.com");
//		user.setProfile("profile.png");
//		user.setEnabled(true);
//		
//		
//		
//		Role role1 = new Role();
//		role1.setRoleId(44L);
//		role1.setRoleName("ADMIN");
//		
//		
//		UserRole userRole = new UserRole();
//		userRole.setRole(role1);
//		userRole.setUser(user);
//		
//		
//		
//		Set<UserRole> userRoleSet = new HashSet<>();
//		userRoleSet.add(userRole); //here we can add multiple userRole for a user
//		
//		
//		User user1 = this.userService.createUser(user, userRoleSet);
//		System.out.println(user1.getUsername());
	}

}
