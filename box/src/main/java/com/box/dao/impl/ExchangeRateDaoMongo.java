package com.box.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.stereotype.Repository;

import com.box.dao.ExchangeRateDao;

@Repository
public class ExchangeRateDaoMongo implements ExchangeRateDao {

	@Autowired
	MongoOperations mongoOperation;
}
