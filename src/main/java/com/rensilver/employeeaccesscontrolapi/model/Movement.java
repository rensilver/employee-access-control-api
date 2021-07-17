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
public class Movement {

    @AllArgsConstructor
    @NoArgsConstructor
    @EqualsAndHashCode
    @Embeddable
    public class MovementId implements Serializable {

        private Long idMoviment;
        private Long idUsuario;
    }

    @EmbeddedId
    private MovementId id;
    private LocalDateTime dateIn;
    private LocalDateTime dateOut;
    private BigDecimal period;
    private Occurrence occurrence;
    private Calendar calendar;
}
