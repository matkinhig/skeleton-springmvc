package vn.com.sgfintech.service;

import org.springframework.data.jpa.repository.JpaRepository;
import vn.com.sgfintech.entity.User;

public interface UserService extends JpaRepository<User, String> {
}
