package com.mulesoft.connectors.orchestrateconvertapi.internal.config;

import com.mulesoft.connectors.orchestrateconvertapi.internal.config.refinement.OrchestrateConvertApiConfigurationRefinement;
import com.mulesoft.connectors.orchestrateconvertapi.internal.connection.provider.ApiKeyAuthConnectionProvider;
import com.mulesoft.connectors.orchestrateconvertapi.internal.operation.PostCdatoFhirr4Operation;
import com.mulesoft.connectors.orchestrateconvertapi.internal.operation.PostCdatoHtmlOperation;
import com.mulesoft.connectors.orchestrateconvertapi.internal.operation.PostCdatoPdfOperation;
import com.mulesoft.connectors.orchestrateconvertapi.internal.operation.PostCombineFhirr4bundlesOperation;
import com.mulesoft.connectors.orchestrateconvertapi.internal.operation.PostFhirr4toCdaOperation;
import com.mulesoft.connectors.orchestrateconvertapi.internal.operation.PostFhirr4toOmopOperation;
import com.mulesoft.connectors.orchestrateconvertapi.internal.operation.PostHl7toFhirr4Operation;
import com.mulesoft.connectors.orchestrateconvertapi.internal.operation.PostX12toFhirr4Operation;
import org.mule.runtime.extension.api.annotation.Configuration;
import org.mule.runtime.extension.api.annotation.Operations;
import org.mule.runtime.extension.api.annotation.connectivity.ConnectionProviders;

@Configuration
@Operations({
  PostCombineFhirr4bundlesOperation.class,
  PostCdatoFhirr4Operation.class,
  PostCdatoHtmlOperation.class,
  PostCdatoPdfOperation.class,
  PostFhirr4toCdaOperation.class,
  PostHl7toFhirr4Operation.class,
  PostFhirr4toOmopOperation.class,
  PostX12toFhirr4Operation.class
})
@ConnectionProviders({ApiKeyAuthConnectionProvider.class})
public class OrchestrateConvertApiConfiguration
    extends OrchestrateConvertApiConfigurationRefinement {}
