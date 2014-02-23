package com.parse.tutorials.pushnotifications;

import com.parse.Parse;
import com.parse.ParseInstallation;
import com.parse.ParseAnalytic;
import com.parse.PushService;

public class Application extends android.app.Application {

  public Application() {
  }

  @Override
  public void onCreate() {
    super.onCreate();

	// Initialize the Parse SDK.
	Parse.initialize(this, "7nAuWaGiKovuuXQmGqUF0foP3RAFhSJ2KpLufbaT", "iXokVvjZf340Ke1pPzShPTLPFsihMUdXP0EDSvZx");
	ParseAnalytics.trackAppOpened(getIntent());

	// Specify an Activity to handle all pushes by default.
	PushService.setDefaultPushCallback(this, MainActivity.class);
	
	PushService.setDefaultPushCallback(this, YourDefaultActivity.class);
  }
}
