package com.abu.project.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.abu.project.model.Project;



@Repository
public interface ProjectDao extends JpaRepository<Project,String> 
{
}
