package com.ssproject2.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data // Generate Getters and Setters
@NoArgsConstructor
@AllArgsConstructor
public class Device {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "deviceid")
    private Long deviceId;

    @Column
    @NotEmpty(message = "The Phone Plan must have a make")
    private String make;

    @Column
    @NotEmpty(message = "The Phone Plan must have a model")
    private String model;

}
