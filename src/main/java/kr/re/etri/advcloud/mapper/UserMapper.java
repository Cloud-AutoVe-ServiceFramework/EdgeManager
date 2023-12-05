package kr.re.etri.advcloud.mapper;

import kr.re.etri.advcloud.model.UserInfoVO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper {
	
	int selectCount(UserInfoVO userInfoVO);
	
	List<UserInfoVO> selectList(UserInfoVO userInfoVO);
	
	UserInfoVO select(UserInfoVO userInfoVO);

	int insert(UserInfoVO userInfoVO);
	
	int update(UserInfoVO userInfoVO);
	
	int updatePassword(UserInfoVO userInfoVO);
	
	int updateManagedCount(UserInfoVO userInfoVO);
	
	int delete(UserInfoVO userInfoVO);

}
