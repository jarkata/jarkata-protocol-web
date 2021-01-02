package cn.jarkata.protocol.web;

import java.util.List;

public class BasePageResponse<T> extends BaseResponse {
    //分页参数
    private int pageNo;
    private int pageSize;
    private int totalCount;
    private List<T> data;

    public BasePageResponse() {
        super();
    }

    public BasePageResponse(BasePageRequest<?> request) {
        this.pageNo = request.getPageNo();
        this.pageSize = request.getPageSize();
    }

    public BasePageResponse(int pageNo, int pageSize) {
        this.pageNo = pageNo;
        this.pageSize = pageSize;
    }

    public int getPageNo() {
        return pageNo;
    }

    public void setPageNo(int pageNo) {
        this.pageNo = pageNo;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public int getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(int totalCount) {
        this.totalCount = totalCount;
    }

    public int getTotalPage() {
        if (pageSize <= 0) {
            return 0;
        }
        if (totalCount <= 0) {
            return 0;
        }
        return totalCount / pageSize + 1;
    }

    public List<T> getData() {
        return data;
    }

    public void setData(List<T> data) {
        this.data = data;
    }
}
