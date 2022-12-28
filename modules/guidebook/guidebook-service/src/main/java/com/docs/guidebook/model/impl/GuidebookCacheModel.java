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

package com.docs.guidebook.model.impl;

import com.docs.guidebook.model.Guidebook;

import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.util.HashUtil;
import com.liferay.portal.kernel.util.StringBundler;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing Guidebook in entity cache.
 *
 * @author liferay
 * @generated
 */
public class GuidebookCacheModel
	implements CacheModel<Guidebook>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof GuidebookCacheModel)) {
			return false;
		}

		GuidebookCacheModel guidebookCacheModel = (GuidebookCacheModel)object;

		if (guidebookId == guidebookCacheModel.guidebookId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, guidebookId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(27);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", guidebookId=");
		sb.append(guidebookId);
		sb.append(", groupId=");
		sb.append(groupId);
		sb.append(", companyId=");
		sb.append(companyId);
		sb.append(", userId=");
		sb.append(userId);
		sb.append(", userName=");
		sb.append(userName);
		sb.append(", createDate=");
		sb.append(createDate);
		sb.append(", modifiedDate=");
		sb.append(modifiedDate);
		sb.append(", name=");
		sb.append(name);
		sb.append(", status=");
		sb.append(status);
		sb.append(", statusByUserId=");
		sb.append(statusByUserId);
		sb.append(", statusByUserName=");
		sb.append(statusByUserName);
		sb.append(", statusDate=");
		sb.append(statusDate);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public Guidebook toEntityModel() {
		GuidebookImpl guidebookImpl = new GuidebookImpl();

		if (uuid == null) {
			guidebookImpl.setUuid("");
		}
		else {
			guidebookImpl.setUuid(uuid);
		}

		guidebookImpl.setGuidebookId(guidebookId);
		guidebookImpl.setGroupId(groupId);
		guidebookImpl.setCompanyId(companyId);
		guidebookImpl.setUserId(userId);

		if (userName == null) {
			guidebookImpl.setUserName("");
		}
		else {
			guidebookImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			guidebookImpl.setCreateDate(null);
		}
		else {
			guidebookImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			guidebookImpl.setModifiedDate(null);
		}
		else {
			guidebookImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (name == null) {
			guidebookImpl.setName("");
		}
		else {
			guidebookImpl.setName(name);
		}

		guidebookImpl.setStatus(status);
		guidebookImpl.setStatusByUserId(statusByUserId);

		if (statusByUserName == null) {
			guidebookImpl.setStatusByUserName("");
		}
		else {
			guidebookImpl.setStatusByUserName(statusByUserName);
		}

		if (statusDate == Long.MIN_VALUE) {
			guidebookImpl.setStatusDate(null);
		}
		else {
			guidebookImpl.setStatusDate(new Date(statusDate));
		}

		guidebookImpl.resetOriginalValues();

		return guidebookImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		guidebookId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		name = objectInput.readUTF();

		status = objectInput.readInt();

		statusByUserId = objectInput.readLong();
		statusByUserName = objectInput.readUTF();
		statusDate = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		if (uuid == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(uuid);
		}

		objectOutput.writeLong(guidebookId);

		objectOutput.writeLong(groupId);

		objectOutput.writeLong(companyId);

		objectOutput.writeLong(userId);

		if (userName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(userName);
		}

		objectOutput.writeLong(createDate);
		objectOutput.writeLong(modifiedDate);

		if (name == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(name);
		}

		objectOutput.writeInt(status);

		objectOutput.writeLong(statusByUserId);

		if (statusByUserName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(statusByUserName);
		}

		objectOutput.writeLong(statusDate);
	}

	public String uuid;
	public long guidebookId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String name;
	public int status;
	public long statusByUserId;
	public String statusByUserName;
	public long statusDate;

}