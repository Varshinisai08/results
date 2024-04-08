package com.spec.varshu.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spec.varshu.entity.Result;
import com.spec.varshu.repo.ResultRepo;

import java.util.List;

@Service
public class ResultService {

    @Autowired
    private ResultRepo resultRepo;

    public List<Result> getAllResults() {
        return resultRepo.findAll();
    }

    public Result getResultById(Long id) {
        return resultRepo.findById(id).orElse(null);
    }

    public Result saveResult(Result result) {
        return resultRepo.save(result);
    }

    public void deleteResult(Long id) {
        resultRepo.deleteById(id);
    }
}
