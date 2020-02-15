package com.ensas.miniprojet.demo.repository.userRepository;

import com.ensas.miniprojet.demo.model.Identification;
import com.ensas.miniprojet.demo.model.user.prof.Prof;
import com.ensas.miniprojet.demo.model.user.student.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
    /**
     * this fucntion is for finding an existing Prof by their identification.
     *
     * @param identification
     * @return Student
     */
    Student findByIdentification(Identification identification);

    /**
     * this fucntion is for finding an existing Prof by their email address.
     *
     * @param email
     * @return Prof
     */
    Student findByEmail(String email);
}
