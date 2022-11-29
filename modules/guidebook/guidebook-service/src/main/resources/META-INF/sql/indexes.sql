create index IX_F5591FB6 on GB_Entry (groupId, guestbookId);
create index IX_B5EF5128 on GB_Entry (uuid_[$COLUMN_LENGTH:75$], companyId);
create unique index IX_C1EA01AA on GB_Entry (uuid_[$COLUMN_LENGTH:75$], groupId);

create index IX_B35C33A3 on GB_Guidebook (groupId);
create index IX_9DC88B1B on GB_Guidebook (uuid_[$COLUMN_LENGTH:75$], companyId);
create unique index IX_29F1C5D on GB_Guidebook (uuid_[$COLUMN_LENGTH:75$], groupId);