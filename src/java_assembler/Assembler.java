package java_assembler;

import java_spring.ChangePasswordService;
import java_spring.MemberDao;
import java_spring.MemberRegisterService;

public class Assembler {

	private MemberDao memberDao;
	private MemberRegisterService reqSvc;
	private ChangePasswordService pwdSvc;
	
	public Assembler(){
		memberDao = new MemberDao();
		reqSvc = new MemberRegisterService(memberDao);
		pwdSvc = new ChangePasswordService(memberDao);
		
	}

	public MemberDao getMemberDao() {
		return memberDao;
	}

	public MemberRegisterService getMemberRegisterService() {
		return reqSvc;
	}

	public ChangePasswordService getChangePasswordService() {
		return pwdSvc;
	}
	
	
	
	
}
