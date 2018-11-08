package springcloud.helloworld.service;

import java.util.List;

import springcloud.helloworld.model.TUser;

public interface TUserService {

	public List<TUser> getUserList(String id,String name,String gender);

}
