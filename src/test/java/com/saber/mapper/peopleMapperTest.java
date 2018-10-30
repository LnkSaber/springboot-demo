package com.saber.mapper;

import com.saber.pojo.People;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class peopleMapperTest {

    @Autowired
    private peopleMapper peopleMapper;

    @Test
    public void textQuery(){
        People people=peopleMapper.selectByPrimaryKey(1);
        System.out.println("people = "+people);
    }
}