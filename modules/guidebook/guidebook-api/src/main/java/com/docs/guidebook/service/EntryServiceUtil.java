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

import com.docs.guidebook.model.Entry;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;

import java.util.List;

/**
 * Provides the remote service utility for Entry. This utility wraps
 * <code>com.docs.guidebook.service.impl.EntryServiceImpl</code> and is an
 * access point for service operations in application layer code running on a
 * remote server. Methods of this service are expected to have security checks
 * based on the propagated JAAS credentials because this service can be
 * accessed remotely.
 *
 * @author liferay
 * @see EntryService
 * @generated
 */
public class EntryServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>com.docs.guidebook.service.impl.EntryServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static Entry addEntry(
			long userId, long guestbookId, String name, String email,
			String message,
			com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws PortalException {

		return getService().addEntry(
			userId, guestbookId, name, email, message, serviceContext);
	}

	public static Entry deleteEntry(long entryId) throws PortalException {
		return getService().deleteEntry(entryId);
	}

	public static List<Entry> getEntries(long groupId, long guestbookId) {
		return getService().getEntries(groupId, guestbookId);
	}

	public static List<Entry> getEntries(
			long groupId, long guestbookId, int start, int end)
		throws SystemException {

		return getService().getEntries(groupId, guestbookId, start, end);
	}

	public static List<Entry> getEntries(
		long groupId, long guestbookId, int start, int end,
		OrderByComparator<Entry> obc) {

		return getService().getEntries(groupId, guestbookId, start, end, obc);
	}

	public static int getEntriesCount(long groupId, long guestbookId) {
		return getService().getEntriesCount(groupId, guestbookId);
	}

	public static Entry getEntry(long entryId)
		throws com.docs.guidebook.exception.NoSuchEntryException {

		return getService().getEntry(entryId);
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	public static String getOSGiServiceIdentifier() {
		return getService().getOSGiServiceIdentifier();
	}

	public static Entry updateEntry(
			long userId, long guestbookId, long entryId, String name,
			String email, String message,
			com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws PortalException, SystemException {

		return getService().updateEntry(
			userId, guestbookId, entryId, name, email, message, serviceContext);
	}

	public static EntryService getService() {
		return _service;
	}

	private static volatile EntryService _service;

}