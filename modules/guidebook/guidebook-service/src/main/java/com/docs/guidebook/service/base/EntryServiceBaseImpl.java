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

package com.docs.guidebook.service.base;

import com.docs.guidebook.model.Entry;
import com.docs.guidebook.service.EntryService;
import com.docs.guidebook.service.EntryServiceUtil;
import com.docs.guidebook.service.persistence.EntryPersistence;
import com.docs.guidebook.service.persistence.GuidebookPersistence;

import com.liferay.portal.kernel.bean.BeanReference;
import com.liferay.portal.kernel.dao.db.DB;
import com.liferay.portal.kernel.dao.db.DBManagerUtil;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdate;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdateFactoryUtil;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.module.framework.service.IdentifiableOSGiService;
import com.liferay.portal.kernel.service.BaseServiceImpl;
import com.liferay.portal.kernel.service.persistence.ClassNamePersistence;
import com.liferay.portal.kernel.service.persistence.UserPersistence;
import com.liferay.portal.kernel.util.PortalUtil;
import com.liferay.portal.spring.extender.service.ServiceReference;

import java.lang.reflect.Field;

import javax.sql.DataSource;

/**
 * Provides the base implementation for the entry remote service.
 *
 * <p>
 * This implementation exists only as a container for the default service methods generated by ServiceBuilder. All custom service methods should be put in {@link com.docs.guidebook.service.impl.EntryServiceImpl}.
 * </p>
 *
 * @author liferay
 * @see com.docs.guidebook.service.impl.EntryServiceImpl
 * @generated
 */
public abstract class EntryServiceBaseImpl
	extends BaseServiceImpl implements EntryService, IdentifiableOSGiService {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Use <code>EntryService</code> via injection or a <code>org.osgi.util.tracker.ServiceTracker</code> or use <code>EntryServiceUtil</code>.
	 */

	/**
	 * Returns the entry local service.
	 *
	 * @return the entry local service
	 */
	public com.docs.guidebook.service.EntryLocalService getEntryLocalService() {
		return entryLocalService;
	}

	/**
	 * Sets the entry local service.
	 *
	 * @param entryLocalService the entry local service
	 */
	public void setEntryLocalService(
		com.docs.guidebook.service.EntryLocalService entryLocalService) {

		this.entryLocalService = entryLocalService;
	}

	/**
	 * Returns the entry remote service.
	 *
	 * @return the entry remote service
	 */
	public EntryService getEntryService() {
		return entryService;
	}

	/**
	 * Sets the entry remote service.
	 *
	 * @param entryService the entry remote service
	 */
	public void setEntryService(EntryService entryService) {
		this.entryService = entryService;
	}

	/**
	 * Returns the entry persistence.
	 *
	 * @return the entry persistence
	 */
	public EntryPersistence getEntryPersistence() {
		return entryPersistence;
	}

	/**
	 * Sets the entry persistence.
	 *
	 * @param entryPersistence the entry persistence
	 */
	public void setEntryPersistence(EntryPersistence entryPersistence) {
		this.entryPersistence = entryPersistence;
	}

	/**
	 * Returns the guidebook local service.
	 *
	 * @return the guidebook local service
	 */
	public com.docs.guidebook.service.GuidebookLocalService
		getGuidebookLocalService() {

		return guidebookLocalService;
	}

	/**
	 * Sets the guidebook local service.
	 *
	 * @param guidebookLocalService the guidebook local service
	 */
	public void setGuidebookLocalService(
		com.docs.guidebook.service.GuidebookLocalService
			guidebookLocalService) {

		this.guidebookLocalService = guidebookLocalService;
	}

	/**
	 * Returns the guidebook remote service.
	 *
	 * @return the guidebook remote service
	 */
	public com.docs.guidebook.service.GuidebookService getGuidebookService() {
		return guidebookService;
	}

	/**
	 * Sets the guidebook remote service.
	 *
	 * @param guidebookService the guidebook remote service
	 */
	public void setGuidebookService(
		com.docs.guidebook.service.GuidebookService guidebookService) {

		this.guidebookService = guidebookService;
	}

	/**
	 * Returns the guidebook persistence.
	 *
	 * @return the guidebook persistence
	 */
	public GuidebookPersistence getGuidebookPersistence() {
		return guidebookPersistence;
	}

	/**
	 * Sets the guidebook persistence.
	 *
	 * @param guidebookPersistence the guidebook persistence
	 */
	public void setGuidebookPersistence(
		GuidebookPersistence guidebookPersistence) {

		this.guidebookPersistence = guidebookPersistence;
	}

	/**
	 * Returns the counter local service.
	 *
	 * @return the counter local service
	 */
	public com.liferay.counter.kernel.service.CounterLocalService
		getCounterLocalService() {

		return counterLocalService;
	}

	/**
	 * Sets the counter local service.
	 *
	 * @param counterLocalService the counter local service
	 */
	public void setCounterLocalService(
		com.liferay.counter.kernel.service.CounterLocalService
			counterLocalService) {

		this.counterLocalService = counterLocalService;
	}

	/**
	 * Returns the class name local service.
	 *
	 * @return the class name local service
	 */
	public com.liferay.portal.kernel.service.ClassNameLocalService
		getClassNameLocalService() {

		return classNameLocalService;
	}

	/**
	 * Sets the class name local service.
	 *
	 * @param classNameLocalService the class name local service
	 */
	public void setClassNameLocalService(
		com.liferay.portal.kernel.service.ClassNameLocalService
			classNameLocalService) {

		this.classNameLocalService = classNameLocalService;
	}

	/**
	 * Returns the class name remote service.
	 *
	 * @return the class name remote service
	 */
	public com.liferay.portal.kernel.service.ClassNameService
		getClassNameService() {

		return classNameService;
	}

	/**
	 * Sets the class name remote service.
	 *
	 * @param classNameService the class name remote service
	 */
	public void setClassNameService(
		com.liferay.portal.kernel.service.ClassNameService classNameService) {

		this.classNameService = classNameService;
	}

	/**
	 * Returns the class name persistence.
	 *
	 * @return the class name persistence
	 */
	public ClassNamePersistence getClassNamePersistence() {
		return classNamePersistence;
	}

	/**
	 * Sets the class name persistence.
	 *
	 * @param classNamePersistence the class name persistence
	 */
	public void setClassNamePersistence(
		ClassNamePersistence classNamePersistence) {

		this.classNamePersistence = classNamePersistence;
	}

	/**
	 * Returns the resource local service.
	 *
	 * @return the resource local service
	 */
	public com.liferay.portal.kernel.service.ResourceLocalService
		getResourceLocalService() {

		return resourceLocalService;
	}

	/**
	 * Sets the resource local service.
	 *
	 * @param resourceLocalService the resource local service
	 */
	public void setResourceLocalService(
		com.liferay.portal.kernel.service.ResourceLocalService
			resourceLocalService) {

		this.resourceLocalService = resourceLocalService;
	}

	/**
	 * Returns the user local service.
	 *
	 * @return the user local service
	 */
	public com.liferay.portal.kernel.service.UserLocalService
		getUserLocalService() {

		return userLocalService;
	}

	/**
	 * Sets the user local service.
	 *
	 * @param userLocalService the user local service
	 */
	public void setUserLocalService(
		com.liferay.portal.kernel.service.UserLocalService userLocalService) {

		this.userLocalService = userLocalService;
	}

	/**
	 * Returns the user remote service.
	 *
	 * @return the user remote service
	 */
	public com.liferay.portal.kernel.service.UserService getUserService() {
		return userService;
	}

	/**
	 * Sets the user remote service.
	 *
	 * @param userService the user remote service
	 */
	public void setUserService(
		com.liferay.portal.kernel.service.UserService userService) {

		this.userService = userService;
	}

	/**
	 * Returns the user persistence.
	 *
	 * @return the user persistence
	 */
	public UserPersistence getUserPersistence() {
		return userPersistence;
	}

	/**
	 * Sets the user persistence.
	 *
	 * @param userPersistence the user persistence
	 */
	public void setUserPersistence(UserPersistence userPersistence) {
		this.userPersistence = userPersistence;
	}

	public void afterPropertiesSet() {
		_setServiceUtilService(entryService);
	}

	public void destroy() {
		_setServiceUtilService(null);
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return EntryService.class.getName();
	}

	protected Class<?> getModelClass() {
		return Entry.class;
	}

	protected String getModelClassName() {
		return Entry.class.getName();
	}

	/**
	 * Performs a SQL query.
	 *
	 * @param sql the sql query
	 */
	protected void runSQL(String sql) {
		try {
			DataSource dataSource = entryPersistence.getDataSource();

			DB db = DBManagerUtil.getDB();

			sql = db.buildSQL(sql);
			sql = PortalUtil.transformSQL(sql);

			SqlUpdate sqlUpdate = SqlUpdateFactoryUtil.getSqlUpdate(
				dataSource, sql);

			sqlUpdate.update();
		}
		catch (Exception exception) {
			throw new SystemException(exception);
		}
	}

	private void _setServiceUtilService(EntryService entryService) {
		try {
			Field field = EntryServiceUtil.class.getDeclaredField("_service");

			field.setAccessible(true);

			field.set(null, entryService);
		}
		catch (ReflectiveOperationException reflectiveOperationException) {
			throw new RuntimeException(reflectiveOperationException);
		}
	}

	@BeanReference(type = com.docs.guidebook.service.EntryLocalService.class)
	protected com.docs.guidebook.service.EntryLocalService entryLocalService;

	@BeanReference(type = EntryService.class)
	protected EntryService entryService;

	@BeanReference(type = EntryPersistence.class)
	protected EntryPersistence entryPersistence;

	@BeanReference(
		type = com.docs.guidebook.service.GuidebookLocalService.class
	)
	protected com.docs.guidebook.service.GuidebookLocalService
		guidebookLocalService;

	@BeanReference(type = com.docs.guidebook.service.GuidebookService.class)
	protected com.docs.guidebook.service.GuidebookService guidebookService;

	@BeanReference(type = GuidebookPersistence.class)
	protected GuidebookPersistence guidebookPersistence;

	@ServiceReference(
		type = com.liferay.counter.kernel.service.CounterLocalService.class
	)
	protected com.liferay.counter.kernel.service.CounterLocalService
		counterLocalService;

	@ServiceReference(
		type = com.liferay.portal.kernel.service.ClassNameLocalService.class
	)
	protected com.liferay.portal.kernel.service.ClassNameLocalService
		classNameLocalService;

	@ServiceReference(
		type = com.liferay.portal.kernel.service.ClassNameService.class
	)
	protected com.liferay.portal.kernel.service.ClassNameService
		classNameService;

	@ServiceReference(type = ClassNamePersistence.class)
	protected ClassNamePersistence classNamePersistence;

	@ServiceReference(
		type = com.liferay.portal.kernel.service.ResourceLocalService.class
	)
	protected com.liferay.portal.kernel.service.ResourceLocalService
		resourceLocalService;

	@ServiceReference(
		type = com.liferay.portal.kernel.service.UserLocalService.class
	)
	protected com.liferay.portal.kernel.service.UserLocalService
		userLocalService;

	@ServiceReference(
		type = com.liferay.portal.kernel.service.UserService.class
	)
	protected com.liferay.portal.kernel.service.UserService userService;

	@ServiceReference(type = UserPersistence.class)
	protected UserPersistence userPersistence;

	private static final Log _log = LogFactoryUtil.getLog(
		EntryServiceBaseImpl.class);

}