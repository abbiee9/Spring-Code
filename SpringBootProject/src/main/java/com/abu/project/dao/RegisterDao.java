package com.abu.project.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.abu.project.model.Register;


@Repository
public interface RegisterDao extends JpaRepository<Register,String>  
{
}
