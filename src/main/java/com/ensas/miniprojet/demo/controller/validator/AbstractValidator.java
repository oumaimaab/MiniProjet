package com.ensas.miniprojet.demo.controller.validator;

import com.ensas.miniprojet.demo.util.ListUtil;

import java.util.List;

public abstract class  AbstractValidator<DM, VO> {
    /**
     * to validate a data model (DM)
     *
     * @param dm
     * @return
     */
    public abstract int validateDM(DM dm);

    /**
     * to validate a list of data models (DMs)
     *
     * @param dms
     * @return
     */
    public int validateDMs(List<DM> dms){
        if (ListUtil.isEmptyOrNull(dms)) return -1;
        for (DM dm : dms) {
            if (validateDM(dm) < 0) {
                return -2;
            }
        }
        return 1;
    }

    /**
     * to validate a value object (VO)
     *
     * @param vo
     * @return
     */
    public abstract int validateVO(VO vo);

    /**
     * to validate a list of value objects (VOs)
     *
     * @param vos
     * @return
     */
    public int validateVOs(List<VO> vos){
        if (ListUtil.isEmptyOrNull(vos)) return -1;
        for (VO vo : vos) {
            if (validateVO(vo) < 0) {
                return -2;
            }
        }
        return 1;
    }
}
