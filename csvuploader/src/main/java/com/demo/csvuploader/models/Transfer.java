package com.demo.csvuploader.models;

public class Transfer {
	//private int id;
	private String identifier;
	private String xferName;
    private String direction;
    private String businessPurpose;
    private String status;
    private String sla;
    private String dataClassification;
    private String xferInterval;
    private String xferDailyVol;
    private String xferAvgFileSize;
	private String changeId;
	private String suffix;
	private String sourceSystem; //new one
	private String srcTransferId;
	private String srcExampleFile;
	private String srcdocType;
	private String srcTransPort;
	private String srcPrHostInfio;
	private String srcQaHostInfo;
	private String srcPort;
	private String srcCredentials;
	private String srcQaCredentials;
	private String srcApplicationName;
	private String scrVendorName;
	private String srcTeamName;
	private String srccontactInfo;
	private String srcSupportTeamPager;
	private String srcSupportteamEmail;
	private String destinationSystem; // New one
	private String TgtTransferId;
	private String tgtExampleFile;
	private String tgtdocType;
	private String tgtAgent;
	private String tgtPrHostInfo;
	private String tgtQaHostInfo;
	private String tgtPort;
	private String tgtCredentials;
	private String tgtQaCredentials; // New One
	private String tgtApplicationName;
	private String tgtVendorName;
	private String tgtTeamName;
	private String tgtContactInfo;
	private String tgtSupportTeamPager;
	private String tgtsupportEmail;
	// private String notes; // Removed One
	
	public Transfer() {
		// TODO Auto-generated constructor stub
	}
	public Transfer(String identifier, String xferName, String direction, String businessPurpose, String status,
			String sla, String dataClassification, String xferInterval, String xferDailyVol, String xferAvgFileSize,
			String changeId, String suffix, String sourceSystem, String srcTransferId, String srcExampleFile,
			String srcdocType, String srcTransPort, String srcPrHostInfio, String srcQaHostInfo, String srcPort,
			String srcCredentials, String srcQaCredentials, String srcApplicationName, String scrVendorName,
			String srcTeamName, String srccontactInfo, String srcSupportTeamPager, String srcSupportteamEmail,
			String destinationSystem, String tgtTransferId, String tgtExampleFile, String tgtdocType, String tgtAgent,
			String tgtPrHostInfo, String tgtQaHostInfo, String tgtPort, String tgtCredentials, String tgtQaCredentials,
			String tgtApplicationName, String tgtVendorName, String tgtTeamName, String tgtContactInfo,
			String tgtSupportTeamPager, String tgtsupportEmail) {
		super();
		//this.id = id;
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
		this.srcPrHostInfio = srcPrHostInfio;
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
		TgtTransferId = tgtTransferId;
		this.tgtExampleFile = tgtExampleFile;
		this.tgtdocType = tgtdocType;
		this.tgtAgent = tgtAgent;
		this.tgtPrHostInfo = tgtPrHostInfo;
		this.tgtQaHostInfo = tgtQaHostInfo;
		this.tgtPort = tgtPort;
		this.tgtCredentials = tgtCredentials;
		this.tgtQaCredentials = tgtQaCredentials;
		this.tgtApplicationName = tgtApplicationName;
		this.tgtVendorName = tgtVendorName;
		this.tgtTeamName = tgtTeamName;
		this.tgtContactInfo = tgtContactInfo;
		this.tgtSupportTeamPager = tgtSupportTeamPager;
		this.tgtsupportEmail = tgtsupportEmail;
	}
//	public int getId() {
//		return id;
//	}
//	public void setId(int id) {
//		this.id = id;
//	}
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
	public void setSourceSystem(String sourcesystem) {
		this.sourceSystem = sourcesystem;
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
	public String getSrcPrHostInfio() {
		return srcPrHostInfio;
	}
	public void setSrcPrHostInfio(String srcPrHostInfio) {
		this.srcPrHostInfio = srcPrHostInfio;
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
	public String getTgtCredentials() {
		return tgtCredentials;
	}
	public void setTgtCredentials(String tgtCredentials) {
		this.tgtCredentials = tgtCredentials;
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

}
