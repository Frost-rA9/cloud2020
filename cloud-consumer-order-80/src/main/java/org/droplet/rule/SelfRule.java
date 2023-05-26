package org.droplet.rule;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SelfRule {

    @Bean
    public IRule rule() {
        // 随机规则
        return new RandomRule();
    }
}
