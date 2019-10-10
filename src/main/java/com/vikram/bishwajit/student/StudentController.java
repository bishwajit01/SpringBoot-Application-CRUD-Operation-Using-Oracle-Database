package com.vikram.bishwajit.student;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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

	@GetMapping("/students")
	public List<Student> getSudent() {
		return studentService.getAllStudents();
	}
	@GetMapping("/students/{id}")
	public Optional<Student> getSudentByID(@PathVariable String id) {
		return studentService.getStudentById(id);
	}
}
