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
package fr.jmini.empoa.generator.simple;

import java.nio.file.Paths;

import fr.jmini.empoa.generator.Input;
import fr.jmini.empoa.specs.Element;
import fr.jmini.empoa.specs.OpenAPISpec;

public class SimpleGeneratorMain {

    public static void main(String[] args) throws Exception {
        Input input = new Input(Paths.get("../empoa-simple-models-impl/src/main/java"), "fr.jmini.empoa.simple.internal");
        for (Element element : OpenAPISpec.elements()) {
            SimpleGenerator generator = new SimpleGenerator(element, input);
            generator.writeFile();
        }
    }

}
