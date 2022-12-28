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

package com.docs.guidebook.service.http;

import com.docs.guidebook.service.GuidebookServiceUtil;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;

import java.rmi.RemoteException;

/**
 * Provides the SOAP utility for the
 * <code>GuidebookServiceUtil</code> service
 * utility. The static methods of this class call the same methods of the
 * service utility. However, the signatures are different because it is
 * difficult for SOAP to support certain types.
 *
 * <p>
 * ServiceBuilder follows certain rules in translating the methods. For example,
 * if the method in the service utility returns a <code>java.util.List</code>,
 * that is translated to an array of
 * <code>com.docs.guidebook.model.GuidebookSoap</code>. If the method in the
 * service utility returns a
 * <code>com.docs.guidebook.model.Guidebook</code>, that is translated to a
 * <code>com.docs.guidebook.model.GuidebookSoap</code>. Methods that SOAP
 * cannot safely wire are skipped.
 * </p>
 *
 * <p>
 * The benefits of using the SOAP utility is that it is cross platform
 * compatible. SOAP allows different languages like Java, .NET, C++, PHP, and
 * even Perl, to call the generated services. One drawback of SOAP is that it is
 * slow because it needs to serialize all calls into a text format (XML).
 * </p>
 *
 * <p>
 * You can see a list of services at http://localhost:8080/api/axis. Set the
 * property <b>axis.servlet.hosts.allowed</b> in portal.properties to configure
 * security.
 * </p>
 *
 * <p>
 * The SOAP utility is only generated for remote services.
 * </p>
 *
 * @author liferay
 * @see GuidebookServiceHttp
 * @generated
 */
public class GuidebookServiceSoap {

	public static com.docs.guidebook.model.GuidebookSoap addGuestbook(
			long userId, String name,
			com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws RemoteException {

		try {
			com.docs.guidebook.model.Guidebook returnValue =
				GuidebookServiceUtil.addGuestbook(userId, name, serviceContext);

			return com.docs.guidebook.model.GuidebookSoap.toSoapModel(
				returnValue);
		}
		catch (Exception exception) {
			_log.error(exception, exception);

			throw new RemoteException(exception.getMessage());
		}
	}

	public static com.docs.guidebook.model.GuidebookSoap[] getGuestbooks(
			long groupId)
		throws RemoteException {

		try {
			java.util.List<com.docs.guidebook.model.Guidebook> returnValue =
				GuidebookServiceUtil.getGuestbooks(groupId);

			return com.docs.guidebook.model.GuidebookSoap.toSoapModels(
				returnValue);
		}
		catch (Exception exception) {
			_log.error(exception, exception);

			throw new RemoteException(exception.getMessage());
		}
	}

	public static com.docs.guidebook.model.GuidebookSoap[] getGuestbooks(
			long groupId, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<com.docs.guidebook.model.Guidebook> obc)
		throws RemoteException {

		try {
			java.util.List<com.docs.guidebook.model.Guidebook> returnValue =
				GuidebookServiceUtil.getGuestbooks(groupId, start, end, obc);

			return com.docs.guidebook.model.GuidebookSoap.toSoapModels(
				returnValue);
		}
		catch (Exception exception) {
			_log.error(exception, exception);

			throw new RemoteException(exception.getMessage());
		}
	}

	public static com.docs.guidebook.model.GuidebookSoap[] getGuestbooks(
			long groupId, int start, int end)
		throws RemoteException {

		try {
			java.util.List<com.docs.guidebook.model.Guidebook> returnValue =
				GuidebookServiceUtil.getGuestbooks(groupId, start, end);

			return com.docs.guidebook.model.GuidebookSoap.toSoapModels(
				returnValue);
		}
		catch (Exception exception) {
			_log.error(exception, exception);

			throw new RemoteException(exception.getMessage());
		}
	}

	public static int getGuestbooksCount(long groupId) throws RemoteException {
		try {
			int returnValue = GuidebookServiceUtil.getGuestbooksCount(groupId);

			return returnValue;
		}
		catch (Exception exception) {
			_log.error(exception, exception);

			throw new RemoteException(exception.getMessage());
		}
	}

	private static Log _log = LogFactoryUtil.getLog(GuidebookServiceSoap.class);

}