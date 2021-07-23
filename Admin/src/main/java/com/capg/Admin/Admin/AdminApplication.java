package com.capg.Admin.Admin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.capg.Admin.Admin.entity.Admin;
import com.capg.Admin.Admin.repo.IAdminRepo;

@SpringBootApplication
public class AdminApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ct = SpringApplication.run(AdminApplication.class, args);
		
//		IAdminRepo repo=ct.getBean(IAdminRepo.class);
//		Admin ad =new Admin();
//		ad.setAdminName("Indrajit");
//		ad.setContactNumber(99999999);
//		ad.setEmail("abc@gmail.com");
//		ad.setPassword("Ajhhihuidguihel");
//		repo.save(ad);
	}

}
