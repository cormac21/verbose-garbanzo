package com.cormacx.auctionservice.repository;

import com.cormacx.auctionservice.entity.auction.Auction;
import org.springframework.data.repository.CrudRepository;

public interface AuctionRepository extends CrudRepository<Auction, Long> {
}
