package com.mulesoft.connectors.orchestrateconvertapi.internal.extension;

import com.mulesoft.connectivity.rest.commons.api.error.RestError;
import com.mulesoft.connectors.orchestrateconvertapi.internal.config.OrchestrateConvertApiConfiguration;
import org.mule.runtime.extension.api.annotation.Configurations;
import org.mule.runtime.extension.api.annotation.Extension;
import org.mule.runtime.extension.api.annotation.dsl.xml.Xml;
import org.mule.runtime.extension.api.annotation.error.ErrorTypes;
import org.mule.runtime.extension.api.annotation.license.RequiresEnterpriseLicense;

@Extension(name = "Orchestrate Convert API")
@Xml(prefix = "orchestrate-convert-api")
@Configurations({OrchestrateConvertApiConfiguration.class})
@ErrorTypes(RestError.class)
@RequiresEnterpriseLicense(allowEvaluationLicense = true)
public class OrchestrateConvertApi {
  public static final String API_METADATA_CATEGORY = "Orchestrate Convert API";
}
