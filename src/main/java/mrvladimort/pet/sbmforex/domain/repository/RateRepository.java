package mrvladimort.pet.sbmforex.domain.repository;

import mrvladimort.pet.sbmforex.domain.entity.Rate;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Optional;
import java.util.UUID;

public interface RateRepository extends JpaRepository<Rate, UUID> {

    @Query("SELECT r FROM Rate r " +
            "JOIN r.main f " +
            "JOIN r.to t " +
            "WHERE f.name = :fromName AND t.name = :toName")
    Optional<Rate> findRateByCurrencyNames(@Param("fromName") String fromName, @Param("toName") String toName);

}
