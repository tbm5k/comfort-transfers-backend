package com.comforttransfers.comforttransfers;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class ComfortTransfersApplication {

	public static void main(String[] args) {
		SpringApplication.run(ComfortTransfersApplication.class, args);
	}

	@CrossOrigin( origins = "http://localhost:8000")
	@PostMapping("/email")
	public String name(){
		return "teddy";
	}
}
