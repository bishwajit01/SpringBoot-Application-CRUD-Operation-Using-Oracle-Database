package com.vikram.bishwajit.student;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Bishwajit.
 *
 */
@Service
public class StudentService {

	@Autowired
	StudentRepository studentRepository;

	public List<Student> getAllStudents() {
		List<Student> listStudent = new ArrayList<Student>();
		studentRepository.findAll().forEach(listStudent::add);
		return listStudent;
	}

	public Optional<Student> getStudentById(String id) {
		return studentRepository.findById(id);
	}

	public void addStudent(Student student) {
		studentRepository.save(student);
	}

}
