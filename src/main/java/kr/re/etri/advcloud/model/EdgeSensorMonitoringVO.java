package kr.re.etri.advcloud.model;

import kr.re.etri.advcloud.common.annotation.Model;
import kr.re.etri.advcloud.common.base.BaseSearch;

@SuppressWarnings("serial")
@Model
public class EdgeSensorMonitoringVO extends BaseSearch {
	
	private int message_serial = -1;	// 메시지 일련번호
	private String message_datetime;	// 메시지 발생일시
	private String edge_group_id;		// 엣지 그룹 ID
	private String edge_id;				// 엣지 ID
	private String device_id;			// 디바이스 ID
	private String status_code;			// 상태 코드
	private String coverage;			// 커버리지
	
	/**
	 * @return the message_serial
	 */
	public int getMessage_serial() {
		return message_serial;
	}

	/**
	 * @param message_serial the message_serial to set
	 */
	public void setMessage_serial(int message_serial) {
		this.message_serial = message_serial;
	}
	
	/**
	 * @return the message_datetime
	 */
	public String getMessage_datetime() {
		return message_datetime;
	}

	/**
	 * @param message_datetime the message_datetime to set
	 */
	public void setMessage_datetime(String message_datetime) {
		this.message_datetime = message_datetime;
	}

	/**
	 * @return the edge_group_id
	 */
	public String getEdge_group_id() {
		return edge_group_id;
	}

	/**
	 * @param edge_group_id the edge_group_id to set
	 */
	public void setEdge_group_id(String edge_group_id) {
		this.edge_group_id = edge_group_id;
	}

	/**
	 * @return the edge_id
	 */
	public String getEdge_id() {
		return edge_id;
	}

	/**
	 * @param edge_id the edge_id to set
	 */
	public void setEdge_id(String edge_id) {
		this.edge_id = edge_id;
	}

	/**
	 * @return the device_id
	 */
	public String getDevice_id() {
		return device_id;
	}

	/**
	 * @param device_id the device_id to set
	 */
	public void setDevice_id(String device_id) {
		this.device_id = device_id;
	}

	/**
	 * @return the status_code
	 */
	public String getStatus_code() {
		return status_code;
	}

	/**
	 * @param status_code the status_code to set
	 */
	public void setStatus_code(String status_code) {
		this.status_code = status_code;
	}

	/**
	 * @return the coverage
	 */
	public String getCoverage() {
		return coverage;
	}

	/**
	 * @param coverage the coverage to set
	 */
	public void setCoverage(String coverage) {
		this.coverage = coverage;
	}

}
