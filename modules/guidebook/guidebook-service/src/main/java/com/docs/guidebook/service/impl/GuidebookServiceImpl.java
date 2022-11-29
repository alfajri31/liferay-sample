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

package com.docs.guidebook.service.impl;
import com.docs.guidebook.exception.GuestbookNameException;
import com.docs.guidebook.model.Guidebook;

import com.docs.guidebook.service.base.GuidebookServiceBaseImpl;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.Validator;

import java.util.Date;
import java.util.List;


/**
 * The implementation of the guidebook remote service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the <code>com.docs.guidebook.service.GuidebookService</code> interface.
 *
 * <p>
 * This is a remote service. Methods of this service are expected to have security checks based on the propagated JAAS credentials because this service can be accessed remotely.
 * </p>
 *
 * @author liferay
 * @see GuidebookServiceBaseImpl
 */
public class GuidebookServiceImpl extends GuidebookServiceBaseImpl {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this class directly. Always use <code>com.docs.guidebook.service.GuidebookServiceUtil</code> to access the guidebook remote service.
	 */
	public Guidebook addGuestbook(
			long userId, String name, ServiceContext serviceContext)
			throws PortalException {
		long groupId = serviceContext.getScopeGroupId();
		User user = userLocalService.getUserById(userId);
		Date now = new Date();
		validate(name);
		long guestbookId = counterLocalService.increment();
		Guidebook guestbook = guidebookPersistence.create(guestbookId);
		guestbook.setUuid(serviceContext.getUuid());
		guestbook.setUserId(userId);
		guestbook.setGroupId(groupId);
		guestbook.setCompanyId(user.getCompanyId());
		guestbook.setUserName(user.getFullName());

		guestbook.setCreateDate(serviceContext.getCreateDate(now));
		guestbook.setModifiedDate(serviceContext.getModifiedDate(now));
		guestbook.setName(name);
		guestbook.setExpandoBridgeAttributes(serviceContext);
		guidebookPersistence.update(guestbook);
		return guestbook;
	}

	public List<Guidebook> getGuestbooks(long groupId) {
		return guidebookPersistence.findByGroupId(groupId);
	}
	public List<Guidebook> getGuestbooks(long groupId, int start, int end,
										 OrderByComparator<Guidebook> obc) {
		return guidebookPersistence.findByGroupId(groupId, start, end, obc);
	}
	public List<Guidebook> getGuestbooks(long groupId, int start, int end) {
		return guidebookPersistence.findByGroupId(groupId, start, end);
	}
	public int getGuestbooksCount(long groupId) {
		return guidebookPersistence.countByGroupId(groupId);
	}

	protected void validate(String name) throws PortalException {
		if (Validator.isNull(name)) {
			throw new GuestbookNameException();
		}
	}
}