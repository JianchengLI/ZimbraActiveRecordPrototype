package zimbra.util.client.impl;

import zimbra.util.client.Client;

public class UnitClient extends Client{

	@Override
	public void createAccount() {
		System.out.println("createAccount");
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
	public void getAccount() {
		System.out.println("getAccount");
	}

	@Override
	public void getAllAccounts() {
		System.out.println("getAllAccounts");
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
