package fr.jmini.empoa.swagger.parser.internal;

import static org.testng.Assert.assertEquals;

import org.eclipse.microprofile.openapi.OASFactory;
import org.testng.annotations.Test;

public class SwOASFactoryResolverTest {

    @Test
    public void testCreateObject() {
        assertEquals(OASFactory.createObject(org.eclipse.microprofile.openapi.models.Components.class)
                .getClass(), fr.jmini.empoa.swagger.parser.internal.models.SwComponents.class);

        assertEquals(OASFactory.createObject(org.eclipse.microprofile.openapi.models.ExternalDocumentation.class)
                .getClass(), fr.jmini.empoa.swagger.parser.internal.models.SwExternalDocumentation.class);

        assertEquals(OASFactory.createObject(org.eclipse.microprofile.openapi.models.OpenAPI.class)
                .getClass(), fr.jmini.empoa.swagger.parser.internal.models.SwOpenAPI.class);

        assertEquals(OASFactory.createObject(org.eclipse.microprofile.openapi.models.Operation.class)
                .getClass(), fr.jmini.empoa.swagger.parser.internal.models.SwOperation.class);

        assertEquals(OASFactory.createObject(org.eclipse.microprofile.openapi.models.PathItem.class)
                .getClass(), fr.jmini.empoa.swagger.parser.internal.models.SwPathItem.class);

        assertEquals(OASFactory.createObject(org.eclipse.microprofile.openapi.models.Paths.class)
                .getClass(), fr.jmini.empoa.swagger.parser.internal.models.SwPaths.class);

        assertEquals(OASFactory.createObject(org.eclipse.microprofile.openapi.models.callbacks.Callback.class)
                .getClass(), fr.jmini.empoa.swagger.parser.internal.models.callbacks.SwCallback.class);

        assertEquals(OASFactory.createObject(org.eclipse.microprofile.openapi.models.examples.Example.class)
                .getClass(), fr.jmini.empoa.swagger.parser.internal.models.examples.SwExample.class);

        assertEquals(OASFactory.createObject(org.eclipse.microprofile.openapi.models.headers.Header.class)
                .getClass(), fr.jmini.empoa.swagger.parser.internal.models.headers.SwHeader.class);

        assertEquals(OASFactory.createObject(org.eclipse.microprofile.openapi.models.info.Contact.class)
                .getClass(), fr.jmini.empoa.swagger.parser.internal.models.info.SwContact.class);

        assertEquals(OASFactory.createObject(org.eclipse.microprofile.openapi.models.info.Info.class)
                .getClass(), fr.jmini.empoa.swagger.parser.internal.models.info.SwInfo.class);

        assertEquals(OASFactory.createObject(org.eclipse.microprofile.openapi.models.info.License.class)
                .getClass(), fr.jmini.empoa.swagger.parser.internal.models.info.SwLicense.class);

        assertEquals(OASFactory.createObject(org.eclipse.microprofile.openapi.models.links.Link.class)
                .getClass(), fr.jmini.empoa.swagger.parser.internal.models.links.SwLink.class);

        assertEquals(OASFactory.createObject(org.eclipse.microprofile.openapi.models.media.Content.class)
                .getClass(), fr.jmini.empoa.swagger.parser.internal.models.media.SwContent.class);

        assertEquals(OASFactory.createObject(org.eclipse.microprofile.openapi.models.media.Discriminator.class)
                .getClass(), fr.jmini.empoa.swagger.parser.internal.models.media.SwDiscriminator.class);

        assertEquals(OASFactory.createObject(org.eclipse.microprofile.openapi.models.media.Encoding.class)
                .getClass(), fr.jmini.empoa.swagger.parser.internal.models.media.SwEncoding.class);

        assertEquals(OASFactory.createObject(org.eclipse.microprofile.openapi.models.media.MediaType.class)
                .getClass(), fr.jmini.empoa.swagger.parser.internal.models.media.SwMediaType.class);

        assertEquals(OASFactory.createObject(org.eclipse.microprofile.openapi.models.media.Schema.class)
                .getClass(), fr.jmini.empoa.swagger.parser.internal.models.media.SwSchema.class);

        assertEquals(OASFactory.createObject(org.eclipse.microprofile.openapi.models.media.XML.class)
                .getClass(), fr.jmini.empoa.swagger.parser.internal.models.media.SwXML.class);

        assertEquals(OASFactory.createObject(org.eclipse.microprofile.openapi.models.parameters.Parameter.class)
                .getClass(), fr.jmini.empoa.swagger.parser.internal.models.parameters.SwParameter.class);

        assertEquals(OASFactory.createObject(org.eclipse.microprofile.openapi.models.parameters.RequestBody.class)
                .getClass(), fr.jmini.empoa.swagger.parser.internal.models.parameters.SwRequestBody.class);

        assertEquals(OASFactory.createObject(org.eclipse.microprofile.openapi.models.responses.APIResponse.class)
                .getClass(), fr.jmini.empoa.swagger.parser.internal.models.responses.SwAPIResponse.class);

        assertEquals(OASFactory.createObject(org.eclipse.microprofile.openapi.models.responses.APIResponses.class)
                .getClass(), fr.jmini.empoa.swagger.parser.internal.models.responses.SwAPIResponses.class);

        assertEquals(OASFactory.createObject(org.eclipse.microprofile.openapi.models.security.OAuthFlow.class)
                .getClass(), fr.jmini.empoa.swagger.parser.internal.models.security.SwOAuthFlow.class);

        assertEquals(OASFactory.createObject(org.eclipse.microprofile.openapi.models.security.OAuthFlows.class)
                .getClass(), fr.jmini.empoa.swagger.parser.internal.models.security.SwOAuthFlows.class);

        assertEquals(OASFactory.createObject(org.eclipse.microprofile.openapi.models.security.Scopes.class)
                .getClass(), fr.jmini.empoa.swagger.parser.internal.models.security.SwScopes.class);

        assertEquals(OASFactory.createObject(org.eclipse.microprofile.openapi.models.security.SecurityRequirement.class)
                .getClass(), fr.jmini.empoa.swagger.parser.internal.models.security.SwSecurityRequirement.class);

        assertEquals(OASFactory.createObject(org.eclipse.microprofile.openapi.models.security.SecurityScheme.class)
                .getClass(), fr.jmini.empoa.swagger.parser.internal.models.security.SwSecurityScheme.class);

        assertEquals(OASFactory.createObject(org.eclipse.microprofile.openapi.models.servers.Server.class)
                .getClass(), fr.jmini.empoa.swagger.parser.internal.models.servers.SwServer.class);

        assertEquals(OASFactory.createObject(org.eclipse.microprofile.openapi.models.servers.ServerVariable.class)
                .getClass(), fr.jmini.empoa.swagger.parser.internal.models.servers.SwServerVariable.class);

        assertEquals(OASFactory.createObject(org.eclipse.microprofile.openapi.models.servers.ServerVariables.class)
                .getClass(), fr.jmini.empoa.swagger.parser.internal.models.servers.SwServerVariables.class);

        assertEquals(OASFactory.createObject(org.eclipse.microprofile.openapi.models.tags.Tag.class)
                .getClass(), fr.jmini.empoa.swagger.parser.internal.models.tags.SwTag.class);
    }

}
