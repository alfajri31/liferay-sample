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

package com.docs.guidebook.service;

import com.docs.guidebook.model.Guidebook;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.util.OrderByComparator;

import java.io.Serializable;

import java.util.List;

/**
 * Provides the local service utility for Guidebook. This utility wraps
 * <code>com.docs.guidebook.service.impl.GuidebookLocalServiceImpl</code> and
 * is an access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author liferay
 * @see GuidebookLocalService
 * @generated
 */
public class GuidebookLocalServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>com.docs.guidebook.service.impl.GuidebookLocalServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * Adds the guidebook to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect GuidebookLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param guidebook the guidebook
	 * @return the guidebook that was added
	 */
	public static Guidebook addGuidebook(Guidebook guidebook) {
		return getService().addGuidebook(guidebook);
	}

	/**
	 * Creates a new guidebook with the primary key. Does not add the guidebook to the database.
	 *
	 * @param guidebookId the primary key for the new guidebook
	 * @return the new guidebook
	 */
	public static Guidebook createGuidebook(long guidebookId) {
		return getService().createGuidebook(guidebookId);
	}

	/**
	 * Deletes the guidebook from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect GuidebookLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param guidebook the guidebook
	 * @return the guidebook that was removed
	 */
	public static Guidebook deleteGuidebook(Guidebook guidebook) {
		return getService().deleteGuidebook(guidebook);
	}

	/**
	 * Deletes the guidebook with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect GuidebookLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param guidebookId the primary key of the guidebook
	 * @return the guidebook that was removed
	 * @throws PortalException if a guidebook with the primary key could not be found
	 */
	public static Guidebook deleteGuidebook(long guidebookId)
		throws PortalException {

		return getService().deleteGuidebook(guidebookId);
	}

	/**
	 * @throws PortalException
	 */
	public static PersistedModel deletePersistedModel(
			PersistedModel persistedModel)
		throws PortalException {

		return getService().deletePersistedModel(persistedModel);
	}

	public static DynamicQuery dynamicQuery() {
		return getService().dynamicQuery();
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	public static <T> List<T> dynamicQuery(DynamicQuery dynamicQuery) {
		return getService().dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.docs.guidebook.model.impl.GuidebookModelImpl</code>.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @return the range of matching rows
	 */
	public static <T> List<T> dynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getService().dynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.docs.guidebook.model.impl.GuidebookModelImpl</code>.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching rows
	 */
	public static <T> List<T> dynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<T> orderByComparator) {

		return getService().dynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the number of rows matching the dynamic query
	 */
	public static long dynamicQueryCount(DynamicQuery dynamicQuery) {
		return getService().dynamicQueryCount(dynamicQuery);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @param projection the projection to apply to the query
	 * @return the number of rows matching the dynamic query
	 */
	public static long dynamicQueryCount(
		DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {

		return getService().dynamicQueryCount(dynamicQuery, projection);
	}

	public static Guidebook fetchGuidebook(long guidebookId) {
		return getService().fetchGuidebook(guidebookId);
	}

	/**
	 * Returns the guidebook matching the UUID and group.
	 *
	 * @param uuid the guidebook's UUID
	 * @param groupId the primary key of the group
	 * @return the matching guidebook, or <code>null</code> if a matching guidebook could not be found
	 */
	public static Guidebook fetchGuidebookByUuidAndGroupId(
		String uuid, long groupId) {

		return getService().fetchGuidebookByUuidAndGroupId(uuid, groupId);
	}

	public static com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return getService().getActionableDynamicQuery();
	}

	public static com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery
		getExportActionableDynamicQuery(
			com.liferay.exportimport.kernel.lar.PortletDataContext
				portletDataContext) {

		return getService().getExportActionableDynamicQuery(portletDataContext);
	}

	/**
	 * Returns the guidebook with the primary key.
	 *
	 * @param guidebookId the primary key of the guidebook
	 * @return the guidebook
	 * @throws PortalException if a guidebook with the primary key could not be found
	 */
	public static Guidebook getGuidebook(long guidebookId)
		throws PortalException {

		return getService().getGuidebook(guidebookId);
	}

	/**
	 * Returns the guidebook matching the UUID and group.
	 *
	 * @param uuid the guidebook's UUID
	 * @param groupId the primary key of the group
	 * @return the matching guidebook
	 * @throws PortalException if a matching guidebook could not be found
	 */
	public static Guidebook getGuidebookByUuidAndGroupId(
			String uuid, long groupId)
		throws PortalException {

		return getService().getGuidebookByUuidAndGroupId(uuid, groupId);
	}

	/**
	 * Returns a range of all the guidebooks.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.docs.guidebook.model.impl.GuidebookModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of guidebooks
	 * @param end the upper bound of the range of guidebooks (not inclusive)
	 * @return the range of guidebooks
	 */
	public static List<Guidebook> getGuidebooks(int start, int end) {
		return getService().getGuidebooks(start, end);
	}

	/**
	 * Returns all the guidebooks matching the UUID and company.
	 *
	 * @param uuid the UUID of the guidebooks
	 * @param companyId the primary key of the company
	 * @return the matching guidebooks, or an empty list if no matches were found
	 */
	public static List<Guidebook> getGuidebooksByUuidAndCompanyId(
		String uuid, long companyId) {

		return getService().getGuidebooksByUuidAndCompanyId(uuid, companyId);
	}

	/**
	 * Returns a range of guidebooks matching the UUID and company.
	 *
	 * @param uuid the UUID of the guidebooks
	 * @param companyId the primary key of the company
	 * @param start the lower bound of the range of guidebooks
	 * @param end the upper bound of the range of guidebooks (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the range of matching guidebooks, or an empty list if no matches were found
	 */
	public static List<Guidebook> getGuidebooksByUuidAndCompanyId(
		String uuid, long companyId, int start, int end,
		OrderByComparator<Guidebook> orderByComparator) {

		return getService().getGuidebooksByUuidAndCompanyId(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of guidebooks.
	 *
	 * @return the number of guidebooks
	 */
	public static int getGuidebooksCount() {
		return getService().getGuidebooksCount();
	}

	public static
		com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
			getIndexableActionableDynamicQuery() {

		return getService().getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	public static String getOSGiServiceIdentifier() {
		return getService().getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	public static PersistedModel getPersistedModel(Serializable primaryKeyObj)
		throws PortalException {

		return getService().getPersistedModel(primaryKeyObj);
	}

	/**
	 * Updates the guidebook in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect GuidebookLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param guidebook the guidebook
	 * @return the guidebook that was updated
	 */
	public static Guidebook updateGuidebook(Guidebook guidebook) {
		return getService().updateGuidebook(guidebook);
	}

	public static GuidebookLocalService getService() {
		return _service;
	}

	private static volatile GuidebookLocalService _service;

}