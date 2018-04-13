package ch.koller.soas.jpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ch.koller.soas.jpa.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
