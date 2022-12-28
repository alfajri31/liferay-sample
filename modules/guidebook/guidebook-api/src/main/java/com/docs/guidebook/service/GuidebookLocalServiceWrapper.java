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

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link GuidebookLocalService}.
 *
 * @author liferay
 * @see GuidebookLocalService
 * @generated
 */
public class GuidebookLocalServiceWrapper
	implements GuidebookLocalService, ServiceWrapper<GuidebookLocalService> {

	public GuidebookLocalServiceWrapper(
		GuidebookLocalService guidebookLocalService) {

		_guidebookLocalService = guidebookLocalService;
	}

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
	@Override
	public com.docs.guidebook.model.Guidebook addGuidebook(
		com.docs.guidebook.model.Guidebook guidebook) {

		return _guidebookLocalService.addGuidebook(guidebook);
	}

	/**
	 * Creates a new guidebook with the primary key. Does not add the guidebook to the database.
	 *
	 * @param guidebookId the primary key for the new guidebook
	 * @return the new guidebook
	 */
	@Override
	public com.docs.guidebook.model.Guidebook createGuidebook(
		long guidebookId) {

		return _guidebookLocalService.createGuidebook(guidebookId);
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
	@Override
	public com.docs.guidebook.model.Guidebook deleteGuidebook(
		com.docs.guidebook.model.Guidebook guidebook) {

		return _guidebookLocalService.deleteGuidebook(guidebook);
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
	@Override
	public com.docs.guidebook.model.Guidebook deleteGuidebook(long guidebookId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _guidebookLocalService.deleteGuidebook(guidebookId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _guidebookLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _guidebookLocalService.dynamicQuery();
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

		return _guidebookLocalService.dynamicQuery(dynamicQuery);
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
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {

		return _guidebookLocalService.dynamicQuery(dynamicQuery, start, end);
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
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {

		return _guidebookLocalService.dynamicQuery(
			dynamicQuery, start, end, orderByComparator);
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

		return _guidebookLocalService.dynamicQueryCount(dynamicQuery);
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

		return _guidebookLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.docs.guidebook.model.Guidebook fetchGuidebook(long guidebookId) {
		return _guidebookLocalService.fetchGuidebook(guidebookId);
	}

	/**
	 * Returns the guidebook matching the UUID and group.
	 *
	 * @param uuid the guidebook's UUID
	 * @param groupId the primary key of the group
	 * @return the matching guidebook, or <code>null</code> if a matching guidebook could not be found
	 */
	@Override
	public com.docs.guidebook.model.Guidebook fetchGuidebookByUuidAndGroupId(
		String uuid, long groupId) {

		return _guidebookLocalService.fetchGuidebookByUuidAndGroupId(
			uuid, groupId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _guidebookLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery
		getExportActionableDynamicQuery(
			com.liferay.exportimport.kernel.lar.PortletDataContext
				portletDataContext) {

		return _guidebookLocalService.getExportActionableDynamicQuery(
			portletDataContext);
	}

	/**
	 * Returns the guidebook with the primary key.
	 *
	 * @param guidebookId the primary key of the guidebook
	 * @return the guidebook
	 * @throws PortalException if a guidebook with the primary key could not be found
	 */
	@Override
	public com.docs.guidebook.model.Guidebook getGuidebook(long guidebookId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _guidebookLocalService.getGuidebook(guidebookId);
	}

	/**
	 * Returns the guidebook matching the UUID and group.
	 *
	 * @param uuid the guidebook's UUID
	 * @param groupId the primary key of the group
	 * @return the matching guidebook
	 * @throws PortalException if a matching guidebook could not be found
	 */
	@Override
	public com.docs.guidebook.model.Guidebook getGuidebookByUuidAndGroupId(
			String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _guidebookLocalService.getGuidebookByUuidAndGroupId(
			uuid, groupId);
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
	@Override
	public java.util.List<com.docs.guidebook.model.Guidebook> getGuidebooks(
		int start, int end) {

		return _guidebookLocalService.getGuidebooks(start, end);
	}

	/**
	 * Returns all the guidebooks matching the UUID and company.
	 *
	 * @param uuid the UUID of the guidebooks
	 * @param companyId the primary key of the company
	 * @return the matching guidebooks, or an empty list if no matches were found
	 */
	@Override
	public java.util.List<com.docs.guidebook.model.Guidebook>
		getGuidebooksByUuidAndCompanyId(String uuid, long companyId) {

		return _guidebookLocalService.getGuidebooksByUuidAndCompanyId(
			uuid, companyId);
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
	@Override
	public java.util.List<com.docs.guidebook.model.Guidebook>
		getGuidebooksByUuidAndCompanyId(
			String uuid, long companyId, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<com.docs.guidebook.model.Guidebook> orderByComparator) {

		return _guidebookLocalService.getGuidebooksByUuidAndCompanyId(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of guidebooks.
	 *
	 * @return the number of guidebooks
	 */
	@Override
	public int getGuidebooksCount() {
		return _guidebookLocalService.getGuidebooksCount();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _guidebookLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _guidebookLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _guidebookLocalService.getPersistedModel(primaryKeyObj);
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
	@Override
	public com.docs.guidebook.model.Guidebook updateGuidebook(
		com.docs.guidebook.model.Guidebook guidebook) {

		return _guidebookLocalService.updateGuidebook(guidebook);
	}

	@Override
	public GuidebookLocalService getWrappedService() {
		return _guidebookLocalService;
	}

	@Override
	public void setWrappedService(GuidebookLocalService guidebookLocalService) {
		_guidebookLocalService = guidebookLocalService;
	}

	private GuidebookLocalService _guidebookLocalService;

}