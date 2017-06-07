package java_spring;

import java_assembler.Assembler;

public class TestMain {
	public static void main(String[] args){
		Assembler assembler = new Assembler();
		ChangePasswordService changePwdSvc = assembler.getChangePasswordService();
		changePwdSvc.changePassword("madvirus@madvirus.net", "1234", "newPwd");
	}
}
