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

    /**
     * running at 0 minute past every 2 hours as the new rate limit is 500 post/month and 17 post/hour
     * ref:
     *  https://developer.x.com/en/docs/x-api/rate-limits
     *
     * e.g. for crontab:
     *  16:00, 18:00, 20:00
     */
    @Scheduled(cron="0 */2 * * * ?")
    public void postReferralInfo() {
        twitterService.tweet();
    }

}
