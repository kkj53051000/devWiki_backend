package com.devwiki.vo;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;

public class ResponseVo {

    @Enumerated(EnumType.STRING)
    private Status status;

    private String cause;

    public ResponseVo(Status status) {
        this.status = status;
    }

    public ResponseVo(Status status,String cause) {
        this.status = status;
        this.cause = cause;
    }
}
