package com.ensas.miniprojet.demo.controller.validator.userValidator;

import com.ensas.miniprojet.demo.controller.validator.AbstractValidator;
import com.ensas.miniprojet.demo.controller.vo.user.ProfVO;
import com.ensas.miniprojet.demo.model.user.prof.Prof;
import com.ensas.miniprojet.demo.util.StringUtil;
import org.springframework.stereotype.Component;

@Component

public class ProvValidator extends AbstractValidator<Prof, ProfVO> {
    @Override
    public int validateDM(Prof prof) {
        if (prof == null){
            return -1;
        }
//        if (StringUtil.isEmptyOrNullOrAWhiteSpace(prof.getNom()) || ){
//
//            return -2;
//        }
        return 1;
    }

    @Override
    public int validateVO(ProfVO profVO) {
        if (profVO == null){
            return -1;
        }
        return 1;
    }
}
