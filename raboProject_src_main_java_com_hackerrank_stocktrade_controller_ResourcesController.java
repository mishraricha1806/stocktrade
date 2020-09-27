package com.hackerrank.stocktrade.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hackerrank.stocktrade.repository.TradeRepository;

@RestController
@RequestMapping(value = "/erase")
public class ResourcesController {
	
	@Autowired
	private TradeRepository tradeRepository;
	
	 @DeleteMapping
	    public void deleteAllTrade() {
	        tradeRepository.deleteAll();
	    }
    
}
