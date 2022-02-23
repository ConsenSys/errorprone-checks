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

import com.google.common.base.Objects;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.Set;
import java.util.HashSet;

public class UseFastutilPositiveCases {

  // BUG: Diagnostic contains: Use the fastutil equivalent
  static final List<Boolean> _bools = new ArrayList<>();

  static public void usesJavaOf() {
    // BUG: Diagnostic contains: Use the fastutil equivalent
    Set<Integer> ints = Set.of(1, 2, 3);
    // BUG: Diagnostic contains: Use the fastutil equivalent
    Map<Integer, String> int_to_str = Map.of(1, "1", 2, "2", 3, "3");
    // BUG: Diagnostic contains: Use the fastutil equivalent
    Map<String, Integer> str_to_int = Map.of("1", 1, "2", 2, "3", 3);
  }

  static public void usesJavaSet() {
    // BUG: Diagnostic contains: Use the fastutil equivalent
    Set<Boolean> bools = new HashSet<>();
    // BUG: Diagnostic contains: Use the fastutil equivalent
    Set<Byte> bytes = new HashSet<>();
    // BUG: Diagnostic contains: Use the fastutil equivalent
    Set<Character> chars = new HashSet<>();
    // BUG: Diagnostic contains: Use the fastutil equivalent
    Set<Double> doubles = new HashSet<>();
    // BUG: Diagnostic contains: Use the fastutil equivalent
    Set<Float> floats = new HashSet<>();
    // BUG: Diagnostic contains: Use the fastutil equivalent
    Set<Integer> ints = new HashSet<>();
    // BUG: Diagnostic contains: Use the fastutil equivalent
    Set<Long> longs = new HashSet<>();
    // BUG: Diagnostic contains: Use the fastutil equivalent
    Set<Short> shorts = new HashSet<>();
  }

  static public void usesJavaList() {
    // BUG: Diagnostic contains: Use the fastutil equivalent
    List<Boolean> bools = new ArrayList<>();
    // BUG: Diagnostic contains: Use the fastutil equivalent
    List<Byte> bytes = new ArrayList<>();
    // BUG: Diagnostic contains: Use the fastutil equivalent
    List<Character> chars = new ArrayList<>();
    // BUG: Diagnostic contains: Use the fastutil equivalent
    List<Double> doubles = new ArrayList<>();
    // BUG: Diagnostic contains: Use the fastutil equivalent
    List<Float> floats = new ArrayList<>();
    // BUG: Diagnostic contains: Use the fastutil equivalent
    List<Integer> ints = new ArrayList<>();
    // BUG: Diagnostic contains: Use the fastutil equivalent
    List<Long> longs = new ArrayList<>();
    // BUG: Diagnostic contains: Use the fastutil equivalent
    List<Short> shorts = new ArrayList<>();
  }

  static public void usesJavamap() {
    // BUG: Diagnostic contains: Use the fastutil equivalent
    Map<Boolean, String> bool_to_str = new HashMap<>();
    // BUG: Diagnostic contains: Use the fastutil equivalent
    Map<String, Boolean> str_to_bool = new HashMap<>();
    // BUG: Diagnostic contains: Use the fastutil equivalent
    Map<Byte, String> byte_to_str = new HashMap<>();
    // BUG: Diagnostic contains: Use the fastutil equivalent
    Map<String, Byte> str_to_byte = new HashMap<>();
    // BUG: Diagnostic contains: Use the fastutil equivalent
    Map<Character, String> char_to_str = new HashMap<>();
    // BUG: Diagnostic contains: Use the fastutil equivalent
    Map<String, Character> str_to_char = new HashMap<>();
    // BUG: Diagnostic contains: Use the fastutil equivalent
    Map<Double, String> double_to_str = new HashMap<>();
    // BUG: Diagnostic contains: Use the fastutil equivalent
    Map<String, Double> str_to_double = new HashMap<>();
    // BUG: Diagnostic contains: Use the fastutil equivalent
    Map<Float, String> float_to_str = new HashMap<>();
    // BUG: Diagnostic contains: Use the fastutil equivalent
    Map<String, Float> str_to_float = new HashMap<>();
    // BUG: Diagnostic contains: Use the fastutil equivalent
    Map<Integer, String> int_to_str = new HashMap<>();
    // BUG: Diagnostic contains: Use the fastutil equivalent
    Map<String, Integer> str_to_int = new HashMap<>();
    // BUG: Diagnostic contains: Use the fastutil equivalent
    Map<Long, String> long_to_str = new HashMap<>();
    // BUG: Diagnostic contains: Use the fastutil equivalent
    Map<String, Long> str_to_long = new HashMap<>();
    // BUG: Diagnostic contains: Use the fastutil equivalent
    Map<Short, String> short_to_str = new HashMap<>();
    // BUG: Diagnostic contains: Use the fastutil equivalent
    Map<String, Short> str_to_short = new HashMap<>();
  }

  static void createGenericList() {
    Integer i = 0;
    // This should be caught.
    List<Integer> list = createListOf(i);
  }
  static <T> List<T> createListOf(T a) {
    List<T> list = new ArrayList<>();
    list.add(a);
    return list;
  }
}