package com.xiaoyuan.hloli.bean;

import java.io.Serializable;
import java.util.List;

/**
 * Created by yzc on 2017/3/17.
 */

public class LoginEntity implements Serializable {


    /**
     * success : true
     * rows : []
     * data : {"returnUrl":null,"wechatBind":"false"}
     * message : null
     * total : 0
     * backUrl : null
     * footer : []
     */

    private boolean success;
    private DataBean data;
    private String message;
    private int total;
    private Object backUrl;
    private List<String> rows;
    private List<String> footer;

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public Object getBackUrl() {
        return backUrl;
    }

    public void setBackUrl(Object backUrl) {
        this.backUrl = backUrl;
    }

    public List<?> getRows() {
        return rows;
    }

    public void setRows(List<String> rows) {
        this.rows = rows;
    }

    public List<String> getFooter() {
        return footer;
    }

    public void setFooter(List<String> footer) {
        this.footer = footer;
    }

    public static class DataBean implements Serializable {
        /**
         * returnUrl : null
         * wechatBind : false
         */

        private Object returnUrl;
        private String wechatBind;

        public Object getReturnUrl() {
            return returnUrl;
        }

        public void setReturnUrl(Object returnUrl) {
            this.returnUrl = returnUrl;
        }

        public String getWechatBind() {
            return wechatBind;
        }

        public void setWechatBind(String wechatBind) {
            this.wechatBind = wechatBind;
        }
    }
}
