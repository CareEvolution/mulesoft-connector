package com.mulesoft.connectors.orchestrateconvertapi.internal.metadata;

import com.mulesoft.connectivity.rest.commons.api.datasense.metadata.input.FromJsonInputMetadataResolver;
import com.mulesoft.connectors.orchestrateconvertapi.internal.extension.OrchestrateConvertApi;
import org.mule.metadata.api.model.MetadataFormat;

public class PostX12toFhirr4InputMetadataResolver extends FromJsonInputMetadataResolver {
  @Override
  public String getSchemaPath() {
    return "/rest_sdk_generated_schemas/post-combine-fhirr4bundles-input-schema.json";
  }

  @Override
  public String getResolverName() {
    return "post-x12to-fhirr4-input-type-resolver";
  }

  @Override
  public String getCategoryName() {
    return OrchestrateConvertApi.API_METADATA_CATEGORY;
  }

  @Override
  public MetadataFormat getFormat() {
    return new MetadataFormat("text/plain", "text/plain", "text/plain");
  }
}
