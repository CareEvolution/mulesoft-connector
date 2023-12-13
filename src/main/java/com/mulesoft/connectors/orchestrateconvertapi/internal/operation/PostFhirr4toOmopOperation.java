package com.mulesoft.connectors.orchestrateconvertapi.internal.operation;

import static com.mulesoft.connectivity.rest.commons.internal.RestConstants.CONNECTOR_OVERRIDES;
import static com.mulesoft.connectivity.rest.commons.internal.RestConstants.REQUEST_PARAMETERS_GROUP_NAME;

import com.mulesoft.connectivity.rest.commons.api.configuration.RestConfiguration;
import com.mulesoft.connectivity.rest.commons.api.connection.RestConnection;
import com.mulesoft.connectivity.rest.commons.api.error.RequestErrorTypeProvider;
import com.mulesoft.connectivity.rest.commons.api.operation.ConfigurationOverrides;
import com.mulesoft.connectivity.rest.commons.api.operation.RequestParameters;
import com.mulesoft.connectors.orchestrateconvertapi.internal.metadata.HttpResponseAttributesMetadataResolver;
import com.mulesoft.connectors.orchestrateconvertapi.internal.metadata.PostFhirr4toOmopInputMetadataResolver;
import com.mulesoft.connectors.orchestrateconvertapi.internal.metadata.PostFhirr4toOmopOutputMetadataResolver;
import com.mulesoft.connectors.orchestrateconvertapi.internal.operation.refinement.PostFhirr4toOmopOperationRefinement;
import java.io.InputStream;
import org.mule.runtime.api.el.ExpressionLanguage;
import org.mule.runtime.api.metadata.TypedValue;
import org.mule.runtime.extension.api.annotation.error.Throws;
import org.mule.runtime.extension.api.annotation.metadata.OutputResolver;
import org.mule.runtime.extension.api.annotation.metadata.TypeResolver;
import org.mule.runtime.extension.api.annotation.param.Config;
import org.mule.runtime.extension.api.annotation.param.Connection;
import org.mule.runtime.extension.api.annotation.param.Content;
import org.mule.runtime.extension.api.annotation.param.MediaType;
import org.mule.runtime.extension.api.annotation.param.Optional;
import org.mule.runtime.extension.api.annotation.param.ParameterGroup;
import org.mule.runtime.extension.api.annotation.param.display.DisplayName;
import org.mule.runtime.extension.api.annotation.param.display.Summary;
import org.mule.runtime.extension.api.runtime.process.CompletionCallback;

/** Lower part of the Operation. It has the operation declaration with its annotations. */
public class PostFhirr4toOmopOperation extends PostFhirr4toOmopOperationRefinement {
  public PostFhirr4toOmopOperation() {
    super();
  }

  public PostFhirr4toOmopOperation(ExpressionLanguage arg0) {
    super(arg0);
  }

  /**
   * This operation converts a FHIR R4 bundle (including one from CDA-to-FHIR, HL7-to-FHIR, or
   * Combine Bundles) into the Observational Medical Outcomes Partnership (OMOP) Common Data Model
   * format.
   *
   * <p>This operation makes an HTTP POST request to the /FHIRR4ToOMOP endpoint
   *
   * @param config the configuration to use
   * @param connection the connection to use
   * @param includePiiTablesQueryParam Include Pii Tables
   * @param postFhirr4toOmopBody the content to use
   * @param parameters the {@link RequestParameters}
   * @param overrides the {@link ConfigurationOverrides}
   * @param callback the operation's {@link CompletionCallback}
   */
  @Throws(RequestErrorTypeProvider.class)
  @DisplayName("Convert FHIR R4 to OMOP")
  @Summary(
      "This operation converts a FHIR R4 bundle (including one from CDA-to-FHIR, HL7-to-FHIR, or Combine Bundles) into the Observational Medical Outcomes Partnership (OMOP) Common Data Model format.")
  @MediaType("application/zip")
  @OutputResolver(
      output = PostFhirr4toOmopOutputMetadataResolver.class,
      attributes = HttpResponseAttributesMetadataResolver.class)
  public void postFhirr4toOmop(
      @Config RestConfiguration config,
      @Connection RestConnection connection,
      @Optional @DisplayName("Include Pii Tables") boolean includePiiTablesQueryParam,
      @Content(primary = true)
          @DisplayName("Body")
          @TypeResolver(PostFhirr4toOmopInputMetadataResolver.class)
          TypedValue<InputStream> postFhirr4toOmopBody,
      @ParameterGroup(name = REQUEST_PARAMETERS_GROUP_NAME) RequestParameters parameters,
      @ParameterGroup(name = CONNECTOR_OVERRIDES) ConfigurationOverrides overrides,
      CompletionCallback<InputStream, Object> callback) {
    super.postFhirr4toOmop(
        config,
        connection,
        includePiiTablesQueryParam,
        postFhirr4toOmopBody,
        parameters,
        overrides,
        callback);
  }
}
