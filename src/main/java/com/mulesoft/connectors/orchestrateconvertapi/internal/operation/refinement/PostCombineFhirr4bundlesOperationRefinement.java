package com.mulesoft.connectors.orchestrateconvertapi.internal.operation.refinement;

import com.mulesoft.connectors.orchestrateconvertapi.internal.operation.base.PostCombineFhirr4bundlesOperationBase;
import org.mule.runtime.api.el.ExpressionLanguage;

/** Middle part of the Operation. Can be used by the user to add custom code into the operation. */
public class PostCombineFhirr4bundlesOperationRefinement
    extends PostCombineFhirr4bundlesOperationBase {
  public PostCombineFhirr4bundlesOperationRefinement() {
    super();
  }

  public PostCombineFhirr4bundlesOperationRefinement(ExpressionLanguage arg0) {
    super(arg0);
  }
}
