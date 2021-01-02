package cn.jarkata.protocol.web;

import java.io.Serializable;

/**
 * 分页请求
 */
public class BasePageRequest implements Serializable {

    private int pageNo;
    private int pageSize;

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
}
