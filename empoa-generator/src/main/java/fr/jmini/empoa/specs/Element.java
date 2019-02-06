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

import java.util.Collections;
import java.util.List;

import fr.jmini.empoa.util.StringUtil;

public class Element {

    public final ElementType type;
    public final String fqName;
    public final boolean extensible;
    public final boolean referenceable;
    public final List<IMember> members;
    public final String mapOfItemFq;
    public final String mapAddName;
    public final String mapRemoveName;
    public final String mapGetAllName;
    public final String mapSetAllName;
    public final String mapHasName;
    public final String mapGetName;

    public Element(ElementType type, String fqName, boolean extensible, boolean referenceable, List<IMember> members) {
        this(type, fqName, extensible, referenceable, members, null);
    }

    public Element(ElementType type, String fqName, boolean extensible, boolean referenceable, List<IMember> members, String mapOfItemFq) {
        this(type, fqName, extensible, referenceable, members, mapOfItemFq, StringUtil.capitalize(StringUtil.computeSimpleName(mapOfItemFq)));
    }

    public Element(ElementType type, String fqName, boolean extensible, boolean referenceable, List<IMember> members, String mapOfItemFq, String itemName) {
        this.type = type;
        this.fqName = fqName;
        this.extensible = extensible;
        this.referenceable = referenceable;
        this.members = Collections.unmodifiableList(members);
        this.mapOfItemFq = mapOfItemFq;
        if (itemName != null) {
            this.mapAddName = "add" + itemName;
            this.mapRemoveName = "remove" + itemName;
            this.mapGetAllName = "get" + StringUtil.plural(itemName);
            this.mapSetAllName = "set" + StringUtil.plural(itemName);
            this.mapHasName = "has" + itemName;
            this.mapGetName = "get" + itemName;
        } else {
            this.mapAddName = null;
            this.mapRemoveName = null;
            this.mapGetAllName = null;
            this.mapSetAllName = null;
            this.mapHasName = null;
            this.mapGetName = null;
        }
    }
}
