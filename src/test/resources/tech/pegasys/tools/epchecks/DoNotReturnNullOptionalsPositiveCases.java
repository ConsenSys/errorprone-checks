/*
 * Copyright ConsenSys AG.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 *
 * SPDX-License-Identifier: Apache-2.0
 */

package tech.pegasys.tools.epchecks;

import java.util.Optional;

public class DoNotReturnNullOptionalsPositiveCases {

  public Optional<Long> returnsNull() {
    // BUG: Diagnostic contains: Do not return null optionals.
    return null;
  }

  public Optional<Long> sometimesReturnsNull(boolean random) {
    if (random) {
      // BUG: Diagnostic contains: Do not return null optionals.
      return null;
    }
    return Optional.of(2L);
  }

  public Optional<Long> returnsVarAssignedNull() {
    Optional<Long> var = null;
    // BUG: Diagnostic contains: Do not return null optionals.
    return var;
  }

  public Optional<Long> returnsVarMaybeAssignedNull(final boolean flag) {
    Optional<Long> var = flag ? Optional.of(2L) : null;
    // BUG: Diagnostic contains: Do not return null optionals.
    return var;
  }
}
