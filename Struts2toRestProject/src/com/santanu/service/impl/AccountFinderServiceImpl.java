package com.santanu.service.impl;

import com.santanu.service.AccountFinderService;

public class AccountFinderServiceImpl implements AccountFinderService {

	private String acc_no = "1234567890123456";

	@Override
	public String getUserAccount() {
		return acc_no;
	}

}
