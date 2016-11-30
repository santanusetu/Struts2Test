package com.santanu.action;

import com.santanu.service.AccountFinderService;
import com.santanu.service.impl.AccountFinderServiceImpl;

public class AccountAction {

	private String userAccount;

	public String execute() {
		AccountFinderService afs = new AccountFinderServiceImpl();
		setUserAccount(afs.getUserAccount());
		// System.out.println(userAccount);
		return "success";
	}

	public String getUserAccount() {
		return userAccount;
	}

	public void setUserAccount(String userAccount) {
		this.userAccount = userAccount;
	}
}
