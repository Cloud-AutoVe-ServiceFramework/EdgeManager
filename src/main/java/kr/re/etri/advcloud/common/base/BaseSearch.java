package kr.re.etri.advcloud.common.base;

@SuppressWarnings("serial")
public class BaseSearch extends BaseObject {
	
	protected int FIRST_PAGE = 1;
	protected int PAGE_SIZE = 10;

	protected Integer pageNum;
	protected Integer pageSize;
	
	private String startDate;
	private String endDate;
    private String order;
    
    protected String searchType;
	protected String searchText;
    private String searchErr;

	/**
	 * @return the pageNum
	 */
	public Integer getPageNum() {
		if (pageNum == null) {
			pageNum = FIRST_PAGE;
		}
		return pageNum;
	}

	/**
	 * @param pageNum the pageNum to set
	 */
	public void setPageNum(Integer pageNum) {
		this.pageNum = pageNum;
	}

	/**
	 * @return the pageSize
	 */
	public Integer getPageSize() {
		if (pageSize == null) {
			pageSize = PAGE_SIZE;
		}
		return pageSize;
	}

	/**
	 * @param pageSize the pageSize to set
	 */
	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}
	
	public int getPageOffset() {
		return (getPageNum() - 1) * getPageSize(); // 시작 레코드 번호
	}
	
	// 오라클용
	public int getPageStartOffset() {
		return (getPageNum() - 1) * getPageSize() + 1; // 시작 레코드 번호
	}
	
	// 오라클용
	public int getPageEndOffset() {
		return getPageNum() * getPageSize(); // 끝 레코드 번호
	}

	/**
	 * @return the startDate
	 */
	public String getStartDate() {
		return startDate;
	}

	/**
	 * @param startDate
	 *            the startDate to set
	 */
	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	/**
	 * @return the endDate
	 */
	public String getEndDate() {
		return endDate;
	}

	/**
	 * @param endDate
	 *            the endDate to set
	 */
	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}

    public String getOrder() {
        return order;
    }

    public void setOrder(String order) {
        this.order = order;
    }
    
    /**
	 * @return the searchType
	 */
	public String getSearchType() {
		return searchType;
	}

	/**
	 * @param searchType the searchType to set
	 */
	public void setSearchType(String searchType) {
		this.searchType = searchType;
	}

	/**
	 * @return the searchText
	 */
	public String getSearchText() {
		return searchText;
	}

	/**
	 * @param searchText the searchText to set
	 */
	public void setSearchText(String searchText) {
		this.searchText = searchText;
	}

    public String getSearchErr() {
        return searchErr;
    }

    public void setSearchErr(String searchErr) {
        this.searchErr = searchErr;
    }
}
