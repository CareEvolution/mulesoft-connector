package com.mulesoft.connectors.orchestrateconvertapiconnectormule4.internal.metadata;

import com.mulesoft.connectivity.rest.commons.api.datasense.metadata.output.FromJsonOutputMetadataResolver;
import com.mulesoft.connectors.orchestrateconvertapiconnectormule4.internal.extension.OrchestrateConvertApiConnectorMule4;
import org.mule.metadata.api.model.MetadataFormat;

public class PostHl7toFhirr4OutputMetadataResolver extends FromJsonOutputMetadataResolver {
  @Override
  public String getSchemaPath() {
    return "/rest_sdk_generated_schemas/post-combine-fhirr4bundles-output-schema.json";
  }

  @Override
  public String getResolverName() {
    return "post-hl7to-fhirr4-output-type-resolver";
  }

  @Override
  public String getCategoryName() {
    return OrchestrateConvertApiConnectorMule4.API_METADATA_CATEGORY;
  }

  @Override
  public MetadataFormat getFormat() {
    return new MetadataFormat(
        "application/fhir+json", "application/fhir+json", "application/fhir+json");
  }
}
