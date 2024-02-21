package com.mulesoft.connectors.orchestrateconvertapiconnectormule4.internal.metadata;

import com.mulesoft.connectivity.rest.commons.api.datasense.metadata.output.FromJsonOutputMetadataResolver;
import com.mulesoft.connectors.orchestrateconvertapiconnectormule4.internal.extension.OrchestrateConvertApiConnectorMule4;
import org.mule.metadata.api.model.MetadataFormat;

public class PostFhirr4toOmopOutputMetadataResolver extends FromJsonOutputMetadataResolver {
  @Override
  public String getSchemaPath() {
    return "/rest_sdk_generated_schemas/post-fhirr4to-omop-output-schema.json";
  }

  @Override
  public String getResolverName() {
    return "post-fhirr4to-omop-output-type-resolver";
  }

  @Override
  public String getCategoryName() {
    return OrchestrateConvertApiConnectorMule4.API_METADATA_CATEGORY;
  }

  @Override
  public MetadataFormat getFormat() {
    return new MetadataFormat("application/zip", "application/zip", "application/zip");
  }
}
