package com.mulesoft.connectors.orchestrateconvertapi.internal.operation.refinement;

import com.mulesoft.connectors.orchestrateconvertapi.internal.operation.base.PostX12toFhirr4OperationBase;
import org.mule.runtime.api.el.ExpressionLanguage;

/** Middle part of the Operation. Can be used by the user to add custom code into the operation. */
public class PostX12toFhirr4OperationRefinement extends PostX12toFhirr4OperationBase {
  public PostX12toFhirr4OperationRefinement() {
    super();
  }

  public PostX12toFhirr4OperationRefinement(ExpressionLanguage arg0) {
    super(arg0);
  }
}
