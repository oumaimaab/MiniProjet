package com.ensas.miniprojet.demo.controller.converter;

import com.ensas.miniprojet.demo.controller.vo.identification.IdentificationVO;
import com.ensas.miniprojet.demo.model.Identification;
import com.ensas.miniprojet.demo.util.ObjectUtil;
import com.ensas.miniprojet.demo.util.StringUtil;
import org.springframework.stereotype.Component;

@Component
public class IdentificationConverter extends AbstractConverter<Identification, IdentificationVO> {
    @Override
    public IdentificationVO convertToVO(Identification identification) {
        if (ObjectUtil.isNull(identification)) {
            return null;
        }
        IdentificationVO identificationVO = new IdentificationVO();
        identificationVO.setUsername(identification.getUsername());
        identificationVO.setPassword(StringUtil.EMPTY);
        return identificationVO;
    }

    @Override
    public Identification convertToDM(IdentificationVO identificationVO) {
        if (ObjectUtil.isNull(identificationVO)) {
            return null;
        }
        Identification identification = new Identification();
        identification.setUsername(identificationVO.getUsername());
        identification.setPassword(identificationVO.getPassword());
        return identification;
    }
}
