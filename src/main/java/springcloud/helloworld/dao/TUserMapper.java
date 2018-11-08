package springcloud.helloworld.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import springcloud.helloworld.model.TUser;
import springcloud.helloworld.model.TUserExample;

public interface TUserMapper {
    long countByExample(TUserExample example);

    int deleteByExample(TUserExample example);

    int insert(TUser record);

    int insertSelective(TUser record);

    List<TUser> selectByExample(TUserExample example);

    int updateByExampleSelective(@Param("record") TUser record, @Param("example") TUserExample example);

    int updateByExample(@Param("record") TUser record, @Param("example") TUserExample example);

    void insertBatch(List<TUser> recordLst);
}