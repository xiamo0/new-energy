package com.molinyi.dev.ocpi.common.v211.module.location.entity;

import cn.hutool.core.collection.CollectionUtil;
import com.baomidou.mybatisplus.annotation.*;
import com.baomidou.mybatisplus.core.handlers.MybatisEnumTypeHandler;
import com.baomidou.mybatisplus.extension.handlers.JacksonTypeHandler;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.infypower.fycev.ocpi.v211.common.*;
import com.infypower.fycev.ocpi.v211.common.types.DisplayText;
import com.infypower.fycev.ocpi.v211.entity.BaseEntity;
import com.infypower.fycev.ocpi.v211.module.location.dto.EVSE;
import com.infypower.fycev.ocpi.v211.module.location.dto.Location;
import com.infypower.fycev.ocpi.v211.module.location.dto.LocationType;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

@EqualsAndHashCode(callSuper = true)
@Data
@NoArgsConstructor
@TableName(autoResultMap = true,value ="ces_ocpi_v211_location")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class LocationEntity extends BaseEntity {

    @TableId(type = IdType.ASSIGN_UUID)
    private String id;

    @TableField(updateStrategy = FieldStrategy.NOT_NULL, typeHandler = MybatisEnumTypeHandler.class)
    private LocationType type;

    @TableField(updateStrategy = FieldStrategy.NOT_EMPTY)
    private String name;

    @TableField(updateStrategy = FieldStrategy.NOT_EMPTY)
    private String address;

    @TableField(updateStrategy = FieldStrategy.NOT_EMPTY)
    private String city;

    @TableField(updateStrategy = FieldStrategy.NOT_EMPTY)
    @JsonProperty("postal_code")
    private String postalCode;

    @TableField(updateStrategy = FieldStrategy.NOT_EMPTY)
    private String country;

    @TableField(updateStrategy = FieldStrategy.NOT_NULL,typeHandler = JacksonTypeHandler.class)
    private GeoLocation coordinates;


    @TableField(updateStrategy = FieldStrategy.NOT_NULL,typeHandler = JacksonTypeHandler.class)
    @JsonProperty("related_locations")
    private List<AdditionalGeoLocation> relatedLocations;

    @TableField(updateStrategy = FieldStrategy.NOT_NULL,typeHandler = JacksonTypeHandler.class)
    private List<DisplayText>  directions;

    @TableField(updateStrategy = FieldStrategy.NOT_NULL,typeHandler = JacksonTypeHandler.class)
    private BusinessDetails operator;

    @TableField(updateStrategy = FieldStrategy.NOT_NULL,typeHandler = JacksonTypeHandler.class)
    private BusinessDetails suboperator;

    @TableField(updateStrategy = FieldStrategy.NOT_NULL,typeHandler = JacksonTypeHandler.class)
    private BusinessDetails owner;

    @TableField(updateStrategy = FieldStrategy.NOT_NULL,typeHandler = JacksonTypeHandler.class)
    private List<Facility> facilities;

    @TableField(updateStrategy = FieldStrategy.NOT_EMPTY)
    @JsonProperty("time_zone")
    private String timeZone;

    @TableField(updateStrategy = FieldStrategy.NOT_NULL,typeHandler = JacksonTypeHandler.class)
    @JsonProperty("opening_times")
    private Hours openingTimes;

    @TableField(updateStrategy = FieldStrategy.NOT_EMPTY)
    @JsonProperty("charging_when_closed")
    private Boolean chargingWhenClosed;

    @TableField(updateStrategy = FieldStrategy.NOT_NULL,typeHandler = JacksonTypeHandler.class)
    private List<Image>  images;

    @TableField(updateStrategy = FieldStrategy.NOT_NULL,typeHandler = JacksonTypeHandler.class)
    @JsonProperty("energy_mix")
    private EnergyMix energyMix;


    public static Location toDto(LocationEntity entity, List<EVSE> evses) {

        if (Objects.isNull(entity)) {
            return null;
        }

        final Location location = new Location();
        location.setId(entity.getId());
        location.setType(entity.getType());
        location.setName(entity.getName());
        location.setAddress(entity.getAddress());
        location.setCity(entity.getCity());
        location.setPostalCode(entity.getPostalCode());
        location.setCountry(entity.getCountry());
        location.setCoordinates(entity.getCoordinates());
        location.setRelatedLocations(entity.getRelatedLocations());
        location.setEvses(evses);
        location.setDirections(entity.getDirections());
        location.setOperator(entity.getOperator());
        location.setSuboperator(entity.getSuboperator() );
        location.setOwner(entity.getOwner());
        location.setFacilities(entity.getFacilities());
        location.setTimeZone(entity.getTimeZone());
        location.setOpeningTimes(entity.getOpeningTimes());
        location.setChargingWhenClosed(entity.getChargingWhenClosed());
        location.setImages(entity.getImages());
        location.setEnergyMix(entity.getEnergyMix());
        location.setLastUpdated(entity.getLastUpdated());

        return location;
    }

    public static List<Location> toDtos(List<LocationEntity> entities) {
        if (CollectionUtil.isEmpty(entities)) {
            return null;
        }
        return entities.stream().map(e -> {
            return LocationEntity.toDto(e, null);
        }).collect(Collectors.toList());
    }


}
