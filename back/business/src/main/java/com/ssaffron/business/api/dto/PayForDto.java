package com.ssaffron.business.api.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class PayForDto {

    private long payForIndex;

    private int payForRequestCount;

    private LocalDateTime payForResponseDate;

    private LocalDateTime payForPickDate;

    private LaundryPlanDto laundryPlanDto;

}
