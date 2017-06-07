package java_spring;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MemberDao {
	private static long nextId = 0;
	private Map<String, Member> map = new HashMap<>();
	
	public Member selectByEmail(String email){
		return map.get(email);
	}
	public void insert(Member member){
		member.setId(++nextId);
		map.put(member.getEmail(), member);
		
	}
	public void update(Member member){
		map.put(member.getEmail(), member);
	}
	
	public String getAllMember(){
		String str = "";
		Member member=null;
		Set<String> set = map.keySet();
		Iterator<String> it = set.iterator();
		while(it.hasNext()){
			String key = it.next();
			member = map.get(key);
			str+=member.memberView()+"\n";
		}
		
		return str;
	}

}
