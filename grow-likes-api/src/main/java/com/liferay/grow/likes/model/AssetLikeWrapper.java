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

import com.liferay.expando.kernel.model.ExpandoBridge;

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.service.ServiceContext;

import java.io.Serializable;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * <p>
 * This class is a wrapper for {@link AssetLike}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AssetLike
 * @generated
 */
@ProviderType
public class AssetLikeWrapper implements AssetLike, ModelWrapper<AssetLike> {
	public AssetLikeWrapper(AssetLike assetLike) {
		_assetLike = assetLike;
	}

	@Override
	public Class<?> getModelClass() {
		return AssetLike.class;
	}

	@Override
	public String getModelClassName() {
		return AssetLike.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("id", getId());
		attributes.put("userId", getUserId());
		attributes.put("assetEntryId", getAssetEntryId());
		attributes.put("rank", getRank());
		attributes.put("createDate", getCreateDate());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long id = (Long)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		Long userId = (Long)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
		}

		Long assetEntryId = (Long)attributes.get("assetEntryId");

		if (assetEntryId != null) {
			setAssetEntryId(assetEntryId);
		}

		Long rank = (Long)attributes.get("rank");

		if (rank != null) {
			setRank(rank);
		}

		Date createDate = (Date)attributes.get("createDate");

		if (createDate != null) {
			setCreateDate(createDate);
		}
	}

	@Override
	public Object clone() {
		return new AssetLikeWrapper((AssetLike)_assetLike.clone());
	}

	@Override
	public int compareTo(AssetLike assetLike) {
		return _assetLike.compareTo(assetLike);
	}

	/**
	* Returns the asset entry ID of this asset like.
	*
	* @return the asset entry ID of this asset like
	*/
	@Override
	public long getAssetEntryId() {
		return _assetLike.getAssetEntryId();
	}

	/**
	* Returns the create date of this asset like.
	*
	* @return the create date of this asset like
	*/
	@Override
	public Date getCreateDate() {
		return _assetLike.getCreateDate();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _assetLike.getExpandoBridge();
	}

	/**
	* Returns the ID of this asset like.
	*
	* @return the ID of this asset like
	*/
	@Override
	public long getId() {
		return _assetLike.getId();
	}

	/**
	* Returns the primary key of this asset like.
	*
	* @return the primary key of this asset like
	*/
	@Override
	public long getPrimaryKey() {
		return _assetLike.getPrimaryKey();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _assetLike.getPrimaryKeyObj();
	}

	/**
	* Returns the rank of this asset like.
	*
	* @return the rank of this asset like
	*/
	@Override
	public long getRank() {
		return _assetLike.getRank();
	}

	/**
	* Returns the user ID of this asset like.
	*
	* @return the user ID of this asset like
	*/
	@Override
	public long getUserId() {
		return _assetLike.getUserId();
	}

	/**
	* Returns the user uuid of this asset like.
	*
	* @return the user uuid of this asset like
	*/
	@Override
	public String getUserUuid() {
		return _assetLike.getUserUuid();
	}

	/**
	* Returns the uuid of this asset like.
	*
	* @return the uuid of this asset like
	*/
	@Override
	public String getUuid() {
		return _assetLike.getUuid();
	}

	@Override
	public int hashCode() {
		return _assetLike.hashCode();
	}

	@Override
	public boolean isCachedModel() {
		return _assetLike.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _assetLike.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _assetLike.isNew();
	}

	@Override
	public void persist() {
		_assetLike.persist();
	}

	/**
	* Sets the asset entry ID of this asset like.
	*
	* @param assetEntryId the asset entry ID of this asset like
	*/
	@Override
	public void setAssetEntryId(long assetEntryId) {
		_assetLike.setAssetEntryId(assetEntryId);
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_assetLike.setCachedModel(cachedModel);
	}

	/**
	* Sets the create date of this asset like.
	*
	* @param createDate the create date of this asset like
	*/
	@Override
	public void setCreateDate(Date createDate) {
		_assetLike.setCreateDate(createDate);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_assetLike.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_assetLike.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_assetLike.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the ID of this asset like.
	*
	* @param id the ID of this asset like
	*/
	@Override
	public void setId(long id) {
		_assetLike.setId(id);
	}

	@Override
	public void setNew(boolean n) {
		_assetLike.setNew(n);
	}

	/**
	* Sets the primary key of this asset like.
	*
	* @param primaryKey the primary key of this asset like
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_assetLike.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_assetLike.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the rank of this asset like.
	*
	* @param rank the rank of this asset like
	*/
	@Override
	public void setRank(long rank) {
		_assetLike.setRank(rank);
	}

	/**
	* Sets the user ID of this asset like.
	*
	* @param userId the user ID of this asset like
	*/
	@Override
	public void setUserId(long userId) {
		_assetLike.setUserId(userId);
	}

	/**
	* Sets the user uuid of this asset like.
	*
	* @param userUuid the user uuid of this asset like
	*/
	@Override
	public void setUserUuid(String userUuid) {
		_assetLike.setUserUuid(userUuid);
	}

	/**
	* Sets the uuid of this asset like.
	*
	* @param uuid the uuid of this asset like
	*/
	@Override
	public void setUuid(String uuid) {
		_assetLike.setUuid(uuid);
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<AssetLike> toCacheModel() {
		return _assetLike.toCacheModel();
	}

	@Override
	public AssetLike toEscapedModel() {
		return new AssetLikeWrapper(_assetLike.toEscapedModel());
	}

	@Override
	public String toString() {
		return _assetLike.toString();
	}

	@Override
	public AssetLike toUnescapedModel() {
		return new AssetLikeWrapper(_assetLike.toUnescapedModel());
	}

	@Override
	public String toXmlString() {
		return _assetLike.toXmlString();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof AssetLikeWrapper)) {
			return false;
		}

		AssetLikeWrapper assetLikeWrapper = (AssetLikeWrapper)obj;

		if (Objects.equals(_assetLike, assetLikeWrapper._assetLike)) {
			return true;
		}

		return false;
	}

	@Override
	public AssetLike getWrappedModel() {
		return _assetLike;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _assetLike.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _assetLike.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_assetLike.resetOriginalValues();
	}

	private final AssetLike _assetLike;
}