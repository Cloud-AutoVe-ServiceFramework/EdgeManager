package kr.re.etri.advcloud.model;

import kr.re.etri.advcloud.common.annotation.Model;
import kr.re.etri.advcloud.common.base.BaseSearch;

@SuppressWarnings("serial")
@Model
public class EdgeMonitoringVO extends BaseSearch {
	
	private int message_serial = -1;	// 메시지 일련번호
	private String message_datetime;	// 메시지 발생일시
	private String edge_group_id;		// 엣지 그룹 ID
	private String edge_id;				// 엣지 ID
	private int error_cnt = -1;			// 에러 건수
	private String status_code;			// 상태 코드
	private int process_cnt = -1;		// 프로세스 개수
	private String cpu_usage;			// CPU 사용량(%)
	private String gpu_usage;			// GPU 사용량(%)
	private String ram_usage;			// RAM 사용량(%)
	private String hdd_usage;			// HDD 사용량(%)
	
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
	 * @return the error_cnt
	 */
	public int getError_cnt() {
		return error_cnt;
	}

	/**
	 * @param error_cnt the error_cnt to set
	 */
	public void setError_cnt(int error_cnt) {
		this.error_cnt = error_cnt;
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
	 * @return the process_cnt
	 */
	public int getProcess_cnt() {
		return process_cnt;
	}

	/**
	 * @param process_cnt the process_cnt to set
	 */
	public void setProcess_cnt(int process_cnt) {
		this.process_cnt = process_cnt;
	}

	/**
	 * @return the cpu_usage
	 */
	public String getCpu_usage() {
		return cpu_usage;
	}

	/**
	 * @param cpu_usage the cpu_usage to set
	 */
	public void setCpu_usage(String cpu_usage) {
		this.cpu_usage = cpu_usage;
	}

	/**
	 * @return the gpu_usage
	 */
	public String getGpu_usage() {
		return gpu_usage;
	}

	/**
	 * @param gpu_usage the gpu_usage to set
	 */
	public void setGpu_usage(String gpu_usage) {
		this.gpu_usage = gpu_usage;
	}

	/**
	 * @return the ram_usage
	 */
	public String getRam_usage() {
		return ram_usage;
	}

	/**
	 * @param ram_usage the ram_usage to set
	 */
	public void setRam_usage(String ram_usage) {
		this.ram_usage = ram_usage;
	}

	/**
	 * @return the hdd_usage
	 */
	public String getHdd_usage() {
		return hdd_usage;
	}

	/**
	 * @param hdd_usage the hdd_usage to set
	 */
	public void setHdd_usage(String hdd_usage) {
		this.hdd_usage = hdd_usage;
	}

}
