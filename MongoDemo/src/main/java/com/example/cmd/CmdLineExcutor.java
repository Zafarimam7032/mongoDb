package com.example.cmd;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.example.Vo.StudentVo;
import com.example.repository.MgRepository;
@Component
public class CmdLineExcutor  implements CommandLineRunner{
	@Autowired
	private MgRepository mgRepository;

	@Override
	public void run(String... args) throws Exception {
		mgRepository.save(new StudentVo(1, "Zafar", "New Delhi", "Jntuh", "7032871006"));
		mgRepository.save(new StudentVo(2, "Sanskar", "New Delhi", "Jntuh", "7032871006"));
		mgRepository.save(new StudentVo(3, "Piyush", "New Delhi", "Jntuh", "7032871006"));
		
	}

}
