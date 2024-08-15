package com.william.bot.service;

import com.william.bot.constants.CommonConstants;
import com.william.bot.domain.enums.Messages;

import io.github.redouane59.twitter.TwitterClient;
import io.github.redouane59.twitter.signature.TwitterCredentials;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;

import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


@Service
@RequiredArgsConstructor
@Slf4j
public class TwitterService {

    @Value("${twitter.consumer.key}")
    private String consumerKey;
    @Value("${twitter.consumer.secret}")
    private String consumerKeySecret;
    @Value("${twitter.access.key}")
    private String accessKey;
    @Value("${twitter.access.secret}")
    private String accessKeySecret;

    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

    public void tweet(){
        try {
            // Step 1: Build Twitter client with library
            TwitterCredentials credentials = TwitterCredentials.builder()
                    .apiKey(consumerKey)
                    .apiSecretKey(consumerKeySecret)
                    .accessToken(accessKey)
                    .accessTokenSecret(accessKeySecret).build();
            TwitterClient client = new TwitterClient(credentials);

            // Step 2: Get message for tweeting
            int index = (int)Math.floor(Math.random() * CommonConstants.emojis.size());
            String tweetText = Messages.RAKUTEN_REFERRAL_TWEET.getMessage().replace("${emoji}", CommonConstants.emojis.get(index));

            // Step 3: Call `Tweet` API to post a tweet
            log.info("[{}] Start posting a tweet, message: {}", LocalDateTime.now().format(formatter), tweetText);
            client.postTweet(tweetText);

        } catch (Exception e) {
            log.error("[{}] Failed to post tweet due to: ", LocalDateTime.now().format(formatter), e);
        } finally {
            log.info("[{}] Finishing tweeting.", LocalDateTime.now().format(formatter));
        }
    }
}
