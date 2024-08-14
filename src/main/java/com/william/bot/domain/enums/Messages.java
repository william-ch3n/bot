package com.william.bot.domain.enums;

public enum Messages {

    RAKUTEN_REFERRAL_TWEET("#楽天モバイル紹介キャンペーン \n" +
            "【楽天モバイルのご紹介です！】\n" +
            "お乗り換えで14,000ポイント、新規ご契約で7,000ポイントプレゼント！\n" +
            "＊再契約も2回線の方も対象${emoji}\n" +
            "\n" +
            "※楽天会員にログインして、楽天モバイル紹介キャンペーンページに遷移します。\n" +
            "▼キャンペーンはこちら\n" +
            "https://r10.to/hPK12Z");

    private final String message;

    Messages(String message){
        this.message = message;
    }

    public String getMessage(){
        return this.message;
    }

}
