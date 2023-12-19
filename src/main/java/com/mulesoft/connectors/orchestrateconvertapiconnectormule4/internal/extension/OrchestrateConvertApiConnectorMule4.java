package com.mulesoft.connectors.orchestrateconvertapiconnectormule4.internal.extension;

import com.mulesoft.connectivity.rest.commons.api.error.RestError;
import com.mulesoft.connectors.orchestrateconvertapiconnectormule4.internal.config.OrchestrateConvertApiConnectorMule4Configuration;
import org.mule.runtime.api.meta.Category;
import org.mule.runtime.extension.api.annotation.Configurations;
import org.mule.runtime.extension.api.annotation.Extension;
import org.mule.runtime.extension.api.annotation.dsl.xml.Xml;
import org.mule.runtime.extension.api.annotation.error.ErrorTypes;
import org.mule.runtime.extension.api.annotation.license.RequiresEnterpriseLicense;

@Extension(name = "Orchestrate Convert API", category = Category.CERTIFIED)
@Xml(prefix = "orchestrate-convert-api-connector-mule-4")
@Configurations({OrchestrateConvertApiConnectorMule4Configuration.class})
@ErrorTypes(RestError.class)
@RequiresEnterpriseLicense(allowEvaluationLicense = true)
public class OrchestrateConvertApiConnectorMule4 {
  public static final String API_METADATA_CATEGORY = "Orchestrate Convert API Connector - Mule 4";
}
