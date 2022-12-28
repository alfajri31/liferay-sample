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
 * Provides a wrapper for {@link GuidebookService}.
 *
 * @author liferay
 * @see GuidebookService
 * @generated
 */
public class GuidebookServiceWrapper
	implements GuidebookService, ServiceWrapper<GuidebookService> {

	public GuidebookServiceWrapper(GuidebookService guidebookService) {
		_guidebookService = guidebookService;
	}

	@Override
	public com.docs.guidebook.model.Guidebook addGuestbook(
			long userId, String name,
			com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _guidebookService.addGuestbook(userId, name, serviceContext);
	}

	@Override
	public java.util.List<com.docs.guidebook.model.Guidebook> getGuestbooks(
		long groupId) {

		return _guidebookService.getGuestbooks(groupId);
	}

	@Override
	public java.util.List<com.docs.guidebook.model.Guidebook> getGuestbooks(
		long groupId, int start, int end) {

		return _guidebookService.getGuestbooks(groupId, start, end);
	}

	@Override
	public java.util.List<com.docs.guidebook.model.Guidebook> getGuestbooks(
		long groupId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<com.docs.guidebook.model.Guidebook> obc) {

		return _guidebookService.getGuestbooks(groupId, start, end, obc);
	}

	@Override
	public int getGuestbooksCount(long groupId) {
		return _guidebookService.getGuestbooksCount(groupId);
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _guidebookService.getOSGiServiceIdentifier();
	}

	@Override
	public GuidebookService getWrappedService() {
		return _guidebookService;
	}

	@Override
	public void setWrappedService(GuidebookService guidebookService) {
		_guidebookService = guidebookService;
	}

	private GuidebookService _guidebookService;

}