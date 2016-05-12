package com.emailsender.platform.sendprocessor;

import com.emailsender.platform.model.WEmail;
import com.emailsender.platform.settings.SenderSettings;

public interface SendProcessor {

	void init(SenderSettings settings);

	void send(WEmail email);
}
