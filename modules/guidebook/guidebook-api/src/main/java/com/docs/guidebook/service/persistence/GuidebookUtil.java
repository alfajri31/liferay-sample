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

import com.docs.guidebook.model.Guidebook;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;
import org.osgi.util.tracker.ServiceTracker;

/**
 * The persistence utility for the guidebook service. This utility wraps <code>com.docs.guidebook.service.persistence.impl.GuidebookPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author liferay
 * @see GuidebookPersistence
 * @generated
 */
@ProviderType
public class GuidebookUtil {

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
	public static void clearCache(Guidebook guidebook) {
		getPersistence().clearCache(guidebook);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
	 */
	public static long countWithDynamicQuery(DynamicQuery dynamicQuery) {
		return getPersistence().countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#fetchByPrimaryKeys(Set)
	 */
	public static Map<Serializable, Guidebook> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<Guidebook> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<Guidebook> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<Guidebook> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<Guidebook> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static Guidebook update(Guidebook guidebook) {
		return getPersistence().update(guidebook);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static Guidebook update(
		Guidebook guidebook, ServiceContext serviceContext) {

		return getPersistence().update(guidebook, serviceContext);
	}

	/**
	 * Returns all the guidebooks where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching guidebooks
	 */
	public static List<Guidebook> findByUuid(String uuid) {
		return getPersistence().findByUuid(uuid);
	}

	/**
	 * Returns a range of all the guidebooks where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>GuidebookModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of guidebooks
	 * @param end the upper bound of the range of guidebooks (not inclusive)
	 * @return the range of matching guidebooks
	 */
	public static List<Guidebook> findByUuid(String uuid, int start, int end) {
		return getPersistence().findByUuid(uuid, start, end);
	}

	/**
	 * Returns an ordered range of all the guidebooks where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>GuidebookModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of guidebooks
	 * @param end the upper bound of the range of guidebooks (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching guidebooks
	 */
	public static List<Guidebook> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<Guidebook> orderByComparator) {

		return getPersistence().findByUuid(uuid, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the guidebooks where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>GuidebookModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of guidebooks
	 * @param end the upper bound of the range of guidebooks (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching guidebooks
	 */
	public static List<Guidebook> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<Guidebook> orderByComparator,
		boolean retrieveFromCache) {

		return getPersistence().findByUuid(
			uuid, start, end, orderByComparator, retrieveFromCache);
	}

	/**
	 * Returns the first guidebook in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching guidebook
	 * @throws NoSuchGuidebookException if a matching guidebook could not be found
	 */
	public static Guidebook findByUuid_First(
			String uuid, OrderByComparator<Guidebook> orderByComparator)
		throws com.docs.guidebook.exception.NoSuchGuidebookException {

		return getPersistence().findByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the first guidebook in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching guidebook, or <code>null</code> if a matching guidebook could not be found
	 */
	public static Guidebook fetchByUuid_First(
		String uuid, OrderByComparator<Guidebook> orderByComparator) {

		return getPersistence().fetchByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the last guidebook in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching guidebook
	 * @throws NoSuchGuidebookException if a matching guidebook could not be found
	 */
	public static Guidebook findByUuid_Last(
			String uuid, OrderByComparator<Guidebook> orderByComparator)
		throws com.docs.guidebook.exception.NoSuchGuidebookException {

		return getPersistence().findByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the last guidebook in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching guidebook, or <code>null</code> if a matching guidebook could not be found
	 */
	public static Guidebook fetchByUuid_Last(
		String uuid, OrderByComparator<Guidebook> orderByComparator) {

		return getPersistence().fetchByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the guidebooks before and after the current guidebook in the ordered set where uuid = &#63;.
	 *
	 * @param guidebookId the primary key of the current guidebook
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next guidebook
	 * @throws NoSuchGuidebookException if a guidebook with the primary key could not be found
	 */
	public static Guidebook[] findByUuid_PrevAndNext(
			long guidebookId, String uuid,
			OrderByComparator<Guidebook> orderByComparator)
		throws com.docs.guidebook.exception.NoSuchGuidebookException {

		return getPersistence().findByUuid_PrevAndNext(
			guidebookId, uuid, orderByComparator);
	}

	/**
	 * Removes all the guidebooks where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public static void removeByUuid(String uuid) {
		getPersistence().removeByUuid(uuid);
	}

	/**
	 * Returns the number of guidebooks where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching guidebooks
	 */
	public static int countByUuid(String uuid) {
		return getPersistence().countByUuid(uuid);
	}

	/**
	 * Returns the guidebook where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchGuidebookException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching guidebook
	 * @throws NoSuchGuidebookException if a matching guidebook could not be found
	 */
	public static Guidebook findByUUID_G(String uuid, long groupId)
		throws com.docs.guidebook.exception.NoSuchGuidebookException {

		return getPersistence().findByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the guidebook where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching guidebook, or <code>null</code> if a matching guidebook could not be found
	 */
	public static Guidebook fetchByUUID_G(String uuid, long groupId) {
		return getPersistence().fetchByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the guidebook where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the matching guidebook, or <code>null</code> if a matching guidebook could not be found
	 */
	public static Guidebook fetchByUUID_G(
		String uuid, long groupId, boolean retrieveFromCache) {

		return getPersistence().fetchByUUID_G(uuid, groupId, retrieveFromCache);
	}

	/**
	 * Removes the guidebook where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the guidebook that was removed
	 */
	public static Guidebook removeByUUID_G(String uuid, long groupId)
		throws com.docs.guidebook.exception.NoSuchGuidebookException {

		return getPersistence().removeByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the number of guidebooks where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching guidebooks
	 */
	public static int countByUUID_G(String uuid, long groupId) {
		return getPersistence().countByUUID_G(uuid, groupId);
	}

	/**
	 * Returns all the guidebooks where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching guidebooks
	 */
	public static List<Guidebook> findByUuid_C(String uuid, long companyId) {
		return getPersistence().findByUuid_C(uuid, companyId);
	}

	/**
	 * Returns a range of all the guidebooks where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>GuidebookModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of guidebooks
	 * @param end the upper bound of the range of guidebooks (not inclusive)
	 * @return the range of matching guidebooks
	 */
	public static List<Guidebook> findByUuid_C(
		String uuid, long companyId, int start, int end) {

		return getPersistence().findByUuid_C(uuid, companyId, start, end);
	}

	/**
	 * Returns an ordered range of all the guidebooks where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>GuidebookModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of guidebooks
	 * @param end the upper bound of the range of guidebooks (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching guidebooks
	 */
	public static List<Guidebook> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<Guidebook> orderByComparator) {

		return getPersistence().findByUuid_C(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the guidebooks where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>GuidebookModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of guidebooks
	 * @param end the upper bound of the range of guidebooks (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching guidebooks
	 */
	public static List<Guidebook> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<Guidebook> orderByComparator,
		boolean retrieveFromCache) {

		return getPersistence().findByUuid_C(
			uuid, companyId, start, end, orderByComparator, retrieveFromCache);
	}

	/**
	 * Returns the first guidebook in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching guidebook
	 * @throws NoSuchGuidebookException if a matching guidebook could not be found
	 */
	public static Guidebook findByUuid_C_First(
			String uuid, long companyId,
			OrderByComparator<Guidebook> orderByComparator)
		throws com.docs.guidebook.exception.NoSuchGuidebookException {

		return getPersistence().findByUuid_C_First(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the first guidebook in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching guidebook, or <code>null</code> if a matching guidebook could not be found
	 */
	public static Guidebook fetchByUuid_C_First(
		String uuid, long companyId,
		OrderByComparator<Guidebook> orderByComparator) {

		return getPersistence().fetchByUuid_C_First(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the last guidebook in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching guidebook
	 * @throws NoSuchGuidebookException if a matching guidebook could not be found
	 */
	public static Guidebook findByUuid_C_Last(
			String uuid, long companyId,
			OrderByComparator<Guidebook> orderByComparator)
		throws com.docs.guidebook.exception.NoSuchGuidebookException {

		return getPersistence().findByUuid_C_Last(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the last guidebook in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching guidebook, or <code>null</code> if a matching guidebook could not be found
	 */
	public static Guidebook fetchByUuid_C_Last(
		String uuid, long companyId,
		OrderByComparator<Guidebook> orderByComparator) {

		return getPersistence().fetchByUuid_C_Last(
			uuid, companyId, orderByComparator);
	}

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
	public static Guidebook[] findByUuid_C_PrevAndNext(
			long guidebookId, String uuid, long companyId,
			OrderByComparator<Guidebook> orderByComparator)
		throws com.docs.guidebook.exception.NoSuchGuidebookException {

		return getPersistence().findByUuid_C_PrevAndNext(
			guidebookId, uuid, companyId, orderByComparator);
	}

	/**
	 * Removes all the guidebooks where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public static void removeByUuid_C(String uuid, long companyId) {
		getPersistence().removeByUuid_C(uuid, companyId);
	}

	/**
	 * Returns the number of guidebooks where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching guidebooks
	 */
	public static int countByUuid_C(String uuid, long companyId) {
		return getPersistence().countByUuid_C(uuid, companyId);
	}

	/**
	 * Returns all the guidebooks where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @return the matching guidebooks
	 */
	public static List<Guidebook> findByGroupId(long groupId) {
		return getPersistence().findByGroupId(groupId);
	}

	/**
	 * Returns a range of all the guidebooks where groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>GuidebookModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param start the lower bound of the range of guidebooks
	 * @param end the upper bound of the range of guidebooks (not inclusive)
	 * @return the range of matching guidebooks
	 */
	public static List<Guidebook> findByGroupId(
		long groupId, int start, int end) {

		return getPersistence().findByGroupId(groupId, start, end);
	}

	/**
	 * Returns an ordered range of all the guidebooks where groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>GuidebookModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param start the lower bound of the range of guidebooks
	 * @param end the upper bound of the range of guidebooks (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching guidebooks
	 */
	public static List<Guidebook> findByGroupId(
		long groupId, int start, int end,
		OrderByComparator<Guidebook> orderByComparator) {

		return getPersistence().findByGroupId(
			groupId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the guidebooks where groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>GuidebookModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param start the lower bound of the range of guidebooks
	 * @param end the upper bound of the range of guidebooks (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching guidebooks
	 */
	public static List<Guidebook> findByGroupId(
		long groupId, int start, int end,
		OrderByComparator<Guidebook> orderByComparator,
		boolean retrieveFromCache) {

		return getPersistence().findByGroupId(
			groupId, start, end, orderByComparator, retrieveFromCache);
	}

	/**
	 * Returns the first guidebook in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching guidebook
	 * @throws NoSuchGuidebookException if a matching guidebook could not be found
	 */
	public static Guidebook findByGroupId_First(
			long groupId, OrderByComparator<Guidebook> orderByComparator)
		throws com.docs.guidebook.exception.NoSuchGuidebookException {

		return getPersistence().findByGroupId_First(groupId, orderByComparator);
	}

	/**
	 * Returns the first guidebook in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching guidebook, or <code>null</code> if a matching guidebook could not be found
	 */
	public static Guidebook fetchByGroupId_First(
		long groupId, OrderByComparator<Guidebook> orderByComparator) {

		return getPersistence().fetchByGroupId_First(
			groupId, orderByComparator);
	}

	/**
	 * Returns the last guidebook in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching guidebook
	 * @throws NoSuchGuidebookException if a matching guidebook could not be found
	 */
	public static Guidebook findByGroupId_Last(
			long groupId, OrderByComparator<Guidebook> orderByComparator)
		throws com.docs.guidebook.exception.NoSuchGuidebookException {

		return getPersistence().findByGroupId_Last(groupId, orderByComparator);
	}

	/**
	 * Returns the last guidebook in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching guidebook, or <code>null</code> if a matching guidebook could not be found
	 */
	public static Guidebook fetchByGroupId_Last(
		long groupId, OrderByComparator<Guidebook> orderByComparator) {

		return getPersistence().fetchByGroupId_Last(groupId, orderByComparator);
	}

	/**
	 * Returns the guidebooks before and after the current guidebook in the ordered set where groupId = &#63;.
	 *
	 * @param guidebookId the primary key of the current guidebook
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next guidebook
	 * @throws NoSuchGuidebookException if a guidebook with the primary key could not be found
	 */
	public static Guidebook[] findByGroupId_PrevAndNext(
			long guidebookId, long groupId,
			OrderByComparator<Guidebook> orderByComparator)
		throws com.docs.guidebook.exception.NoSuchGuidebookException {

		return getPersistence().findByGroupId_PrevAndNext(
			guidebookId, groupId, orderByComparator);
	}

	/**
	 * Removes all the guidebooks where groupId = &#63; from the database.
	 *
	 * @param groupId the group ID
	 */
	public static void removeByGroupId(long groupId) {
		getPersistence().removeByGroupId(groupId);
	}

	/**
	 * Returns the number of guidebooks where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @return the number of matching guidebooks
	 */
	public static int countByGroupId(long groupId) {
		return getPersistence().countByGroupId(groupId);
	}

	/**
	 * Caches the guidebook in the entity cache if it is enabled.
	 *
	 * @param guidebook the guidebook
	 */
	public static void cacheResult(Guidebook guidebook) {
		getPersistence().cacheResult(guidebook);
	}

	/**
	 * Caches the guidebooks in the entity cache if it is enabled.
	 *
	 * @param guidebooks the guidebooks
	 */
	public static void cacheResult(List<Guidebook> guidebooks) {
		getPersistence().cacheResult(guidebooks);
	}

	/**
	 * Creates a new guidebook with the primary key. Does not add the guidebook to the database.
	 *
	 * @param guidebookId the primary key for the new guidebook
	 * @return the new guidebook
	 */
	public static Guidebook create(long guidebookId) {
		return getPersistence().create(guidebookId);
	}

	/**
	 * Removes the guidebook with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param guidebookId the primary key of the guidebook
	 * @return the guidebook that was removed
	 * @throws NoSuchGuidebookException if a guidebook with the primary key could not be found
	 */
	public static Guidebook remove(long guidebookId)
		throws com.docs.guidebook.exception.NoSuchGuidebookException {

		return getPersistence().remove(guidebookId);
	}

	public static Guidebook updateImpl(Guidebook guidebook) {
		return getPersistence().updateImpl(guidebook);
	}

	/**
	 * Returns the guidebook with the primary key or throws a <code>NoSuchGuidebookException</code> if it could not be found.
	 *
	 * @param guidebookId the primary key of the guidebook
	 * @return the guidebook
	 * @throws NoSuchGuidebookException if a guidebook with the primary key could not be found
	 */
	public static Guidebook findByPrimaryKey(long guidebookId)
		throws com.docs.guidebook.exception.NoSuchGuidebookException {

		return getPersistence().findByPrimaryKey(guidebookId);
	}

	/**
	 * Returns the guidebook with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param guidebookId the primary key of the guidebook
	 * @return the guidebook, or <code>null</code> if a guidebook with the primary key could not be found
	 */
	public static Guidebook fetchByPrimaryKey(long guidebookId) {
		return getPersistence().fetchByPrimaryKey(guidebookId);
	}

	/**
	 * Returns all the guidebooks.
	 *
	 * @return the guidebooks
	 */
	public static List<Guidebook> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the guidebooks.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>GuidebookModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of guidebooks
	 * @param end the upper bound of the range of guidebooks (not inclusive)
	 * @return the range of guidebooks
	 */
	public static List<Guidebook> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the guidebooks.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>GuidebookModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of guidebooks
	 * @param end the upper bound of the range of guidebooks (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of guidebooks
	 */
	public static List<Guidebook> findAll(
		int start, int end, OrderByComparator<Guidebook> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the guidebooks.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>GuidebookModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of guidebooks
	 * @param end the upper bound of the range of guidebooks (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of guidebooks
	 */
	public static List<Guidebook> findAll(
		int start, int end, OrderByComparator<Guidebook> orderByComparator,
		boolean retrieveFromCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, retrieveFromCache);
	}

	/**
	 * Removes all the guidebooks from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of guidebooks.
	 *
	 * @return the number of guidebooks
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static Set<String> getBadColumnNames() {
		return getPersistence().getBadColumnNames();
	}

	public static GuidebookPersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<GuidebookPersistence, GuidebookPersistence>
		_serviceTracker;

	static {
		Bundle bundle = FrameworkUtil.getBundle(GuidebookPersistence.class);

		ServiceTracker<GuidebookPersistence, GuidebookPersistence>
			serviceTracker =
				new ServiceTracker<GuidebookPersistence, GuidebookPersistence>(
					bundle.getBundleContext(), GuidebookPersistence.class,
					null);

		serviceTracker.open();

		_serviceTracker = serviceTracker;
	}

}