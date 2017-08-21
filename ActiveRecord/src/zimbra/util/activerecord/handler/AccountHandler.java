package zimbra.util.activerecord.handler;

import java.util.List;

import zimbra.util.activerecord.ActiveRecord;
import zimbra.util.client.Client;

public class AccountHandler extends Handler {

	public AccountHandler(Client client) {
		super(client);
		// TODO Auto-generated constructor stub
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
