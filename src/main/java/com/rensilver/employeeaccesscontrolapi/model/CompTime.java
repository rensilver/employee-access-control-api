package com.rensilver.employeeaccesscontrolapi.model;

import lombok.*;

import javax.persistence.Embeddable;
import javax.persistence.EmbeddedId;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
public class CompTime {

    @EqualsAndHashCode
    @Embeddable
    @Getter
    @Setter
    public class CompTimeId implements Serializable {

        private Long idCompTime;
        private Long idMoviment;
        private Long idUsuario;
    }

    @EmbeddedId
    private CompTimeId Id;
    private LocalDateTime dateWorked;
    private BigDecimal hoursQuantity;
    private BigDecimal hoursBalance;
}
