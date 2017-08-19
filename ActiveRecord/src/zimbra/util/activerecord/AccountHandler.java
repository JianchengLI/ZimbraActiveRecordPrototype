package zimbra.util.activerecord;

import java.util.List;

import zimbra.util.client.Client;

public class AccountHandler implements Handler {
	
	private Client client;
	 
	public AccountHandler(Client client) {
		this.client = client;
	}

	@Override
	public void save(ActiveRecord model) {
		client.createAccount();
	}

	@Override
	public void update(ActiveRecord model) {
		client.updateAccount();
	}

	@Override
	public void delete(ActiveRecord model) {
		client.removeAccount();
	}

	@Override
	public ActiveRecord get() {
		client.getAccount();
		return null;
	}

	@Override
	public List<ActiveRecord> all() {
		client.getAllAccounts();
		return null;
	}

}
