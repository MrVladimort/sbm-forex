package mrvladimort.pet.sbmforex.service.mapper;

import mrvladimort.pet.sbmforex.domain.entity.Currency;
import mrvladimort.pet.sbmforex.web.model.CurrencyDTO;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", uses = IdMapper.class)
public interface CurrencyMapper {
    CurrencyDTO currencyToCurrencyDto(Currency currency);
}
