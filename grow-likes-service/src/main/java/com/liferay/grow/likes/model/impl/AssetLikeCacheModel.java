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

import com.liferay.grow.likes.model.AssetLike;

import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.util.HashUtil;
import com.liferay.portal.kernel.util.StringBundler;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing AssetLike in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see AssetLike
 * @generated
 */
@ProviderType
public class AssetLikeCacheModel implements CacheModel<AssetLike>,
	Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof AssetLikeCacheModel)) {
			return false;
		}

		AssetLikeCacheModel assetLikeCacheModel = (AssetLikeCacheModel)obj;

		if (id == assetLikeCacheModel.id) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, id);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(13);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", id=");
		sb.append(id);
		sb.append(", userId=");
		sb.append(userId);
		sb.append(", assetEntryId=");
		sb.append(assetEntryId);
		sb.append(", rank=");
		sb.append(rank);
		sb.append(", createDate=");
		sb.append(createDate);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public AssetLike toEntityModel() {
		AssetLikeImpl assetLikeImpl = new AssetLikeImpl();

		if (uuid == null) {
			assetLikeImpl.setUuid("");
		}
		else {
			assetLikeImpl.setUuid(uuid);
		}

		assetLikeImpl.setId(id);
		assetLikeImpl.setUserId(userId);
		assetLikeImpl.setAssetEntryId(assetEntryId);
		assetLikeImpl.setRank(rank);

		if (createDate == Long.MIN_VALUE) {
			assetLikeImpl.setCreateDate(null);
		}
		else {
			assetLikeImpl.setCreateDate(new Date(createDate));
		}

		assetLikeImpl.resetOriginalValues();

		return assetLikeImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		id = objectInput.readLong();

		userId = objectInput.readLong();

		assetEntryId = objectInput.readLong();

		rank = objectInput.readLong();
		createDate = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		if (uuid == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(uuid);
		}

		objectOutput.writeLong(id);

		objectOutput.writeLong(userId);

		objectOutput.writeLong(assetEntryId);

		objectOutput.writeLong(rank);
		objectOutput.writeLong(createDate);
	}

	public String uuid;
	public long id;
	public long userId;
	public long assetEntryId;
	public long rank;
	public long createDate;
}