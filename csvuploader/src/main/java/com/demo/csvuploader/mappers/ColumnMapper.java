package com.demo.csvuploader.mappers;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Component;

@Component
public class ColumnMapper {
	Map<String, String> map = new HashMap<>();
	
	public ColumnMapper() {

		map.put("Identifier", "setIdentifier");
		map.put("Xfername", "setXferName");
		map.put("Direction", "setDirection");
		map.put("Businesspurpose", "setBusinessPurpose");
		map.put("Status", "setStatus");
		map.put("Sla", "setSla");
		map.put("Dataclassification", "setDataClassification");
		map.put("Xferinterval", "setXferInterval");
		map.put("Xferdailyvol", "setXferDailyVol");
		map.put("Xferavgfilesize", "setXferAvgFileSize");
		map.put("Changeid", "setChangeId");
		map.put("Suffix", "setSuffix");
		map.put("Source System", "setSourceSystem");
		map.put("Srctransferid", "setSrcTransferId");
		map.put("Srcexamplefile", "setSrcExampleFile");
		map.put("Srcdoctype", "setSrcdocType");
		map.put("Srctransport", "setSrcTransPort");
		map.put("Srcprhostinfio", "setSrcPrHostInfo");
		map.put("Srcqahostinfo", "setSrcQaHostInfo");
		map.put("Srcport", "setSrcPort");
		map.put("Srccredentials", "setSrcCredentials");
		map.put("Srcqacredentials", "setSrcQaCredentials");
		map.put("Srcapplicationname", "setSrcApplicationName");
		map.put("Scrvendorname", "setScrVendorName");
		map.put("Srcteamname", "setSrcTeamName");
		map.put("Srccontactinfo", "setSrccontactInfo");
		map.put("Srcsupportteampager", "setSrcSupportTeamPager");
		map.put("Srcsupportteamemail", "setSrcSupportteamEmail");
		map.put("Destination System", "setDestinationSystem");
		map.put("Tgtthansferid", "setTgtTransferId");
		map.put("Tgtexamplefile", "setTgtExampleFile");
		map.put("Tgtdoctype", "setTgtdocType");
		map.put("Tgtagent", "setTgtAgent");
		map.put("Tgtprhostinfo", "setTgtPrHostInfo");
		map.put("Tgtqahostinfo", "setTgtQaHostInfo");
		map.put("Tgtport", "setTgtPort");
		map.put("Tgtcredentials", "setTgtcredentials");
		map.put("Tgtqacredentials", "setTgtQaCredentials");
		map.put("Tgtapplicationname", "setTgtApplicationName");
		map.put("Tgtvendorname", "setTgtVendorName");
		map.put("Tgtteamname", "setTgtTeamName");
		map.put("Tgtcontactinfo", "setTgtContactInfo");
		map.put("Tgtsupportteampager", "setTgtSupportTeamPager");
		map.put("Tgtsupportemail", "setTgtsupportEmail");
	}
	
	public String getMappedDbColName(String dbColName) {
		return map.get(dbColName);
	}
}
