package com.capg.Admin.Admin.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capg.Admin.Admin.Exception.AdminException;
import com.capg.Admin.Admin.entity.Admin;
import com.capg.Admin.Admin.repo.IAdminRepo;

@Service
public class IAdminServiceImp implements IAdminService{
@Autowired
private IAdminRepo repo;
	@Override
	public Admin addAdmin(Admin admin) {
		// TODO Auto-generated method stub
		return repo.save(admin);
	}

	@Override
	public Admin updateAdmin(Admin admin) {
		// TODO Auto-generated method stub
		Admin admin1=repo.findById(admin.getAdminId()).get();
		admin1.setAdminId(admin.getAdminId());
		admin1.setAdminName(admin.getAdminName());
		admin1.setContactNumber(admin.getContactNumber());
		admin1.setEmail(admin.getEmail());
		admin1.setPassword(admin.getPassword());
		return repo.save(admin1);
	}

	@Override
	public void removeAdmin(int admin) {
		// TODO Auto-generated method stub
		 repo.deleteById(admin);
	}

	@Override
	public Admin viewAdmin(int admin) {
		// TODO Auto-generated method stub
		Optional <Admin> list=repo.findById(admin);
		if (list.isEmpty()) {
			throw new AdminException("Unauthorized Admin");
		}
		return list.get();
	}

}
