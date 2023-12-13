package com.mulesoft.connectors.orchestrateconvertapi.internal.operation.refinement;

import com.mulesoft.connectors.orchestrateconvertapi.internal.operation.base.PostFhirr4toOmopOperationBase;
import org.mule.runtime.api.el.ExpressionLanguage;

/** Middle part of the Operation. Can be used by the user to add custom code into the operation. */
public class PostFhirr4toOmopOperationRefinement extends PostFhirr4toOmopOperationBase {
  public PostFhirr4toOmopOperationRefinement() {
    super();
  }

  public PostFhirr4toOmopOperationRefinement(ExpressionLanguage arg0) {
    super(arg0);
  }
}
