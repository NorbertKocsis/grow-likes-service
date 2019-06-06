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

package com.liferay.grow.likes.service;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link AssetLikeLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see AssetLikeLocalService
 * @generated
 */
@ProviderType
public class AssetLikeLocalServiceWrapper implements AssetLikeLocalService,
	ServiceWrapper<AssetLikeLocalService> {
	public AssetLikeLocalServiceWrapper(
		AssetLikeLocalService assetLikeLocalService) {
		_assetLikeLocalService = assetLikeLocalService;
	}

	/**
	* Adds the asset like to the database. Also notifies the appropriate model listeners.
	*
	* @param assetLike the asset like
	* @return the asset like that was added
	*/
	@Override
	public com.liferay.grow.likes.model.AssetLike addAssetLike(
		com.liferay.grow.likes.model.AssetLike assetLike) {
		return _assetLikeLocalService.addAssetLike(assetLike);
	}

	@Override
	public com.liferay.grow.likes.model.AssetLike addAssetLike(long userId,
		long assetEntryId, long rank) {
		return _assetLikeLocalService.addAssetLike(userId, assetEntryId, rank);
	}

	/**
	* Creates a new asset like with the primary key. Does not add the asset like to the database.
	*
	* @param id the primary key for the new asset like
	* @return the new asset like
	*/
	@Override
	public com.liferay.grow.likes.model.AssetLike createAssetLike(long id) {
		return _assetLikeLocalService.createAssetLike(id);
	}

	/**
	* Deletes the asset like from the database. Also notifies the appropriate model listeners.
	*
	* @param assetLike the asset like
	* @return the asset like that was removed
	*/
	@Override
	public com.liferay.grow.likes.model.AssetLike deleteAssetLike(
		com.liferay.grow.likes.model.AssetLike assetLike) {
		return _assetLikeLocalService.deleteAssetLike(assetLike);
	}

	/**
	* Deletes the asset like with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the asset like
	* @return the asset like that was removed
	* @throws PortalException if a asset like with the primary key could not be found
	*/
	@Override
	public com.liferay.grow.likes.model.AssetLike deleteAssetLike(long id)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _assetLikeLocalService.deleteAssetLike(id);
	}

	@Override
	public void deleteAssetLike(long userId, long assetEntryId)
		throws com.liferay.portal.kernel.exception.PortalException {
		_assetLikeLocalService.deleteAssetLike(userId, assetEntryId);
	}

	/**
	* @throws PortalException
	*/
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _assetLikeLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _assetLikeLocalService.dynamicQuery();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	*/
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {
		return _assetLikeLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.grow.likes.model.impl.AssetLikeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @return the range of matching rows
	*/
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {
		return _assetLikeLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.grow.likes.model.impl.AssetLikeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching rows
	*/
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {
		return _assetLikeLocalService.dynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows matching the dynamic query
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {
		return _assetLikeLocalService.dynamicQueryCount(dynamicQuery);
	}

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows matching the dynamic query
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {
		return _assetLikeLocalService.dynamicQueryCount(dynamicQuery, projection);
	}

	@Override
	public com.liferay.grow.likes.model.AssetLike fetchAssetLike(long id) {
		return _assetLikeLocalService.fetchAssetLike(id);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return _assetLikeLocalService.getActionableDynamicQuery();
	}

	/**
	* Returns the asset like with the primary key.
	*
	* @param id the primary key of the asset like
	* @return the asset like
	* @throws PortalException if a asset like with the primary key could not be found
	*/
	@Override
	public com.liferay.grow.likes.model.AssetLike getAssetLike(long id)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _assetLikeLocalService.getAssetLike(id);
	}

	/**
	* Returns a range of all the asset likes.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.grow.likes.model.impl.AssetLikeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of asset likes
	* @param end the upper bound of the range of asset likes (not inclusive)
	* @return the range of asset likes
	*/
	@Override
	public java.util.List<com.liferay.grow.likes.model.AssetLike> getAssetLikes(
		int start, int end) {
		return _assetLikeLocalService.getAssetLikes(start, end);
	}

	/**
	* Returns the number of asset likes.
	*
	* @return the number of asset likes
	*/
	@Override
	public int getAssetLikesCount() {
		return _assetLikeLocalService.getAssetLikesCount();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return _assetLikeLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public String getOSGiServiceIdentifier() {
		return _assetLikeLocalService.getOSGiServiceIdentifier();
	}

	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _assetLikeLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Updates the asset like in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param assetLike the asset like
	* @return the asset like that was updated
	*/
	@Override
	public com.liferay.grow.likes.model.AssetLike updateAssetLike(
		com.liferay.grow.likes.model.AssetLike assetLike) {
		return _assetLikeLocalService.updateAssetLike(assetLike);
	}

	@Override
	public AssetLikeLocalService getWrappedService() {
		return _assetLikeLocalService;
	}

	@Override
	public void setWrappedService(AssetLikeLocalService assetLikeLocalService) {
		_assetLikeLocalService = assetLikeLocalService;
	}

	private AssetLikeLocalService _assetLikeLocalService;
}