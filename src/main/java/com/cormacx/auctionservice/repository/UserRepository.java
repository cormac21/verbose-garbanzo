package com.cormacx.auctionservice.repository;

import com.cormacx.auctionservice.entity.user.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {
}
