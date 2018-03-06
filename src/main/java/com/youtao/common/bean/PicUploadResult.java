package com.youtao.common.bean;

/**
 * @title: PicUploadResult
 * @description: 图片上传结果实体
 * @Copyright: Copyright (c) 2018
 * @Company: lgxkdream.github.io
 * @author gang.li
 * @version 1.0.0
 * @since 2018年2月28日 上午10:30:01
 */
public class PicUploadResult {
    
    private Integer error;
    
    private String url;
    
    private String width;
    
    private String height;

    public Integer getError() {
        return error;
    }

    public void setError(Integer error) {
        this.error = error;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getWidth() {
        return width;
    }

    public void setWidth(String width) {
        this.width = width;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

}
