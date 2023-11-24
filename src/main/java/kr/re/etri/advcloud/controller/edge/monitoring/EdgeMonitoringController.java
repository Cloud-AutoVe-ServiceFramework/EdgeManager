package kr.re.etri.advcloud.controller.edge.monitoring;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kr.re.etri.advcloud.controller.ApiResponseMessage;
import kr.re.etri.advcloud.controller.CommonController;
import kr.re.etri.advcloud.model.EdgeMonitoringVO;
import kr.re.etri.advcloud.service.EdgeMonitoringService;

@RestController
@RequestMapping("/api/datamanager/edge-monitoring")
public class EdgeMonitoringController extends CommonController {

    @Autowired
    private EdgeMonitoringService edgeMonitoringService;

    @GetMapping("/count")
    public ResponseEntity<?> count(EdgeMonitoringVO edgeMonitoringVO) {
        logger.info("EdgeMonitoringController count invoked...");

        super.param = edgeMonitoringVO;

        ApiResponseMessage response = null;
        try {
            response = responseSuccess(edgeMonitoringService.selectListCount(edgeMonitoringVO));
        } catch (Exception e) {
            response = responseError(e.getMessage());
        }

        return ResponseEntity.ok(response);
    }

    @GetMapping("/search")
    public ResponseEntity<?> search(EdgeMonitoringVO edgeMonitoringVO) {
        logger.info("EdgeMonitoringController search invoked...");

        super.param = edgeMonitoringVO;

        ApiResponseMessage response = null;
        try {
            response = responseSuccess(edgeMonitoringService.selectList(edgeMonitoringVO));
        } catch (Exception e) {
            response = responseError(e.getMessage());
        }

        return ResponseEntity.ok(response);
    }

    @PostMapping("/add")
    public ResponseEntity<?> add(@RequestBody EdgeMonitoringVO edgeMonitoringVO) {
        logger.info("EdgeMonitoringController add invoked...");

        super.param = edgeMonitoringVO;

        ApiResponseMessage response = null;
        try {
            if (edgeMonitoringVO.getEdge_group_id() == null || edgeMonitoringVO.getEdge_id() == null
                    || edgeMonitoringVO.getMessage_datetime() == null) {
                return ResponseEntity.badRequest().build();
            }

            // insert
            edgeMonitoringService.insert(edgeMonitoringVO);
            response = responseSuccess();
        } catch (Exception e) {
            response = responseError(e.getMessage());
        }

        return ResponseEntity.ok(response);
    }

    @PutMapping("/update")
    public ResponseEntity<?> update(@RequestBody EdgeMonitoringVO edgeMonitoringVO) {
        logger.info("EdgeMonitoringController update invoked...");

        super.param = edgeMonitoringVO;

        ApiResponseMessage response = null;
        try {
            if (edgeMonitoringVO.getMessage_serial() == -1) {
                return ResponseEntity.badRequest().build();
            }

            // update
            edgeMonitoringService.update(edgeMonitoringVO);
            response = responseSuccess();
        } catch (Exception e) {
            response = responseError(e.getMessage());
        }

        return ResponseEntity.ok(response);
    }

    @PostMapping(value = "/delete")
    public ResponseEntity<?> delete(@RequestBody EdgeMonitoringVO edgeMonitoringVO) {
        logger.info("EdgeMonitoringController delete invoked...");

        super.param = edgeMonitoringVO;

        ApiResponseMessage response = null;
        try {
            if (edgeMonitoringVO.getMessage_serial() == -1) {
                return ResponseEntity.badRequest().build();
            }

            // delete
            edgeMonitoringService.delete(edgeMonitoringVO);
            response = responseSuccess();
        } catch (Exception e) {
            response = responseError(e.getMessage());
        }

        return ResponseEntity.ok(response);
    }

    @PostMapping(value = "/deleteSearch")
    public ResponseEntity<?> deleteSearch(@RequestBody EdgeMonitoringVO edgeMonitoringVO) {
        logger.info("EdgeMonitoringController deleteSearch invoked...");

        super.param = edgeMonitoringVO;

        ApiResponseMessage response = null;
        try {
            if (StringUtils.isEmpty(edgeMonitoringVO.getStartDate()) && StringUtils.isEmpty(edgeMonitoringVO.getEndDate())) {
                return ResponseEntity.badRequest().build();
            }

            edgeMonitoringService.deleteSearch(edgeMonitoringVO);
            response = responseSuccess();
        } catch (Exception e) {
            response = responseError(e.getMessage());
        }

        return ResponseEntity.ok(response);
    }

    @GetMapping("/errCount")
    public ResponseEntity<?> errCount(EdgeMonitoringVO edgeMonitoringVO) {
        logger.info("EdgeMonitoringController errCount invoked...");

        super.param = edgeMonitoringVO;

        ApiResponseMessage response = null;
        try {
            response = responseSuccess(edgeMonitoringService.selectErrCount(edgeMonitoringVO));
        } catch (Exception e) {
            response = responseError(e.getMessage());
        }

        return ResponseEntity.ok(response);
    }

}
