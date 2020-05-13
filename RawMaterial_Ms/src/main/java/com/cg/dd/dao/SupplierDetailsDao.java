package com.cg.dd.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.dd.entities.SupplierDetails;

@Repository
public interface SupplierDetailsDao extends JpaRepository<SupplierDetails, String> {

}
