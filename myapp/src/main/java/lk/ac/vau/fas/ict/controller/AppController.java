package lk.ac.vau.fas.ict.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lk.ac.vau.fas.ict.model.Student;

@RestController
@RequestMapping("/app")
public class AppController {
	//create some student objects
	Student Bob = new Student("2020IT67", "Sachintha Pramod", 24, "IT", 3.2);
	Student Alice = new Student("2020IT96", "Sanduni Amasha", 23, "IT", 3.6);
	Student John = new Student("2021IT03", "John Parker", 22, "Bio", 3.3);
	
	private Map<String, Student> mstudents=new HashMap<String, Student>();
	
	public AppController() {
		mstudents.put(Alice.getRegNo(), Alice);
		mstudents.put(Bob.getRegNo(), Bob);
		mstudents.put(John.getRegNo(), John);
	}
	
	@GetMapping("/students")
	public Map<String,Student> getStudents() {	
		return mstudents;
	}
	
	@GetMapping("/student/{id}")
	public Student getStudent(@PathVariable("id") String regno) {
		return mstudents.get(regno);
	}
	//Add a new student
	@PostMapping("/add")
	public String addStudent(@RequestBody Student student) {
		mstudents.put(student.getRegNo(), student);
		return "New student added";
	}
	//Delete the student
	@DeleteMapping("/student/{id}")
	public String DeleteStudent(@PathVariable("id") String regno) {
		if(mstudents.get(regno) != null) {
			mstudents.remove(regno);
			return "The student removed";
		}
		return "404 Couldn't find the student";	
	}
	//Update the student
	@PutMapping("/student/{id}")
	public String updateStudent(@PathVariable("id") String regno,@RequestBody Student student) {
		if(mstudents.get(regno) != null) {
			mstudents.put(student.getRegNo(), student);
			return "The student details are updated";
		}
		return "404 Couldn't find the student";	
	}
	
	//find the students whose age is between 20 and 23
	//sort the students by their GPA
	//Create CRUD operations for students
}
