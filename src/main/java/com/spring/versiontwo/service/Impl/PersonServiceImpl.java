package com.spring.versiontwo.service.Impl;

import com.spring.versiontwo.repository.PersonRepository;
import com.spring.versiontwo.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
public class PersonServiceImpl implements PersonService {

    @Autowired
    private PersonRepository personRepository;

}
