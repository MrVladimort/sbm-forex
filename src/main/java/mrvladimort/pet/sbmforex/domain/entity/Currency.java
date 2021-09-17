package mrvladimort.pet.sbmforex.domain.entity;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Builder
@Entity
@Table(name = "currencies")
public class Currency extends AbstractAuditingEntity {

    @Column(unique = true, length = 8)
    private String name;
}
