package com.mulesoft.connectors.orchestrateconvertapi.internal.config.refinement;

import com.mulesoft.connectors.orchestrateconvertapi.internal.config.base.OrchestrateConvertApiConfigurationBase;

/**
 * This refinement is the middle layer of the configuration generation gap pattern. It can be
 * overridden to add custom logic in the configuration.
 */
public abstract class OrchestrateConvertApiConfigurationRefinement
    extends OrchestrateConvertApiConfigurationBase {}
