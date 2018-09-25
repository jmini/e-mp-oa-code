package org.eclipse.microprofile.openapi.tck;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotNull;
import static org.testng.Assert.assertNotSame;
import static org.testng.Assert.assertTrue;

import java.util.Arrays;

import org.eclipse.microprofile.openapi.OASFactory;
import org.eclipse.microprofile.openapi.models.Constructible;
import org.eclipse.microprofile.openapi.models.OpenAPI;
import org.eclipse.microprofile.openapi.models.security.SecurityRequirement;
import org.testng.annotations.Test;

public class ExtendedTCKTest {

    @Test
    public void openAPITest() {
        final OpenAPI o = createConstructibleInstance(OpenAPI.class);

        final SecurityRequirement sr1 = createConstructibleInstance(SecurityRequirement.class);
        final SecurityRequirement sr2 = createConstructibleInstance(SecurityRequirement.class);
        o.security(Arrays.asList(sr1, sr2));
        assertEquals(o.getSecurity()
                .size(), 2, "The list is expected to contain two entries.");
        final SecurityRequirement sr3 = createConstructibleInstance(SecurityRequirement.class);
        o.addSecurityRequirement(sr3);
        assertEquals(o.getSecurity()
                .size(), 3, "The list is expected to contain three entries.");

        // final Server s = createConstructibleInstance(Server.class);
        // checkSameObject(o, o.addServer(s));
        // checkListEntry(o.getServers(), s);
        // assertEquals(o.getServers()
        // .size(), 1, "The list is expected to contain one entry.");
        // o.removeServer(s);
        // assertEquals(o.getServers()
        // .size(), 0, "The list is expected to be empty.");
        //
        // final Tag t = createConstructibleInstance(Tag.class);
        // checkSameObject(o, o.addTag(t));
        // checkListEntry(o.getTags(), t);
        // assertEquals(o.getTags()
        // .size(), 1, "The list is expected to contain one entry.");
        // o.removeTag(t);
        // assertEquals(o.getTags()
        // .size(), 0, "The list is expected to be empty.");
    }

    private <T extends Constructible> T createConstructibleInstance(Class<T> clazz) {
        // Check that the OASFactory is able to create an instance of the given Class.
        final T o1 = OASFactory.createObject(clazz);
        assertNotNull(o1, "The return value of OASFactory.createObject(" + clazz.getName() + ") must not be null.");
        assertTrue(clazz.isInstance(o1), "The return value of OASFactory.createObject() is expected to be an instance of: " + clazz.getName());
        final T o2 = OASFactory.createObject(clazz);
        assertNotNull(o2, "The return value of OASFactory.createObject(" + clazz.getName() + ") must not be null.");
        assertTrue(clazz.isInstance(o2), "The return value of OASFactory.createObject() is expected to be an instance of: " + clazz.getName());
        assertNotSame(o2, o1, "OASFactory.createObject(" + clazz.getName() + ") is expected to create a new object on each invocation.");
        return o1;
    }
}
