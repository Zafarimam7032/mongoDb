package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Vo.StudentVo;
import com.example.repository.MgRepository;

@RestController
@RequestMapping(path = "/home/student")
public class StudentController {
	@Autowired
	private MgRepository mgRepository;
	
	@GetMapping(path = "/display/all")
	public List<StudentVo> displayAll()
	{
		return mgRepository.findAll();
	}
	

}
