package com.entertainment.moviemax.mymovieapp;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

import com.entertainment.moviemax.mymovieapp.model.User;
import com.entertainment.moviemax.mymovieapp.service.RegistrationService;

@SpringBootApplication
@PropertySource(value = { "classpath:configuration.properties" })
public class MymovieappApplication implements CommandLineRunner {
	@Autowired
	private Environment environment;
	@Autowired
	ApplicationContext context;
	HashMap<String, String> hmap;
	
	public static void main(String[] args) {
		SpringApplication.run(MymovieappApplication.class, args);
	}
	@Override
	public void run(String... arg0) throws Exception {
		  hmap = new HashMap<String, String>();

	      /*Adding elements to HashMap*/
	      hmap.put("M1001", "IronMan");
	      hmap.put("M1002", "Interstellar");
	      hmap.put("M1003", "HeraPheri");
	      hmap.put("M1004", "RushHour");
	      hmap.put("M1005", "Golmaal");
	      
  
	      
		try {
			User user = new User();
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Enter name: ");
			String name = sc.next();

			System.out.println("Enter email: ");
			String mail = sc.next();
			
			System.out.println("Enter phone: ");
			String phone = sc.next();
			
			System.out.println("Enter city: ");
			String city = sc.next();
			
			user.setName(name);
			user.setEmail(mail);
			user.setPhone(phone);
			user.setCity(city);
		
	        //System.out.println("Iterating Hashmap...");  
		    for(Map.Entry<String,String> m : hmap.entrySet()){    
		       System.out.println("."+m.getValue()); 
		    }
		    
		    System.out.println("Select a movie from the list");
			String movieName = sc.next();
			
		    for(Map.Entry<String,String> m : hmap.entrySet()){    
		    	if (movieName.equalsIgnoreCase(m.getValue())){
		    		user.setMovieId(m.getKey());
		    	}
			    }
			
			RegistrationService service = (RegistrationService) context.getBean("registrationService");
			String registrationMessage = service.registerUser(user);
			System.out.println(environment.getProperty(registrationMessage)+" "+user.getMovieId());
		    
		}catch (Exception e) {
			System.out.println(environment.getProperty(e.getMessage()));
		}
	}
}
