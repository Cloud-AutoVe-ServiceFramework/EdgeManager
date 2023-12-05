package kr.re.etri.advcloud.mapper;

import kr.re.etri.advcloud.model.EdgeMonitoringVO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface EdgeMonitoringMapper {
	
	int selectListCount(EdgeMonitoringVO edgeMonitoringVO);
	
	List<EdgeMonitoringVO> selectList(EdgeMonitoringVO edgeMonitoringVO);

	EdgeMonitoringVO select(EdgeMonitoringVO edgeMonitoringVO);

	int update(EdgeMonitoringVO edgeMonitoringVO);

	int insert(EdgeMonitoringVO edgeMonitoringVO);

	int delete(EdgeMonitoringVO edgeMonitoringVO);

    int deleteSearch(EdgeMonitoringVO edgeMonitoringVO);

    int selectErrCount(EdgeMonitoringVO edgeMonitoringVO);

    int deleteSensor(EdgeMonitoringVO edgeMonitoringVO);
}
