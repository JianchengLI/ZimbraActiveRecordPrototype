package zimbra.util.client;

import java.util.List;

import zimbra.util.activerecord.Account;
import zimbra.util.activerecord.ActiveRecord;

public interface AccountRequests {
	public abstract Account getAccount();
	public abstract List<ActiveRecord> getAllAccounts();
	public abstract void createAccount(Account model);
	public abstract void updateAccount();
	public abstract void removeAccount();
	public abstract void addAccountAlias();
	public abstract void removeAccountAlias();
}
