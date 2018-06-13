package com.vrv.vo;

/**
 * 返回状态实体类
 * @author wale
 *
 */
public class Status {
    
    /** 返回状态码 */
    private String resCode;
    
    /** 返回状态信息描述 */
    private String resMsg;
    
    /** 返回内容 */
    private Object resContent;

    public String getResCode() {
        return resCode;
    }

    public void setResCode(String resCode) {
        this.resCode = resCode;
    }

    public String getResMsg() {
        return resMsg;
    }

    public void setResMsg(String resMsg) {
        this.resMsg = resMsg;
    }

    public Object getResContent() {
        return resContent;
    }

    public void setResContent(Object resContent) {
        this.resContent = resContent;
    }
    

}
