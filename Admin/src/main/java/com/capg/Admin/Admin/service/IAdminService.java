package com.capg.Admin.Admin.service;

import com.capg.Admin.Admin.entity.Admin;

public interface IAdminService {

	
	public Admin addAdmin(Admin admin);
	public Admin updateAdmin(Admin admin);
	public void removeAdmin(int admin);
	public Admin viewAdmin(int admin);
	
}