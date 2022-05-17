package com.cormacx.auctionservice.repository;

import com.cormacx.auctionservice.entity.user.User;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.Optional;

public interface UserRepository extends PagingAndSortingRepository<User, Long> {

    Optional<User> findByEmail( String email );

}
