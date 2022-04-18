package com.example.demo.taskcontroller;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class TaskController {
	@GetMapping("/task")
	public String task() {
		return "Task demonstration";
	}
	@GetMapping("/task/showMyInfo")
	public String showInfo() {
		return "Name:Sruthi Boddu, City:Hyderabad, State:Telangana, Dream_Job:Software Developer";
	}
	
	@GetMapping("/task/showMyHobbies")
	public List<String> showHobbies() {
		return List.of("Sketching","Playing Badminton","Reading Novels");
	}
}


