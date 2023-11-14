package kr.re.etri.advcloud.controller.edge.monitoring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kr.re.etri.advcloud.controller.ApiResponseMessage;
import kr.re.etri.advcloud.controller.CommonController;
import kr.re.etri.advcloud.model.EdgeSensorMonitoringVO;
import kr.re.etri.advcloud.service.EdgeSensorMonitoringService;

@RestController
@RequestMapping("/api/datamanager/edge-sensor-monitoring")
public class EdgeSensorMonitoringController extends CommonController {
	
	@Autowired
	private EdgeSensorMonitoringService edgeSensorMonitoringService;
	
	@GetMapping("/count")
	public ResponseEntity<?> count(EdgeSensorMonitoringVO edgeSensorMonitoringVO) {
		logger.info("EdgeSensorMonitoringController count invoked...");
		
		super.param = edgeSensorMonitoringVO;

		ApiResponseMessage response = null;
		try {
			response = responseSuccess(edgeSensorMonitoringService.selectListCount(edgeSensorMonitoringVO));
		} catch (Exception e) {
			response = responseError(e.getMessage());
		}

		return ResponseEntity.ok(response);
	}
	
	@GetMapping("/search")
	public ResponseEntity<?> search(EdgeSensorMonitoringVO edgeSensorMonitoringVO) {
		logger.info("EdgeSensorMonitoringController search invoked...");
		
		super.param = edgeSensorMonitoringVO;

		ApiResponseMessage response = null;
		try {
			response = responseSuccess(edgeSensorMonitoringService.selectList(edgeSensorMonitoringVO));
		} catch (Exception e) {
			response = responseError(e.getMessage());
		}

		return ResponseEntity.ok(response);
	}

	@PostMapping("/add")
	public ResponseEntity<?> add(@RequestBody EdgeSensorMonitoringVO edgeSensorMonitoringVO) {
		logger.info("EdgeSensorMonitoringController add invoked...");

		super.param = edgeSensorMonitoringVO;

		ApiResponseMessage response = null;
		try {
			if (edgeSensorMonitoringVO.getEdge_group_id() == null || edgeSensorMonitoringVO.getEdge_id() == null
					|| edgeSensorMonitoringVO.getDevice_id() == null
					|| edgeSensorMonitoringVO.getMessage_datetime() == null) {
				return ResponseEntity.badRequest().build();
			}

			// insert
			edgeSensorMonitoringService.insert(edgeSensorMonitoringVO);
			response = responseSuccess();
		} catch (Exception e) {
			response = responseError(e.getMessage());
		}

		return ResponseEntity.ok(response);
	}

	@PutMapping("/update")
	public ResponseEntity<?> update(@RequestBody EdgeSensorMonitoringVO edgeSensorMonitoringVO) {
		logger.info("EdgeSensorMonitoringController update invoked...");
		
		super.param = edgeSensorMonitoringVO;

		ApiResponseMessage response = null;
		try {
			if (edgeSensorMonitoringVO.getMessage_serial() == -1) {
				return ResponseEntity.badRequest().build();
			}

			// update
			edgeSensorMonitoringService.update(edgeSensorMonitoringVO);
			response = responseSuccess();
		} catch (Exception e) {
			response = responseError(e.getMessage());
		}

		return ResponseEntity.ok(response);
	}

	@DeleteMapping(value = "/delete")
	public ResponseEntity<?> delete(@RequestBody EdgeSensorMonitoringVO edgeSensorMonitoringVO) {
		logger.info("EdgeSensorMonitoringController delete invoked...");
		
		super.param = edgeSensorMonitoringVO;

		ApiResponseMessage response = null;
		try {
			if (edgeSensorMonitoringVO.getMessage_serial() == -1) {
				return ResponseEntity.badRequest().build();
			}
			
			// delete
			edgeSensorMonitoringService.delete(edgeSensorMonitoringVO);
			response = responseSuccess();
		} catch (Exception e) {
			response = responseError(e.getMessage());
		}

		return ResponseEntity.ok(response);
	}
	
}
