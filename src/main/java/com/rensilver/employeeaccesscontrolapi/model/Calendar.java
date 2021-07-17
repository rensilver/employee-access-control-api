package com.rensilver.employeeaccesscontrolapi.model;

import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
public class Calendar {

    private Long id;
    private String description;
    private DataType dataType;
    private LocalDateTime specialDate;
}
