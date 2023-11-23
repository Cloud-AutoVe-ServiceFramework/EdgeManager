package kr.re.etri.advcloud.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.re.etri.advcloud.mapper.EdgeMonitoringMapper;
import kr.re.etri.advcloud.model.EdgeMonitoringVO;

@Service
public class EdgeMonitoringService {

	private static final Logger logger = LoggerFactory.getLogger(EdgeMonitoringService.class);

	@Autowired
	private EdgeMonitoringMapper edgeMonitoringMapper;

	public int selectListCount(EdgeMonitoringVO edgeMonitoringVO) {
		try {
			return edgeMonitoringMapper.selectListCount(edgeMonitoringVO);
		} catch (Exception e) {
			logger.error(e.getMessage(), e);
			throw e;
		}
	}

	public List<EdgeMonitoringVO> selectList(EdgeMonitoringVO edgeMonitoringVO) {
		try {
			return edgeMonitoringMapper.selectList(edgeMonitoringVO);
		} catch (Exception e) {
			logger.error(e.getMessage(), e);
			throw e;
		}
	}

	public int selectErrCount(EdgeMonitoringVO edgeMonitoringVO) {
		try {
			return edgeMonitoringMapper.selectErrCount(edgeMonitoringVO);
		} catch (Exception e) {
			logger.error(e.getMessage(), e);
			throw e;
		}
	}

	public EdgeMonitoringVO select(EdgeMonitoringVO edgeMonitoringVO) {
		try {
			return edgeMonitoringMapper.select(edgeMonitoringVO);
		} catch (Exception e) {
			logger.error(e.getMessage(), e);
			throw e;
		}
	}

	public int insert(EdgeMonitoringVO edgeMonitoringVO) {
		try {
			return edgeMonitoringMapper.insert(edgeMonitoringVO);
		} catch (Exception e) {
			logger.error(e.getMessage(), e);
			throw e;
		}
	}

	public int update(EdgeMonitoringVO edgeMonitoringVO) {
		try {
			return edgeMonitoringMapper.update(edgeMonitoringVO);
		} catch (Exception e) {
			logger.error(e.getMessage(), e);
			throw e;
		}
	}

	public int delete(EdgeMonitoringVO edgeMonitoringVO) {
		try {
			return edgeMonitoringMapper.delete(edgeMonitoringVO);	
		} catch (Exception e) {
			logger.error(e.getMessage(), e);
			throw e;
		}
	}

	public int deleteSearch(EdgeMonitoringVO edgeMonitoringVO) {
		try {
			return edgeMonitoringMapper.deleteSearch(edgeMonitoringVO);
		} catch (Exception e) {
			logger.error(e.getMessage(), e);
			throw e;
		}
	}

}
