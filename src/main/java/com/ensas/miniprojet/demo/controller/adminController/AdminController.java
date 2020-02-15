package com.ensas.miniprojet.demo.controller.adminController;

import com.ensas.miniprojet.demo.controller.AbstractController;
import com.ensas.miniprojet.demo.controller.vo.admin.AdminVO;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("scolarite/Admin")
public class AdminController implements AbstractController<AdminVO> {
    /*
    * If you want to use the AdminService class or any class you must use:
    * the @Autowired annotation in order to use the Dependency Injection
    * */

    @PostMapping("/")
    @Override
    public int save(AdminVO adminVO) {
        return 0;
    }

    @PutMapping("/")
    @Override
    public int update(AdminVO adminVO) {
        return 0;
    }
    @DeleteMapping("/{id}")
    @Override
    public int delete(Long id) {
        return 0;
    }

    @GetMapping("/")
    @Override
    public List<AdminVO> findAll() {
        return null;
    }
}
