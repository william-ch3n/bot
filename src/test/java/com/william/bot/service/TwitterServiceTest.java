package com.william.bot.service;

import com.william.bot.BotApplication;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest(classes = BotApplication.class)
class TwitterServiceTest {

    @Autowired
    TwitterService twitterService;

    @Test
    void tweet_case_1(){
        Assertions.assertDoesNotThrow(() -> twitterService.tweet());
    }

}
