package com.gfg.JBCMajorProject.JBCMajorProject.repository;

import com.gfg.JBCMajorProject.JBCMajorProject.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {

}
