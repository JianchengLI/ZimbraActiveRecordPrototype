package zimbra.util.activerecord.test;

import org.junit.Test;

import zimbra.util.activerecord.DistributionList;
import zimbra.util.activerecord.handler.DistributionListHandler;
import zimbra.util.client.impl.UnitClient;

public class DistributionListTest {

	@Test
	public void test() {
		DistributionListHandler handler = new DistributionListHandler(new UnitClient());
		DistributionList dl = new DistributionList(handler);
		dl.save();
		dl.update();
		dl.delete();
	}

}
