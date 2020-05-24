package cuit.shop.mapper;

import cuit.shop.entity.User;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserMapper {
    List<User> UserList();
    int AddUser(User user);
    String login(String id);
}
