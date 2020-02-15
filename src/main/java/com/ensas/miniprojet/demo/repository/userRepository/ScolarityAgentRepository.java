package com.ensas.miniprojet.demo.repository.userRepository;

import com.ensas.miniprojet.demo.model.user.scolartyAgent.ScolarityAgent;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ScolarityAgentRepository extends JpaRepository<ScolarityAgent,Long> {
}
