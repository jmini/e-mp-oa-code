/**
 *
 */
package fr.jmini.empoa.generator;

import java.util.List;
import java.util.stream.Collectors;

import fr.jmini.empoa.specs.Element;
import fr.jmini.empoa.specs.MapMember;

/**
 * @author jbr
 *
 */
public class Util {

    public static MapMember findSingleMapMember(Element e) {
        switch (e.type) {
        case Paths:
        case Callback:
        case Content:
        case APIResponses:
        case Scopes:
        case SecurityRequirement:
        case ServerVariables:
            List<MapMember> list = e.members.stream()
                    .filter(m -> m instanceof MapMember)
                    .map(m -> (MapMember) m)
                    .collect(Collectors.toList());
            if (list.size() != 1) {
                throw new IllegalStateException("Expecting only one MapMember, got " + list.size());
            }
            return list.get(0);
        default:
            return null;
        }
    }

}
