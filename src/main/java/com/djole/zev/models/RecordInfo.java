package com.djole.zev.models;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.ManyToOne;
import javax.persistence.MappedSuperclass;
import javax.persistence.OneToOne;
import java.time.Instant;

@Data
@MappedSuperclass
@NoArgsConstructor
public class RecordInfo extends BaseData {
    private Instant createdAt;

    @ManyToOne
    private User creator;
    private Instant updatedAt;

    @ManyToOne
    private User updater;
}
