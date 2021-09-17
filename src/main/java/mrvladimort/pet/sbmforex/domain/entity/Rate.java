package mrvladimort.pet.sbmforex.domain.entity;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Builder
@Entity
@Table(name = "rates")
public class Rate extends AbstractAuditingEntity {

    @ManyToOne(optional = false)
    private Currency main;

    @ManyToOne(optional = false)
    private Currency to;

    private Double rate;
}
