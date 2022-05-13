package com.cormacx.auctionservice.entity.user;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Permission {

    @Id
    private Long id;

    private String name;

}
