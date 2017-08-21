package zimbra.util.activerecord.handler;

import java.util.List;

import zimbra.util.activerecord.ActiveRecord;
import zimbra.util.client.Client;

public abstract class Handler {
	protected Client client;
	
	public Handler(Client client) {
		this.client = client;
	}
	public abstract void save(ActiveRecord model);
	public Client getClient() {
		return client;
	}
	public void setClient(Client client) {
		this.client = client;
	}
	public abstract void update(ActiveRecord model);
	public abstract void delete(ActiveRecord model);
	public abstract ActiveRecord get();
	public abstract List<ActiveRecord> all();
}