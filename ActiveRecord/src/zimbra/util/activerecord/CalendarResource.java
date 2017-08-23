package zimbra.util.activerecord;

import java.util.Optional;

import zimbra.util.activerecord.handler.Handler;

public class CalendarResource extends ActiveRecord {
	private Optional<String> password;
	
	public CalendarResource(Handler handler, Optional<String> password) {
		super(handler);
		this.password = password;
	}

	public String getPassword() {
		return password.get();
	}

	public void setPassword(String password) {
		this.password = Optional.of(password);
	}
}
