package com.ensas.miniprojet.demo.controller.converter.admin;

import com.ensas.miniprojet.demo.controller.converter.UserConverter;
import org.springframework.stereotype.Component;

import javax.persistence.Entity;
import java.io.Serializable;

@Component
public class AdminConverter extends UserConverter implements Serializable {
}
