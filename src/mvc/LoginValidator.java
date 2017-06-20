package mvc;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

public class LoginValidator implements Validator{

	MemberDao dao;
	
	public LoginValidator(MemberDao dao){
		this.dao = dao;
	}
	
	@Override
	public boolean supports(Class<?> clazz) {
		
		return MemberVo.class.isAssignableFrom(clazz);
	}

	@Override
	public void validate(Object obj, Errors err) {
		MemberVo vo = (MemberVo)obj;
		boolean b = true;//true : 에러없음, false : 에러있음.
		
		if(vo.getUserid() == null || vo.getUserid().trim().isEmpty()){
			err.rejectValue("userid", "아이디를 입력하세요.");
			b = false;
			 
		}
		if(vo.getUserpwd()== null || vo.getUserpwd().trim().isEmpty()){
			err.rejectValue("userpwd", "비밀번호를 입력해 주세요.");
			b = false;
		}
		//가입된 유저 인지 판단하기 위해서
		if(b){//b(true)라면 에러가 없다.. 에러가 있다면(false) 이 부분이 실행되지 않을것
			if(!dao.login(vo)){//login메소드 실행하면서 오류가 발생하게 되면
				err.rejectValue("msg", "당신은 가입된 유저가 아님.");
				
			}
		}
	}

}
