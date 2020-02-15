package com.ensas.miniprojet.demo.controller.converter;

import com.ensas.miniprojet.demo.controller.validator.UserValidator;
import com.ensas.miniprojet.demo.controller.vo.UserVO;
import com.ensas.miniprojet.demo.model.User;
import com.ensas.miniprojet.demo.model.admin.Admin;
import com.ensas.miniprojet.demo.model.user.prof.Prof;
import com.ensas.miniprojet.demo.model.user.scolartyAgent.ScolarityAgent;
import com.ensas.miniprojet.demo.model.user.student.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserConverter extends AbstractConverter<User, UserVO>{
    @Autowired
    private IdentificationConverter identificationConverter;

    @Autowired
    private UserValidator userValidator;
    @Override
    public UserVO convertToVO(User user) {
        if (userValidator.validateDM(user) < 0) {
            return null;
        }
        UserVO userVO = new UserVO();
        userVO.setId(user.getId());
        userVO.setNom(user.getNom());
        userVO.setPrenom(user.getPrenom());
        userVO.setEmail(user.getEmail());
        userVO.setIdentificationVO(identificationConverter.convertToVO(user.getIdentification()));


        if (user instanceof Admin){
            userVO.setRole("ADMIN");
        }else if(user instanceof Prof){
            userVO.setRole("PROF");
        }
        else if(user instanceof Student){
            userVO.setRole("STUDENT");
        }
        else if(user instanceof ScolarityAgent){
            userVO.setRole("SCOLARITYAGENT");
        }else{
            userVO.setRole("USER");
        }
        return userVO;
    }

    @Override
    public User convertToDM(UserVO userVO) {
        User user;
        if (userValidator.validateVO(userVO) < 0) {
            return null;
        }
        else if (userVO.getRole().equals("ADMIN")){
            user = new Admin();
        }else if (userVO.getRole().equals("STUDENT")){
            user = new Student();
        }
        else if (userVO.getRole().equals("SCOLARITYAGENT")){
            user = new ScolarityAgent();
        }
        else{
            user = new User();
        }

        user.setId(userVO.getId());
        user.setNom(userVO.getNom());
        user.setPrenom(userVO.getPrenom());
        user.setEmail(userVO.getEmail());
        user.setIdentification(identificationConverter.convertToDM(userVO.getIdentificationVO()));

        return user;
    }



    public IdentificationConverter getIdentificationConverter() {
        return identificationConverter;
    }

    public void setIdentificationConverter(IdentificationConverter identificationConverter) {
        this.identificationConverter = identificationConverter;
    }
}
