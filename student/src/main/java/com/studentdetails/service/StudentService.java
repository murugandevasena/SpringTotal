package com.studentdetails.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.InvalidDataAccessApiUsageException;
import org.springframework.stereotype.Service;

import com.studentdetails.dao.StudentDao;
import com.studentdetails.entity.Student;
import com.studentdetails.userdefinedexception.AgeNotEligibleException;

@Service
public class StudentService {

	@Autowired
	StudentDao studentdao;

	public String setOne(Student student) {
		// TODO Auto-generated method stub
		return studentdao.setOne(student);
	}

	public String setMany(List<Student> student) {
		// TODO Auto-generated method stub
		return studentdao.setMany(student);
	}

	public Student getOne(int id) {
		// TODO Auto-generated method stub
		return studentdao.getOne(id);
	}

	public List<Student> getMany() {
		// TODO Auto-generated method stub
		return studentdao.getMany();
	}

	public String setOneUpdate(Student student, int id) {
		// TODO Auto-generated method stub
		List<Student> s1 = getMany();
		s1.stream().filter(x -> x.getId() == id).forEach(s -> s.setName(student.getName()));
//		s1.stream().filter(x->x.getId()==id).forEach(y->y.setAge(y.getAge()+2));
		return studentdao.setMany(s1);
	}

	public String setByAbove18(List<Student> student) throws InvalidDataAccessApiUsageException {
		// TODO Auto-generated method stub
//		List<Student> stu = student.stream().filter(x -> x.getAge() >= 18).collect(Collectors.toList());
//		if(stu.isEmpty()) {
//			throw new InvalidDataAccessApiUsageException("");
//		}
//		return studentdao.setMany(stu);
		List<Student> stu=null;
		System.out.println("list count:"+student.size());
		for(int j=1;j<student.size();j++) {
			if(student.get(j).getAge()>=18) {
			 stu.addAll(student);
			 System.out.println("Student"+student.get(j));
			}
		}
		if(stu==null) {
			throw new InvalidDataAccessApiUsageException("");
		}
		return studentdao.setMany(stu);
	}

	public String deleteById(int id) {
		// TODO Auto-generated method stub
		return studentdao.deleteById(id);
	}

}
