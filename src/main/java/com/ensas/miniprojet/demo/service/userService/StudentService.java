package com.ensas.miniprojet.demo.service.userService;

import com.ensas.miniprojet.demo.model.Identification;
import com.ensas.miniprojet.demo.model.user.student.Student;
import com.ensas.miniprojet.demo.service.AbstractService;

public interface StudentService extends AbstractService<Student> {
    public Student login(Identification identification);
}
