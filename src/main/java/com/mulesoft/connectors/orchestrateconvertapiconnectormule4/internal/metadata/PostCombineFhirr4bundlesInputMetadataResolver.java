package com.mulesoft.connectors.orchestrateconvertapiconnectormule4.internal.metadata;

import com.mulesoft.connectivity.rest.commons.api.datasense.metadata.input.FromJsonInputMetadataResolver;
import com.mulesoft.connectors.orchestrateconvertapiconnectormule4.internal.extension.OrchestrateConvertApiConnectorMule4;
import org.mule.metadata.api.model.MetadataFormat;

public class PostCombineFhirr4bundlesInputMetadataResolver extends FromJsonInputMetadataResolver {
  @Override
  public String getSchemaPath() {
    return "/rest_sdk_generated_schemas/post-combine-fhirr4bundles-input-schema.json";
  }

  @Override
  public String getResolverName() {
    return "post-combine-fhirr4bundles-input-type-resolver";
  }

  @Override
  public String getCategoryName() {
    return OrchestrateConvertApiConnectorMule4.API_METADATA_CATEGORY;
  }

  @Override
  public MetadataFormat getFormat() {
    return new MetadataFormat(
        "application/x-ndjson", "application/x-ndjson", "application/x-ndjson");
  }
}
