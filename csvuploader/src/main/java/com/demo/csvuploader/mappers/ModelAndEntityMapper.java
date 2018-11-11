package com.demo.csvuploader.mappers;

import org.springframework.stereotype.Component;

import com.demo.csvuploader.data.entities.TransferEntity;
import com.demo.csvuploader.models.Transfer;

@Component
public class ModelAndEntityMapper {

	public Transfer entityToModel(TransferEntity entity) {
		Transfer model = new Transfer();
		//model.setId(entity.getId());
		model.setIdentifier(entity.getIdentifier());
		model.setXferName(entity.getXferName());
		model.setDirection(entity.getDirection());
		model.setBusinessPurpose(entity.getBusinessPurpose());
		model.setStatus(entity.getStatus());
		model.setSla(entity.getSla());
		model.setDataClassification(entity.getDataClassification());
		model.setXferInterval(entity.getXferInterval());
		model.setXferDailyVol(entity.getXferDailyVol());
		model.setXferAvgFileSize(entity.getXferAvgFileSize());
		model.setChangeId(entity.getChangeId());
		model.setSuffix(entity.getSuffix());
		model.setSourceSystem(entity.getSourceSystem());
		model.setSrcTransferId(entity.getSrcTransferId());
		model.setSrcExampleFile(entity.getSrcExampleFile());
		model.setSrcdocType(entity.getSrcdocType());
		model.setSrcTransPort(entity.getSrcTransPort());
		model.setSrcPrHostInfio(entity.getSrcPrHostInfo());
		model.setSrcQaHostInfo(entity.getSrcPrHostInfo());
		model.setSrcPort(entity.getSrcPort());
		model.setSrcCredentials(entity.getSrcCredentials());
		model.setSrcQaCredentials(entity.getSrcQaCredentials());
		model.setSrcApplicationName(entity.getSrcApplicationName());
		model.setScrVendorName(entity.getScrVendorName());
		model.setSrcTeamName(entity.getSrcTeamName());
		model.setSrccontactInfo(entity.getSrccontactInfo());
		model.setSrcSupportTeamPager(entity.getSrcSupportTeamPager());
		model.setSrcSupportteamEmail(entity.getSrcSupportteamEmail());
		model.setDestinationSystem(entity.getDestinationSystem());
		model.setTgtTransferId(entity.getTgtTransferId());
		model.setTgtExampleFile(entity.getTgtExampleFile());
		model.setTgtdocType(entity.getTgtdocType());
		model.setTgtAgent(entity.getTgtAgent());
		model.setTgtPrHostInfo(entity.getTgtPrHostInfo());
		model.setTgtQaHostInfo(entity.getTgtQaHostInfo());
		model.setTgtPort(entity.getTgtPort());
		model.setTgtCredentials(entity.getTgtcredentials());
		model.setTgtQaCredentials(entity.getTgtQaCredentials());
		model.setTgtApplicationName(entity.getTgtApplicationName());
		model.setTgtVendorName(entity.getTgtVendorName());
		model.setTgtTeamName(entity.getTgtTeamName());
		model.setTgtContactInfo(entity.getTgtContactInfo());
		model.setTgtSupportTeamPager(entity.getTgtSupportTeamPager());
		model.setTgtsupportEmail(entity.getTgtsupportEmail());
		
		return model;
	}
	
	public TransferEntity modelToEntity(Transfer model) {
		TransferEntity entity = new TransferEntity();
		//entity.setId(model.getId());
		entity.setIdentifier(model.getIdentifier());
		entity.setXferName(model.getXferName());
		entity.setDirection(model.getDirection());
		entity.setBusinessPurpose(model.getBusinessPurpose());
		entity.setStatus(model.getStatus());
		entity.setSla(model.getSla());
		entity.setDataClassification(model.getDataClassification());
		entity.setXferInterval(model.getXferInterval());
		entity.setXferDailyVol(model.getXferDailyVol());
		entity.setXferAvgFileSize(model.getXferAvgFileSize());
		entity.setChangeId(model.getChangeId());
		entity.setSuffix(model.getSuffix());
		entity.setSourceSystem(model.getSourceSystem());
		entity.setSrcTransferId(model.getSrcTransferId());
		entity.setSrcExampleFile(model.getSrcExampleFile());
		entity.setSrcdocType(model.getSrcdocType());
		entity.setSrcTransPort(model.getSrcTransPort());
		entity.setSrcPrHostInfo(model.getSrcPrHostInfio());
		entity.setSrcQaHostInfo(model.getSrcQaHostInfo());
		entity.setSrcPort(model.getSrcPort());
		entity.setSrcCredentials(model.getSrcCredentials());
		entity.setSrcQaCredentials(model.getSrcQaCredentials());
		entity.setSrcApplicationName(model.getSrcApplicationName());
		entity.setScrVendorName(model.getScrVendorName());
		entity.setSrcTeamName(model.getSrcTeamName());
		entity.setSrccontactInfo(model.getSrccontactInfo());
		entity.setSrcSupportTeamPager(model.getSrcSupportTeamPager());
		entity.setSrcSupportteamEmail(model.getSrcSupportteamEmail());
		entity.setDestinationSystem(model.getDestinationSystem());
		entity.setTgtTransferId(model.getTgtTransferId());
		entity.setTgtExampleFile(model.getTgtExampleFile());
		entity.setTgtdocType(model.getTgtdocType());
		entity.setTgtAgent(model.getTgtAgent());
		entity.setTgtPrHostInfo(model.getTgtPrHostInfo());
		entity.setTgtQaHostInfo(model.getTgtQaHostInfo());
		entity.setTgtPort(model.getTgtPort());
		entity.setTgtcredentials(model.getTgtCredentials());
		entity.setTgtQaCredentials(model.getTgtQaCredentials());
		entity.setTgtApplicationName(model.getTgtApplicationName());
		entity.setTgtVendorName(model.getTgtVendorName());
		entity.setTgtTeamName(model.getTgtTeamName());
		entity.setTgtContactInfo(model.getTgtContactInfo());
		entity.setTgtSupportTeamPager(model.getTgtSupportTeamPager());
		entity.setTgtsupportEmail(model.getTgtsupportEmail());
		
		return entity;
	}
}
