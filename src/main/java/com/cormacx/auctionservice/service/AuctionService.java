package com.cormacx.auctionservice.service;

import com.cormacx.auctionservice.repository.AuctionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuctionService {

    private AuctionRepository auctionRepo;

    @Autowired
    public AuctionService( AuctionRepository auctionRepository ) {
        this.auctionRepo = auctionRepository;
    }

}
