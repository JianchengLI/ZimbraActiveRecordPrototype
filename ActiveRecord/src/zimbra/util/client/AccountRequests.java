package zimbra.util.client;

public interface AccountRequests {
	public abstract void getAccount();
	public abstract void getAllAccounts();
	public abstract void createAccount();
	public abstract void updateAccount();
	public abstract void removeAccount();
	public abstract void addAccountAlias();
	public abstract void removeAccountAlias();
}
