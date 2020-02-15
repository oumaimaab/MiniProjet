package com.ensas.miniprojet.demo.controller.validator.userValidator;

import com.ensas.miniprojet.demo.controller.validator.AbstractValidator;
import com.ensas.miniprojet.demo.controller.vo.user.ScolarityAgentVO;
import com.ensas.miniprojet.demo.model.user.scolartyAgent.ScolarityAgent;
import org.springframework.stereotype.Component;

@Component
public class ScolarityAgentValidator extends AbstractValidator<ScolarityAgent, ScolarityAgentVO> {
    @Override
    public int validateDM(ScolarityAgent scolarityAgent) {
        return 0;
    }

    @Override
    public int validateVO(ScolarityAgentVO scolarityAgentVO) {
        return 0;
    }
}
