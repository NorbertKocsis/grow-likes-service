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

package com.liferay.grow.likes.service.persistence;

import aQute.bnd.annotation.ProviderType;

import com.liferay.grow.likes.model.AssetLike;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;

import org.osgi.util.tracker.ServiceTracker;

import java.util.List;

/**
 * The persistence utility for the asset like service. This utility wraps {@link com.liferay.grow.likes.service.persistence.impl.AssetLikePersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AssetLikePersistence
 * @see com.liferay.grow.likes.service.persistence.impl.AssetLikePersistenceImpl
 * @generated
 */
@ProviderType
public class AssetLikeUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static void clearCache(AssetLike assetLike) {
		getPersistence().clearCache(assetLike);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
	 */
	public static long countWithDynamicQuery(DynamicQuery dynamicQuery) {
		return getPersistence().countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<AssetLike> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<AssetLike> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<AssetLike> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<AssetLike> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static AssetLike update(AssetLike assetLike) {
		return getPersistence().update(assetLike);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static AssetLike update(AssetLike assetLike,
		ServiceContext serviceContext) {
		return getPersistence().update(assetLike, serviceContext);
	}

	/**
	* Returns all the asset likes where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the matching asset likes
	*/
	public static List<AssetLike> findByUuid(String uuid) {
		return getPersistence().findByUuid(uuid);
	}

	/**
	* Returns a range of all the asset likes where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link AssetLikeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of asset likes
	* @param end the upper bound of the range of asset likes (not inclusive)
	* @return the range of matching asset likes
	*/
	public static List<AssetLike> findByUuid(String uuid, int start, int end) {
		return getPersistence().findByUuid(uuid, start, end);
	}

	/**
	* Returns an ordered range of all the asset likes where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link AssetLikeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of asset likes
	* @param end the upper bound of the range of asset likes (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching asset likes
	*/
	public static List<AssetLike> findByUuid(String uuid, int start, int end,
		OrderByComparator<AssetLike> orderByComparator) {
		return getPersistence().findByUuid(uuid, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the asset likes where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link AssetLikeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of asset likes
	* @param end the upper bound of the range of asset likes (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching asset likes
	*/
	public static List<AssetLike> findByUuid(String uuid, int start, int end,
		OrderByComparator<AssetLike> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByUuid(uuid, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	* Returns the first asset like in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching asset like
	* @throws NoSuchAssetLikeException if a matching asset like could not be found
	*/
	public static AssetLike findByUuid_First(String uuid,
		OrderByComparator<AssetLike> orderByComparator)
		throws com.liferay.grow.likes.exception.NoSuchAssetLikeException {
		return getPersistence().findByUuid_First(uuid, orderByComparator);
	}

	/**
	* Returns the first asset like in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching asset like, or <code>null</code> if a matching asset like could not be found
	*/
	public static AssetLike fetchByUuid_First(String uuid,
		OrderByComparator<AssetLike> orderByComparator) {
		return getPersistence().fetchByUuid_First(uuid, orderByComparator);
	}

	/**
	* Returns the last asset like in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching asset like
	* @throws NoSuchAssetLikeException if a matching asset like could not be found
	*/
	public static AssetLike findByUuid_Last(String uuid,
		OrderByComparator<AssetLike> orderByComparator)
		throws com.liferay.grow.likes.exception.NoSuchAssetLikeException {
		return getPersistence().findByUuid_Last(uuid, orderByComparator);
	}

	/**
	* Returns the last asset like in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching asset like, or <code>null</code> if a matching asset like could not be found
	*/
	public static AssetLike fetchByUuid_Last(String uuid,
		OrderByComparator<AssetLike> orderByComparator) {
		return getPersistence().fetchByUuid_Last(uuid, orderByComparator);
	}

	/**
	* Returns the asset likes before and after the current asset like in the ordered set where uuid = &#63;.
	*
	* @param id the primary key of the current asset like
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next asset like
	* @throws NoSuchAssetLikeException if a asset like with the primary key could not be found
	*/
	public static AssetLike[] findByUuid_PrevAndNext(long id, String uuid,
		OrderByComparator<AssetLike> orderByComparator)
		throws com.liferay.grow.likes.exception.NoSuchAssetLikeException {
		return getPersistence()
				   .findByUuid_PrevAndNext(id, uuid, orderByComparator);
	}

	/**
	* Removes all the asset likes where uuid = &#63; from the database.
	*
	* @param uuid the uuid
	*/
	public static void removeByUuid(String uuid) {
		getPersistence().removeByUuid(uuid);
	}

	/**
	* Returns the number of asset likes where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the number of matching asset likes
	*/
	public static int countByUuid(String uuid) {
		return getPersistence().countByUuid(uuid);
	}

	/**
	* Returns all the asset likes where userId = &#63;.
	*
	* @param userId the user ID
	* @return the matching asset likes
	*/
	public static List<AssetLike> findByUserId(long userId) {
		return getPersistence().findByUserId(userId);
	}

	/**
	* Returns a range of all the asset likes where userId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link AssetLikeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param userId the user ID
	* @param start the lower bound of the range of asset likes
	* @param end the upper bound of the range of asset likes (not inclusive)
	* @return the range of matching asset likes
	*/
	public static List<AssetLike> findByUserId(long userId, int start, int end) {
		return getPersistence().findByUserId(userId, start, end);
	}

	/**
	* Returns an ordered range of all the asset likes where userId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link AssetLikeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param userId the user ID
	* @param start the lower bound of the range of asset likes
	* @param end the upper bound of the range of asset likes (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching asset likes
	*/
	public static List<AssetLike> findByUserId(long userId, int start, int end,
		OrderByComparator<AssetLike> orderByComparator) {
		return getPersistence()
				   .findByUserId(userId, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the asset likes where userId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link AssetLikeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param userId the user ID
	* @param start the lower bound of the range of asset likes
	* @param end the upper bound of the range of asset likes (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching asset likes
	*/
	public static List<AssetLike> findByUserId(long userId, int start, int end,
		OrderByComparator<AssetLike> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByUserId(userId, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	* Returns the first asset like in the ordered set where userId = &#63;.
	*
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching asset like
	* @throws NoSuchAssetLikeException if a matching asset like could not be found
	*/
	public static AssetLike findByUserId_First(long userId,
		OrderByComparator<AssetLike> orderByComparator)
		throws com.liferay.grow.likes.exception.NoSuchAssetLikeException {
		return getPersistence().findByUserId_First(userId, orderByComparator);
	}

	/**
	* Returns the first asset like in the ordered set where userId = &#63;.
	*
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching asset like, or <code>null</code> if a matching asset like could not be found
	*/
	public static AssetLike fetchByUserId_First(long userId,
		OrderByComparator<AssetLike> orderByComparator) {
		return getPersistence().fetchByUserId_First(userId, orderByComparator);
	}

	/**
	* Returns the last asset like in the ordered set where userId = &#63;.
	*
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching asset like
	* @throws NoSuchAssetLikeException if a matching asset like could not be found
	*/
	public static AssetLike findByUserId_Last(long userId,
		OrderByComparator<AssetLike> orderByComparator)
		throws com.liferay.grow.likes.exception.NoSuchAssetLikeException {
		return getPersistence().findByUserId_Last(userId, orderByComparator);
	}

	/**
	* Returns the last asset like in the ordered set where userId = &#63;.
	*
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching asset like, or <code>null</code> if a matching asset like could not be found
	*/
	public static AssetLike fetchByUserId_Last(long userId,
		OrderByComparator<AssetLike> orderByComparator) {
		return getPersistence().fetchByUserId_Last(userId, orderByComparator);
	}

	/**
	* Returns the asset likes before and after the current asset like in the ordered set where userId = &#63;.
	*
	* @param id the primary key of the current asset like
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next asset like
	* @throws NoSuchAssetLikeException if a asset like with the primary key could not be found
	*/
	public static AssetLike[] findByUserId_PrevAndNext(long id, long userId,
		OrderByComparator<AssetLike> orderByComparator)
		throws com.liferay.grow.likes.exception.NoSuchAssetLikeException {
		return getPersistence()
				   .findByUserId_PrevAndNext(id, userId, orderByComparator);
	}

	/**
	* Removes all the asset likes where userId = &#63; from the database.
	*
	* @param userId the user ID
	*/
	public static void removeByUserId(long userId) {
		getPersistence().removeByUserId(userId);
	}

	/**
	* Returns the number of asset likes where userId = &#63;.
	*
	* @param userId the user ID
	* @return the number of matching asset likes
	*/
	public static int countByUserId(long userId) {
		return getPersistence().countByUserId(userId);
	}

	/**
	* Returns all the asset likes where assetEntryId = &#63;.
	*
	* @param assetEntryId the asset entry ID
	* @return the matching asset likes
	*/
	public static List<AssetLike> findByAssetEntryId(long assetEntryId) {
		return getPersistence().findByAssetEntryId(assetEntryId);
	}

	/**
	* Returns a range of all the asset likes where assetEntryId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link AssetLikeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param assetEntryId the asset entry ID
	* @param start the lower bound of the range of asset likes
	* @param end the upper bound of the range of asset likes (not inclusive)
	* @return the range of matching asset likes
	*/
	public static List<AssetLike> findByAssetEntryId(long assetEntryId,
		int start, int end) {
		return getPersistence().findByAssetEntryId(assetEntryId, start, end);
	}

	/**
	* Returns an ordered range of all the asset likes where assetEntryId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link AssetLikeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param assetEntryId the asset entry ID
	* @param start the lower bound of the range of asset likes
	* @param end the upper bound of the range of asset likes (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching asset likes
	*/
	public static List<AssetLike> findByAssetEntryId(long assetEntryId,
		int start, int end, OrderByComparator<AssetLike> orderByComparator) {
		return getPersistence()
				   .findByAssetEntryId(assetEntryId, start, end,
			orderByComparator);
	}

	/**
	* Returns an ordered range of all the asset likes where assetEntryId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link AssetLikeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param assetEntryId the asset entry ID
	* @param start the lower bound of the range of asset likes
	* @param end the upper bound of the range of asset likes (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching asset likes
	*/
	public static List<AssetLike> findByAssetEntryId(long assetEntryId,
		int start, int end, OrderByComparator<AssetLike> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByAssetEntryId(assetEntryId, start, end,
			orderByComparator, retrieveFromCache);
	}

	/**
	* Returns the first asset like in the ordered set where assetEntryId = &#63;.
	*
	* @param assetEntryId the asset entry ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching asset like
	* @throws NoSuchAssetLikeException if a matching asset like could not be found
	*/
	public static AssetLike findByAssetEntryId_First(long assetEntryId,
		OrderByComparator<AssetLike> orderByComparator)
		throws com.liferay.grow.likes.exception.NoSuchAssetLikeException {
		return getPersistence()
				   .findByAssetEntryId_First(assetEntryId, orderByComparator);
	}

	/**
	* Returns the first asset like in the ordered set where assetEntryId = &#63;.
	*
	* @param assetEntryId the asset entry ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching asset like, or <code>null</code> if a matching asset like could not be found
	*/
	public static AssetLike fetchByAssetEntryId_First(long assetEntryId,
		OrderByComparator<AssetLike> orderByComparator) {
		return getPersistence()
				   .fetchByAssetEntryId_First(assetEntryId, orderByComparator);
	}

	/**
	* Returns the last asset like in the ordered set where assetEntryId = &#63;.
	*
	* @param assetEntryId the asset entry ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching asset like
	* @throws NoSuchAssetLikeException if a matching asset like could not be found
	*/
	public static AssetLike findByAssetEntryId_Last(long assetEntryId,
		OrderByComparator<AssetLike> orderByComparator)
		throws com.liferay.grow.likes.exception.NoSuchAssetLikeException {
		return getPersistence()
				   .findByAssetEntryId_Last(assetEntryId, orderByComparator);
	}

	/**
	* Returns the last asset like in the ordered set where assetEntryId = &#63;.
	*
	* @param assetEntryId the asset entry ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching asset like, or <code>null</code> if a matching asset like could not be found
	*/
	public static AssetLike fetchByAssetEntryId_Last(long assetEntryId,
		OrderByComparator<AssetLike> orderByComparator) {
		return getPersistence()
				   .fetchByAssetEntryId_Last(assetEntryId, orderByComparator);
	}

	/**
	* Returns the asset likes before and after the current asset like in the ordered set where assetEntryId = &#63;.
	*
	* @param id the primary key of the current asset like
	* @param assetEntryId the asset entry ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next asset like
	* @throws NoSuchAssetLikeException if a asset like with the primary key could not be found
	*/
	public static AssetLike[] findByAssetEntryId_PrevAndNext(long id,
		long assetEntryId, OrderByComparator<AssetLike> orderByComparator)
		throws com.liferay.grow.likes.exception.NoSuchAssetLikeException {
		return getPersistence()
				   .findByAssetEntryId_PrevAndNext(id, assetEntryId,
			orderByComparator);
	}

	/**
	* Removes all the asset likes where assetEntryId = &#63; from the database.
	*
	* @param assetEntryId the asset entry ID
	*/
	public static void removeByAssetEntryId(long assetEntryId) {
		getPersistence().removeByAssetEntryId(assetEntryId);
	}

	/**
	* Returns the number of asset likes where assetEntryId = &#63;.
	*
	* @param assetEntryId the asset entry ID
	* @return the number of matching asset likes
	*/
	public static int countByAssetEntryId(long assetEntryId) {
		return getPersistence().countByAssetEntryId(assetEntryId);
	}

	/**
	* Returns all the asset likes where userId = &#63; and assetEntryId = &#63;.
	*
	* @param userId the user ID
	* @param assetEntryId the asset entry ID
	* @return the matching asset likes
	*/
	public static List<AssetLike> findByU_A(long userId, long assetEntryId) {
		return getPersistence().findByU_A(userId, assetEntryId);
	}

	/**
	* Returns a range of all the asset likes where userId = &#63; and assetEntryId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link AssetLikeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param userId the user ID
	* @param assetEntryId the asset entry ID
	* @param start the lower bound of the range of asset likes
	* @param end the upper bound of the range of asset likes (not inclusive)
	* @return the range of matching asset likes
	*/
	public static List<AssetLike> findByU_A(long userId, long assetEntryId,
		int start, int end) {
		return getPersistence().findByU_A(userId, assetEntryId, start, end);
	}

	/**
	* Returns an ordered range of all the asset likes where userId = &#63; and assetEntryId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link AssetLikeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param userId the user ID
	* @param assetEntryId the asset entry ID
	* @param start the lower bound of the range of asset likes
	* @param end the upper bound of the range of asset likes (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching asset likes
	*/
	public static List<AssetLike> findByU_A(long userId, long assetEntryId,
		int start, int end, OrderByComparator<AssetLike> orderByComparator) {
		return getPersistence()
				   .findByU_A(userId, assetEntryId, start, end,
			orderByComparator);
	}

	/**
	* Returns an ordered range of all the asset likes where userId = &#63; and assetEntryId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link AssetLikeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param userId the user ID
	* @param assetEntryId the asset entry ID
	* @param start the lower bound of the range of asset likes
	* @param end the upper bound of the range of asset likes (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching asset likes
	*/
	public static List<AssetLike> findByU_A(long userId, long assetEntryId,
		int start, int end, OrderByComparator<AssetLike> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByU_A(userId, assetEntryId, start, end,
			orderByComparator, retrieveFromCache);
	}

	/**
	* Returns the first asset like in the ordered set where userId = &#63; and assetEntryId = &#63;.
	*
	* @param userId the user ID
	* @param assetEntryId the asset entry ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching asset like
	* @throws NoSuchAssetLikeException if a matching asset like could not be found
	*/
	public static AssetLike findByU_A_First(long userId, long assetEntryId,
		OrderByComparator<AssetLike> orderByComparator)
		throws com.liferay.grow.likes.exception.NoSuchAssetLikeException {
		return getPersistence()
				   .findByU_A_First(userId, assetEntryId, orderByComparator);
	}

	/**
	* Returns the first asset like in the ordered set where userId = &#63; and assetEntryId = &#63;.
	*
	* @param userId the user ID
	* @param assetEntryId the asset entry ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching asset like, or <code>null</code> if a matching asset like could not be found
	*/
	public static AssetLike fetchByU_A_First(long userId, long assetEntryId,
		OrderByComparator<AssetLike> orderByComparator) {
		return getPersistence()
				   .fetchByU_A_First(userId, assetEntryId, orderByComparator);
	}

	/**
	* Returns the last asset like in the ordered set where userId = &#63; and assetEntryId = &#63;.
	*
	* @param userId the user ID
	* @param assetEntryId the asset entry ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching asset like
	* @throws NoSuchAssetLikeException if a matching asset like could not be found
	*/
	public static AssetLike findByU_A_Last(long userId, long assetEntryId,
		OrderByComparator<AssetLike> orderByComparator)
		throws com.liferay.grow.likes.exception.NoSuchAssetLikeException {
		return getPersistence()
				   .findByU_A_Last(userId, assetEntryId, orderByComparator);
	}

	/**
	* Returns the last asset like in the ordered set where userId = &#63; and assetEntryId = &#63;.
	*
	* @param userId the user ID
	* @param assetEntryId the asset entry ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching asset like, or <code>null</code> if a matching asset like could not be found
	*/
	public static AssetLike fetchByU_A_Last(long userId, long assetEntryId,
		OrderByComparator<AssetLike> orderByComparator) {
		return getPersistence()
				   .fetchByU_A_Last(userId, assetEntryId, orderByComparator);
	}

	/**
	* Returns the asset likes before and after the current asset like in the ordered set where userId = &#63; and assetEntryId = &#63;.
	*
	* @param id the primary key of the current asset like
	* @param userId the user ID
	* @param assetEntryId the asset entry ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next asset like
	* @throws NoSuchAssetLikeException if a asset like with the primary key could not be found
	*/
	public static AssetLike[] findByU_A_PrevAndNext(long id, long userId,
		long assetEntryId, OrderByComparator<AssetLike> orderByComparator)
		throws com.liferay.grow.likes.exception.NoSuchAssetLikeException {
		return getPersistence()
				   .findByU_A_PrevAndNext(id, userId, assetEntryId,
			orderByComparator);
	}

	/**
	* Removes all the asset likes where userId = &#63; and assetEntryId = &#63; from the database.
	*
	* @param userId the user ID
	* @param assetEntryId the asset entry ID
	*/
	public static void removeByU_A(long userId, long assetEntryId) {
		getPersistence().removeByU_A(userId, assetEntryId);
	}

	/**
	* Returns the number of asset likes where userId = &#63; and assetEntryId = &#63;.
	*
	* @param userId the user ID
	* @param assetEntryId the asset entry ID
	* @return the number of matching asset likes
	*/
	public static int countByU_A(long userId, long assetEntryId) {
		return getPersistence().countByU_A(userId, assetEntryId);
	}

	/**
	* Caches the asset like in the entity cache if it is enabled.
	*
	* @param assetLike the asset like
	*/
	public static void cacheResult(AssetLike assetLike) {
		getPersistence().cacheResult(assetLike);
	}

	/**
	* Caches the asset likes in the entity cache if it is enabled.
	*
	* @param assetLikes the asset likes
	*/
	public static void cacheResult(List<AssetLike> assetLikes) {
		getPersistence().cacheResult(assetLikes);
	}

	/**
	* Creates a new asset like with the primary key. Does not add the asset like to the database.
	*
	* @param id the primary key for the new asset like
	* @return the new asset like
	*/
	public static AssetLike create(long id) {
		return getPersistence().create(id);
	}

	/**
	* Removes the asset like with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the asset like
	* @return the asset like that was removed
	* @throws NoSuchAssetLikeException if a asset like with the primary key could not be found
	*/
	public static AssetLike remove(long id)
		throws com.liferay.grow.likes.exception.NoSuchAssetLikeException {
		return getPersistence().remove(id);
	}

	public static AssetLike updateImpl(AssetLike assetLike) {
		return getPersistence().updateImpl(assetLike);
	}

	/**
	* Returns the asset like with the primary key or throws a {@link NoSuchAssetLikeException} if it could not be found.
	*
	* @param id the primary key of the asset like
	* @return the asset like
	* @throws NoSuchAssetLikeException if a asset like with the primary key could not be found
	*/
	public static AssetLike findByPrimaryKey(long id)
		throws com.liferay.grow.likes.exception.NoSuchAssetLikeException {
		return getPersistence().findByPrimaryKey(id);
	}

	/**
	* Returns the asset like with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the asset like
	* @return the asset like, or <code>null</code> if a asset like with the primary key could not be found
	*/
	public static AssetLike fetchByPrimaryKey(long id) {
		return getPersistence().fetchByPrimaryKey(id);
	}

	public static java.util.Map<java.io.Serializable, AssetLike> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the asset likes.
	*
	* @return the asset likes
	*/
	public static List<AssetLike> findAll() {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the asset likes.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link AssetLikeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of asset likes
	* @param end the upper bound of the range of asset likes (not inclusive)
	* @return the range of asset likes
	*/
	public static List<AssetLike> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the asset likes.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link AssetLikeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of asset likes
	* @param end the upper bound of the range of asset likes (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of asset likes
	*/
	public static List<AssetLike> findAll(int start, int end,
		OrderByComparator<AssetLike> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the asset likes.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link AssetLikeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of asset likes
	* @param end the upper bound of the range of asset likes (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of asset likes
	*/
	public static List<AssetLike> findAll(int start, int end,
		OrderByComparator<AssetLike> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the asset likes from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of asset likes.
	*
	* @return the number of asset likes
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static java.util.Set<String> getBadColumnNames() {
		return getPersistence().getBadColumnNames();
	}

	public static AssetLikePersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<AssetLikePersistence, AssetLikePersistence> _serviceTracker;

	static {
		Bundle bundle = FrameworkUtil.getBundle(AssetLikePersistence.class);

		ServiceTracker<AssetLikePersistence, AssetLikePersistence> serviceTracker =
			new ServiceTracker<AssetLikePersistence, AssetLikePersistence>(bundle.getBundleContext(),
				AssetLikePersistence.class, null);

		serviceTracker.open();

		_serviceTracker = serviceTracker;
	}
}