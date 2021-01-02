package cn.jarkata.protocol.web;

import org.junit.Assert;
import org.junit.Test;

public class BasePageResponseTest {

    @org.junit.Test
    public void getTotalPage() {
        BasePageResponse<Object> data = new BasePageResponse<Object>();
        data.setPageSize(100);
        data.setTotalCount(10);
        long totalPage = data.getTotalPage();
        Assert.assertEquals(totalPage, 1);
    }

    @Test
    public void getTotalPage_TotalCountZero() {
        BasePageResponse<Object> data = new BasePageResponse<Object>();
        data.setPageSize(100);
        data.setTotalCount(0);
        long totalPage = data.getTotalPage();
        Assert.assertEquals(totalPage, 0);
    }

    @Test
    public void getTotalPage_TotalCount210() {
        BasePageResponse<Object> data = new BasePageResponse<Object>();
        data.setPageSize(100);
        data.setTotalCount(210);
        long totalPage = data.getTotalPage();
        Assert.assertEquals(totalPage, 3);
    }

    @Test
    public void getTotalPage_PageSizeZero() {
        BasePageResponse<Object> data = new BasePageResponse<Object>();
        data.setPageSize(0);
        long totalPage = data.getTotalPage();
        Assert.assertEquals(totalPage, 0);
    }

}