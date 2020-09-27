package com.hackerrank.stocktrade.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hackerrank.stocktrade.model.Trade;
import com.hackerrank.stocktrade.model.User;

@Repository
public interface TradeRepository extends JpaRepository<Trade, Long> {
	
    List<Trade>findBySymbol(String symbol);
    List<Trade>findByUser(User userID);
    List<Trade>findByUserAndSymbol(User user,String symbol);

}
