package zimbra.util.activerecord;

import java.util.List;

public interface Handler {
	public abstract void save(ActiveRecord model);
	public abstract void update(ActiveRecord model);
	public abstract void delete(ActiveRecord model);
	public abstract ActiveRecord get();
	public abstract List<ActiveRecord> all();
}