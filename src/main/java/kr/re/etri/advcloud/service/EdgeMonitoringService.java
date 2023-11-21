package kr.re.etri.advcloud.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.re.etri.advcloud.mapper.EdgeMonitoringMapper;
import kr.re.etri.advcloud.model.EdgeMonitoringVO;

@Service
public class EdgeMonitoringService {

    @Autowired
    private EdgeMonitoringMapper edgeMonitoringMapper;

    public int selectListCount(EdgeMonitoringVO edgeMonitoringVO) {
        return edgeMonitoringMapper.selectListCount(edgeMonitoringVO);
    }

    public List<EdgeMonitoringVO> selectList(EdgeMonitoringVO edgeMonitoringVO) {
        return edgeMonitoringMapper.selectList(edgeMonitoringVO);
    }

    public int selectErrCount(EdgeMonitoringVO edgeMonitoringVO) {
        return edgeMonitoringMapper.selectErrCount(edgeMonitoringVO);
    }

    public EdgeMonitoringVO select(EdgeMonitoringVO edgeMonitoringVO) {
        return edgeMonitoringMapper.select(edgeMonitoringVO);
    }

    public int insert(EdgeMonitoringVO edgeMonitoringVO) {
        return edgeMonitoringMapper.insert(edgeMonitoringVO);
    }

    public int update(EdgeMonitoringVO edgeMonitoringVO) {
        return edgeMonitoringMapper.update(edgeMonitoringVO);
    }

    public int delete(EdgeMonitoringVO edgeMonitoringVO) {
        return edgeMonitoringMapper.delete(edgeMonitoringVO);
    }

    public int deleteSearch(EdgeMonitoringVO edgeMonitoringVO) {
        return edgeMonitoringMapper.deleteSearch(edgeMonitoringVO);
    }

}
