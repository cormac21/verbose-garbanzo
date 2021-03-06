package com.cormacx.auctionservice.service;

import com.cormacx.auctionservice.entity.auction.Auction;
import com.cormacx.auctionservice.repository.AuctionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AuctionService {

    private AuctionRepository auctionRepo;

    @Autowired
    public AuctionService( AuctionRepository auctionRepository ) {
        this.auctionRepo = auctionRepository;
    }

    public Optional<Auction> findAuctionById(Long id) {
        return auctionRepo.findById(id);
    }

    public Auction createNewAuction(Auction auction) {
        return auctionRepo.save(auction);
    }

    public boolean validateNewAuction(Auction auction) {
        return false;
    }

    public void deleteAuction(Long id) {
        auctionRepo.deleteById(id);
    }
}
