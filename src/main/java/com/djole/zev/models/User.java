package com.djole.zev.models;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Data
@NoArgsConstructor
public class User extends RecordInfo {
    private String firstName;
    private String lastName;
    private String username;
    private String email;
}
