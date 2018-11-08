package springcloud.helloworld.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import springcloud.helloworld.model.TUser;
import springcloud.helloworld.service.TUserService;

@RestController
public class HelloWorldController {

	private TUserService tUserService;

	public TUserService gettUserService() {
		return tUserService;
	}

	@Autowired
	public void settUserService(TUserService tUserService) {
		this.tUserService = tUserService;
	}

	@RequestMapping("/getUserList")
	public List<TUser> getUserList(String id, String name, String gender) {
		return tUserService.getUserList(id, name, gender);
	}

}
