package com.ensas.miniprojet.demo.service.userService;

import com.ensas.miniprojet.demo.model.Identification;
import com.ensas.miniprojet.demo.model.user.scolartyAgent.ScolarityAgent;
import com.ensas.miniprojet.demo.service.AbstractService;

public interface ScolarityAgentService extends AbstractService<ScolarityAgent> {
    public ScolarityAgent login(Identification identification);
}
