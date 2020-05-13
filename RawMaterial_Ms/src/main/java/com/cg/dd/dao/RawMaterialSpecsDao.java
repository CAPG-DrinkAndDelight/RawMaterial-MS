package com.cg.dd.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.dd.entities.RawMaterialSpecs;

@Repository
public interface RawMaterialSpecsDao extends JpaRepository<RawMaterialSpecs, String> {

}
