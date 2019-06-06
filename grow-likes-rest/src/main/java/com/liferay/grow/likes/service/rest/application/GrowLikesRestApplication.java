package com.liferay.grow.likes.service.rest.application;

import javax.ws.rs.core.Application;

import org.osgi.service.component.annotations.Component;

/**
 * @author Liferay
 */
@Component(
	property = {
			"auth.verifier.auth.verifier.BasicAuthHeaderAuthVerifier.urls.includes=/*",
			"auth.verifier.auth.verifier.PortalSessionAuthVerifier.urls.includes=/*",
			"osgi.jaxrs.application.base=/grow-likes",
			"osgi.jaxrs.extension.select=(osgi.jaxrs.name=jaxb-json)",
			"osgi.jaxrs.extension.select=(osgi.jaxrs.name=Liferay.Vulcan)",
			"osgi.jaxrs.name=Grow.Likes.REST"
	},
	service = Application.class
)
public class GrowLikesRestApplication extends Application {
}