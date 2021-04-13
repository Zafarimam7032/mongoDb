package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Vo.EmployeeVo;
import com.example.service.EmployeeService;

@RestController
@RequestMapping(path = "/home/employee")
public class EmployeeController {
	@Autowired
	private EmployeeService employeeService;
	@GetMapping(path = "/all")
	public List<EmployeeVo> listEmployeeVos()
	{
		return employeeService.displayAll();
	}
	@GetMapping(path = "/{id}")
	public EmployeeVo displayEmployeeVo(@PathVariable("id") int id)
	{
		return employeeService.displayById(id);
	}
	@PostMapping(path = "/insert")
	public EmployeeVo insertEmployeeVo(@RequestBody EmployeeVo employeeVo)
	{
		return employeeService.addEmployeeVo(employeeVo);
	
	}
	@PutMapping(path = "/update/{id}/{name}")
	public EmployeeVo updateEmployeeVo(@PathVariable("id") int id,@PathVariable("name") String name)
	{
		return employeeService.updateEmployeeVo(id, name);
	}
	@DeleteMapping(path = "/delete/{id}")
	public void deleteEmployee(@PathVariable("id") int id)
	{
		 employeeService.deleteEmployee(id);
	}
}
