/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.liferay.grow.likes.model;

import aQute.bnd.annotation.ProviderType;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@ProviderType
public class AssetLikeSoap implements Serializable {
	public static AssetLikeSoap toSoapModel(AssetLike model) {
		AssetLikeSoap soapModel = new AssetLikeSoap();

		soapModel.setUuid(model.getUuid());
		soapModel.setId(model.getId());
		soapModel.setUserId(model.getUserId());
		soapModel.setAssetEntryId(model.getAssetEntryId());
		soapModel.setRank(model.getRank());
		soapModel.setCreateDate(model.getCreateDate());

		return soapModel;
	}

	public static AssetLikeSoap[] toSoapModels(AssetLike[] models) {
		AssetLikeSoap[] soapModels = new AssetLikeSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static AssetLikeSoap[][] toSoapModels(AssetLike[][] models) {
		AssetLikeSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new AssetLikeSoap[models.length][models[0].length];
		}
		else {
			soapModels = new AssetLikeSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static AssetLikeSoap[] toSoapModels(List<AssetLike> models) {
		List<AssetLikeSoap> soapModels = new ArrayList<AssetLikeSoap>(models.size());

		for (AssetLike model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new AssetLikeSoap[soapModels.size()]);
	}

	public AssetLikeSoap() {
	}

	public long getPrimaryKey() {
		return _id;
	}

	public void setPrimaryKey(long pk) {
		setId(pk);
	}

	public String getUuid() {
		return _uuid;
	}

	public void setUuid(String uuid) {
		_uuid = uuid;
	}

	public long getId() {
		return _id;
	}

	public void setId(long id) {
		_id = id;
	}

	public long getUserId() {
		return _userId;
	}

	public void setUserId(long userId) {
		_userId = userId;
	}

	public long getAssetEntryId() {
		return _assetEntryId;
	}

	public void setAssetEntryId(long assetEntryId) {
		_assetEntryId = assetEntryId;
	}

	public long getRank() {
		return _rank;
	}

	public void setRank(long rank) {
		_rank = rank;
	}

	public Date getCreateDate() {
		return _createDate;
	}

	public void setCreateDate(Date createDate) {
		_createDate = createDate;
	}

	private String _uuid;
	private long _id;
	private long _userId;
	private long _assetEntryId;
	private long _rank;
	private Date _createDate;
}