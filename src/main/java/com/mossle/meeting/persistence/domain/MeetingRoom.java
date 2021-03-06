package com.mossle.meeting.persistence.domain;

// Generated by Hibernate Tools
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * MeetingRoom .
 * 
 * @author Lingo
 */
@Entity
@Table(name = "MEETING_ROOM")
public class MeetingRoom implements java.io.Serializable {
    private static final long serialVersionUID = 0L;

    /** null. */
    private Long id;

    /** null. */
    private String code;

    /** null. */
    private String name;

    /** null. */
    private String mapRef;

    /** null. */
    private Integer num;

    /** null. */
    private String device;

    /** null. */
    private String type;

    /** null. */
    private String notice;

    /** null. */
    private String timezone;

    /** null. */
    private Date startTime;

    /** null. */
    private Date endTime;

    /** null. */
    private String building;

    /** null. */
    private String floor;

    /** null. */
    private String status;

    /** null. */
    private String tenantId;

    /** . */
    private Set<MeetingItem> meetingItems = new HashSet<MeetingItem>(0);

    /** . */
    private Set<MeetingInfo> meetingInfos = new HashSet<MeetingInfo>(0);

    public MeetingRoom() {
    }

    public MeetingRoom(Long id) {
        this.id = id;
    }

    public MeetingRoom(Long id, String code, String name, String mapRef,
            Integer num, String device, String type, String notice,
            String timezone, Date startTime, Date endTime, String building,
            String floor, String status, String tenantId,
            Set<MeetingItem> meetingItems, Set<MeetingInfo> meetingInfos) {
        this.id = id;
        this.code = code;
        this.name = name;
        this.mapRef = mapRef;
        this.num = num;
        this.device = device;
        this.type = type;
        this.notice = notice;
        this.timezone = timezone;
        this.startTime = startTime;
        this.endTime = endTime;
        this.building = building;
        this.floor = floor;
        this.status = status;
        this.tenantId = tenantId;
        this.meetingItems = meetingItems;
        this.meetingInfos = meetingInfos;
    }

    /** @return null. */
    @Id
    @Column(name = "ID", unique = true, nullable = false)
    public Long getId() {
        return this.id;
    }

    /**
     * @param id
     *            null.
     */
    public void setId(Long id) {
        this.id = id;
    }

    /** @return null. */
    @Column(name = "CODE", length = 50)
    public String getCode() {
        return this.code;
    }

    /**
     * @param code
     *            null.
     */
    public void setCode(String code) {
        this.code = code;
    }

    /** @return null. */
    @Column(name = "NAME", length = 200)
    public String getName() {
        return this.name;
    }

    /**
     * @param name
     *            null.
     */
    public void setName(String name) {
        this.name = name;
    }

    /** @return null. */
    @Column(name = "MAP_REF", length = 200)
    public String getMapRef() {
        return this.mapRef;
    }

    /**
     * @param mapRef
     *            null.
     */
    public void setMapRef(String mapRef) {
        this.mapRef = mapRef;
    }

    /** @return null. */
    @Column(name = "NUM")
    public Integer getNum() {
        return this.num;
    }

    /**
     * @param num
     *            null.
     */
    public void setNum(Integer num) {
        this.num = num;
    }

    /** @return null. */
    @Column(name = "DEVICE", length = 200)
    public String getDevice() {
        return this.device;
    }

    /**
     * @param device
     *            null.
     */
    public void setDevice(String device) {
        this.device = device;
    }

    /** @return null. */
    @Column(name = "TYPE", length = 50)
    public String getType() {
        return this.type;
    }

    /**
     * @param type
     *            null.
     */
    public void setType(String type) {
        this.type = type;
    }

    /** @return null. */
    @Column(name = "NOTICE", length = 50)
    public String getNotice() {
        return this.notice;
    }

    /**
     * @param notice
     *            null.
     */
    public void setNotice(String notice) {
        this.notice = notice;
    }

    /** @return null. */
    @Column(name = "TIMEZONE", length = 50)
    public String getTimezone() {
        return this.timezone;
    }

    /**
     * @param timezone
     *            null.
     */
    public void setTimezone(String timezone) {
        this.timezone = timezone;
    }

    /** @return null. */
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "START_TIME", length = 26)
    public Date getStartTime() {
        return this.startTime;
    }

    /**
     * @param startTime
     *            null.
     */
    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    /** @return null. */
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "END_TIME", length = 26)
    public Date getEndTime() {
        return this.endTime;
    }

    /**
     * @param endTime
     *            null.
     */
    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    /** @return null. */
    @Column(name = "BUILDING", length = 200)
    public String getBuilding() {
        return this.building;
    }

    /**
     * @param building
     *            null.
     */
    public void setBuilding(String building) {
        this.building = building;
    }

    /** @return null. */
    @Column(name = "FLOOR", length = 50)
    public String getFloor() {
        return this.floor;
    }

    /**
     * @param floor
     *            null.
     */
    public void setFloor(String floor) {
        this.floor = floor;
    }

    /** @return null. */
    @Column(name = "STATUS", length = 50)
    public String getStatus() {
        return this.status;
    }

    /**
     * @param status
     *            null.
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /** @return null. */
    @Column(name = "TENANT_ID", length = 64)
    public String getTenantId() {
        return this.tenantId;
    }

    /**
     * @param tenantId
     *            null.
     */
    public void setTenantId(String tenantId) {
        this.tenantId = tenantId;
    }

    /** @return . */
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "meetingRoom")
    public Set<MeetingItem> getMeetingItems() {
        return this.meetingItems;
    }

    /**
     * @param meetingItems
     *            .
     */
    public void setMeetingItems(Set<MeetingItem> meetingItems) {
        this.meetingItems = meetingItems;
    }

    /** @return . */
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "meetingRoom")
    public Set<MeetingInfo> getMeetingInfos() {
        return this.meetingInfos;
    }

    /**
     * @param meetingInfos
     *            .
     */
    public void setMeetingInfos(Set<MeetingInfo> meetingInfos) {
        this.meetingInfos = meetingInfos;
    }
}
