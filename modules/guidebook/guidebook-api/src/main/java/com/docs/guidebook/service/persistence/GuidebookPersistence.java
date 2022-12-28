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

package com.docs.guidebook.service.persistence;

import aQute.bnd.annotation.ProviderType;

import com.docs.guidebook.exception.NoSuchGuidebookException;
import com.docs.guidebook.model.Guidebook;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import java.io.Serializable;

import java.util.Map;
import java.util.Set;

/**
 * The persistence interface for the guidebook service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author liferay
 * @see GuidebookUtil
 * @generated
 */
@ProviderType
public interface GuidebookPersistence extends BasePersistence<Guidebook> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link GuidebookUtil} to access the guidebook persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */
	@Override
	public Map<Serializable, Guidebook> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys);

	/**
	 * Returns all the guidebooks where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching guidebooks
	 */
	public java.util.List<Guidebook> findByUuid(String uuid);

	/**
	 * Returns a range of all the guidebooks where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>GuidebookModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of guidebooks
	 * @param end the upper bound of the range of guidebooks (not inclusive)
	 * @return the range of matching guidebooks
	 */
	public java.util.List<Guidebook> findByUuid(
		String uuid, int start, int end);

	/**
	 * Returns an ordered range of all the guidebooks where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>GuidebookModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of guidebooks
	 * @param end the upper bound of the range of guidebooks (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching guidebooks
	 */
	public java.util.List<Guidebook> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Guidebook>
			orderByComparator);

	/**
	 * Returns an ordered range of all the guidebooks where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>GuidebookModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of guidebooks
	 * @param end the upper bound of the range of guidebooks (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching guidebooks
	 */
	public java.util.List<Guidebook> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Guidebook>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first guidebook in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching guidebook
	 * @throws NoSuchGuidebookException if a matching guidebook could not be found
	 */
	public Guidebook findByUuid_First(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<Guidebook>
				orderByComparator)
		throws NoSuchGuidebookException;

	/**
	 * Returns the first guidebook in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching guidebook, or <code>null</code> if a matching guidebook could not be found
	 */
	public Guidebook fetchByUuid_First(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Guidebook>
			orderByComparator);

	/**
	 * Returns the last guidebook in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching guidebook
	 * @throws NoSuchGuidebookException if a matching guidebook could not be found
	 */
	public Guidebook findByUuid_Last(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<Guidebook>
				orderByComparator)
		throws NoSuchGuidebookException;

	/**
	 * Returns the last guidebook in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching guidebook, or <code>null</code> if a matching guidebook could not be found
	 */
	public Guidebook fetchByUuid_Last(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Guidebook>
			orderByComparator);

	/**
	 * Returns the guidebooks before and after the current guidebook in the ordered set where uuid = &#63;.
	 *
	 * @param guidebookId the primary key of the current guidebook
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next guidebook
	 * @throws NoSuchGuidebookException if a guidebook with the primary key could not be found
	 */
	public Guidebook[] findByUuid_PrevAndNext(
			long guidebookId, String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<Guidebook>
				orderByComparator)
		throws NoSuchGuidebookException;

	/**
	 * Removes all the guidebooks where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public void removeByUuid(String uuid);

	/**
	 * Returns the number of guidebooks where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching guidebooks
	 */
	public int countByUuid(String uuid);

	/**
	 * Returns the guidebook where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchGuidebookException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching guidebook
	 * @throws NoSuchGuidebookException if a matching guidebook could not be found
	 */
	public Guidebook findByUUID_G(String uuid, long groupId)
		throws NoSuchGuidebookException;

	/**
	 * Returns the guidebook where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching guidebook, or <code>null</code> if a matching guidebook could not be found
	 */
	public Guidebook fetchByUUID_G(String uuid, long groupId);

	/**
	 * Returns the guidebook where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching guidebook, or <code>null</code> if a matching guidebook could not be found
	 */
	public Guidebook fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache);

	/**
	 * Removes the guidebook where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the guidebook that was removed
	 */
	public Guidebook removeByUUID_G(String uuid, long groupId)
		throws NoSuchGuidebookException;

	/**
	 * Returns the number of guidebooks where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching guidebooks
	 */
	public int countByUUID_G(String uuid, long groupId);

	/**
	 * Returns all the guidebooks where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching guidebooks
	 */
	public java.util.List<Guidebook> findByUuid_C(String uuid, long companyId);

	/**
	 * Returns a range of all the guidebooks where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>GuidebookModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of guidebooks
	 * @param end the upper bound of the range of guidebooks (not inclusive)
	 * @return the range of matching guidebooks
	 */
	public java.util.List<Guidebook> findByUuid_C(
		String uuid, long companyId, int start, int end);

	/**
	 * Returns an ordered range of all the guidebooks where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>GuidebookModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of guidebooks
	 * @param end the upper bound of the range of guidebooks (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching guidebooks
	 */
	public java.util.List<Guidebook> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Guidebook>
			orderByComparator);

	/**
	 * Returns an ordered range of all the guidebooks where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>GuidebookModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of guidebooks
	 * @param end the upper bound of the range of guidebooks (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching guidebooks
	 */
	public java.util.List<Guidebook> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Guidebook>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first guidebook in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching guidebook
	 * @throws NoSuchGuidebookException if a matching guidebook could not be found
	 */
	public Guidebook findByUuid_C_First(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<Guidebook>
				orderByComparator)
		throws NoSuchGuidebookException;

	/**
	 * Returns the first guidebook in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching guidebook, or <code>null</code> if a matching guidebook could not be found
	 */
	public Guidebook fetchByUuid_C_First(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<Guidebook>
			orderByComparator);

	/**
	 * Returns the last guidebook in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching guidebook
	 * @throws NoSuchGuidebookException if a matching guidebook could not be found
	 */
	public Guidebook findByUuid_C_Last(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<Guidebook>
				orderByComparator)
		throws NoSuchGuidebookException;

	/**
	 * Returns the last guidebook in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching guidebook, or <code>null</code> if a matching guidebook could not be found
	 */
	public Guidebook fetchByUuid_C_Last(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<Guidebook>
			orderByComparator);

	/**
	 * Returns the guidebooks before and after the current guidebook in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param guidebookId the primary key of the current guidebook
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next guidebook
	 * @throws NoSuchGuidebookException if a guidebook with the primary key could not be found
	 */
	public Guidebook[] findByUuid_C_PrevAndNext(
			long guidebookId, String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<Guidebook>
				orderByComparator)
		throws NoSuchGuidebookException;

	/**
	 * Removes all the guidebooks where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public void removeByUuid_C(String uuid, long companyId);

	/**
	 * Returns the number of guidebooks where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching guidebooks
	 */
	public int countByUuid_C(String uuid, long companyId);

	/**
	 * Returns all the guidebooks where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @return the matching guidebooks
	 */
	public java.util.List<Guidebook> findByGroupId(long groupId);

	/**
	 * Returns a range of all the guidebooks where groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>GuidebookModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param start the lower bound of the range of guidebooks
	 * @param end the upper bound of the range of guidebooks (not inclusive)
	 * @return the range of matching guidebooks
	 */
	public java.util.List<Guidebook> findByGroupId(
		long groupId, int start, int end);

	/**
	 * Returns an ordered range of all the guidebooks where groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>GuidebookModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param start the lower bound of the range of guidebooks
	 * @param end the upper bound of the range of guidebooks (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching guidebooks
	 */
	public java.util.List<Guidebook> findByGroupId(
		long groupId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Guidebook>
			orderByComparator);

	/**
	 * Returns an ordered range of all the guidebooks where groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>GuidebookModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param start the lower bound of the range of guidebooks
	 * @param end the upper bound of the range of guidebooks (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching guidebooks
	 */
	public java.util.List<Guidebook> findByGroupId(
		long groupId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Guidebook>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first guidebook in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching guidebook
	 * @throws NoSuchGuidebookException if a matching guidebook could not be found
	 */
	public Guidebook findByGroupId_First(
			long groupId,
			com.liferay.portal.kernel.util.OrderByComparator<Guidebook>
				orderByComparator)
		throws NoSuchGuidebookException;

	/**
	 * Returns the first guidebook in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching guidebook, or <code>null</code> if a matching guidebook could not be found
	 */
	public Guidebook fetchByGroupId_First(
		long groupId,
		com.liferay.portal.kernel.util.OrderByComparator<Guidebook>
			orderByComparator);

	/**
	 * Returns the last guidebook in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching guidebook
	 * @throws NoSuchGuidebookException if a matching guidebook could not be found
	 */
	public Guidebook findByGroupId_Last(
			long groupId,
			com.liferay.portal.kernel.util.OrderByComparator<Guidebook>
				orderByComparator)
		throws NoSuchGuidebookException;

	/**
	 * Returns the last guidebook in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching guidebook, or <code>null</code> if a matching guidebook could not be found
	 */
	public Guidebook fetchByGroupId_Last(
		long groupId,
		com.liferay.portal.kernel.util.OrderByComparator<Guidebook>
			orderByComparator);

	/**
	 * Returns the guidebooks before and after the current guidebook in the ordered set where groupId = &#63;.
	 *
	 * @param guidebookId the primary key of the current guidebook
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next guidebook
	 * @throws NoSuchGuidebookException if a guidebook with the primary key could not be found
	 */
	public Guidebook[] findByGroupId_PrevAndNext(
			long guidebookId, long groupId,
			com.liferay.portal.kernel.util.OrderByComparator<Guidebook>
				orderByComparator)
		throws NoSuchGuidebookException;

	/**
	 * Removes all the guidebooks where groupId = &#63; from the database.
	 *
	 * @param groupId the group ID
	 */
	public void removeByGroupId(long groupId);

	/**
	 * Returns the number of guidebooks where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @return the number of matching guidebooks
	 */
	public int countByGroupId(long groupId);

	/**
	 * Caches the guidebook in the entity cache if it is enabled.
	 *
	 * @param guidebook the guidebook
	 */
	public void cacheResult(Guidebook guidebook);

	/**
	 * Caches the guidebooks in the entity cache if it is enabled.
	 *
	 * @param guidebooks the guidebooks
	 */
	public void cacheResult(java.util.List<Guidebook> guidebooks);

	/**
	 * Creates a new guidebook with the primary key. Does not add the guidebook to the database.
	 *
	 * @param guidebookId the primary key for the new guidebook
	 * @return the new guidebook
	 */
	public Guidebook create(long guidebookId);

	/**
	 * Removes the guidebook with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param guidebookId the primary key of the guidebook
	 * @return the guidebook that was removed
	 * @throws NoSuchGuidebookException if a guidebook with the primary key could not be found
	 */
	public Guidebook remove(long guidebookId) throws NoSuchGuidebookException;

	public Guidebook updateImpl(Guidebook guidebook);

	/**
	 * Returns the guidebook with the primary key or throws a <code>NoSuchGuidebookException</code> if it could not be found.
	 *
	 * @param guidebookId the primary key of the guidebook
	 * @return the guidebook
	 * @throws NoSuchGuidebookException if a guidebook with the primary key could not be found
	 */
	public Guidebook findByPrimaryKey(long guidebookId)
		throws NoSuchGuidebookException;

	/**
	 * Returns the guidebook with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param guidebookId the primary key of the guidebook
	 * @return the guidebook, or <code>null</code> if a guidebook with the primary key could not be found
	 */
	public Guidebook fetchByPrimaryKey(long guidebookId);

	/**
	 * Returns all the guidebooks.
	 *
	 * @return the guidebooks
	 */
	public java.util.List<Guidebook> findAll();

	/**
	 * Returns a range of all the guidebooks.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>GuidebookModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of guidebooks
	 * @param end the upper bound of the range of guidebooks (not inclusive)
	 * @return the range of guidebooks
	 */
	public java.util.List<Guidebook> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the guidebooks.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>GuidebookModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of guidebooks
	 * @param end the upper bound of the range of guidebooks (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of guidebooks
	 */
	public java.util.List<Guidebook> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Guidebook>
			orderByComparator);

	/**
	 * Returns an ordered range of all the guidebooks.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>GuidebookModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of guidebooks
	 * @param end the upper bound of the range of guidebooks (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of guidebooks
	 */
	public java.util.List<Guidebook> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Guidebook>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the guidebooks from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of guidebooks.
	 *
	 * @return the number of guidebooks
	 */
	public int countAll();

	@Override
	public Set<String> getBadColumnNames();

}