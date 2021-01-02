package cn.jarkata.protocol.web;

import java.util.List;

public class BasePageResponse<T> extends BaseResponse {
    //分页参数
    private int pageNo;
    private int pageSize;
    private long totalCount;
    private List<T> data;

    public BasePageResponse() {
        super();
    }

    public BasePageResponse(BasePageRequest<?> request) {
        this(request.getPageNo(), request.getPageSize());
    }

    public BasePageResponse(int pageNo, int pageSize) {
        super();
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

    public long getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(long totalCount) {
        this.totalCount = totalCount;
    }

    public long getTotalPage() {
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

    @Override
    public String toString() {
        final StringBuffer buffer = new StringBuffer("BasePageResponse{");
        buffer.append(super.toString());
        buffer.append(", pageNo=").append(pageNo);
        buffer.append(", pageSize=").append(pageSize);
        buffer.append(", totalCount=").append(totalCount);
        buffer.append('}');
        return buffer.toString();
    }
}
