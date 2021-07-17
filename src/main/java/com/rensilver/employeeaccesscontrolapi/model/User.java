package com.rensilver.employeeaccesscontrolapi.model;

import lombok.*;

import javax.persistence.ManyToOne;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
public class User {

    private Long id;
    private String name;
    private LocalDateTime workingDayBeginning;
    private LocalDateTime workingDayEnd;
    private BigDecimal tolerance;

    @ManyToOne
    private UserCategory userCategory;

    @ManyToOne
    private Company company;

    @ManyToOne
    private AccessLevel accessLevel;
    private WorkingDay workingDay;

}
