package com.mossle.ticket.persistence.domain;

// Generated by Hibernate Tools
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * TicketAttachment .
 * 
 * @author Lingo
 */
@Entity
@Table(name = "TICKET_ATTACHMENT")
public class TicketAttachment implements java.io.Serializable {
    private static final long serialVersionUID = 0L;

    /** null. */
    private Long id;

    /** null. */
    private TicketInfo ticketInfo;

    /** null. */
    private String code;

    /** null. */
    private String name;

    /** null. */
    private Long fileSize;

    /** null. */
    private String type;

    /** null. */
    private String userId;

    /** null. */
    private Date createTime;

    public TicketAttachment() {
    }

    public TicketAttachment(Long id) {
        this.id = id;
    }

    public TicketAttachment(Long id, TicketInfo ticketInfo, String code,
            String name, Long fileSize, String type, String userId,
            Date createTime) {
        this.id = id;
        this.ticketInfo = ticketInfo;
        this.code = code;
        this.name = name;
        this.fileSize = fileSize;
        this.type = type;
        this.userId = userId;
        this.createTime = createTime;
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
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "INFO_ID")
    public TicketInfo getTicketInfo() {
        return this.ticketInfo;
    }

    /**
     * @param ticketInfo
     *            null.
     */
    public void setTicketInfo(TicketInfo ticketInfo) {
        this.ticketInfo = ticketInfo;
    }

    /** @return null. */
    @Column(name = "CODE", length = 200)
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
    @Column(name = "FILE_SIZE")
    public Long getFileSize() {
        return this.fileSize;
    }

    /**
     * @param fileSize
     *            null.
     */
    public void setFileSize(Long fileSize) {
        this.fileSize = fileSize;
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
    @Column(name = "USER_ID", length = 64)
    public String getUserId() {
        return this.userId;
    }

    /**
     * @param userId
     *            null.
     */
    public void setUserId(String userId) {
        this.userId = userId;
    }

    /** @return null. */
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "CREATE_TIME", length = 26)
    public Date getCreateTime() {
        return this.createTime;
    }

    /**
     * @param createTime
     *            null.
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}