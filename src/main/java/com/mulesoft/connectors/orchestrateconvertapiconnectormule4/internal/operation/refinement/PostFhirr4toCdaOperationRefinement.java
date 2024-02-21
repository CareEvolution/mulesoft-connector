package com.mulesoft.connectors.orchestrateconvertapiconnectormule4.internal.operation.refinement;

import com.mulesoft.connectors.orchestrateconvertapiconnectormule4.internal.operation.base.PostFhirr4toCdaOperationBase;
import org.mule.runtime.api.el.ExpressionLanguage;

/** Middle part of the Operation. Can be used by the user to add custom code into the operation. */
public class PostFhirr4toCdaOperationRefinement extends PostFhirr4toCdaOperationBase {
  public PostFhirr4toCdaOperationRefinement() {
    super();
  }

  public PostFhirr4toCdaOperationRefinement(ExpressionLanguage arg0) {
    super(arg0);
  }
}
