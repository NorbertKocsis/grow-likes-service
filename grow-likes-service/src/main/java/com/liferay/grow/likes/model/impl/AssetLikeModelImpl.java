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

package com.liferay.grow.likes.model.impl;

import aQute.bnd.annotation.ProviderType;

import com.liferay.expando.kernel.model.ExpandoBridge;
import com.liferay.expando.kernel.util.ExpandoBridgeFactoryUtil;

import com.liferay.grow.likes.model.AssetLike;
import com.liferay.grow.likes.model.AssetLikeModel;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.model.impl.BaseModelImpl;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.service.UserLocalServiceUtil;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;

import java.io.Serializable;

import java.sql.Types;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * The base model implementation for the AssetLike service. Represents a row in the &quot;AssetLike&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link AssetLikeModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link AssetLikeImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AssetLikeImpl
 * @see AssetLike
 * @see AssetLikeModel
 * @generated
 */
@ProviderType
public class AssetLikeModelImpl extends BaseModelImpl<AssetLike>
	implements AssetLikeModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a asset like model instance should use the {@link AssetLike} interface instead.
	 */
	public static final String TABLE_NAME = "AssetLike";
	public static final Object[][] TABLE_COLUMNS = {
			{ "uuid_", Types.VARCHAR },
			{ "id_", Types.BIGINT },
			{ "userId", Types.BIGINT },
			{ "assetEntryId", Types.BIGINT },
			{ "rank", Types.BIGINT },
			{ "createDate", Types.TIMESTAMP }
		};
	public static final Map<String, Integer> TABLE_COLUMNS_MAP = new HashMap<String, Integer>();

	static {
		TABLE_COLUMNS_MAP.put("uuid_", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("id_", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("userId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("assetEntryId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("rank", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("createDate", Types.TIMESTAMP);
	}

	public static final String TABLE_SQL_CREATE = "create table AssetLike (uuid_ VARCHAR(75) null,id_ LONG not null primary key,userId LONG,assetEntryId LONG,rank LONG,createDate DATE null)";
	public static final String TABLE_SQL_DROP = "drop table AssetLike";
	public static final String ORDER_BY_JPQL = " ORDER BY assetLike.id ASC";
	public static final String ORDER_BY_SQL = " ORDER BY AssetLike.id_ ASC";
	public static final String DATA_SOURCE = "liferayDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.grow.likes.service.util.ServiceProps.get(
				"value.object.entity.cache.enabled.com.liferay.grow.likes.model.AssetLike"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.grow.likes.service.util.ServiceProps.get(
				"value.object.finder.cache.enabled.com.liferay.grow.likes.model.AssetLike"),
			true);
	public static final boolean COLUMN_BITMASK_ENABLED = GetterUtil.getBoolean(com.liferay.grow.likes.service.util.ServiceProps.get(
				"value.object.column.bitmask.enabled.com.liferay.grow.likes.model.AssetLike"),
			true);
	public static final long ASSETENTRYID_COLUMN_BITMASK = 1L;
	public static final long USERID_COLUMN_BITMASK = 2L;
	public static final long UUID_COLUMN_BITMASK = 4L;
	public static final long ID_COLUMN_BITMASK = 8L;
	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.grow.likes.service.util.ServiceProps.get(
				"lock.expiration.time.com.liferay.grow.likes.model.AssetLike"));

	public AssetLikeModelImpl() {
	}

	@Override
	public long getPrimaryKey() {
		return _id;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _id;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
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

		attributes.put("entityCacheEnabled", isEntityCacheEnabled());
		attributes.put("finderCacheEnabled", isFinderCacheEnabled());

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
	public String getUuid() {
		if (_uuid == null) {
			return "";
		}
		else {
			return _uuid;
		}
	}

	@Override
	public void setUuid(String uuid) {
		if (_originalUuid == null) {
			_originalUuid = _uuid;
		}

		_uuid = uuid;
	}

	public String getOriginalUuid() {
		return GetterUtil.getString(_originalUuid);
	}

	@Override
	public long getId() {
		return _id;
	}

	@Override
	public void setId(long id) {
		_id = id;
	}

	@Override
	public long getUserId() {
		return _userId;
	}

	@Override
	public void setUserId(long userId) {
		_columnBitmask |= USERID_COLUMN_BITMASK;

		if (!_setOriginalUserId) {
			_setOriginalUserId = true;

			_originalUserId = _userId;
		}

		_userId = userId;
	}

	@Override
	public String getUserUuid() {
		try {
			User user = UserLocalServiceUtil.getUserById(getUserId());

			return user.getUuid();
		}
		catch (PortalException pe) {
			return "";
		}
	}

	@Override
	public void setUserUuid(String userUuid) {
	}

	public long getOriginalUserId() {
		return _originalUserId;
	}

	@Override
	public long getAssetEntryId() {
		return _assetEntryId;
	}

	@Override
	public void setAssetEntryId(long assetEntryId) {
		_columnBitmask |= ASSETENTRYID_COLUMN_BITMASK;

		if (!_setOriginalAssetEntryId) {
			_setOriginalAssetEntryId = true;

			_originalAssetEntryId = _assetEntryId;
		}

		_assetEntryId = assetEntryId;
	}

	public long getOriginalAssetEntryId() {
		return _originalAssetEntryId;
	}

	@Override
	public long getRank() {
		return _rank;
	}

	@Override
	public void setRank(long rank) {
		_rank = rank;
	}

	@Override
	public Date getCreateDate() {
		return _createDate;
	}

	@Override
	public void setCreateDate(Date createDate) {
		_createDate = createDate;
	}

	public long getColumnBitmask() {
		return _columnBitmask;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return ExpandoBridgeFactoryUtil.getExpandoBridge(0,
			AssetLike.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public AssetLike toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (AssetLike)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelInterfaces, new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		AssetLikeImpl assetLikeImpl = new AssetLikeImpl();

		assetLikeImpl.setUuid(getUuid());
		assetLikeImpl.setId(getId());
		assetLikeImpl.setUserId(getUserId());
		assetLikeImpl.setAssetEntryId(getAssetEntryId());
		assetLikeImpl.setRank(getRank());
		assetLikeImpl.setCreateDate(getCreateDate());

		assetLikeImpl.resetOriginalValues();

		return assetLikeImpl;
	}

	@Override
	public int compareTo(AssetLike assetLike) {
		long primaryKey = assetLike.getPrimaryKey();

		if (getPrimaryKey() < primaryKey) {
			return -1;
		}
		else if (getPrimaryKey() > primaryKey) {
			return 1;
		}
		else {
			return 0;
		}
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof AssetLike)) {
			return false;
		}

		AssetLike assetLike = (AssetLike)obj;

		long primaryKey = assetLike.getPrimaryKey();

		if (getPrimaryKey() == primaryKey) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return (int)getPrimaryKey();
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return ENTITY_CACHE_ENABLED;
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return FINDER_CACHE_ENABLED;
	}

	@Override
	public void resetOriginalValues() {
		AssetLikeModelImpl assetLikeModelImpl = this;

		assetLikeModelImpl._originalUuid = assetLikeModelImpl._uuid;

		assetLikeModelImpl._originalUserId = assetLikeModelImpl._userId;

		assetLikeModelImpl._setOriginalUserId = false;

		assetLikeModelImpl._originalAssetEntryId = assetLikeModelImpl._assetEntryId;

		assetLikeModelImpl._setOriginalAssetEntryId = false;

		assetLikeModelImpl._columnBitmask = 0;
	}

	@Override
	public CacheModel<AssetLike> toCacheModel() {
		AssetLikeCacheModel assetLikeCacheModel = new AssetLikeCacheModel();

		assetLikeCacheModel.uuid = getUuid();

		String uuid = assetLikeCacheModel.uuid;

		if ((uuid != null) && (uuid.length() == 0)) {
			assetLikeCacheModel.uuid = null;
		}

		assetLikeCacheModel.id = getId();

		assetLikeCacheModel.userId = getUserId();

		assetLikeCacheModel.assetEntryId = getAssetEntryId();

		assetLikeCacheModel.rank = getRank();

		Date createDate = getCreateDate();

		if (createDate != null) {
			assetLikeCacheModel.createDate = createDate.getTime();
		}
		else {
			assetLikeCacheModel.createDate = Long.MIN_VALUE;
		}

		return assetLikeCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(13);

		sb.append("{uuid=");
		sb.append(getUuid());
		sb.append(", id=");
		sb.append(getId());
		sb.append(", userId=");
		sb.append(getUserId());
		sb.append(", assetEntryId=");
		sb.append(getAssetEntryId());
		sb.append(", rank=");
		sb.append(getRank());
		sb.append(", createDate=");
		sb.append(getCreateDate());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(22);

		sb.append("<model><model-name>");
		sb.append("com.liferay.grow.likes.model.AssetLike");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>uuid</column-name><column-value><![CDATA[");
		sb.append(getUuid());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>id</column-name><column-value><![CDATA[");
		sb.append(getId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>userId</column-name><column-value><![CDATA[");
		sb.append(getUserId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>assetEntryId</column-name><column-value><![CDATA[");
		sb.append(getAssetEntryId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>rank</column-name><column-value><![CDATA[");
		sb.append(getRank());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>createDate</column-name><column-value><![CDATA[");
		sb.append(getCreateDate());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private static final ClassLoader _classLoader = AssetLike.class.getClassLoader();
	private static final Class<?>[] _escapedModelInterfaces = new Class[] {
			AssetLike.class, ModelWrapper.class
		};
	private String _uuid;
	private String _originalUuid;
	private long _id;
	private long _userId;
	private long _originalUserId;
	private boolean _setOriginalUserId;
	private long _assetEntryId;
	private long _originalAssetEntryId;
	private boolean _setOriginalAssetEntryId;
	private long _rank;
	private Date _createDate;
	private long _columnBitmask;
	private AssetLike _escapedModel;
}