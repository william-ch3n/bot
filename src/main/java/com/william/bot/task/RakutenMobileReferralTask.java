package com.william.bot.task;

import com.william.bot.service.TwitterService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
@Slf4j
public class RakutenMobileReferralTask {

    private final TwitterService twitterService;

    @Scheduled(cron="0 0 * * * ?")
    public void postReferralInfo() {
        twitterService.tweet();
    }

}
