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

package com.liferay.grow.likes.service.impl;

import com.liferay.grow.likes.model.AssetLike;
import com.liferay.grow.likes.service.base.AssetLikeLocalServiceBaseImpl;
import com.liferay.portal.kernel.exception.PortalException;

import java.util.Date;
import java.util.List;

/**
 * The implementation of the asset like local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link com.liferay.grow.likes.service.AssetLikeLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AssetLikeLocalServiceBaseImpl
 * @see com.liferay.grow.likes.service.AssetLikeLocalServiceUtil
 */
public class AssetLikeLocalServiceImpl extends AssetLikeLocalServiceBaseImpl {

	/**
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this class directly. Always use {@link com.liferay.grow.likes.service.AssetLikeLocalServiceUtil} to access the asset like local service.
	 */
	public AssetLike addAssetLike(long userId, long assetEntryId, long rank) {
		long id = counterLocalService.increment(AssetLike.class.getName());

		AssetLike assetLike = createAssetLike(id);

		assetLike.setUserId(userId);
		assetLike.setAssetEntryId(assetEntryId);
		assetLike.setRank(rank);
		assetLike.setCreateDate(new Date());

		assetLike = super.addAssetLike(assetLike);

		return assetLike;
	}

	public void deleteAssetLike(long userId, long assetEntryId)
		throws PortalException {

		List<AssetLike> assetLikes = assetLikePersistence.findByU_A(
			userId, assetEntryId);

		for (AssetLike assetLike : assetLikes) {
			assetLikeLocalService.deleteAssetLike(assetLike);
		}
	}

}