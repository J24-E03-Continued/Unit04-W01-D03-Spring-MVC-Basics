package com.example.booklist;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;

@SpringBootApplication
public class BooklistApplication implements CommandLineRunner {

	@Value("${title.book}")
	String title;
	public static void main(String[] args) {
		SpringApplication.run(BooklistApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception{
		System.out.println(title);
	}

}
