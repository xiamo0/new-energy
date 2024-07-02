package com.molinyi.dev.ocpi.common.v211.module.types;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum ParkingType {

    ALONG_MOTORWAY("ALONG_MOTORWAY"), PARKING_GARAGE("PARKING_GARAGE"), PARKING_LOT("PARKING_LOT"), ON_DRIVEWAY("ON_DRIVEWAY"), ON_STREET("ON_STREET"), UNDERGROUND_GARAGE("UNDERGROUND_GARAGE");

    private final String value;
}
