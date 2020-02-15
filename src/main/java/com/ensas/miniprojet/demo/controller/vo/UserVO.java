package com.ensas.miniprojet.demo.controller.vo;

import com.ensas.miniprojet.demo.controller.vo.identification.IdentificationVO;

public class UserVO {
    private Long id;
    private String nom;
    private String prenom;
    private String email;
    private IdentificationVO identificationVO;
    private String role;

    public UserVO() {
    }

    public UserVO(String nom, String prenom, String email, IdentificationVO identificationVO) {
        this.nom = nom;
        this.prenom = prenom;
        this.email = email;
        this.identificationVO = identificationVO;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public IdentificationVO getIdentificationVO() {
        return identificationVO;
    }

    public void setIdentificationVO(IdentificationVO identificationVO) {
        this.identificationVO = identificationVO;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return "UserVO{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", email='" + email + '\'' +
                ", identificationVO=" + identificationVO +
                ", role='" + role + '\'' +
                '}';
    }
}
