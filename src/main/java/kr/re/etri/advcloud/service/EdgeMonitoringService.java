package kr.re.etri.advcloud.service;

import java.util.List;

import kr.re.etri.advcloud.mapper.EdgeSensorMonitoringMapper;
import kr.re.etri.advcloud.model.EdgeSensorMonitoringVO;
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

    @Autowired
    private EdgeSensorMonitoringMapper edgeSensorMonitoringMapper;

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
            edgeMonitoringVO = edgeMonitoringMapper.select(edgeMonitoringVO);
            edgeMonitoringMapper.deleteSensor(edgeMonitoringVO);
			return edgeMonitoringMapper.delete(edgeMonitoringVO);	
		} catch (Exception e) {
			logger.error(e.getMessage(), e);
			throw e;
		}
	}

	public int deleteSearch(EdgeMonitoringVO edgeMonitoringVO) {
		try {

            EdgeSensorMonitoringVO edgeSensorMonitoringVO = new EdgeSensorMonitoringVO();
            edgeSensorMonitoringVO.setEdge_group_id(edgeMonitoringVO.getEdge_group_id());
            edgeSensorMonitoringVO.setEdge_id(edgeMonitoringVO.getEdge_id());
            edgeSensorMonitoringVO.setEndDate(edgeMonitoringVO.getEndDate());
            edgeSensorMonitoringVO.setStartDate(edgeMonitoringVO.getStartDate());

            edgeSensorMonitoringMapper.deleteSearch(edgeSensorMonitoringVO);
			return edgeMonitoringMapper.deleteSearch(edgeMonitoringVO);
		} catch (Exception e) {
			logger.error(e.getMessage(), e);
			throw e;
		}
	}

}
