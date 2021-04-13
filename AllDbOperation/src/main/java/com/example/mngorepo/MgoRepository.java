package com.example.mngorepo;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.Vo.EmployeeVo;
@Repository
public interface MgoRepository extends MongoRepository<EmployeeVo, Integer> {

}
