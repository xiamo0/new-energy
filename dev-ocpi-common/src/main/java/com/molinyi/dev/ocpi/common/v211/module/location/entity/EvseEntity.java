package com.molinyi.dev.ocpi.common.v211.module.location.entity;

import com.baomidou.mybatisplus.annotation.*;
import com.baomidou.mybatisplus.extension.handlers.JacksonTypeHandler;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.infypower.fycev.ocpi.v211.common.*;
import com.infypower.fycev.ocpi.v211.common.types.DisplayText;
import com.infypower.fycev.ocpi.v211.entity.BaseEntity;
import com.infypower.fycev.ocpi.v211.module.location.dto.Connector;
import com.infypower.fycev.ocpi.v211.module.location.dto.EVSE;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Data
@NoArgsConstructor
@TableName(autoResultMap = true, value = "ces_ocpi_v211_evse")
public class EvseEntity extends BaseEntity {

    @TableId(type = IdType.ASSIGN_UUID)
    private String uid;

    @JsonProperty("evse_id")
    private String evseId;

    @TableField(updateStrategy = FieldStrategy.NOT_NULL, typeHandler = JacksonTypeHandler.class)
    private Status status;

    @TableField(updateStrategy = FieldStrategy.NOT_NULL, typeHandler = JacksonTypeHandler.class)
    @JsonProperty("status_schedule")
    private List<StatusSchedule> statusSchedule;

    @TableField(updateStrategy = FieldStrategy.NOT_NULL, typeHandler = JacksonTypeHandler.class)
    private List<Capability> capabilities;


    @TableField(updateStrategy = FieldStrategy.NOT_EMPTY)
    @JsonProperty("floor_level")
    private String floorLevel;

    @TableField(updateStrategy = FieldStrategy.NOT_NULL, typeHandler = JacksonTypeHandler.class)
    private GeoLocation coordinates;

    @TableField(updateStrategy = FieldStrategy.NOT_EMPTY)
    @JsonProperty("physical_reference")
    private String physicalReference;

    @TableField(updateStrategy = FieldStrategy.NOT_NULL, typeHandler = JacksonTypeHandler.class)
    private List<DisplayText> directions;

    @TableField(updateStrategy = FieldStrategy.NOT_NULL, typeHandler = JacksonTypeHandler.class)
    @JsonProperty("parking_restrictions")
    private List<ParkingRestriction> parkingRestrictions;

    @TableField(updateStrategy = FieldStrategy.NOT_NULL, typeHandler = JacksonTypeHandler.class)
    private List<Image> images;



    public static EVSE toDto(EvseEntity evseEntity, List<Connector> connectors) {
        EVSE evse = new EVSE();
        evse.setUid(evseEntity.getUid());
        evse.setEvseId(evseEntity.getEvseId());
        evse.setStatus(evseEntity.getStatus());

        evse.setStatusSchedule(evseEntity.getStatusSchedule());
        evse.setCapabilities(evseEntity.getCapabilities());

        evse.setConnectors(connectors);
        evse.setFloorLevel(evseEntity.getFloorLevel());

        evse.setCoordinates(evseEntity.getCoordinates());

        evse.setPhysicalReference(evseEntity.getPhysicalReference());

        evse.setDirections(evseEntity.getDirections());

        evse.setParkingRestrictions(evseEntity.getParkingRestrictions());

        evse.setImages(evseEntity.getImages());

        evse.setLastUpdated(evseEntity.getLastUpdated());
        return evse;

    }



}
