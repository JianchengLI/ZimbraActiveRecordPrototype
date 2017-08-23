package zimbra.util.activerecord;

import java.util.Optional;

import zimbra.util.activerecord.handler.Handler;

public class DistributionList extends ActiveRecord{
	private Optional<Boolean> dynamic;
	

	private String ref; //LDAP DN of the DL.

	public DistributionList(Handler handler, Optional<Boolean> dynamic) {
		super(handler);
		this.dynamic = dynamic;
	}
	
	public Optional<Boolean> getDynamic() {
		return dynamic;
	}

	public String getRef() {
		return ref;
	}

	public void setRef(String ref) {
		this.ref = ref;
	}

	public void setDynamic(Optional<Boolean> dynamic) {
		this.dynamic = dynamic;
	}
	
	public void setDynamic(Boolean dynamic) {
		this.dynamic = Optional.of(dynamic);
	}

}
