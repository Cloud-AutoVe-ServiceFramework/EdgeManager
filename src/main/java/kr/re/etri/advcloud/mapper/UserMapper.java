package kr.re.etri.advcloud.mapper;

import java.util.List;

import kr.re.etri.advcloud.common.annotation.Mapper;
import kr.re.etri.advcloud.model.UserInfoVO;

@Mapper("userMapper")
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
