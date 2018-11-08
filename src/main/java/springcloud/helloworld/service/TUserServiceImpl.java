package springcloud.helloworld.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import springcloud.helloworld.dao.TUserMapper;
import springcloud.helloworld.model.TUser;
import springcloud.helloworld.model.TUserExample;
import springcloud.helloworld.util.MyStringUtils;

@Service("tUserService")
public class TUserServiceImpl implements TUserService {

	private TUserMapper tUserMapper;
	
	public TUserMapper gettUserMapper() {
		return tUserMapper;
	}

	@Autowired
	public void settUserMapper(TUserMapper tUserMapper) {
		this.tUserMapper = tUserMapper;
	}

	@Override
	public List<TUser> getUserList(String id, String name, String gender) {
		TUserExample example = new TUserExample();
		TUserExample.Criteria criteria = example.createCriteria();
		if (MyStringUtils.isNotBlank(id)) {
			criteria.andIdEqualTo(Short.parseShort(id));
		}
		if (MyStringUtils.isNotBlank(name)) {
			criteria.andNameEqualTo(name);
		}
		if (MyStringUtils.isNotBlank(gender)) {
			criteria.andGenderEqualTo(gender);
		}
		return tUserMapper.selectByExample(example);
	}

}
