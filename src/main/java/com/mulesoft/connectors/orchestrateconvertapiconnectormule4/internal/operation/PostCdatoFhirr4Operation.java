package com.mulesoft.connectors.orchestrateconvertapiconnectormule4.internal.operation;

import static com.mulesoft.connectivity.rest.commons.internal.RestConstants.CONNECTOR_OVERRIDES;
import static com.mulesoft.connectivity.rest.commons.internal.RestConstants.REQUEST_PARAMETERS_GROUP_NAME;

import com.mulesoft.connectivity.rest.commons.api.configuration.RestConfiguration;
import com.mulesoft.connectivity.rest.commons.api.connection.RestConnection;
import com.mulesoft.connectivity.rest.commons.api.error.RequestErrorTypeProvider;
import com.mulesoft.connectivity.rest.commons.api.operation.ConfigurationOverrides;
import com.mulesoft.connectivity.rest.commons.api.operation.RequestParameters;
import com.mulesoft.connectors.orchestrateconvertapiconnectormule4.internal.metadata.HttpResponseAttributesMetadataResolver;
import com.mulesoft.connectors.orchestrateconvertapiconnectormule4.internal.metadata.PostCdatoFhirr4InputMetadataResolver;
import com.mulesoft.connectors.orchestrateconvertapiconnectormule4.internal.metadata.PostCdatoFhirr4OutputMetadataResolver;
import com.mulesoft.connectors.orchestrateconvertapiconnectormule4.internal.operation.refinement.PostCdatoFhirr4OperationRefinement;
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
public class PostCdatoFhirr4Operation extends PostCdatoFhirr4OperationRefinement {
  public PostCdatoFhirr4Operation() {
    super();
  }

  public PostCdatoFhirr4Operation(ExpressionLanguage arg0) {
    super(arg0);
  }

  /**
   * This operation converts a CDA document into a FHIR R4 bundle.
   *
   * <p>This operation makes an HTTP POST request to the /CDAtoFHIRR4 endpoint
   *
   * @param config the configuration to use
   * @param connection the connection to use
   * @param includeCdaInTheOutputQueryParam Include Cda In The Output
   * @param notIncludeDocumentIdInDataSourceQueryParam Not Include Document Id In Data Source
   * @param postCdatoFhirr4Body the content to use
   * @param parameters the {@link RequestParameters}
   * @param overrides the {@link ConfigurationOverrides}
   * @param callback the operation's {@link CompletionCallback}
   */
  @Throws(RequestErrorTypeProvider.class)
  @DisplayName("Convert CDA to FHIR R4")
  @Summary("This operation converts a CDA document into a FHIR R4 bundle.")
  @MediaType("application/fhir+json")
  @OutputResolver(
      output = PostCdatoFhirr4OutputMetadataResolver.class,
      attributes = HttpResponseAttributesMetadataResolver.class)
  public void postCdatoFhirr4(
      @Config RestConfiguration config,
      @Connection RestConnection connection,
      @Optional(defaultValue = "false") @DisplayName("Include Cda In The Output")
          boolean includeCdaInTheOutputQueryParam,
      @Optional(defaultValue = "false") @DisplayName("Not Include Document Id In Data Source")
          boolean notIncludeDocumentIdInDataSourceQueryParam,
      @Content(primary = true)
          @DisplayName("Body")
          @TypeResolver(PostCdatoFhirr4InputMetadataResolver.class)
          TypedValue<InputStream> postCdatoFhirr4Body,
      @ParameterGroup(name = REQUEST_PARAMETERS_GROUP_NAME) RequestParameters parameters,
      @ParameterGroup(name = CONNECTOR_OVERRIDES) ConfigurationOverrides overrides,
      CompletionCallback<InputStream, Object> callback) {
    super.postCdatoFhirr4(
        config,
        connection,
        includeCdaInTheOutputQueryParam,
        notIncludeDocumentIdInDataSourceQueryParam,
        postCdatoFhirr4Body,
        parameters,
        overrides,
        callback);
  }
}
