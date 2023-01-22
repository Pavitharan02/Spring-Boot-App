package com.nimbusventure.routeoptimizer.repo;

import com.nimbusventure.routeoptimizer.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User, Long> {
    void deleteUserById(Long user_id);
}
