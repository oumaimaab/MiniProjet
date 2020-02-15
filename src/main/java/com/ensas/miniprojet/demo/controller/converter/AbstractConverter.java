package com.ensas.miniprojet.demo.controller.converter;

import com.ensas.miniprojet.demo.util.ListUtil;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstractConverter<DM,VO> {
    /**
     * to convert a data model (DM) to a value object (VO)
     *
     * @param dm
     * @return
     */
    public abstract VO convertToVO(DM dm);

    /**
     * to convert a list of data models (DMs) to a list of value objects (VOs)
     *
     * @param dms
     * @return
     */
    public List<VO> convertToVOs(List<DM> dms){
        if (ListUtil.isEmptyOrNull(dms)) {
            return null;
        }
        List<VO> vos = new ArrayList<>();
        for (DM dm : dms) {
            vos.add(convertToVO(dm));
        }
        return vos;
    }

    /**
     * to convert a value object (VO) to a data model (DM)
     *
     * @param vo
     * @return
     */
    public abstract DM convertToDM(VO vo);

    /**
     * to convert a list of value objects (VOs) to a list of data models (DMs)
     *
     * @param vos
     * @return
     */
    public List<DM> convertToDMs(List<VO> vos){
        if (ListUtil.isEmptyOrNull(vos)) {
            return null;
        }
        List<DM> dms = new ArrayList<>();
        for (VO vo : vos) {
            dms.add(convertToDM(vo));
        }
        return dms;
    }
}
