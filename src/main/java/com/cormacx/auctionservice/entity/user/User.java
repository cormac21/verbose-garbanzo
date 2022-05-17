package com.cormacx.auctionservice.entity.user;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.util.List;

@Entity
public class User {

    @Id
    private Long id;

    private String email;

    private String password;

    @ManyToMany
    private List<Permission> permissions;

}
