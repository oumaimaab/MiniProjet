package com.ensas.miniprojet.demo.service.userService;

import com.ensas.miniprojet.demo.model.Identification;
import com.ensas.miniprojet.demo.model.user.prof.Prof;
import com.ensas.miniprojet.demo.service.AbstractService;

public interface ProfService extends AbstractService<Prof> {
    public Prof login(Identification identification);
}
