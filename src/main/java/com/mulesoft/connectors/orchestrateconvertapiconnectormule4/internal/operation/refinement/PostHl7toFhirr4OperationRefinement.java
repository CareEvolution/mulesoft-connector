package com.mulesoft.connectors.orchestrateconvertapiconnectormule4.internal.operation.refinement;

import com.mulesoft.connectors.orchestrateconvertapiconnectormule4.internal.operation.base.PostHl7toFhirr4OperationBase;
import org.mule.runtime.api.el.ExpressionLanguage;

/** Middle part of the Operation. Can be used by the user to add custom code into the operation. */
public class PostHl7toFhirr4OperationRefinement extends PostHl7toFhirr4OperationBase {
  public PostHl7toFhirr4OperationRefinement() {
    super();
  }

  public PostHl7toFhirr4OperationRefinement(ExpressionLanguage arg0) {
    super(arg0);
  }
}
