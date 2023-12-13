package com.mulesoft.connectors.orchestrateconvertapi.internal.metadata;

import com.mulesoft.connectivity.rest.commons.api.datasense.metadata.output.StringOutputMetadataResolver;
import com.mulesoft.connectors.orchestrateconvertapi.internal.extension.OrchestrateConvertApi;

public class PostFhirr4toCdaOutputMetadataResolver extends StringOutputMetadataResolver {
  @Override
  public String getResolverName() {
    return "post-fhirr4to-cda-output-type-resolver";
  }

  @Override
  public String getCategoryName() {
    return OrchestrateConvertApi.API_METADATA_CATEGORY;
  }
}
