package com.spec.varshu.repo;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spec.varshu.entity.Result;

@Repository
public interface ResultRepo extends JpaRepository<Result, Long> {
    // You can add custom query methods here if needed
}
