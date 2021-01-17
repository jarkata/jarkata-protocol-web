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

    public int getPageSize() {
        return pageSize;
    }

    public long getTotalCount() {
        return totalCount;
    }

    public BasePageResponse<T> setPageNo(int pageNo) {
        this.pageNo = pageNo;
        return this;
    }

    public BasePageResponse<T> setPageSize(int pageSize) {
        this.pageSize = pageSize;
        return this;
    }

    public BasePageResponse<T> setTotalCount(long totalCount) {
        this.totalCount = totalCount;
        return this;
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

    public BasePageResponse<T> setData(List<T> data) {
        this.data = data;
        return this;
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
