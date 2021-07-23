package com.capg.Admin.Admin.repo;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.capg.Admin.Admin.entity.Admin;

@Repository
public interface IAdminRepo extends JpaRepository<Admin,Serializable> {

}
