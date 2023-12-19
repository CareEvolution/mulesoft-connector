package com.mulesoft.connectors.orchestrateconvertapiconnectormule4.internal.operation;

import static com.mulesoft.connectivity.rest.commons.internal.RestConstants.CONNECTOR_OVERRIDES;
import static com.mulesoft.connectivity.rest.commons.internal.RestConstants.REQUEST_PARAMETERS_GROUP_NAME;

import com.mulesoft.connectivity.rest.commons.api.configuration.RestConfiguration;
import com.mulesoft.connectivity.rest.commons.api.connection.RestConnection;
import com.mulesoft.connectivity.rest.commons.api.error.RequestErrorTypeProvider;
import com.mulesoft.connectivity.rest.commons.api.operation.ConfigurationOverrides;
import com.mulesoft.connectivity.rest.commons.api.operation.RequestParameters;
import com.mulesoft.connectors.orchestrateconvertapiconnectormule4.internal.metadata.HttpResponseAttributesMetadataResolver;
import com.mulesoft.connectors.orchestrateconvertapiconnectormule4.internal.metadata.PostHl7toFhirr4InputMetadataResolver;
import com.mulesoft.connectors.orchestrateconvertapiconnectormule4.internal.metadata.PostHl7toFhirr4OutputMetadataResolver;
import com.mulesoft.connectors.orchestrateconvertapiconnectormule4.internal.operation.refinement.PostHl7toFhirr4OperationRefinement;
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
public class PostHl7toFhirr4Operation extends PostHl7toFhirr4OperationRefinement {
  public PostHl7toFhirr4Operation() {
    super();
  }

  public PostHl7toFhirr4Operation(ExpressionLanguage arg0) {
    super(arg0);
  }

  /**
   * This operation converts one or more HL7v2 messages into a FHIR R4 bundle.
   *
   * <p>This operation makes an HTTP POST request to the /HL7toFHIRR4 endpoint
   *
   * @param config the configuration to use
   * @param connection the connection to use
   * @param postHl7toFhirr4Body the content to use
   * @param parameters the {@link RequestParameters}
   * @param overrides the {@link ConfigurationOverrides}
   * @param callback the operation's {@link CompletionCallback}
   */
  @Throws(RequestErrorTypeProvider.class)
  @DisplayName("Convert HL7 to FHIR R4")
  @Summary("This operation converts one or more HL7v2 messages into a FHIR R4 bundle.")
  @MediaType("application/fhir+json")
  @OutputResolver(
      output = PostHl7toFhirr4OutputMetadataResolver.class,
      attributes = HttpResponseAttributesMetadataResolver.class)
  public void postHl7toFhirr4(
      @Config RestConfiguration config,
      @Connection RestConnection connection,
      @Content(primary = true)
          @DisplayName("Body")
          @TypeResolver(PostHl7toFhirr4InputMetadataResolver.class)
          TypedValue<InputStream> postHl7toFhirr4Body,
      @ParameterGroup(name = REQUEST_PARAMETERS_GROUP_NAME) RequestParameters parameters,
      @ParameterGroup(name = CONNECTOR_OVERRIDES) ConfigurationOverrides overrides,
      CompletionCallback<InputStream, Object> callback) {
    super.postHl7toFhirr4(config, connection, postHl7toFhirr4Body, parameters, overrides, callback);
  }
}
