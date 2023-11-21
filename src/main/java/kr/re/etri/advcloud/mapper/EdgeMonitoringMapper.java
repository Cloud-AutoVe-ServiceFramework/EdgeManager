package kr.re.etri.advcloud.mapper;

import java.util.List;

import kr.re.etri.advcloud.common.annotation.Mapper;
import kr.re.etri.advcloud.model.EdgeMonitoringVO;

@Mapper("edgeMonitoringMapper")
public interface EdgeMonitoringMapper {
	
	int selectListCount(EdgeMonitoringVO edgeMonitoringVO);
	
	List<EdgeMonitoringVO> selectList(EdgeMonitoringVO edgeMonitoringVO);

	EdgeMonitoringVO select(EdgeMonitoringVO edgeMonitoringVO);

	int update(EdgeMonitoringVO edgeMonitoringVO);

	int insert(EdgeMonitoringVO edgeMonitoringVO);

	int delete(EdgeMonitoringVO edgeMonitoringVO);

    int deleteSearch(EdgeMonitoringVO edgeMonitoringVO);

    int selectErrCount(EdgeMonitoringVO edgeMonitoringVO);

}
