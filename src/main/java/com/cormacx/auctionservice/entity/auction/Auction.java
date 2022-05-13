package com.cormacx.auctionservice.entity.auction;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
public class Auction {

    @Id
    @GeneratedValue( strategy = GenerationType.AUTO)
    private Long id;

    private LocalDateTime startTime;

    private LocalDateTime endTime;

    @Enumerated(EnumType.ORDINAL)
    private AuctionStatus status;

    private String description;

    //TODO add user relationship
    //private User createdByUser;

}
