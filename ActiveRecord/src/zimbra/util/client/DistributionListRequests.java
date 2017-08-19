package zimbra.util.client;

public interface DistributionListRequests {
	public abstract void createDistributionList();
	public abstract void updateDistributionList();
	public abstract void removeDistributionList();
	public abstract void addDistributionListAlias();
	public abstract void removeDistributionListAlias();
	public abstract void addDistributionListMemeber();
	public abstract void removeDistributionListMemeber();
}
