package di_anno2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class AutoWired {

	private Member user;

	@Autowired
	@Qualifier("guest")
	public void setUser(Member user) {
		this.user = user;
	}

	public Member getUser() {
		return user;
	}
	
	
	
}
