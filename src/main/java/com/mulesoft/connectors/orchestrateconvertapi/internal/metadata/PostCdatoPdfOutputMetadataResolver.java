package com.mulesoft.connectors.orchestrateconvertapi.internal.metadata;

import com.mulesoft.connectivity.rest.commons.api.datasense.metadata.output.IntegerOutputMetadataResolver;
import com.mulesoft.connectors.orchestrateconvertapi.internal.extension.OrchestrateConvertApi;

public class PostCdatoPdfOutputMetadataResolver extends IntegerOutputMetadataResolver {
  @Override
  public String getResolverName() {
    return "post-cdato-pdf-output-type-resolver";
  }

  @Override
  public String getCategoryName() {
    return OrchestrateConvertApi.API_METADATA_CATEGORY;
  }
}
