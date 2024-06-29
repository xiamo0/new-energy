package com.molinyi.dev.ocpp16.common.dto;

import lombok.Data;
import lombok.NonNull;
import lombok.extern.slf4j.Slf4j;

import java.io.Serializable;

@Slf4j
@Data
public class Configuration implements Serializable {

    //If this key exists, the Charge Point supports Unknown Offline Authorization.
    //If this key reports a value of true, Unknown Offline Authorization is
    //enabled.
    private Boolean AllowOfflineTxForUnknownId;

    //If this key exists, the Charge Point supports an Authorization Cache. If this
    //key reports a value of true, the Authorization Cache is enabled.
    private boolean AuthorizationCacheEnabled;

    //Whether a remote request to start a transaction in the form of a
    //RemoteStartTransaction.req message should be authorized beforehand like
    //a local action to start a transaction.
    @NonNull
    public boolean AuthorizeRemoteTxRequests;

    //Number of times to blink Charge Point lighting when signalling
    private int BlinkRepeat;

    //Size (in seconds) of the clock-aligned data interval. This is the size (in
    //seconds) of the set of evenly spaced aggregation intervals per day, starting
    //at 00:00:00 (midnight). For example, a value of 900 (15 minutes) indicates
    //that every day should be broken into 96 15-minute intervals.
    //When clock aligned data is being transmitted, the interval in question is
    //identified by the start time and (optional) duration interval value,
    //represented according to the ISO8601 standard. All "per-period" data (e.g.
    //energy readings) should be accumulated (for "flow" type measurands such
    //as energy), or averaged (for other values) across the entire interval (or
    //partial interval, at the beginning or end of a charging session), and
    //transmitted (if so enabled) at the end of each interval, bearing the interval
    //start time timestamp.
    //A value of "0" (numeric zero), by convention, is to be interpreted to mean
    //that no clock-aligned data should be transmitted
    @NonNull
    private int ClockAlignedDataInterval;

    //Interval (from successful authorization) until incipient charging session is
    //automatically canceled due to failure of EV user to (correctly) insert the
    //charging cable connector(s) into the appropriate connector(s).
    @NonNull
    private int ConnectionTimeOut;

    //Maximum number of requested configuration keys in a
    //GetConfiguration.req PDU.
    @NonNull
    private int GetConfigurationMaxKeys;

    //Interval of inactivity (no OCPP exchanges) with central system after which
    //the Charge Point should send a Heartbeat.req PDU
    @NonNull
    private int HeartbeatInterval;

    //Percentage of maximum intensity at which to illuminate Charge Point
    //lighting
    private int LightIntensity;

    //whether the Charge Point, when offline, will start a transaction for locallyauthorized identifiers.
    @NonNull
    private boolean LocalAuthorizeOffline;

    //whether the Charge Point, when online, will start a transaction for locallyauthorized identifiers without waiting for or requesting an Authorize.conf
    //from the Central System
    @NonNull
    private boolean LocalPreAuthorize;

    //Maximum energy in Wh delivered when an identifier is invalidated by the
    //Central System after start of a transaction.
    private int MaxEnergyOnInvalidId;

    //Clock-aligned measurand(s) to be included in a MeterValues.req PDU, every
    //ClockAlignedDataInterval seconds
    private String MeterValuesAlignedData;


    //Maximum number of items in a MeterValuesAlignedData Configuration Key
    private int MeterValuesAlignedDataMaxLength;

    //Sampled measurands to be included in a MeterValues.req PDU, every
    //MeterValueSampleInterval seconds. Where applicable, the Measurand is
    //combined with the optional phase; for instance: Voltage.L1 Default:
    //"Energy.Active.Import.Register"
    @NonNull
    private String MeterValuesSampledData;

    //Maximum number of items in a MeterValuesSampledData Configuration Key
    private int MeterValuesSampledDataMaxLength;

    //Interval between sampling of metering (or other) data, intended to be
    //transmitted by "MeterValues" PDUs. For charging session data
    //(ConnectorId>0), samples are acquired and transmitted periodically at this
    //interval from the start of the charging transaction.
    //A value of "0" (numeric zero), by convention, is to be interpreted to mean
    //that no sampled data should be transmitted
    @NonNull
    private int MeterValueSampleInterval;

    //The minimum duration that a Charge Point or Connector status is stable
    //before a StatusNotification.req PDU is sent to the Central System.
    private int MinimumStatusDuration;

    //The number of physical charging connectors of this Charge Point
    @NonNull
    private int NumberOfConnectors;

    //Number of times to retry an unsuccessful reset of the Charge Point.
    @NonNull
    private int ResetRetries;

    //The phase rotation per connector in respect to the connector’s energy meter
    //(or if absent, the grid connection). Possible values per connector are:
    //NotApplicable (for Single phase or DC Charge Points)
    //Unknown (not (yet) known)
    //RST (Standard Reference Phasing)
    //RTS (Reversed Reference Phasing)
    //SRT (Reversed 240 degree rotation)
    //STR (Standard 120 degree rotation)
    //TRS (Standard 240 degree rotation)
    //TSR (Reversed 120 degree rotation)
    //R can be identified as phase 1 (L1), S as phase 2 (L2), T as phase 3 (L3). If
    //known, the Charge Point MAY also report the phase rotation between the
    //grid connection and the main energymeter by using index number Zero (0).
    //Values are reported in CSL, formatted: 0.RST, 1.RST, 2.RTS
    @NonNull
    private String ConnectorPhaseRotation;

    private int ConnectorPhaseRotationMaxLength;

    //When set to true, the Charge Point SHALL administratively stop the
    //transaction when the cable is unplugged from the EV.
    @NonNull
    private boolean StopTransactionOnEVSideDisconnect;

    //whether the Charge Point will stop an ongoing transaction when it receives
    //a non- Accepted authorization status in a StartTransaction.conf for this
    //transaction
    @NonNull
    private boolean StopTransactionOnInvalidId;

    //Clock-aligned periodic measurand(s) to be included in the TransactionData
    //element of StopTransaction.req MeterValues.req PDU for every
    //ClockAlignedDataInterval of the charging session
    @NonNull
    private String StopTxnAlignedData;

    //Maximum number of items in a StopTxnAlignedData Configuration Key
    private int StopTxnAlignedDataMaxLength;

    //Sampled measurands to be included in the TransactionData element of
    //StopTransaction.req PDU, every MeterValueSampleInterval seconds from the
    //start of the charging session
    @NonNull
    private String StopTxnSampledData;

    //Maximum number of items in a StopTxnSampledData Configuration Key.
    private int StopTxnSampledDataMaxLength;

    //A list of supported Feature Profiles. Possible profile identifiers: Core,
    //FirmwareManagement, LocalAuthListManagement, Reservation,
    //SmartCharging and RemoteTrigger.
    @NonNull
    private String SupportedFeatureProfiles;

    //Maximum number of items in a SupportedFeatureProfiles Configuration
//Key.
    private int SupportedFeatureProfilesMaxLength;

    //How often the Charge Point should try to submit a transaction-related
    //message when the Central System fails to process it
    @NonNull
    private int TransactionMessageAttempts;

    //How long the Charge Point should wait before resubmitting a transactionrelated message that the Central System failed to process
    @NonNull
    private int TransactionMessageRetryInterval;

    //When set to true, the Charge Point SHALL unlock the cable on Charge Point
    //side when the cable is unplugged at the EV.
    @NonNull
    private boolean UnlockConnectorOnEVSideDisconnect;

    //Only relevant for websocket implementations. 0 disables client side
    //websocket Ping/Pong. In this case there is either no ping/pong or the server
    //initiates the ping and client responds with Pong. Positive values are
    //interpreted as number of seconds between pings. Negative values are not
    //allowed. ChangeConfiguration is expected to return a REJECTED result
    private int WebSocketPingInterval;

    //--------------Local Auth List Management Profile--------------

    //whether the Local Authorization List is enabled
    @NonNull
    private boolean LocalAuthListEnabled;

    //Maximum number of identifications that can be stored in the Local
    //Authorization List
    @NonNull
    private int LocalAuthListMaxLength;

    //Maximum number of identifications that can be send in a single
    //SendLocalList.req
    @NonNull
    private int SendLocalListMaxLength;

    //--------------Reservation Profile--------------

    //If this configuration key is present and set to true: Charge Point support
    //reservations on connector 0
    private boolean ReserveConnectorZeroSupported;

    //--------------Smart Charging Profile--------------

    //Max StackLevel of a ChargingProfile. The number defined also indicates the
    //max allowed number of installed charging schedules per Charging Profile
    //Purposes.
    @NonNull
    private int ChargeProfileMaxStackLevel;

    //A list of supported quantities for use in a ChargingSchedule. Allowed values:
    //'Current' and 'Power'
    @NonNull
    private String ChargingScheduleAllowedChargingRateUnit;

    //Maximum number of periods that may be defined per ChargingSchedule
    @NonNull
    private int ChargingScheduleMaxPeriods;

    //If defined and true, this Charge Point support switching from 3 to 1 phase
    //during a charging session.
    private boolean ConnectorSwitch3to1PhaseSupported;

    //Maximum number of Charging profiles installed at a time
    @NonNull
    private int MaxChargingProfilesInstalled;

}
