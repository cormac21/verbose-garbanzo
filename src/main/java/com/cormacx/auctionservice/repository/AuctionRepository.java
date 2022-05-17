package com.cormacx.auctionservice.repository;

import com.cormacx.auctionservice.entity.auction.Auction;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface AuctionRepository extends PagingAndSortingRepository<Auction, Long> {
}
