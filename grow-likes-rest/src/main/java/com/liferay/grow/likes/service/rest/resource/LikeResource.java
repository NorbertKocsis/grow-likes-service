package com.liferay.grow.likes.service.rest.resource;

import com.liferay.grow.likes.model.AssetLike;
import com.liferay.grow.likes.service.AssetLikeLocalService;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.util.Validator;

import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Response;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;
import org.osgi.service.component.annotations.ServiceScope;

@Component(
		property = {
			"osgi.jaxrs.application.select=(osgi.jaxrs.name=Grow.Likes.REST)",
			"osgi.jaxrs.resource=true"
		},
		scope = ServiceScope.PROTOTYPE, service = LikeResource.class
	)
	@Path("/")
public class LikeResource {

	@Path("/addAssetLike")
	@POST
	public Response addAssetLike(
		@QueryParam("assetEntryId") long assetEntryId,
		@QueryParam("rank") long rank,
		@QueryParam("userId") long userId) {

		if (Validator.isNotNull(userId) && Validator.isNotNull(assetEntryId) &&
			Validator.isNotNull(rank)) {

			AssetLike assetlike = _assetLikeLocalService.addAssetLike(
				userId, assetEntryId, rank);

			return _ok();
		}

		return _badRequest();
	}

	@Path("/deleteAssetLike")
	@POST
	public Response deleteAssetLike(
		@QueryParam("assetEntryId") long assetEntryId,
		@QueryParam("userId") long userId) {

		if (Validator.isNotNull(userId) && Validator.isNotNull(assetEntryId)) {
			try {
				_assetLikeLocalService.deleteAssetLike(userId, assetEntryId);

				return _ok();
			}
			catch (PortalException pe) {
				//Log
			}
		}

		return _badRequest();
	}

	private Response _badRequest() {
		Response.ResponseBuilder responseBuilder = Response.status(400);

		return responseBuilder.build();
	}

	private Response _ok() {
		Response.ResponseBuilder responseBuilder = Response.ok();

		return responseBuilder.build();
	}

	@Reference
	private AssetLikeLocalService _assetLikeLocalService;

}