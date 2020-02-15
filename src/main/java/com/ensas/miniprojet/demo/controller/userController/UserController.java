package com.ensas.miniprojet.demo.controller.userController;

import com.ensas.miniprojet.demo.controller.AbstractController;
import com.ensas.miniprojet.demo.controller.converter.IdentificationConverter;
import com.ensas.miniprojet.demo.controller.converter.UserConverter;
import com.ensas.miniprojet.demo.controller.vo.UserVO;
import com.ensas.miniprojet.demo.controller.vo.identification.IdentificationVO;
import com.ensas.miniprojet.demo.model.User;
import com.ensas.miniprojet.demo.service.userService.UserService;
import com.ensas.miniprojet.demo.util.ObjectUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("scolarite/user")
public class UserController implements AbstractController<UserVO> {
    @Autowired
    private UserService userService;

    @Autowired
    private UserConverter userConverter;

    @Autowired
    private IdentificationConverter identificationConverter;

    /**
     * this end-point is for adding a user
     * @param userVO
     * @return int
     */
    @PostMapping("/")
    @Override
    public int save(@RequestBody UserVO userVO) {
        User user = userConverter.convertToDM(userVO);
        if (ObjectUtil.isNull(user)) {
            return -1;
        }
        return userService.save(user);
    }

    /**
     * this end-point if for updating an existing user
     * @param userVO
     * @return int
     */
    @PutMapping("/")
    @Override
    public int update(@RequestBody UserVO userVO) {
        User user = userConverter.convertToDM(userVO);
        if (ObjectUtil.isNull(user)) {
            return -1;
        }
        return userService.update(user);
    }

    /**
     * this end-point if for deleting an existing user
     * @param id
     * @return int
     */
    @DeleteMapping("/{id}")
    @Override
    public int delete(@PathVariable Long id) {
        if (ObjectUtil.isNull(id)) {
            return -1;
        }
        return userService.delete(id);
    }

    /**
     * this end-point is for getting all the existing users
     * @return List<UserVO>
     */
    @GetMapping("/")
    @Override
    public List<UserVO> findAll() {
        return userConverter.convertToVOs(userService.findAll());
    }

    /**
     * this end-point if authenticating an existing user
     * @param identificationVO
     * @return UserVO
     */
    @PostMapping("/auth")
    public UserVO login(@RequestBody IdentificationVO identificationVO){
        return userConverter.convertToVO(userService.login(identificationConverter.convertToDM(identificationVO)));
    }



    public UserService getUserService() {
        return userService;
    }

    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    public UserConverter getUserConverter() {
        return userConverter;
    }

    public void setUserConverter(UserConverter userConverter) {
        this.userConverter = userConverter;
    }

    public IdentificationConverter getIdentificationConverter() {
        return identificationConverter;
    }

    public void setIdentificationConverter(IdentificationConverter identificationConverter) {
        this.identificationConverter = identificationConverter;
    }
}
