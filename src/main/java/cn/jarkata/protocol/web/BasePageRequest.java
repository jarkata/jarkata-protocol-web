package cn.jarkata.protocol.web;

/**
 * 分页请求
 */
public final class BasePageRequest<T> extends BaseRequest<T> {

    private int pageNo;
    private int pageSize;

    public BasePageRequest() {
    }

    public BasePageRequest(int pageNo, int pageSize) {
        this.pageNo = pageNo;
        this.pageSize = pageSize;
    }

    public static <R> BasePageRequest<R> newRequest(BasePageRequest<?> pageRequest) {
        return new BasePageRequest<>(pageRequest.getPageNo(), pageRequest.getPageSize());
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

    @Override
    public String toString() {
        final StringBuffer buffer = new StringBuffer("BasePageRequest{");
        buffer.append(super.toString());
        buffer.append(", pageNo=").append(pageNo);
        buffer.append(", pageSize=").append(pageSize);
        buffer.append('}');
        return buffer.toString();
    }
}
