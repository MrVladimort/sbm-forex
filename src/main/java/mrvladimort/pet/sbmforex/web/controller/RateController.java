package mrvladimort.pet.sbmforex.web.controller;

import lombok.RequiredArgsConstructor;
import mrvladimort.pet.sbmforex.service.RateService;
import mrvladimort.pet.sbmforex.web.model.RateDTO;
import org.springframework.data.repository.query.Param;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/api/v1/rate")
@RestController
@RequiredArgsConstructor
public class RateController {

    private final RateService rateService;

    @GetMapping("/")
    public ResponseEntity<RateDTO> getRateForCurrencies(@Param("from") String from, @Param("to") String to) {
        return ResponseEntity.ok(rateService.getRateForCurrencies(from, to));
    }
}
