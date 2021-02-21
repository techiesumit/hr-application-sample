package com.sumit.hr.management.model;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "regions")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Regions {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Integer region_id;
    private String region_name;
}
