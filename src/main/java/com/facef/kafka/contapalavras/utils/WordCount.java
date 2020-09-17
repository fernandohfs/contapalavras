package com.facef.kafka.contapalavras.utils;

import lombok.*;

import java.util.Date;

@AllArgsConstructor
@Getter
@Setter
@Builder
public class WordCount {

    private String key;
    private Long count;
    private Date start;
    private Date end;

}
