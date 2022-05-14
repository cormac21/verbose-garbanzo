package com.cormacx.auctionservice.controller;

import com.cormacx.auctionservice.entity.auction.Auction;
import com.cormacx.auctionservice.service.AuctionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import java.util.Optional;

@RestController("/auction")
public class AuctionController {

    private AuctionService auctionService;

    @Autowired
    public AuctionController( AuctionService auctionService ) {
        this.auctionService = auctionService;
    }

    @GetMapping("/{id}")
    public Auction findById(@PathVariable Long id) {
        Optional<Auction> auctionOpt = auctionService.findAuctionById(id);

        if ( auctionOpt.isPresent()) {
            return auctionOpt.get();
        } else {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Auction not found");
        }
    }

}
