package kr.co.skcc.base.gateway.domain;

import lombok.Data;
import org.springframework.data.annotation.Id;

import java.time.Instant;

@Data
public class Token {
    @Id
    private String userid;

    private String accessToken;

    private String oldAccessToken;

    private String refreshToken;

    private String updateTime;

    private Instant expiryDate;
}