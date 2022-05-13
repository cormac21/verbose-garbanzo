package com.cormacx.auctionservice.entity.user;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class User {

    @Id
    private Long id;

    private String email;

    private String password;

    //TODO add permissions relationship
    //private List<Permission> permissions;

}
