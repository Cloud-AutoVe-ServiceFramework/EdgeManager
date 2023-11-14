package kr.re.etri.advcloud.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.re.etri.advcloud.mapper.EdgeSensorMonitoringMapper;
import kr.re.etri.advcloud.model.EdgeSensorMonitoringVO;

@Service
public class EdgeSensorMonitoringService {
	
	@Autowired
	private EdgeSensorMonitoringMapper edgeSensorMonitoringMapper;
	
	public int selectListCount (EdgeSensorMonitoringVO edgeSensorMonitoringVO) {
		return edgeSensorMonitoringMapper.selectListCount(edgeSensorMonitoringVO);
	}
	
	public List<EdgeSensorMonitoringVO> selectList(EdgeSensorMonitoringVO edgeSensorMonitoringVO) throws Exception {
		return edgeSensorMonitoringMapper.selectList(edgeSensorMonitoringVO);
	}

	public EdgeSensorMonitoringVO select(EdgeSensorMonitoringVO edgeSensorMonitoringVO) {
		return edgeSensorMonitoringMapper.select(edgeSensorMonitoringVO);
	}

	public int insert(EdgeSensorMonitoringVO edgeSensorMonitoringVO) throws Exception {
		return edgeSensorMonitoringMapper.insert(edgeSensorMonitoringVO);
	}

	public int update(EdgeSensorMonitoringVO edgeSensorMonitoringVO) {
		return edgeSensorMonitoringMapper.update(edgeSensorMonitoringVO);
	}

	public int delete(EdgeSensorMonitoringVO edgeSensorMonitoringVO) {
		return edgeSensorMonitoringMapper.delete(edgeSensorMonitoringVO);
	}
	
}
