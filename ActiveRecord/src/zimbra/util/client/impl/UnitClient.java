package zimbra.util.client.impl;

import java.util.List;

import zimbra.util.activerecord.Account;
import zimbra.util.activerecord.ActiveRecord;
import zimbra.util.client.Client;

public class UnitClient extends Client{

	@Override
	public void createAccount(Account account) {
		System.out.println("createAccount");
		System.out.println(account);
	}

	@Override
	public void updateAccount() {
		System.out.println("updateAccount");
	}

	@Override
	public void removeAccount() {
		System.out.println("removeAccount");
	}

	@Override
	public void addAccountAlias() {
		System.out.println("addAccountAlias");
	}

	@Override
	public void removeAccountAlias() {
		System.out.println("removeAccountAlias");
	}

	@Override
	public void createDistributionList() {
		System.out.println("createDistributionList");
	}

	@Override
	public void updateDistributionList() {
		System.out.println("updateDistributionList");
	}

	@Override
	public void removeDistributionList() {
		System.out.println("removeDistributionList");
	}

	@Override
	public void addDistributionListAlias() {
		System.out.println("addDistributionListAlias");
	}

	@Override
	public void removeDistributionListAlias() {
		System.out.println("removeDistributionListAlias");
	}

	@Override
	public void addDistributionListMemeber() {
		System.out.println("addDistributionListMemeber");
	}

	@Override
	public void removeDistributionListMemeber() {
		System.out.println("removeDistributionListMemeber");
	}

	@Override
	public Account getAccount() {
		System.out.println("getAccount");
		return null;
	}

	@Override
	public List<ActiveRecord> getAllAccounts() {
		System.out.println("getAllAccounts");
		return null;
	}

	@Override
	public void getDistributionList() {
		System.out.println("getDistributionList");
	}

	@Override
	public void getAllDistributionList() {
		System.out.println("getAllDistributionList");
		
	}

}
