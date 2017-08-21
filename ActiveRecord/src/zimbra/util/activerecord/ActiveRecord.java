package zimbra.util.activerecord;

import java.util.List;

import zimbra.util.activerecord.handler.Handler;

public class ActiveRecord {
	private Handler handler;
	
	public ActiveRecord(Handler handler) {
		this.handler = handler;
	}

	public void save() {
		handler.save(this);
	}
	
	public void update() {
		handler.update(this);
	}
	
	public void update_all() {
		
	}
	
	public void delete() {
		handler.delete(this);
	}
	
	public static List<ActiveRecord> all(){
		return null;
	}
	
	public static ActiveRecord first(){
		return null;
	}
	
	public static ActiveRecord find_by(){
		return null;
	}
	
	public static List<ActiveRecord> where(){
		return null;
	}
	

}
