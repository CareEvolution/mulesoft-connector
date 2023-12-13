package com.mulesoft.connectors.orchestrateconvertapi.internal.operation.refinement;

import com.mulesoft.connectors.orchestrateconvertapi.internal.operation.base.PostCdatoPdfOperationBase;
import org.mule.runtime.api.el.ExpressionLanguage;

/** Middle part of the Operation. Can be used by the user to add custom code into the operation. */
public class PostCdatoPdfOperationRefinement extends PostCdatoPdfOperationBase {
  public PostCdatoPdfOperationRefinement() {
    super();
  }

  public PostCdatoPdfOperationRefinement(ExpressionLanguage arg0) {
    super(arg0);
  }
}
