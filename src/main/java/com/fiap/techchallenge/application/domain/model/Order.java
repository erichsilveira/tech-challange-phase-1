package com.fiap.techchallenge.application.domain.model;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import java.math.BigDecimal;
import java.time.ZonedDateTime;
import java.util.List;

@Builder
public class Order {

    @Getter
    private final String id;

    @Getter
    private final List<Product> products;

    @Getter
    @Setter
    private BigDecimal orderPrice;

    @Getter
    private final OrderStatus status;

    @Getter
    private final String customerId;

    @Getter
    private final String customerCpf;

    @Getter
    private ZonedDateTime createdAt;

    @Getter
    private ZonedDateTime updatedAt;
}
