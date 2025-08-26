package com.taskmgr.task.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.taskmgr.task.entity.LearnEntity;

public interface LearnRepository extends JpaRepository<LearnEntity,Long>{
    
}
