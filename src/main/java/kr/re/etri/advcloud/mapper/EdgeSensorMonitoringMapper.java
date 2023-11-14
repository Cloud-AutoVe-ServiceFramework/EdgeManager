package kr.re.etri.advcloud.mapper;

import java.util.List;

import kr.re.etri.advcloud.common.annotation.Mapper;
import kr.re.etri.advcloud.model.EdgeSensorMonitoringVO;

@Mapper("edgeSensorMonitoringMapper")
public interface EdgeSensorMonitoringMapper {
	
	int selectListCount(EdgeSensorMonitoringVO edgeSensorMonitoringVO);
	
	List<EdgeSensorMonitoringVO> selectList(EdgeSensorMonitoringVO edgeSensorMonitoringVO);

	EdgeSensorMonitoringVO select(EdgeSensorMonitoringVO edgeSensorMonitoringVO);

	int update(EdgeSensorMonitoringVO edgeSensorMonitoringVO);

	int insert(EdgeSensorMonitoringVO edgeSensorMonitoringVO);

	int delete(EdgeSensorMonitoringVO edgeSensorMonitoringVO);
	
}
