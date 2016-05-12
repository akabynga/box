package com.box.service;

import java.util.List;

import com.box.entity.ExchangeRate;

public interface ExchangeRateService {

	ExchangeRate getExchangeRate(Long id);

	List<ExchangeRate> getAllExchangeRates();

	void update(Long id, ExchangeRate student);

	void delete(Long id);

	void create(ExchangeRate student);

}
