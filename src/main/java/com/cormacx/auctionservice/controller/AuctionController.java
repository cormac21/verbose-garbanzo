package com.cormacx.auctionservice.controller;

import com.cormacx.auctionservice.entity.auction.Auction;
import com.cormacx.auctionservice.service.AuctionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
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

    @PostMapping
    public Auction createNewAuction(@RequestBody Auction auction) {
        boolean isValid = auctionService.validateNewAuction(auction);

        if (isValid) {
            Auction retVal = auctionService.createNewAuction(auction);
        } else {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Failed to validate new Auction");
        }
        return auction;
    }

    @DeleteMapping("/{id}")
    public void deleteAuction(@PathVariable Long id) {
        Optional<Auction> auctionOpt = auctionService.findAuctionById(id);

        if (auctionOpt.isPresent()) {
            auctionService.deleteAuction(id);
        } else {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Auction not found");
        }
    }



}
