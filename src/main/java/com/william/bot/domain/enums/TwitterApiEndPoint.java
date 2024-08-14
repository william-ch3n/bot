package com.william.bot.domain.enums;

public enum TwitterApiEndPoint {

    CREATE_TWEET("https://api.twitter.com/2/tweets");

    private final String endPoint;

    TwitterApiEndPoint(String endPoint){
        this.endPoint = endPoint;
    }

    public String getEndPoint(){
        return this.endPoint;
    }

}
