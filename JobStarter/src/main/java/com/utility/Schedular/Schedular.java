package com.utility.Schedular;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service
public class Schedular {

	@Scheduled(fixedRate = 100000)
	public void cronJobSch() {

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
		Date now = new Date();
		String strDate = sdf.format(now);
		System.out.println("Mail Utility Job:: " + strDate);
		
	}

	@Scheduled(fixedRate = 100000)
	public void cronJobSch2() {

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
		Date now = new Date();
		String strDate = sdf.format(now);
		System.out.println("Sms Utility Job:: " + strDate);
	}

	@Scheduled(fixedRate = 100000)
	public void cronJobSch3() {

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
		Date now = new Date();
		String strDate = sdf.format(now);
		System.out.println("Notification Utility Job:: " + strDate);
	}

}
