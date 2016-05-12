package com.emailsender.platform.sendprocessor.impl;

import org.springframework.stereotype.Component;

import com.emailsender.platform.model.WEmail;
import com.emailsender.platform.sendprocessor.SendProcessor;
import com.emailsender.platform.settings.SenderSettings;

@Component("Default")
public class ISendProcessor_Default implements SendProcessor {

	@Override
	public void init(SenderSettings settings) {
		// TODO Auto-generated method stub

	}

	@Override
	public void send(WEmail email) {
		// TODO Auto-generated method stub

	}

}
