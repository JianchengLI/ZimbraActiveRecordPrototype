package zimbra.util.activerecord.test;

import org.junit.Test;

import zimbra.util.activerecord.Account;
import zimbra.util.activerecord.AccountHandler;
import zimbra.util.client.impl.UnitClient;

public class AccountTest {

	@Test
	public void test() {
		AccountHandler handler = new AccountHandler(new UnitClient());
		Account account = new Account(handler);
		account.save();
		account.update();
		account.delete();
	}
}
