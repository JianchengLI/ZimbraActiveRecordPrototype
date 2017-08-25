package zimbra.util.activerecord.handler;

import java.util.List;

import zimbra.util.activerecord.ActiveRecord;
import zimbra.util.client.Client;

public class DistributionListHandler extends Handler {

	public DistributionListHandler(Client client) {
		super(client);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void save(ActiveRecord model) {
		client.createDistributionList();
	}

	@Override
	public void update(ActiveRecord model) {
		client.updateDistributionList();
	}

	@Override
	public void delete(ActiveRecord model) {
		client.removeDistributionList();
	}

	
	public static ActiveRecord get() {
		client.getDistributionList();
		return null;
	}


	public static List<ActiveRecord> all() {
		client.getDistributionList();
		return null;
	}

}
