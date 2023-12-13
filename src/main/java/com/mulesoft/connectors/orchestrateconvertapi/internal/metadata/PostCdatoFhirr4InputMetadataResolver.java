package com.mulesoft.connectors.orchestrateconvertapi.internal.metadata;

import com.mulesoft.connectivity.rest.commons.api.datasense.metadata.input.XmlInputMetadataResolver;
import com.mulesoft.connectors.orchestrateconvertapi.internal.extension.OrchestrateConvertApi;

public class PostCdatoFhirr4InputMetadataResolver extends XmlInputMetadataResolver {
  @Override
  public String getSchemaPath() {
    return "/rest_sdk_generated_schemas/post-cdato-fhirr4-input-schema.xsd";
  }

  @Override
  public String getResolverName() {
    return "post-cdato-fhirr4-input-type-resolver";
  }

  @Override
  public String getCategoryName() {
    return OrchestrateConvertApi.API_METADATA_CATEGORY;
  }

  @Override
  public String getQName() {
    return "{http://validationnamespace.raml.org}root";
  }
}
