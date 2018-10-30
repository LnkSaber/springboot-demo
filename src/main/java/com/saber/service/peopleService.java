package com.saber.service;

import com.saber.mapper.peopleMapper;
import com.saber.pojo.People;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class peopleService {
    @Autowired
    private peopleMapper peopleMapper;

    public People queryByid(Integer id){
        return peopleMapper.selectByPrimaryKey(id);
    }
    @Transactional
    public void insertPeople(People people){
        peopleMapper.insert(people);
    }
}
