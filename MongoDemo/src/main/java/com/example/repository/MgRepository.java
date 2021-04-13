package com.example.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.Vo.StudentVo;
@Repository
public interface MgRepository  extends MongoRepository<StudentVo, Integer>{

}
