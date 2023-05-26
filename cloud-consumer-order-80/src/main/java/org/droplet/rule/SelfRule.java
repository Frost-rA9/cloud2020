package org.droplet.rule;

import org.springframework.context.annotation.Configuration;

@Configuration
// Spring Cloud 版本太新没有 Ribbon
public class SelfRule {
    /*
    @Bean
    public IRule rule()
    {
        // 随机规则
        return new RandomRule();
    }
    */
}
