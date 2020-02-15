package com.ensas.miniprojet.demo.controller;

import java.util.List;

public interface AbstractController<VO> {
    public int save(VO vo);
    public int update(VO vo);
    public int delete(Long id);
    public List<VO> findAll();
}
