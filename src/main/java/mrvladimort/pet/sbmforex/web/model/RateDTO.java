package mrvladimort.pet.sbmforex.web.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class RateDTO {
    String id;
    CurrencyDTO from;
    CurrencyDTO to;
    Integer rate;
}
