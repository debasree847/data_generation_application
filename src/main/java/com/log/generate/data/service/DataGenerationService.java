package com.log.generate.data.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.util.Random;

@Slf4j
@Service
public class DataGenerationService {

    @Scheduled(cron= "${scheduler.cron}")
    public void generateLog(){
        int minUserId = 1;
        int maxUserId = 100;
        int minProductId = 100;
        int maxProductId = 1000;
        String evenOrOdd = null;
        String allAlphabets = "ABCDEFGHIJKLMNOPQRSTUVWZYZ";
        try{
            int userId = (int)(Math.random() * (maxUserId - minUserId + 1) + minUserId);
            int productId = (int)(Math.random() * (maxProductId - minProductId + 1) + minProductId);

            if(productId % 2 == 0){
                evenOrOdd = "even";
            }else{
                evenOrOdd = "odd";
            }

            Random randNum = new Random();
            char category = allAlphabets.toCharArray()[randNum.nextInt(allAlphabets.toCharArray().length)];



            log.info("User Id: {}; Product Id: {}; Is this even or odd: {}; Category: {}", userId, productId, evenOrOdd, category);
        }catch(Exception e){
            log.error("Exception occurred : {}", e.getMessage());
        }
    }
}
