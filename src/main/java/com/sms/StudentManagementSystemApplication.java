package com.sms;

import com.sms.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StudentManagementSystemApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(StudentManagementSystemApplication.class, args);
	}

	@Autowired
	StudentRepository studentRepository;

	@Override
	public void run(String... args) {
//		studentRepository.saveAll(Arrays.asList(new Student("Jimmy", "Botezine", "jbotezine@gmail.com"),
//												new Student("Carol", "Lisboa", "clisboa@gmail.com")));
	}
}
