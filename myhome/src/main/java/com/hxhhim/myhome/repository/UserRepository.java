package com.hxhhim.myhome.repository;

import com.hxhhim.myhome.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
