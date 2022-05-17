package com.cormacx.auctionservice.entity.user;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.util.List;

@Entity
public class Permission {

    @Id
    private Long id;

    private String name;

    @ManyToMany
    private List<User> users;

}
