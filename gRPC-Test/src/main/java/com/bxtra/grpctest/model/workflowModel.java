package com.bxtra.grpctest.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class workflowModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    String workflowId;
    String executionId;
    Long startTime;
    Long endTime;
}
