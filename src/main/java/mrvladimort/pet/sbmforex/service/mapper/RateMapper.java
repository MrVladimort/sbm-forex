package mrvladimort.pet.sbmforex.service.mapper;

import mrvladimort.pet.sbmforex.domain.entity.Rate;
import mrvladimort.pet.sbmforex.web.model.RateDTO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring", uses = {CurrencyMapper.class, IdMapper.class})
public interface RateMapper {

    @Mapping(source = "rate.main", target = "from")
    RateDTO rateToRateDto(Rate rate);
}
