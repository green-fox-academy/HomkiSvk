package com.greenfox.api.services;

import com.greenfox.api.models.Log;
import com.greenfox.api.repos.LogRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LogService {

    private final LogRepo logRepo;

    @Autowired
    public LogService(LogRepo logRepo){
        this.logRepo= logRepo;
    }

    public void add(Log log) {
        logRepo.save(log);
    }

    public List<Log> getAll () {
        return logRepo.findAll();
    }
}
