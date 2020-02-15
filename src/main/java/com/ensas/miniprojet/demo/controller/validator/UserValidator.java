package com.ensas.miniprojet.demo.controller.validator;

import com.ensas.miniprojet.demo.controller.vo.UserVO;
import com.ensas.miniprojet.demo.model.User;
import com.ensas.miniprojet.demo.util.ObjectUtil;
import com.ensas.miniprojet.demo.util.StringUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserValidator extends AbstractValidator<User, UserVO> {


    @Autowired
    private IdentificationValidator identificationValidator;
    @Override
    public int validateDM(User user) {
        if (ObjectUtil.isNull(user)) return -1;
        return 1;
    }

    @Override
    public int validateVO(UserVO userVO) {
        if (ObjectUtil.isNull(userVO)) return -1;
        if (StringUtil.isEmptyOrNullOrAWhiteSpace(userVO.getNom())) return -2;
        if (StringUtil.isEmptyOrNullOrAWhiteSpace(userVO.getPrenom())) return -3;
        if (!StringUtil.isEmailValid(userVO.getEmail())) return -4;
//        if (accesValidator.validateVOs(userVO.getAcces()) < 0) return -5;
        if (identificationValidator.validateVO(userVO.getIdentificationVO()) < 0) {
            System.out.println("popopo"+identificationValidator.validateVO(userVO.getIdentificationVO()));
            return -6;
        }
        if (StringUtil.isEmptyOrNullOrAWhiteSpace(userVO.getRole())){
            return -7;
        }
        return 1;
    }
    public IdentificationValidator getIdentificationValidator() {
        return identificationValidator;
    }

    public void setIdentificationValidator(IdentificationValidator identificationValidator) {
        this.identificationValidator = identificationValidator;
    }
}
