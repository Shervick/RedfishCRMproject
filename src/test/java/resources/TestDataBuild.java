package resources;

import pojo.loginWebApp;

public class TestDataBuild {
	public loginWebApp loginwebapp(String UserName,String Password,String application) {
		
		loginWebApp logininfo=new loginWebApp();
		logininfo.setUserName(UserName);
		logininfo.setPassword(Password);
		logininfo.setApplication(application);
		return logininfo;
		
	}

}
