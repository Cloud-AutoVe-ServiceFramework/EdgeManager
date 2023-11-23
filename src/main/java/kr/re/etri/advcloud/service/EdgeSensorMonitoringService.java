package kr.re.etri.advcloud.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.re.etri.advcloud.mapper.EdgeSensorMonitoringMapper;
import kr.re.etri.advcloud.model.EdgeSensorMonitoringVO;

@Service
public class EdgeSensorMonitoringService {

	private static final Logger logger = LoggerFactory.getLogger(EdgeSensorMonitoringService.class);

	@Autowired
	private EdgeSensorMonitoringMapper edgeSensorMonitoringMapper;

	public int selectListCount(EdgeSensorMonitoringVO edgeSensorMonitoringVO) {
		try {
			return edgeSensorMonitoringMapper.selectListCount(edgeSensorMonitoringVO);
		} catch (Exception e) {
			logger.error(e.getMessage(), e);
			throw e;
		}
	}

	public List<EdgeSensorMonitoringVO> selectList(EdgeSensorMonitoringVO edgeSensorMonitoringVO) {
		try {
			return edgeSensorMonitoringMapper.selectList(edgeSensorMonitoringVO);
		} catch (Exception e) {
			logger.error(e.getMessage(), e);
			throw e;
		}
	}

	public EdgeSensorMonitoringVO select(EdgeSensorMonitoringVO edgeSensorMonitoringVO) {
		try {
			return edgeSensorMonitoringMapper.select(edgeSensorMonitoringVO);
		} catch (Exception e) {
			logger.error(e.getMessage(), e);
			throw e;
		}
	}

	public int insert(EdgeSensorMonitoringVO edgeSensorMonitoringVO) {
		try {
			return edgeSensorMonitoringMapper.insert(edgeSensorMonitoringVO);
		} catch (Exception e) {
			logger.error(e.getMessage(), e);
			throw e;
		}
	}

	public int update(EdgeSensorMonitoringVO edgeSensorMonitoringVO) {
		try {
			return edgeSensorMonitoringMapper.update(edgeSensorMonitoringVO);
		} catch (Exception e) {
			logger.error(e.getMessage(), e);
			throw e;
		}
	}

	public int delete(EdgeSensorMonitoringVO edgeSensorMonitoringVO) {
		try {
			return edgeSensorMonitoringMapper.delete(edgeSensorMonitoringVO);
		} catch (Exception e) {
			logger.error(e.getMessage(), e);
			throw e;
		}
	}

	public int selectErrCount(EdgeSensorMonitoringVO edgeSensorMonitoringVO) {
		try {
			return edgeSensorMonitoringMapper.selectErrCount(edgeSensorMonitoringVO);
		} catch (Exception e) {
			logger.error(e.getMessage(), e);
			throw e;
		}
	}

	public List<EdgeSensorMonitoringVO> selectDeviceList(EdgeSensorMonitoringVO edgeSensorMonitoringVO) {
		try {
			return edgeSensorMonitoringMapper.selectDeviceList(edgeSensorMonitoringVO);
		} catch (Exception e) {
			logger.error(e.getMessage(), e);
			throw e;
		}
	}

}
