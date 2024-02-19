package com.myblog.blogapp.payload;

import java.util.Date;

public class ErrorDetails {
    private Date timestamp;
    private String messsage;
    private String details;


    public ErrorDetails(Date timestamp, String messsage, String details) {
        this.timestamp = timestamp;
        this.messsage = messsage;
        this.details = details;
    }
}
