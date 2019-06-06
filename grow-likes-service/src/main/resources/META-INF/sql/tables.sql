create table AssetLike (
	uuid_ VARCHAR(75) null,
	id_ LONG not null primary key,
	userId LONG,
	assetEntryId LONG,
	rank LONG,
	createDate DATE null
);