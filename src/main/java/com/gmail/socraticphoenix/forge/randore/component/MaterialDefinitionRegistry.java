/*
 * The MIT License (MIT)
 *
 * Copyright (c) 2016 socraticphoenix@gmail.com
 * Copyright (c) 2016 contributors
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy of this software and
 * associated documentation files (the "Software"), to deal in the Software without restriction,
 * including without limitation the rights to use, copy, modify, merge, publish, distribute,
 * sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all copies or
 * substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT
 * NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND
 * NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM,
 * DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */
package com.gmail.socraticphoenix.forge.randore.component;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MaterialDefinitionRegistry {
    private static final Map<Long, List<MaterialDefinition>> definitions = Collections.synchronizedMap(new HashMap<Long, List<MaterialDefinition>>());

    public static List<MaterialDefinition> get(long seed) {
        MaterialDefinitionGenerator.registerDefinitionsIfNeeded(seed);
        return MaterialDefinitionRegistry.definitions.get(seed);
    }

    public static boolean contains(long seed, int index) {
        List<MaterialDefinition> definitions = MaterialDefinitionRegistry.definitions.get(seed);
        return definitions != null && index >= 0 && index < definitions.size();
    }

    public static List<MaterialDefinition> remove(long seed) {
        return MaterialDefinitionRegistry.definitions.remove(seed);
    }

    public static void put(long seed, List<MaterialDefinition> definitions) {
        MaterialDefinitionRegistry.definitions.put(seed, definitions);
    }

    public static boolean contains(long seed) {
        return MaterialDefinitionRegistry.definitions.containsKey(seed);
    }


}
