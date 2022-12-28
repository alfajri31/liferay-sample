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

package com.docs.guidebook.model;

import com.liferay.expando.kernel.model.ExpandoBridge;
import com.liferay.exportimport.kernel.lar.StagedModelType;
import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.service.ServiceContext;

import java.io.Serializable;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * <p>
 * This class is a wrapper for {@link Guidebook}.
 * </p>
 *
 * @author liferay
 * @see Guidebook
 * @generated
 */
public class GuidebookWrapper implements Guidebook, ModelWrapper<Guidebook> {

	public GuidebookWrapper(Guidebook guidebook) {
		_guidebook = guidebook;
	}

	@Override
	public Class<?> getModelClass() {
		return Guidebook.class;
	}

	@Override
	public String getModelClassName() {
		return Guidebook.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("guidebookId", getGuidebookId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("name", getName());
		attributes.put("status", getStatus());
		attributes.put("statusByUserId", getStatusByUserId());
		attributes.put("statusByUserName", getStatusByUserName());
		attributes.put("statusDate", getStatusDate());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long guidebookId = (Long)attributes.get("guidebookId");

		if (guidebookId != null) {
			setGuidebookId(guidebookId);
		}

		Long groupId = (Long)attributes.get("groupId");

		if (groupId != null) {
			setGroupId(groupId);
		}

		Long companyId = (Long)attributes.get("companyId");

		if (companyId != null) {
			setCompanyId(companyId);
		}

		Long userId = (Long)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
		}

		String userName = (String)attributes.get("userName");

		if (userName != null) {
			setUserName(userName);
		}

		Date createDate = (Date)attributes.get("createDate");

		if (createDate != null) {
			setCreateDate(createDate);
		}

		Date modifiedDate = (Date)attributes.get("modifiedDate");

		if (modifiedDate != null) {
			setModifiedDate(modifiedDate);
		}

		String name = (String)attributes.get("name");

		if (name != null) {
			setName(name);
		}

		Integer status = (Integer)attributes.get("status");

		if (status != null) {
			setStatus(status);
		}

		Long statusByUserId = (Long)attributes.get("statusByUserId");

		if (statusByUserId != null) {
			setStatusByUserId(statusByUserId);
		}

		String statusByUserName = (String)attributes.get("statusByUserName");

		if (statusByUserName != null) {
			setStatusByUserName(statusByUserName);
		}

		Date statusDate = (Date)attributes.get("statusDate");

		if (statusDate != null) {
			setStatusDate(statusDate);
		}
	}

	@Override
	public Object clone() {
		return new GuidebookWrapper((Guidebook)_guidebook.clone());
	}

	@Override
	public int compareTo(Guidebook guidebook) {
		return _guidebook.compareTo(guidebook);
	}

	/**
	 * Returns the company ID of this guidebook.
	 *
	 * @return the company ID of this guidebook
	 */
	@Override
	public long getCompanyId() {
		return _guidebook.getCompanyId();
	}

	/**
	 * Returns the create date of this guidebook.
	 *
	 * @return the create date of this guidebook
	 */
	@Override
	public Date getCreateDate() {
		return _guidebook.getCreateDate();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _guidebook.getExpandoBridge();
	}

	/**
	 * Returns the group ID of this guidebook.
	 *
	 * @return the group ID of this guidebook
	 */
	@Override
	public long getGroupId() {
		return _guidebook.getGroupId();
	}

	/**
	 * Returns the guidebook ID of this guidebook.
	 *
	 * @return the guidebook ID of this guidebook
	 */
	@Override
	public long getGuidebookId() {
		return _guidebook.getGuidebookId();
	}

	/**
	 * Returns the modified date of this guidebook.
	 *
	 * @return the modified date of this guidebook
	 */
	@Override
	public Date getModifiedDate() {
		return _guidebook.getModifiedDate();
	}

	/**
	 * Returns the name of this guidebook.
	 *
	 * @return the name of this guidebook
	 */
	@Override
	public String getName() {
		return _guidebook.getName();
	}

	/**
	 * Returns the primary key of this guidebook.
	 *
	 * @return the primary key of this guidebook
	 */
	@Override
	public long getPrimaryKey() {
		return _guidebook.getPrimaryKey();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _guidebook.getPrimaryKeyObj();
	}

	/**
	 * Returns the status of this guidebook.
	 *
	 * @return the status of this guidebook
	 */
	@Override
	public int getStatus() {
		return _guidebook.getStatus();
	}

	/**
	 * Returns the status by user ID of this guidebook.
	 *
	 * @return the status by user ID of this guidebook
	 */
	@Override
	public long getStatusByUserId() {
		return _guidebook.getStatusByUserId();
	}

	/**
	 * Returns the status by user name of this guidebook.
	 *
	 * @return the status by user name of this guidebook
	 */
	@Override
	public String getStatusByUserName() {
		return _guidebook.getStatusByUserName();
	}

	/**
	 * Returns the status by user uuid of this guidebook.
	 *
	 * @return the status by user uuid of this guidebook
	 */
	@Override
	public String getStatusByUserUuid() {
		return _guidebook.getStatusByUserUuid();
	}

	/**
	 * Returns the status date of this guidebook.
	 *
	 * @return the status date of this guidebook
	 */
	@Override
	public Date getStatusDate() {
		return _guidebook.getStatusDate();
	}

	/**
	 * Returns the user ID of this guidebook.
	 *
	 * @return the user ID of this guidebook
	 */
	@Override
	public long getUserId() {
		return _guidebook.getUserId();
	}

	/**
	 * Returns the user name of this guidebook.
	 *
	 * @return the user name of this guidebook
	 */
	@Override
	public String getUserName() {
		return _guidebook.getUserName();
	}

	/**
	 * Returns the user uuid of this guidebook.
	 *
	 * @return the user uuid of this guidebook
	 */
	@Override
	public String getUserUuid() {
		return _guidebook.getUserUuid();
	}

	/**
	 * Returns the uuid of this guidebook.
	 *
	 * @return the uuid of this guidebook
	 */
	@Override
	public String getUuid() {
		return _guidebook.getUuid();
	}

	@Override
	public int hashCode() {
		return _guidebook.hashCode();
	}

	/**
	 * Returns <code>true</code> if this guidebook is approved.
	 *
	 * @return <code>true</code> if this guidebook is approved; <code>false</code> otherwise
	 */
	@Override
	public boolean isApproved() {
		return _guidebook.isApproved();
	}

	@Override
	public boolean isCachedModel() {
		return _guidebook.isCachedModel();
	}

	/**
	 * Returns <code>true</code> if this guidebook is denied.
	 *
	 * @return <code>true</code> if this guidebook is denied; <code>false</code> otherwise
	 */
	@Override
	public boolean isDenied() {
		return _guidebook.isDenied();
	}

	/**
	 * Returns <code>true</code> if this guidebook is a draft.
	 *
	 * @return <code>true</code> if this guidebook is a draft; <code>false</code> otherwise
	 */
	@Override
	public boolean isDraft() {
		return _guidebook.isDraft();
	}

	@Override
	public boolean isEscapedModel() {
		return _guidebook.isEscapedModel();
	}

	/**
	 * Returns <code>true</code> if this guidebook is expired.
	 *
	 * @return <code>true</code> if this guidebook is expired; <code>false</code> otherwise
	 */
	@Override
	public boolean isExpired() {
		return _guidebook.isExpired();
	}

	/**
	 * Returns <code>true</code> if this guidebook is inactive.
	 *
	 * @return <code>true</code> if this guidebook is inactive; <code>false</code> otherwise
	 */
	@Override
	public boolean isInactive() {
		return _guidebook.isInactive();
	}

	/**
	 * Returns <code>true</code> if this guidebook is incomplete.
	 *
	 * @return <code>true</code> if this guidebook is incomplete; <code>false</code> otherwise
	 */
	@Override
	public boolean isIncomplete() {
		return _guidebook.isIncomplete();
	}

	@Override
	public boolean isNew() {
		return _guidebook.isNew();
	}

	/**
	 * Returns <code>true</code> if this guidebook is pending.
	 *
	 * @return <code>true</code> if this guidebook is pending; <code>false</code> otherwise
	 */
	@Override
	public boolean isPending() {
		return _guidebook.isPending();
	}

	/**
	 * Returns <code>true</code> if this guidebook is scheduled.
	 *
	 * @return <code>true</code> if this guidebook is scheduled; <code>false</code> otherwise
	 */
	@Override
	public boolean isScheduled() {
		return _guidebook.isScheduled();
	}

	@Override
	public void persist() {
		_guidebook.persist();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_guidebook.setCachedModel(cachedModel);
	}

	/**
	 * Sets the company ID of this guidebook.
	 *
	 * @param companyId the company ID of this guidebook
	 */
	@Override
	public void setCompanyId(long companyId) {
		_guidebook.setCompanyId(companyId);
	}

	/**
	 * Sets the create date of this guidebook.
	 *
	 * @param createDate the create date of this guidebook
	 */
	@Override
	public void setCreateDate(Date createDate) {
		_guidebook.setCreateDate(createDate);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {

		_guidebook.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_guidebook.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_guidebook.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	 * Sets the group ID of this guidebook.
	 *
	 * @param groupId the group ID of this guidebook
	 */
	@Override
	public void setGroupId(long groupId) {
		_guidebook.setGroupId(groupId);
	}

	/**
	 * Sets the guidebook ID of this guidebook.
	 *
	 * @param guidebookId the guidebook ID of this guidebook
	 */
	@Override
	public void setGuidebookId(long guidebookId) {
		_guidebook.setGuidebookId(guidebookId);
	}

	/**
	 * Sets the modified date of this guidebook.
	 *
	 * @param modifiedDate the modified date of this guidebook
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		_guidebook.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the name of this guidebook.
	 *
	 * @param name the name of this guidebook
	 */
	@Override
	public void setName(String name) {
		_guidebook.setName(name);
	}

	@Override
	public void setNew(boolean n) {
		_guidebook.setNew(n);
	}

	/**
	 * Sets the primary key of this guidebook.
	 *
	 * @param primaryKey the primary key of this guidebook
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		_guidebook.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_guidebook.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	 * Sets the status of this guidebook.
	 *
	 * @param status the status of this guidebook
	 */
	@Override
	public void setStatus(int status) {
		_guidebook.setStatus(status);
	}

	/**
	 * Sets the status by user ID of this guidebook.
	 *
	 * @param statusByUserId the status by user ID of this guidebook
	 */
	@Override
	public void setStatusByUserId(long statusByUserId) {
		_guidebook.setStatusByUserId(statusByUserId);
	}

	/**
	 * Sets the status by user name of this guidebook.
	 *
	 * @param statusByUserName the status by user name of this guidebook
	 */
	@Override
	public void setStatusByUserName(String statusByUserName) {
		_guidebook.setStatusByUserName(statusByUserName);
	}

	/**
	 * Sets the status by user uuid of this guidebook.
	 *
	 * @param statusByUserUuid the status by user uuid of this guidebook
	 */
	@Override
	public void setStatusByUserUuid(String statusByUserUuid) {
		_guidebook.setStatusByUserUuid(statusByUserUuid);
	}

	/**
	 * Sets the status date of this guidebook.
	 *
	 * @param statusDate the status date of this guidebook
	 */
	@Override
	public void setStatusDate(Date statusDate) {
		_guidebook.setStatusDate(statusDate);
	}

	/**
	 * Sets the user ID of this guidebook.
	 *
	 * @param userId the user ID of this guidebook
	 */
	@Override
	public void setUserId(long userId) {
		_guidebook.setUserId(userId);
	}

	/**
	 * Sets the user name of this guidebook.
	 *
	 * @param userName the user name of this guidebook
	 */
	@Override
	public void setUserName(String userName) {
		_guidebook.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this guidebook.
	 *
	 * @param userUuid the user uuid of this guidebook
	 */
	@Override
	public void setUserUuid(String userUuid) {
		_guidebook.setUserUuid(userUuid);
	}

	/**
	 * Sets the uuid of this guidebook.
	 *
	 * @param uuid the uuid of this guidebook
	 */
	@Override
	public void setUuid(String uuid) {
		_guidebook.setUuid(uuid);
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<Guidebook>
		toCacheModel() {

		return _guidebook.toCacheModel();
	}

	@Override
	public Guidebook toEscapedModel() {
		return new GuidebookWrapper(_guidebook.toEscapedModel());
	}

	@Override
	public String toString() {
		return _guidebook.toString();
	}

	@Override
	public Guidebook toUnescapedModel() {
		return new GuidebookWrapper(_guidebook.toUnescapedModel());
	}

	@Override
	public String toXmlString() {
		return _guidebook.toXmlString();
	}

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof GuidebookWrapper)) {
			return false;
		}

		GuidebookWrapper guidebookWrapper = (GuidebookWrapper)object;

		if (Objects.equals(_guidebook, guidebookWrapper._guidebook)) {
			return true;
		}

		return false;
	}

	@Override
	public StagedModelType getStagedModelType() {
		return _guidebook.getStagedModelType();
	}

	@Override
	public Guidebook getWrappedModel() {
		return _guidebook;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _guidebook.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _guidebook.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_guidebook.resetOriginalValues();
	}

	private final Guidebook _guidebook;

}