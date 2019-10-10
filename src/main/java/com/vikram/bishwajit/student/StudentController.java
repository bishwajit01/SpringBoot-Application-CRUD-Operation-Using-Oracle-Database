package com.vikram.bishwajit.student;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * 
 * @author Bishwajit.
 *
 */
@RestController
public class StudentController {

	@Autowired
	StudentService studentService;

	@GetMapping(path = "/students")
	public List<Student> getSudent() {
		return studentService.getAllStudents();
	}

	@GetMapping("/students/{id}")
	public Optional<Student> getSudentByID(@PathVariable String id) {
		return studentService.getStudentById(id);
	}

	@PostMapping("/students")
	public void addStudent(@RequestBody Student student) {
		studentService.addStudent(student);
	}
	
	@DeleteMapping("/students/{id}")
	public void deleteStudentById(@PathVariable String id) {
		studentService.deleteById(id);
	}
	
	@PutMapping("/students/{id}")
	public void updateStudent(@RequestBody Student student, @PathVariable String id) {
		studentService.updateStudent(student, id);
	}
}
