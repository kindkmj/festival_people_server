package com.feastival.project.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@Data
@NoArgsConstructor
@AllArgsConstructor
//@Entity
@Builder
//@Table
public class Member {
    Integer mem_id;
    String mem_email;
    String mem_nickname;
    String mem_token;
}
