package mrvladimort.pet.sbmforex.service.impl;

import lombok.RequiredArgsConstructor;
import mrvladimort.pet.sbmforex.domain.entity.Rate;
import mrvladimort.pet.sbmforex.domain.repository.RateRepository;
import mrvladimort.pet.sbmforex.service.RateService;
import mrvladimort.pet.sbmforex.service.mapper.RateMapper;
import mrvladimort.pet.sbmforex.web.error.NotFoundException;
import mrvladimort.pet.sbmforex.web.model.RateDTO;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
@Transactional
public class RateServiceImpl implements RateService {

    private final RateMapper rateMapper;
    private final RateRepository rateRepository;

    @Override
    public RateDTO getRateForCurrencies(String from, String to) {
        Rate rate = rateRepository.findRateByCurrencyNames(from, to).orElseThrow(NotFoundException::new);
        return rateMapper.rateToRateDto(rate);
    }
}
