/*
 *  CPAchecker is a tool for configurable software verification.
 *  This file is part of CPAchecker.
 *
 *  Copyright (C) 2007-2014  Dirk Beyer
 *  All rights reserved.
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 *
 *
 *  CPAchecker web page:
 *    http://cpachecker.sosy-lab.org
 */
package org.sosy_lab.cpachecker.cpa.wp.segkro.rules;

import java.util.List;
import java.util.Set;

import org.sosy_lab.cpachecker.cpa.wp.segkro.interfaces.Rule;
import org.sosy_lab.cpachecker.util.predicates.Solver;
import org.sosy_lab.cpachecker.util.predicates.interfaces.BooleanFormula;
import org.sosy_lab.cpachecker.util.predicates.interfaces.FormulaManager;

public abstract class AbstractRule implements Rule {

  protected final FormulaManager fm;
  protected final Solver solver;

  public AbstractRule(FormulaManager pFm, Solver pSolver) {
    this.fm = pFm;
    this.solver = pSolver;
  }

  @Override
  public String getRuleName() {
    return getClass().getSimpleName();
  }

  @Override
  public Set<BooleanFormula> apply(BooleanFormula pInput) {
    throw new UnsupportedOperationException("Implement me in the child class if needed!");
  }

  @Override
  public Set<BooleanFormula> apply(List<BooleanFormula> pConjunctiveInputPredicates) {
    throw new UnsupportedOperationException("Implement me in the child class if needed!");
  }


}
