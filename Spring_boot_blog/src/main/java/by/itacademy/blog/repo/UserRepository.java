package by.itacademy.blog.repo;

import by.itacademy.blog.models.User;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.core.userdetails.UserDetails;

public interface UserRepository extends JpaRepository<User,Long> {
    User findByUsername(String username);
}
