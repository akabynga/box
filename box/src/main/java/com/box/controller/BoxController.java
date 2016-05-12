package com.box.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.box.entity.ExchangeRate;
import com.box.service.ExchangeRateService;

@Controller
@RequestMapping("/exchangeRate")
@Scope(BeanDefinition.SCOPE_SINGLETON)
public class BoxController {

	@Autowired
	private ExchangeRateService exchangeRateService;

	@RequestMapping(value = "/{id}", method = RequestMethod.GET, headers = "Accept=application/json")
	public @ResponseBody ExchangeRate fetchExchangeRateById(@PathVariable("id") Long id) {
		return exchangeRateService.getExchangeRate(id);
	}

	@RequestMapping(method = RequestMethod.GET, headers = "Accept=application/json")
	public @ResponseBody List<ExchangeRate> fetchAllExchangeRates(@RequestParam int amount, @RequestParam int skip) {
		System.out.println("WORK!");
		return exchangeRateService.getAllExchangeRates();
	}

	@RequestMapping(value = "/currency/{currency}", method = RequestMethod.GET, headers = "Accept=application/json")
	public @ResponseBody List<ExchangeRate> fetchExchangeRatesByCurrency(@RequestParam int amount,
			@RequestParam int skip, @PathVariable("currency") String currency) {
		return exchangeRateService.getAllExchangeRates();
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.PUT, headers = "Accept=application/json")
	public @ResponseBody void updateExchangeRate(@PathVariable("id") Long id, @RequestBody ExchangeRate student) {
		exchangeRateService.update(id, student);
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE, headers = "Accept=application/json")
	public @ResponseBody void deleteExchangeRate(@PathVariable("id") Long id) {
		exchangeRateService.delete(id);
	}

	@RequestMapping(method = RequestMethod.POST, headers = "Accept=application/json")
	public @ResponseBody void createExchangeRate(@RequestBody ExchangeRate student) {
		exchangeRateService.create(student);
	}

}
