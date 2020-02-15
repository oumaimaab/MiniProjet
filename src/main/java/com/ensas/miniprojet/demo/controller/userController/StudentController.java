package com.ensas.miniprojet.demo.controller.userController;

import com.ensas.miniprojet.demo.controller.AbstractController;
import com.ensas.miniprojet.demo.controller.vo.user.StudentVO;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("scolarite/student")
public class StudentController implements AbstractController<StudentVO> {
    /*
     * If you want to use the AdminService class or any class you must use:
     * the @Autowired annotation in order to use the Dependency Injection
     * */
    @PostMapping("/")
    @Override
    public int save(StudentVO studentVO) {
        return 0;
    }

    @PutMapping("")
    @Override
    public int update(StudentVO studentVO) {
        return 0;
    }

    @DeleteMapping("/{id}")
    @Override
    public int delete(Long id) {
        return 0;
    }

    @GetMapping("/")
    @Override
    public List<StudentVO> findAll() {
        return null;
    }
}
