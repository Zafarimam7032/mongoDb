package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Vo.EmployeeVo;
import com.example.mngorepo.MgoRepository;

@Service
public class EmployeeService {

	@Autowired
	private MgoRepository mgoRepository;

	public List<EmployeeVo> displayAll() {
		List<EmployeeVo> listEmployeeVos = mgoRepository.findAll();
		return listEmployeeVos;
	}

	public EmployeeVo displayById(int id) {
		return mgoRepository.findAll().stream().filter(employee -> employee.getId() == id).findFirst().orElse(null);
	}

	public EmployeeVo updateEmployeeVo(int id, String empName) {
		return mgoRepository.findAll().stream().filter(employee -> employee.getId() == id).map(employee -> {
			employee.setName(empName);
			return mgoRepository.save(employee);
			
		}).findAny().orElse(null);

	}

	public EmployeeVo addEmployeeVo(EmployeeVo employeeVo) {
		return mgoRepository.save(employeeVo);

	}

	public void deleteEmployee(int id) {
		mgoRepository.deleteById(id);
	}

}
