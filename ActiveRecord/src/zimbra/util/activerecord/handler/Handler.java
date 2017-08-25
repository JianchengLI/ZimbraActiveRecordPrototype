package zimbra.util.activerecord.handler;

import java.util.List;

import zimbra.util.activerecord.ActiveRecord;
import zimbra.util.client.Client;

public abstract class Handler {
	protected static Client client;
	
	public Handler(Client client) {
		Handler.client = client;
	}
	
	public abstract void save(ActiveRecord model);
	
	public Client getClient() {
		return client;
	}
	
	public void setClient(Client client) {
		Handler.client = client;
	}
	public abstract void update(ActiveRecord model);
	public abstract void delete(ActiveRecord model);

	public static ActiveRecord get() {
		// TODO Auto-generated method stub
		return null;
	}

	public static List<ActiveRecord> all() {
		// TODO Auto-generated method stub
		return null;
	}
}