package com.example.cmdrunner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.example.Vo.EmployeeVo;
import com.example.mngorepo.MgoRepository;

@Component
public class cmdRunner implements CommandLineRunner {
	@Autowired
	private MgoRepository mgoRepository;

	@Override
	public void run(String... args) throws Exception {

		mgoRepository.save(new EmployeeVo(1,"Zafar","new Delhi",30000d,"Greatwits"));
	}

}
