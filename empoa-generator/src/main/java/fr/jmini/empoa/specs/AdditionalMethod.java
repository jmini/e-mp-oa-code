/*******************************************************************************
 * Copyright 2019 Jeremie Bresson
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License.  You may obtain a copy
 * of the License at
 * 
 *   http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.  See the
 * License for the specific language governing permissions and limitations under
 * the License.
 ******************************************************************************/
package fr.jmini.empoa.specs;

public class AdditionalMethod implements IMember {

    public final Type type;

    public AdditionalMethod(Type type) {
        super();
        this.type = type;
    }

    public static enum Type {
        PathItem_readOperations,
        PathItem_readOperationsMap,
        OpenAPI_path,
        SecurityRequirement_addScheme_singleton,
        SecurityRequirement_addScheme_empty
    }
}
