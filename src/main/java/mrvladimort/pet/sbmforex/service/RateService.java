package mrvladimort.pet.sbmforex.service;

import mrvladimort.pet.sbmforex.web.model.RateDTO;

public interface RateService {

    RateDTO getRateForCurrencies(String from, String to);
}
