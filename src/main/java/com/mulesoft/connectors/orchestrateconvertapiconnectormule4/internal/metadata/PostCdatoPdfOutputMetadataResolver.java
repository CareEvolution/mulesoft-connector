package com.mulesoft.connectors.orchestrateconvertapiconnectormule4.internal.metadata;

import com.mulesoft.connectivity.rest.commons.api.datasense.metadata.output.IntegerOutputMetadataResolver;
import com.mulesoft.connectors.orchestrateconvertapiconnectormule4.internal.extension.OrchestrateConvertApiConnectorMule4;

public class PostCdatoPdfOutputMetadataResolver extends IntegerOutputMetadataResolver {
  @Override
  public String getResolverName() {
    return "post-cdato-pdf-output-type-resolver";
  }

  @Override
  public String getCategoryName() {
    return OrchestrateConvertApiConnectorMule4.API_METADATA_CATEGORY;
  }
}
