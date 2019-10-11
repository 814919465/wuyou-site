package com.wuyou.wysite;

import lombok.extern.slf4j.Slf4j;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

@Slf4j
public class Test01 {

    public static void main(String[] args) {
        // 报价A
        BigDecimal bigDecimalA = new BigDecimal("49.9995");

        // 报价B
        BigDecimal bigDecimalB = new BigDecimal("49.9996");

        // 报价c
        BigDecimal bigDecimalC = new BigDecimal("49.9997");

        // 报价列表
        List<BigDecimal> list = Arrays.asList(bigDecimalA, bigDecimalB, bigDecimalC);

        log.info("报价列表：{}", list);
        log.info("最高报价：{}", Collections.max(list));
        log.info("最低报价：{}", Collections.min(list));

    }


}
