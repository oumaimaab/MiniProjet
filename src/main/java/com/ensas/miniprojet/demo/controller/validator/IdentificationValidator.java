package com.ensas.miniprojet.demo.controller.validator;

import com.ensas.miniprojet.demo.controller.vo.identification.IdentificationVO;
import com.ensas.miniprojet.demo.model.Identification;
import com.ensas.miniprojet.demo.util.ObjectUtil;
import com.ensas.miniprojet.demo.util.StringUtil;

public class IdentificationValidator extends AbstractValidator<Identification, IdentificationVO> {
    @Override
    public int validateDM(Identification identification) {
        if (ObjectUtil.isNull(identification)) return -1;
        if (StringUtil.isEmptyOrNullOrAWhiteSpace(identification.getUsername())) return -2;
        if (StringUtil.isEmptyOrNullOrAWhiteSpace(identification.getPassword())) return -3;
        return 1;
    }

    @Override
    public int validateVO(IdentificationVO identificationVO) {
        if (ObjectUtil.isNull(identificationVO)) return -1;
        if (StringUtil.isEmptyOrNullOrAWhiteSpace(identificationVO.getUsername())) return -2;
        if (StringUtil.isEmptyOrNullOrAWhiteSpace(identificationVO.getPassword())) return -3;
        return 1;
    }
}
