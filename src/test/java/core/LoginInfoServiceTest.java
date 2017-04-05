package core;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.ijoy.service.ILoginInfoService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:spring-context.xml")
public class LoginInfoServiceTest {
	@Autowired
	private ILoginInfoService loginInfoServiceImpl; 
	@Test
	public  void demoTest(){
		
		String code = loginInfoServiceImpl.getCodeByCellPhone("123");
		System.out.println(code);
	}
	
	@Test
	public  void loginByPhoneAndCodeTest(){
		
		String code = loginInfoServiceImpl.loginByPhoneAndCode("123", "2015");
		System.out.println(code);
	}
}




