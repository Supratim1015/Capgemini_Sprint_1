package com.capg.Admin.Admin.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.capg.Admin.Admin.entity.Admin;
import com.capg.Admin.Admin.service.IAdminService;

@RestController
public class AdminController {
@Autowired
private IAdminService service;
@PostMapping("/Add_Admin")
public Admin saveAdmin(@RequestBody Admin obj) {
	return service.addAdmin(obj);
}
@DeleteMapping("/Del_Admin/{ID}")
public void removeAdmin(@PathVariable("ID")int ID) {
	service.removeAdmin(ID);
}
@GetMapping("/Get_Admin/{ID}")
public Admin find_admin(@PathVariable("ID")int ID) {
	return service.viewAdmin(ID);
}
@PutMapping("/Update_Admin")
public Admin update_admin(@RequestBody Admin obj) {
	return service.updateAdmin(obj);
}
}
