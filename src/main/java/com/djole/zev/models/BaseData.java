package com.djole.zev.models;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

@Data
@MappedSuperclass
@NoArgsConstructor
public class BaseData {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;
}
