package com.molinyi.dev.ocpp16.common.dto;

import com.molinyi.dev.ocpp16.common.dto.conf.*;
import com.molinyi.dev.ocpp16.common.dto.req.*;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum MessageMapping {

    AUTHORIZE("Authorize", AuthorizeReq.class, AuthorizeConf.class),
    BOOT_NOTIFICATION("BootNotification", BootNotificationReq.class, BootNotificationConf.class),
    CANCEL_RESERVATION("CancelReservation", CancelReservationReq.class, CancelReservationConf.class),
    CHANGE_AVAILABILITY("ChangeAvailability", ChangeAvailabilityReq.class, ChangeAvailabilityConf.class),
    CHANGE_CONFIGURATION("ChangeConfiguration", ChangeConfigurationReq.class, ChangeConfigurationConf.class),
    CLEAR_CACHE("ClearCache", ClearCacheReq.class, ClearCacheConf.class),
    CLEAR_CHARGING_PROFILE("ClearChargingProfile", ClearChargingProfileReq.class, ClearChargingProfileConf.class),
    DATA_TRANSFER("DataTransfer", DataTransferReq.class, DataTransferConf.class),
    DIAGNOSTICS_STATUS_NOTIFICATION("DiagnosticsStatusNotification", DiagnosticsStatusNotificationReq.class, DiagnosticsStatusNotificationConf.class),
    FIRMWARE_STATUS_NOTIFICATION("FirmwareStatusNotification", FirmwareStatusNotificationReq.class, FirmwareStatusNotificationConf.class),
    GET_COMPOSITE_SCHEDULE("GetCompositeSchedule", GetCompositeScheduleReq.class, GetCompositeScheduleConf.class),
    GET_CONFIGURATION("GetConfiguration", GetConfigurationReq.class, GetConfigurationConf.class),
    GET_DIAGNOSTICS("GetDiagnostics", GetDiagnosticsReq.class, GetDiagnosticsConf.class),
    GET_LOCAL_LIST_VERSION("GetLocalListVersion", GetLocalListVersionReq.class, GetLocalListVersionConf.class),
    METER_VALUES("MeterValues", MeterValuesReq.class, MeterValuesConf.class),
    REMOTE_START_TRANSACTION("RemoteStartTransaction", RemoteStartTransactionReq.class, RemoteStartTransactionConf.class),
    REMOTE_STOP_TRANSACTION("RemoteStopTransaction", RemoteStopTransactionReq.class, RemoteStopTransactionConf.class),
    RESERVE_NOW("ReserveNow", ReserveNowReq.class, ReserveNowConf.class),
    RESET("Reset", ResetReq.class, ResetConf.class),
    SEND_LOCAL_LIST("SendLocalList", SendLocalListReq.class, SendLocalListConf.class),
    SET_CHARGING_PROFILE("SetChargingProfile", SetChargingProfileReq.class, SetChargingProfileConf.class),
    START_TRANSACTION("StartTransaction", StartTransactionReq.class, StartTransactionConf.class),
    STATUS_NOTIFICATION("StatusNotification", StatusNotificationReq.class, StatusNotificationConf.class),
    STOP_TRANSACTION("StopTransaction", StopTransactionReq.class, StopTransactionConf.class),
    TRIGGER_MESSAGE("TriggerMessage", TriggerMessageReq.class, TriggerMessageConf.class),
    UNLOCK_CONNECTOR("UnlockConnector", UnlockConnectorReq.class, UnlockConnectorConf.class),
    UPDATE_FIRMWARE("UpdateFirmware", UpdateFirmwareReq.class, UpdateFirmwareConf.class),
    HEARTBEAT("Heartbeat", HeartbeatReq.class, HeartbeatConf.class);


    private String action;
    private final Class reqMessageClass;
    private final Class confMessageClass;


}