package com.mulesoft.connectors.orchestrateconvertapi.internal.operation.refinement;

import com.mulesoft.connectors.orchestrateconvertapi.internal.operation.base.PostCdatoFhirr4OperationBase;
import org.mule.runtime.api.el.ExpressionLanguage;

/** Middle part of the Operation. Can be used by the user to add custom code into the operation. */
public class PostCdatoFhirr4OperationRefinement extends PostCdatoFhirr4OperationBase {
  public PostCdatoFhirr4OperationRefinement() {
    super();
  }

  public PostCdatoFhirr4OperationRefinement(ExpressionLanguage arg0) {
    super(arg0);
  }
}
