package zimbra.util.activerecord;

import java.util.List;
import java.util.Map;

import zimbra.util.activerecord.handler.Handler;

public class ActiveRecord {
	private Handler handler;
	 
	protected String id;
	protected String name;
	protected List<Map<String, ?>> attributes;
	
	public ActiveRecord(Handler handler) {
		this.handler = handler;
	}

	public void setHandler(Handler handler) {
		this.handler = handler;
	}

	public void save() {
		handler.save(this);
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Map<String, ?>> getAttributes() {
		return attributes;
	}

	public void setAttributes(List<Map<String, ?>> attributes) {
		this.attributes = attributes;
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
