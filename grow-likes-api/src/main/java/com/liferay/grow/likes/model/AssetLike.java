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

package com.liferay.grow.likes.model;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.annotation.ImplementationClassName;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.util.Accessor;

/**
 * The extended model interface for the AssetLike service. Represents a row in the &quot;AssetLike&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see AssetLikeModel
 * @see com.liferay.grow.likes.model.impl.AssetLikeImpl
 * @see com.liferay.grow.likes.model.impl.AssetLikeModelImpl
 * @generated
 */
@ImplementationClassName("com.liferay.grow.likes.model.impl.AssetLikeImpl")
@ProviderType
public interface AssetLike extends AssetLikeModel, PersistedModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to {@link com.liferay.grow.likes.model.impl.AssetLikeImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<AssetLike, Long> ID_ACCESSOR = new Accessor<AssetLike, Long>() {
			@Override
			public Long get(AssetLike assetLike) {
				return assetLike.getId();
			}

			@Override
			public Class<Long> getAttributeClass() {
				return Long.class;
			}

			@Override
			public Class<AssetLike> getTypeClass() {
				return AssetLike.class;
			}
		};
}