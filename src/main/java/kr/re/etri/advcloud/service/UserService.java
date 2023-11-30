package kr.re.etri.advcloud.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.re.etri.advcloud.mapper.UserMapper;
import kr.re.etri.advcloud.model.UserInfoVO;

@Service
public class UserService {
	
	private static final Logger logger = LoggerFactory.getLogger(UserService.class);
	
	@Autowired
	private UserMapper userMapper;
	
	
	public int selectCount(UserInfoVO userInfoVO) {
		try {
			return userMapper.selectCount(userInfoVO);
		} catch (Exception e) {
			logger.error(e.getMessage(), e);
			throw e;
		}
	}
	
	public List<UserInfoVO> selectList(UserInfoVO userInfoVO) {
		try {
			return userMapper.selectList(userInfoVO);
		} catch (Exception e) {
			logger.error(e.getMessage(), e);
			throw e;
		}
	}
	
	public UserInfoVO select(String id) {
		try {
			UserInfoVO userInfoVO = new UserInfoVO();
			userInfoVO.setId(id);
			
			return select(userInfoVO);
		} catch (Exception e) {
			logger.error(e.getMessage(), e);
			throw e;
		}
	}
	
	public UserInfoVO select(String id, String name)  {
		try {
			UserInfoVO userInfoVO = new UserInfoVO();
			userInfoVO.setId(id);
			userInfoVO.setName(name);
			
			return select(userInfoVO);
		} catch (Exception e) {
			logger.error(e.getMessage(), e);
			throw e;
		}
	}
	
	public UserInfoVO select(UserInfoVO userInfoVO) {
		try {
			return userMapper.select(userInfoVO);
		} catch (Exception e) {
			logger.error(e.getMessage(), e);
			throw e;
		}
	}
	
	public int insert(UserInfoVO userInfoVO) {
		try {
			return userMapper.insert(userInfoVO);
		} catch (Exception e) {
			logger.error(e.getMessage(), e);
			throw e;
		}
	}
	
	public int update(UserInfoVO userInfoVO) {
		try {
			return userMapper.update(userInfoVO);
		} catch (Exception e) {
			logger.error(e.getMessage(), e);
			throw e;
		}
	}
	
	public int updatePassword(UserInfoVO userInfoVO) {
		try {
			return userMapper.updatePassword(userInfoVO);
		} catch (Exception e) {
			logger.error(e.getMessage(), e);
			throw e;
		}
	}
	
	public int updateManagedCount(UserInfoVO userInfoVO) {
		try {
			return userMapper.updateManagedCount(userInfoVO);
		} catch (Exception e) {
			logger.error(e.getMessage(), e);
			throw e;
		}
	}

	public int delete(UserInfoVO userInfoVO) {
		try {
			return userMapper.delete(userInfoVO);
		} catch (Exception e) {
			logger.error(e.getMessage(), e);
			throw e;
		}
	}

}

