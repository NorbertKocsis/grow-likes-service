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

import com.liferay.grow.likes.exception.NoSuchAssetLikeException;
import com.liferay.grow.likes.model.AssetLike;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * The persistence interface for the asset like service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see com.liferay.grow.likes.service.persistence.impl.AssetLikePersistenceImpl
 * @see AssetLikeUtil
 * @generated
 */
@ProviderType
public interface AssetLikePersistence extends BasePersistence<AssetLike> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link AssetLikeUtil} to access the asset like persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the asset likes where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the matching asset likes
	*/
	public java.util.List<AssetLike> findByUuid(String uuid);

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
	public java.util.List<AssetLike> findByUuid(String uuid, int start, int end);

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
	public java.util.List<AssetLike> findByUuid(String uuid, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<AssetLike> orderByComparator);

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
	public java.util.List<AssetLike> findByUuid(String uuid, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<AssetLike> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first asset like in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching asset like
	* @throws NoSuchAssetLikeException if a matching asset like could not be found
	*/
	public AssetLike findByUuid_First(String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<AssetLike> orderByComparator)
		throws NoSuchAssetLikeException;

	/**
	* Returns the first asset like in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching asset like, or <code>null</code> if a matching asset like could not be found
	*/
	public AssetLike fetchByUuid_First(String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<AssetLike> orderByComparator);

	/**
	* Returns the last asset like in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching asset like
	* @throws NoSuchAssetLikeException if a matching asset like could not be found
	*/
	public AssetLike findByUuid_Last(String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<AssetLike> orderByComparator)
		throws NoSuchAssetLikeException;

	/**
	* Returns the last asset like in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching asset like, or <code>null</code> if a matching asset like could not be found
	*/
	public AssetLike fetchByUuid_Last(String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<AssetLike> orderByComparator);

	/**
	* Returns the asset likes before and after the current asset like in the ordered set where uuid = &#63;.
	*
	* @param id the primary key of the current asset like
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next asset like
	* @throws NoSuchAssetLikeException if a asset like with the primary key could not be found
	*/
	public AssetLike[] findByUuid_PrevAndNext(long id, String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<AssetLike> orderByComparator)
		throws NoSuchAssetLikeException;

	/**
	* Removes all the asset likes where uuid = &#63; from the database.
	*
	* @param uuid the uuid
	*/
	public void removeByUuid(String uuid);

	/**
	* Returns the number of asset likes where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the number of matching asset likes
	*/
	public int countByUuid(String uuid);

	/**
	* Returns all the asset likes where userId = &#63;.
	*
	* @param userId the user ID
	* @return the matching asset likes
	*/
	public java.util.List<AssetLike> findByUserId(long userId);

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
	public java.util.List<AssetLike> findByUserId(long userId, int start,
		int end);

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
	public java.util.List<AssetLike> findByUserId(long userId, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<AssetLike> orderByComparator);

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
	public java.util.List<AssetLike> findByUserId(long userId, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<AssetLike> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first asset like in the ordered set where userId = &#63;.
	*
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching asset like
	* @throws NoSuchAssetLikeException if a matching asset like could not be found
	*/
	public AssetLike findByUserId_First(long userId,
		com.liferay.portal.kernel.util.OrderByComparator<AssetLike> orderByComparator)
		throws NoSuchAssetLikeException;

	/**
	* Returns the first asset like in the ordered set where userId = &#63;.
	*
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching asset like, or <code>null</code> if a matching asset like could not be found
	*/
	public AssetLike fetchByUserId_First(long userId,
		com.liferay.portal.kernel.util.OrderByComparator<AssetLike> orderByComparator);

	/**
	* Returns the last asset like in the ordered set where userId = &#63;.
	*
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching asset like
	* @throws NoSuchAssetLikeException if a matching asset like could not be found
	*/
	public AssetLike findByUserId_Last(long userId,
		com.liferay.portal.kernel.util.OrderByComparator<AssetLike> orderByComparator)
		throws NoSuchAssetLikeException;

	/**
	* Returns the last asset like in the ordered set where userId = &#63;.
	*
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching asset like, or <code>null</code> if a matching asset like could not be found
	*/
	public AssetLike fetchByUserId_Last(long userId,
		com.liferay.portal.kernel.util.OrderByComparator<AssetLike> orderByComparator);

	/**
	* Returns the asset likes before and after the current asset like in the ordered set where userId = &#63;.
	*
	* @param id the primary key of the current asset like
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next asset like
	* @throws NoSuchAssetLikeException if a asset like with the primary key could not be found
	*/
	public AssetLike[] findByUserId_PrevAndNext(long id, long userId,
		com.liferay.portal.kernel.util.OrderByComparator<AssetLike> orderByComparator)
		throws NoSuchAssetLikeException;

	/**
	* Removes all the asset likes where userId = &#63; from the database.
	*
	* @param userId the user ID
	*/
	public void removeByUserId(long userId);

	/**
	* Returns the number of asset likes where userId = &#63;.
	*
	* @param userId the user ID
	* @return the number of matching asset likes
	*/
	public int countByUserId(long userId);

	/**
	* Returns all the asset likes where assetEntryId = &#63;.
	*
	* @param assetEntryId the asset entry ID
	* @return the matching asset likes
	*/
	public java.util.List<AssetLike> findByAssetEntryId(long assetEntryId);

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
	public java.util.List<AssetLike> findByAssetEntryId(long assetEntryId,
		int start, int end);

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
	public java.util.List<AssetLike> findByAssetEntryId(long assetEntryId,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<AssetLike> orderByComparator);

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
	public java.util.List<AssetLike> findByAssetEntryId(long assetEntryId,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<AssetLike> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first asset like in the ordered set where assetEntryId = &#63;.
	*
	* @param assetEntryId the asset entry ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching asset like
	* @throws NoSuchAssetLikeException if a matching asset like could not be found
	*/
	public AssetLike findByAssetEntryId_First(long assetEntryId,
		com.liferay.portal.kernel.util.OrderByComparator<AssetLike> orderByComparator)
		throws NoSuchAssetLikeException;

	/**
	* Returns the first asset like in the ordered set where assetEntryId = &#63;.
	*
	* @param assetEntryId the asset entry ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching asset like, or <code>null</code> if a matching asset like could not be found
	*/
	public AssetLike fetchByAssetEntryId_First(long assetEntryId,
		com.liferay.portal.kernel.util.OrderByComparator<AssetLike> orderByComparator);

	/**
	* Returns the last asset like in the ordered set where assetEntryId = &#63;.
	*
	* @param assetEntryId the asset entry ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching asset like
	* @throws NoSuchAssetLikeException if a matching asset like could not be found
	*/
	public AssetLike findByAssetEntryId_Last(long assetEntryId,
		com.liferay.portal.kernel.util.OrderByComparator<AssetLike> orderByComparator)
		throws NoSuchAssetLikeException;

	/**
	* Returns the last asset like in the ordered set where assetEntryId = &#63;.
	*
	* @param assetEntryId the asset entry ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching asset like, or <code>null</code> if a matching asset like could not be found
	*/
	public AssetLike fetchByAssetEntryId_Last(long assetEntryId,
		com.liferay.portal.kernel.util.OrderByComparator<AssetLike> orderByComparator);

	/**
	* Returns the asset likes before and after the current asset like in the ordered set where assetEntryId = &#63;.
	*
	* @param id the primary key of the current asset like
	* @param assetEntryId the asset entry ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next asset like
	* @throws NoSuchAssetLikeException if a asset like with the primary key could not be found
	*/
	public AssetLike[] findByAssetEntryId_PrevAndNext(long id,
		long assetEntryId,
		com.liferay.portal.kernel.util.OrderByComparator<AssetLike> orderByComparator)
		throws NoSuchAssetLikeException;

	/**
	* Removes all the asset likes where assetEntryId = &#63; from the database.
	*
	* @param assetEntryId the asset entry ID
	*/
	public void removeByAssetEntryId(long assetEntryId);

	/**
	* Returns the number of asset likes where assetEntryId = &#63;.
	*
	* @param assetEntryId the asset entry ID
	* @return the number of matching asset likes
	*/
	public int countByAssetEntryId(long assetEntryId);

	/**
	* Returns all the asset likes where userId = &#63; and assetEntryId = &#63;.
	*
	* @param userId the user ID
	* @param assetEntryId the asset entry ID
	* @return the matching asset likes
	*/
	public java.util.List<AssetLike> findByU_A(long userId, long assetEntryId);

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
	public java.util.List<AssetLike> findByU_A(long userId, long assetEntryId,
		int start, int end);

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
	public java.util.List<AssetLike> findByU_A(long userId, long assetEntryId,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<AssetLike> orderByComparator);

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
	public java.util.List<AssetLike> findByU_A(long userId, long assetEntryId,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<AssetLike> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first asset like in the ordered set where userId = &#63; and assetEntryId = &#63;.
	*
	* @param userId the user ID
	* @param assetEntryId the asset entry ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching asset like
	* @throws NoSuchAssetLikeException if a matching asset like could not be found
	*/
	public AssetLike findByU_A_First(long userId, long assetEntryId,
		com.liferay.portal.kernel.util.OrderByComparator<AssetLike> orderByComparator)
		throws NoSuchAssetLikeException;

	/**
	* Returns the first asset like in the ordered set where userId = &#63; and assetEntryId = &#63;.
	*
	* @param userId the user ID
	* @param assetEntryId the asset entry ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching asset like, or <code>null</code> if a matching asset like could not be found
	*/
	public AssetLike fetchByU_A_First(long userId, long assetEntryId,
		com.liferay.portal.kernel.util.OrderByComparator<AssetLike> orderByComparator);

	/**
	* Returns the last asset like in the ordered set where userId = &#63; and assetEntryId = &#63;.
	*
	* @param userId the user ID
	* @param assetEntryId the asset entry ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching asset like
	* @throws NoSuchAssetLikeException if a matching asset like could not be found
	*/
	public AssetLike findByU_A_Last(long userId, long assetEntryId,
		com.liferay.portal.kernel.util.OrderByComparator<AssetLike> orderByComparator)
		throws NoSuchAssetLikeException;

	/**
	* Returns the last asset like in the ordered set where userId = &#63; and assetEntryId = &#63;.
	*
	* @param userId the user ID
	* @param assetEntryId the asset entry ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching asset like, or <code>null</code> if a matching asset like could not be found
	*/
	public AssetLike fetchByU_A_Last(long userId, long assetEntryId,
		com.liferay.portal.kernel.util.OrderByComparator<AssetLike> orderByComparator);

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
	public AssetLike[] findByU_A_PrevAndNext(long id, long userId,
		long assetEntryId,
		com.liferay.portal.kernel.util.OrderByComparator<AssetLike> orderByComparator)
		throws NoSuchAssetLikeException;

	/**
	* Removes all the asset likes where userId = &#63; and assetEntryId = &#63; from the database.
	*
	* @param userId the user ID
	* @param assetEntryId the asset entry ID
	*/
	public void removeByU_A(long userId, long assetEntryId);

	/**
	* Returns the number of asset likes where userId = &#63; and assetEntryId = &#63;.
	*
	* @param userId the user ID
	* @param assetEntryId the asset entry ID
	* @return the number of matching asset likes
	*/
	public int countByU_A(long userId, long assetEntryId);

	/**
	* Caches the asset like in the entity cache if it is enabled.
	*
	* @param assetLike the asset like
	*/
	public void cacheResult(AssetLike assetLike);

	/**
	* Caches the asset likes in the entity cache if it is enabled.
	*
	* @param assetLikes the asset likes
	*/
	public void cacheResult(java.util.List<AssetLike> assetLikes);

	/**
	* Creates a new asset like with the primary key. Does not add the asset like to the database.
	*
	* @param id the primary key for the new asset like
	* @return the new asset like
	*/
	public AssetLike create(long id);

	/**
	* Removes the asset like with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the asset like
	* @return the asset like that was removed
	* @throws NoSuchAssetLikeException if a asset like with the primary key could not be found
	*/
	public AssetLike remove(long id) throws NoSuchAssetLikeException;

	public AssetLike updateImpl(AssetLike assetLike);

	/**
	* Returns the asset like with the primary key or throws a {@link NoSuchAssetLikeException} if it could not be found.
	*
	* @param id the primary key of the asset like
	* @return the asset like
	* @throws NoSuchAssetLikeException if a asset like with the primary key could not be found
	*/
	public AssetLike findByPrimaryKey(long id) throws NoSuchAssetLikeException;

	/**
	* Returns the asset like with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the asset like
	* @return the asset like, or <code>null</code> if a asset like with the primary key could not be found
	*/
	public AssetLike fetchByPrimaryKey(long id);

	@Override
	public java.util.Map<java.io.Serializable, AssetLike> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the asset likes.
	*
	* @return the asset likes
	*/
	public java.util.List<AssetLike> findAll();

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
	public java.util.List<AssetLike> findAll(int start, int end);

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
	public java.util.List<AssetLike> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<AssetLike> orderByComparator);

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
	public java.util.List<AssetLike> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<AssetLike> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the asset likes from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of asset likes.
	*
	* @return the number of asset likes
	*/
	public int countAll();

	@Override
	public java.util.Set<String> getBadColumnNames();
}