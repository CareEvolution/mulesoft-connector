package com.mulesoft.connectors.orchestrateconvertapiconnectormule4.internal.operation;

import static com.mulesoft.connectivity.rest.commons.internal.RestConstants.CONNECTOR_OVERRIDES;
import static com.mulesoft.connectivity.rest.commons.internal.RestConstants.REQUEST_PARAMETERS_GROUP_NAME;

import com.mulesoft.connectivity.rest.commons.api.configuration.RestConfiguration;
import com.mulesoft.connectivity.rest.commons.api.connection.RestConnection;
import com.mulesoft.connectivity.rest.commons.api.error.RequestErrorTypeProvider;
import com.mulesoft.connectivity.rest.commons.api.operation.ConfigurationOverrides;
import com.mulesoft.connectivity.rest.commons.api.operation.RequestParameters;
import com.mulesoft.connectors.orchestrateconvertapiconnectormule4.internal.metadata.HttpResponseAttributesMetadataResolver;
import com.mulesoft.connectors.orchestrateconvertapiconnectormule4.internal.metadata.PostCdatoPdfInputMetadataResolver;
import com.mulesoft.connectors.orchestrateconvertapiconnectormule4.internal.metadata.PostCdatoPdfOutputMetadataResolver;
import com.mulesoft.connectors.orchestrateconvertapiconnectormule4.internal.operation.refinement.PostCdatoPdfOperationRefinement;
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
public class PostCdatoPdfOperation extends PostCdatoPdfOperationRefinement {
  public PostCdatoPdfOperation() {
    super();
  }

  public PostCdatoPdfOperation(ExpressionLanguage arg0) {
    super(arg0);
  }

  /**
   * This operation converts a CDA document into a PDF document.
   *
   * <p>This operation makes an HTTP POST request to the /CDAtoPDF endpoint
   *
   * @param config the configuration to use
   * @param connection the connection to use
   * @param postCdatoPdfBody the content to use
   * @param parameters the {@link RequestParameters}
   * @param overrides the {@link ConfigurationOverrides}
   * @param callback the operation's {@link CompletionCallback}
   */
  @Throws(RequestErrorTypeProvider.class)
  @DisplayName("Convert CDA to PDF")
  @Summary("This operation converts a CDA document into a PDF document.")
  @MediaType("application/pdf")
  @OutputResolver(
      output = PostCdatoPdfOutputMetadataResolver.class,
      attributes = HttpResponseAttributesMetadataResolver.class)
  public void postCdatoPdf(
      @Config RestConfiguration config,
      @Connection RestConnection connection,
      @Content(primary = true)
          @DisplayName("Body")
          @TypeResolver(PostCdatoPdfInputMetadataResolver.class)
          TypedValue<InputStream> postCdatoPdfBody,
      @ParameterGroup(name = REQUEST_PARAMETERS_GROUP_NAME) RequestParameters parameters,
      @ParameterGroup(name = CONNECTOR_OVERRIDES) ConfigurationOverrides overrides,
      CompletionCallback<InputStream, Object> callback) {
    super.postCdatoPdf(config, connection, postCdatoPdfBody, parameters, overrides, callback);
  }
}
