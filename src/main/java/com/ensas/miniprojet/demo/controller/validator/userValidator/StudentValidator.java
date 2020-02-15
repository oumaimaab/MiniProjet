package com.ensas.miniprojet.demo.controller.validator.userValidator;

import com.ensas.miniprojet.demo.controller.validator.AbstractValidator;
import com.ensas.miniprojet.demo.controller.vo.user.StudentVO;
import com.ensas.miniprojet.demo.model.user.student.Student;
import org.springframework.stereotype.Component;

@Component
public class StudentValidator extends AbstractValidator<Student, StudentVO> {
    @Override
    public int validateDM(Student student) {
        return 0;
    }

    @Override
    public int validateVO(StudentVO studentVO) {
        return 0;
    }
}
