package com.ensas.miniprojet.demo.service;

import java.util.List;

public interface AbstractService<DM> {
    public int save(DM dm);
    public int update(DM dm);
    public int delete(Long id);
    public List<DM> findAll();
}
