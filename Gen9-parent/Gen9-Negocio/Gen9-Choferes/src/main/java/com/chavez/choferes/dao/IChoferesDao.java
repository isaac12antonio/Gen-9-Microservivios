package com.chavez.choferes.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.chavez.choferes.models.Chofer;

public interface IChoferesDao extends JpaRepository<Chofer, Long>{
    

}
