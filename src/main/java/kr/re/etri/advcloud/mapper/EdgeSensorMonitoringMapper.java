package kr.re.etri.advcloud.mapper;

import kr.re.etri.advcloud.model.EdgeSensorMonitoringVO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface EdgeSensorMonitoringMapper {
	
	int selectListCount(EdgeSensorMonitoringVO edgeSensorMonitoringVO);
	
	List<EdgeSensorMonitoringVO> selectList(EdgeSensorMonitoringVO edgeSensorMonitoringVO);

	EdgeSensorMonitoringVO select(EdgeSensorMonitoringVO edgeSensorMonitoringVO);

	int update(EdgeSensorMonitoringVO edgeSensorMonitoringVO);

	int insert(EdgeSensorMonitoringVO edgeSensorMonitoringVO);

	int delete(EdgeSensorMonitoringVO edgeSensorMonitoringVO);

    int selectErrCount(EdgeSensorMonitoringVO edgeSensorMonitoringVO);

    List<EdgeSensorMonitoringVO> selectDeviceList(EdgeSensorMonitoringVO edgeSensorMonitoringVO);

    int deleteSearch(EdgeSensorMonitoringVO edgeSensorMonitoringVO);

}
