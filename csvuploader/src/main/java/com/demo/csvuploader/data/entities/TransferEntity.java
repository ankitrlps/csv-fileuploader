package com.demo.csvuploader.data.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="transfer_test")
public class TransferEntity {

	public TransferEntity() {

	}
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column
	private int id;
	
	@Column
	@Temporal(TemporalType.TIMESTAMP)
	private Date dateCreated;
	
	@Column
	private String identifier;

	@Column
	private String xferName;

	@Column
	private String direction;
    
	@Column
	private String businessPurpose;
    
	@Column
	private String status;
    
	@Column
	private String sla;
    
	@Column
	private String dataClassification;
    
	@Column
	private String xferInterval;
    
	@Column
	private String xferDailyVol;
    
	@Column
	private String xferAvgFileSize;
	
	@Column
	private String changeId;
	
	@Column
	private String suffix;
	
	@Column
	private String sourceSystem;
	
	@Column
	private String srcTransferId;
	
	@Column
	private String srcExampleFile;
	
	@Column
	private String srcdocType;
	
	@Column
	private String srcTransPort;
	
	@Column
	private String srcPrHostInfo;
	
	@Column
	private String srcQaHostInfo;
	
	@Column
	private String srcPort;
	
	@Column
	private String srcCredentials;
	
	@Column
	private String srcQaCredentials;
	
	@Column
	private String srcApplicationName;
	
	@Column
	private String scrVendorName;
	
	@Column
	private String srcTeamName;
	
	@Column
	private String srccontactInfo;
	
	@Column
	private String srcSupportTeamPager;
	
	@Column
	private String srcSupportteamEmail;
	
	@Column
	private String destinationSystem;
	
	@Column
	private String TgtTransferId;
	
	@Column
	private String tgtExampleFile;
	
	@Column
	private String tgtdocType;
	
	@Column
	private String tgtAgent;
	
	@Column
	private String tgtPrHostInfo;
	
	@Column
	private String tgtQaHostInfo;
	
	@Column
	private String tgtPort;
	
	@Column
	private String tgtcredentials; 
	
	@Column
	private String tgtQaCredentials;
	
	@Column
	private String tgtApplicationName;
	
	@Column
	private String tgtVendorName;
	
	@Column
	private String tgtTeamName;
	
	@Column
	private String tgtContactInfo;
	
	@Column
	private String tgtSupportTeamPager;
	
	@Column
	private String tgtsupportEmail;

	public TransferEntity(int id, String identifier, String xferName, String direction, String businessPurpose,
			String status, String sla, String dataClassification, String xferInterval, String xferDailyVol,
			String xferAvgFileSize, String changeId, String suffix, String sourceSystem, String srcTransferId,
			String srcExampleFile, String srcdocType, String srcTransPort, String srcPrHostInfo, String srcQaHostInfo,
			String srcPort, String srcCredentials, String srcQaCredentials, String srcApplicationName,
			String scrVendorName, String srcTeamName, String srccontactInfo, String srcSupportTeamPager,
			String srcSupportteamEmail, String destinationSystem, String tgtTransferId, String tgtExampleFile,
			String tgtdocType, String tgtAgent, String tgtPrHostInfo, String tgtQaHostInfo, String tgtPort,
			String tgtcredentials, String tgtQaCredentials, String tgtApplicationName, String tgtVendorName,
			String tgtTeamName, String tgtContactInfo, String tgtSupportTeamPager, String tgtsupportEmail) {
		super();
		this.id = id;
		this.identifier = identifier;
		this.xferName = xferName;
		this.direction = direction;
		this.businessPurpose = businessPurpose;
		this.status = status;
		this.sla = sla;
		this.dataClassification = dataClassification;
		this.xferInterval = xferInterval;
		this.xferDailyVol = xferDailyVol;
		this.xferAvgFileSize = xferAvgFileSize;
		this.changeId = changeId;
		this.suffix = suffix;
		this.sourceSystem = sourceSystem;
		this.srcTransferId = srcTransferId;
		this.srcExampleFile = srcExampleFile;
		this.srcdocType = srcdocType;
		this.srcTransPort = srcTransPort;
		this.srcPrHostInfo = srcPrHostInfo;
		this.srcQaHostInfo = srcQaHostInfo;
		this.srcPort = srcPort;
		this.srcCredentials = srcCredentials;
		this.srcQaCredentials = srcQaCredentials;
		this.srcApplicationName = srcApplicationName;
		this.scrVendorName = scrVendorName;
		this.srcTeamName = srcTeamName;
		this.srccontactInfo = srccontactInfo;
		this.srcSupportTeamPager = srcSupportTeamPager;
		this.srcSupportteamEmail = srcSupportteamEmail;
		this.destinationSystem = destinationSystem;
		this.TgtTransferId = tgtTransferId;
		this.tgtExampleFile = tgtExampleFile;
		this.tgtdocType = tgtdocType;
		this.tgtAgent = tgtAgent;
		this.tgtPrHostInfo = tgtPrHostInfo;
		this.tgtQaHostInfo = tgtQaHostInfo;
		this.tgtPort = tgtPort;
		this.tgtcredentials = tgtcredentials;
		this.tgtQaCredentials = tgtQaCredentials;
		this.tgtApplicationName = tgtApplicationName;
		this.tgtVendorName = tgtVendorName;
		this.tgtTeamName = tgtTeamName;
		this.tgtContactInfo = tgtContactInfo;
		this.tgtSupportTeamPager = tgtSupportTeamPager;
		this.tgtsupportEmail = tgtsupportEmail;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getIdentifier() {
		return identifier;
	}

	public void setIdentifier(String identifier) {
		this.identifier = identifier;
	}

	public String getXferName() {
		return xferName;
	}

	public void setXferName(String xferName) {
		this.xferName = xferName;
	}

	public String getDirection() {
		return direction;
	}

	public void setDirection(String direction) {
		this.direction = direction;
	}

	public String getBusinessPurpose() {
		return businessPurpose;
	}

	public void setBusinessPurpose(String businessPurpose) {
		this.businessPurpose = businessPurpose;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getSla() {
		return sla;
	}

	public void setSla(String sla) {
		this.sla = sla;
	}

	public String getDataClassification() {
		return dataClassification;
	}

	public void setDataClassification(String dataClassification) {
		this.dataClassification = dataClassification;
	}

	public String getXferInterval() {
		return xferInterval;
	}

	public void setXferInterval(String xferInterval) {
		this.xferInterval = xferInterval;
	}

	public String getXferDailyVol() {
		return xferDailyVol;
	}

	public void setXferDailyVol(String xferDailyVol) {
		this.xferDailyVol = xferDailyVol;
	}

	public String getXferAvgFileSize() {
		return xferAvgFileSize;
	}

	public void setXferAvgFileSize(String xferAvgFileSize) {
		this.xferAvgFileSize = xferAvgFileSize;
	}

	public String getChangeId() {
		return changeId;
	}

	public void setChangeId(String changeId) {
		this.changeId = changeId;
	}

	public String getSuffix() {
		return suffix;
	}

	public void setSuffix(String suffix) {
		this.suffix = suffix;
	}

	public String getSourceSystem() {
		return sourceSystem;
	}

	public void setSourceSystem(String sourceSystem) {
		this.sourceSystem = sourceSystem;
	}

	public String getSrcTransferId() {
		return srcTransferId;
	}

	public void setSrcTransferId(String srcTransferId) {
		this.srcTransferId = srcTransferId;
	}

	public String getSrcExampleFile() {
		return srcExampleFile;
	}

	public void setSrcExampleFile(String srcExampleFile) {
		this.srcExampleFile = srcExampleFile;
	}

	public String getSrcdocType() {
		return srcdocType;
	}

	public void setSrcdocType(String srcdocType) {
		this.srcdocType = srcdocType;
	}

	public String getSrcTransPort() {
		return srcTransPort;
	}

	public void setSrcTransPort(String srcTransPort) {
		this.srcTransPort = srcTransPort;
	}

	public String getSrcPrHostInfo() {
		return srcPrHostInfo;
	}

	public void setSrcPrHostInfo(String srcPrHostInfo) {
		this.srcPrHostInfo = srcPrHostInfo;
	}

	public String getSrcQaHostInfo() {
		return srcQaHostInfo;
	}

	public void setSrcQaHostInfo(String srcQaHostInfo) {
		this.srcQaHostInfo = srcQaHostInfo;
	}

	public String getSrcPort() {
		return srcPort;
	}

	public void setSrcPort(String srcPort) {
		this.srcPort = srcPort;
	}

	public String getSrcCredentials() {
		return srcCredentials;
	}

	public void setSrcCredentials(String srcCredentials) {
		this.srcCredentials = srcCredentials;
	}

	public String getSrcQaCredentials() {
		return srcQaCredentials;
	}

	public void setSrcQaCredentials(String srcQaCredentials) {
		this.srcQaCredentials = srcQaCredentials;
	}

	public String getSrcApplicationName() {
		return srcApplicationName;
	}

	public void setSrcApplicationName(String srcApplicationName) {
		this.srcApplicationName = srcApplicationName;
	}

	public String getScrVendorName() {
		return scrVendorName;
	}

	public void setScrVendorName(String scrVendorName) {
		this.scrVendorName = scrVendorName;
	}

	public String getSrcTeamName() {
		return srcTeamName;
	}

	public void setSrcTeamName(String srcTeamName) {
		this.srcTeamName = srcTeamName;
	}

	public String getSrccontactInfo() {
		return srccontactInfo;
	}

	public void setSrccontactInfo(String srccontactInfo) {
		this.srccontactInfo = srccontactInfo;
	}

	public String getSrcSupportTeamPager() {
		return srcSupportTeamPager;
	}

	public void setSrcSupportTeamPager(String srcSupportTeamPager) {
		this.srcSupportTeamPager = srcSupportTeamPager;
	}

	public String getSrcSupportteamEmail() {
		return srcSupportteamEmail;
	}

	public void setSrcSupportteamEmail(String srcSupportteamEmail) {
		this.srcSupportteamEmail = srcSupportteamEmail;
	}

	public String getDestinationSystem() {
		return destinationSystem;
	}

	public void setDestinationSystem(String destinationSystem) {
		this.destinationSystem = destinationSystem;
	}

	public String getTgtTransferId() {
		return TgtTransferId;
	}

	public void setTgtTransferId(String tgtTransferId) {
		TgtTransferId = tgtTransferId;
	}

	public String getTgtExampleFile() {
		return tgtExampleFile;
	}

	public void setTgtExampleFile(String tgtExampleFile) {
		this.tgtExampleFile = tgtExampleFile;
	}

	public String getTgtdocType() {
		return tgtdocType;
	}

	public void setTgtdocType(String tgtdocType) {
		this.tgtdocType = tgtdocType;
	}

	public String getTgtAgent() {
		return tgtAgent;
	}

	public void setTgtAgent(String tgtAgent) {
		this.tgtAgent = tgtAgent;
	}

	public String getTgtPrHostInfo() {
		return tgtPrHostInfo;
	}

	public void setTgtPrHostInfo(String tgtPrHostInfo) {
		this.tgtPrHostInfo = tgtPrHostInfo;
	}

	public String getTgtQaHostInfo() {
		return tgtQaHostInfo;
	}

	public void setTgtQaHostInfo(String tgtQaHostInfo) {
		this.tgtQaHostInfo = tgtQaHostInfo;
	}

	public String getTgtPort() {
		return tgtPort;
	}

	public void setTgtPort(String tgtPort) {
		this.tgtPort = tgtPort;
	}

	public String getTgtcredentials() {
		return tgtcredentials;
	}

	public void setTgtcredentials(String tgtcredentials) {
		this.tgtcredentials = tgtcredentials;
	}

	public String getTgtQaCredentials() {
		return tgtQaCredentials;
	}

	public void setTgtQaCredentials(String tgtQaCredentials) {
		this.tgtQaCredentials = tgtQaCredentials;
	}

	public String getTgtApplicationName() {
		return tgtApplicationName;
	}

	public void setTgtApplicationName(String tgtApplicationName) {
		this.tgtApplicationName = tgtApplicationName;
	}

	public String getTgtVendorName() {
		return tgtVendorName;
	}

	public void setTgtVendorName(String tgtVendorName) {
		this.tgtVendorName = tgtVendorName;
	}

	public String getTgtTeamName() {
		return tgtTeamName;
	}

	public void setTgtTeamName(String tgtTeamName) {
		this.tgtTeamName = tgtTeamName;
	}

	public String getTgtContactInfo() {
		return tgtContactInfo;
	}

	public void setTgtContactInfo(String tgtContactInfo) {
		this.tgtContactInfo = tgtContactInfo;
	}

	public String getTgtSupportTeamPager() {
		return tgtSupportTeamPager;
	}

	public void setTgtSupportTeamPager(String tgtSupportTeamPager) {
		this.tgtSupportTeamPager = tgtSupportTeamPager;
	}

	public String getTgtsupportEmail() {
		return tgtsupportEmail;
	}

	public void setTgtsupportEmail(String tgtsupportEmail) {
		this.tgtsupportEmail = tgtsupportEmail;
	}

	public void setDateCreated() {
		this.dateCreated = new Date();
	}
	
	public Date getDateCreated() {
		return dateCreated;
	}

	
}
