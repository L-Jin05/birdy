package com.keduit.bird.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.domain.AuditorAware;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@Configuration
@EnableJpaAuditing
//JPA의 Auditing 기능을 활성화 하기
public class AuditConfig {
//    등록자와 수정자를 처리하는 AditorAware를 빈으로 등록하기
    @Bean
    public AuditorAware<String> auditorProvider(){
        return new AuditorAwareImpl();
    }
}
