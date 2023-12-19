package com.mulesoft.connectors.orchestrateconvertapiconnectormule4.internal.operation;

import static com.mulesoft.connectivity.rest.commons.internal.RestConstants.CONNECTOR_OVERRIDES;
import static com.mulesoft.connectivity.rest.commons.internal.RestConstants.REQUEST_PARAMETERS_GROUP_NAME;

import com.mulesoft.connectivity.rest.commons.api.configuration.RestConfiguration;
import com.mulesoft.connectivity.rest.commons.api.connection.RestConnection;
import com.mulesoft.connectivity.rest.commons.api.error.RequestErrorTypeProvider;
import com.mulesoft.connectivity.rest.commons.api.operation.ConfigurationOverrides;
import com.mulesoft.connectivity.rest.commons.api.operation.RequestParameters;
import com.mulesoft.connectors.orchestrateconvertapiconnectormule4.internal.metadata.HttpResponseAttributesMetadataResolver;
import com.mulesoft.connectors.orchestrateconvertapiconnectormule4.internal.metadata.PostFhirr4toCdaInputMetadataResolver;
import com.mulesoft.connectors.orchestrateconvertapiconnectormule4.internal.metadata.PostFhirr4toCdaOutputMetadataResolver;
import com.mulesoft.connectors.orchestrateconvertapiconnectormule4.internal.operation.refinement.PostFhirr4toCdaOperationRefinement;
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
import org.mule.runtime.extension.api.annotation.param.ParameterGroup;
import org.mule.runtime.extension.api.annotation.param.display.DisplayName;
import org.mule.runtime.extension.api.annotation.param.display.Summary;
import org.mule.runtime.extension.api.runtime.process.CompletionCallback;

/** Lower part of the Operation. It has the operation declaration with its annotations. */
public class PostFhirr4toCdaOperation extends PostFhirr4toCdaOperationRefinement {
  public PostFhirr4toCdaOperation() {
    super();
  }

  public PostFhirr4toCdaOperation(ExpressionLanguage arg0) {
    super(arg0);
  }

  /**
   * This operation converts a FHIR R4 bundle (including one from HL7-to-FHIR or Combine Bundles)
   * into an aggregated CDA document.
   *
   * <p>This operation makes an HTTP POST request to the /FHIRR4toCda endpoint
   *
   * @param config the configuration to use
   * @param connection the connection to use
   * @param postFhirr4toCdaBody the content to use
   * @param parameters the {@link RequestParameters}
   * @param overrides the {@link ConfigurationOverrides}
   * @param callback the operation's {@link CompletionCallback}
   */
  @Throws(RequestErrorTypeProvider.class)
  @DisplayName("Convert FHIR R4 to CDA")
  @Summary(
      "This operation converts a FHIR R4 bundle (including one from HL7-to-FHIR or Combine Bundles) into an aggregated CDA document.")
  @MediaType("application/xml")
  @OutputResolver(
      output = PostFhirr4toCdaOutputMetadataResolver.class,
      attributes = HttpResponseAttributesMetadataResolver.class)
  public void postFhirr4toCda(
      @Config RestConfiguration config,
      @Connection RestConnection connection,
      @Content(primary = true)
          @DisplayName("Body")
          @TypeResolver(PostFhirr4toCdaInputMetadataResolver.class)
          TypedValue<InputStream> postFhirr4toCdaBody,
      @ParameterGroup(name = REQUEST_PARAMETERS_GROUP_NAME) RequestParameters parameters,
      @ParameterGroup(name = CONNECTOR_OVERRIDES) ConfigurationOverrides overrides,
      CompletionCallback<InputStream, Object> callback) {
    super.postFhirr4toCda(config, connection, postFhirr4toCdaBody, parameters, overrides, callback);
  }
}
