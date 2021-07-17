package com.rensilver.employeeaccesscontrolapi.model;

import lombok.*;

import javax.persistence.ManyToOne;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
public class Locale {

    private Long id;
    private String description;

    @ManyToOne
    private AccessLevel accessLevel;
}
