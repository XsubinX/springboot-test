package com.zourceview.soas.jpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.zourceview.soas.jpa.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
