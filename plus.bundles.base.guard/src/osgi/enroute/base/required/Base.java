package osgi.enroute.base.required;


import org.osgi.dto.DTO;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;
import org.osgi.service.metatype.annotations.Designate;
import org.osgi.service.metatype.annotations.ObjectClassDefinition;

import osgi.enroute.authentication.api.RequireAuthenticationImplementation;
import osgi.enroute.authorization.api.RequireAuthorizationImplementation;
import osgi.enroute.configurer.api.RequireConfigurerExtender;
import osgi.enroute.dto.api.RequireDTOsImplementation;
import osgi.enroute.http.capabilities.RequireHttpImplementation;
import osgi.enroute.rest.api.RequireRestImplementation;
import osgi.enroute.webserver.capabilities.RequireWebServerExtender;

/**
 * The purpose of this class is to require all the parts that are part of
 * bundles.plus base in their right version. This bundle can be deployed in a
 * bundle.plus distribution to verify that the profile is completely present.
 */
@RequireAuthenticationImplementation
@RequireAuthorizationImplementation
@RequireConfigurerExtender
@RequireDTOsImplementation
@RequireHttpImplementation
@RequireRestImplementation
@RequireWebServerExtender
@Designate(ocd = Base.Config.class)
@Component(property = "enroute.profile=base")
public class Base //
		extends javax.servlet.http.HttpServlet // drag in http server
		implements osgi.enroute.rest.api.REST // REST server
{

	@ObjectClassDefinition
	@interface Config {}

	private static final long	serialVersionUID	= 1L;
	DTO							dto;

	@Reference
	void setConfigurationAdmin(org.osgi.service.cm.ConfigurationAdmin v) {}

	@Reference
	void setCoordinator(org.osgi.service.coordinator.Coordinator v) {}

	@Reference
	void setEventAdmin(org.osgi.service.event.EventAdmin v) {}

	@Reference
	void setLogService(org.osgi.service.log.LogService v) {}

	@Reference
	void setMetatypeService(org.osgi.service.metatype.MetaTypeService v) {}

	@Reference
	void setUserAdmin(org.osgi.service.useradmin.UserAdmin v) {}

	@Reference
	void setLauncher(osgi.enroute.launch.api.Launcher v) {}

	@Reference
	void setLogger(org.slf4j.Logger v) {}

	@Reference
	void setAuthenticator(osgi.enroute.authentication.api.Authenticator v) {}

	@Reference
	void setAuthority(osgi.enroute.authorization.api.Authority v) {}

	@Reference
	void setConfigurationDone(osgi.enroute.configurer.api.ConfigurationDone v) {}

	@Reference
	void setDTO(osgi.enroute.dto.api.DTOs v) {}

	@Reference
	void setExecutor(java.util.concurrent.Executor v) {}

	@Reference
	void setHttp(org.osgi.service.http.HttpService v) {}

	@Reference
	void setRSA(org.osgi.service.remoteserviceadmin.RemoteServiceAdmin v) {}
}
