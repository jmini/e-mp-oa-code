/**
 *
 */
package fr.jmini.empoa.specs.swagger;

import java.util.ArrayList;
import java.util.List;

import fr.jmini.empoa.specs.OpenAPISpec;

/**
 * @author jbr
 *
 */
public class SwSpec {

    public static List<SwElement> elements() {
        List<SwElement> elements = new ArrayList<>();
        // org.eclipse.microprofile.openapi.models
        elements.add(createComponents());
        elements.add(createExternalDocumentation());
        elements.add(createOpenAPI());
        elements.add(createOperation());
        elements.add(createPathItem());
        elements.add(createPaths());

        // org.eclipse.microprofile.openapi.models.callbacks
        elements.add(createCallback());

        // org.eclipse.microprofile.openapi.models.examples
        elements.add(createExample());

        // org.eclipse.microprofile.openapi.models.headers
        elements.add(createHeader());

        // org.eclipse.microprofile.openapi.models.info
        elements.add(createContact());
        elements.add(createInfo());
        elements.add(createLicense());

        // org.eclipse.microprofile.openapi.models.links
        elements.add(createLink());

        // org.eclipse.microprofile.openapi.models.media
        elements.add(createContent());
        elements.add(createDiscriminator());
        elements.add(createEncoding());
        elements.add(createMediaType());
        elements.add(createSchema());
        elements.add(createXML());

        // org.eclipse.microprofile.openapi.models.parameters
        elements.add(createParameter());
        elements.add(createRequestBody());

        // org.eclipse.microprofile.openapi.models.responses
        elements.add(createAPIResponse());
        elements.add(createAPIResponses());

        // org.eclipse.microprofile.openapi.models.security
        elements.add(createOAuthFlow());
        elements.add(createOAuthFlows());
        elements.add(createScopes());
        elements.add(createSecurityRequirement());
        elements.add(createSecurityScheme());

        // org.eclipse.microprofile.openapi.models.servers
        elements.add(createServer());
        elements.add(createServerVariable());
        elements.add(createServerVariables());

        // org.eclipse.microprofile.openapi.models.tag
        elements.add(createTag());

        return elements;
    }

    public static SwElement createComponents() {
        return new SwElement(OpenAPISpec.createComponents(), io.swagger.v3.oas.models.Components.class.getCanonicalName());
    }

    public static SwElement createExternalDocumentation() {
        return new SwElement(OpenAPISpec.createExternalDocumentation(), io.swagger.v3.oas.models.ExternalDocumentation.class.getCanonicalName());
    }

    public static SwElement createOpenAPI() {
        return new SwElement(OpenAPISpec.createOpenAPI(), io.swagger.v3.oas.models.OpenAPI.class.getCanonicalName());
    }

    public static SwElement createOperation() {
        return new SwElement(OpenAPISpec.createOperation(), io.swagger.v3.oas.models.Operation.class.getCanonicalName());
    }

    public static SwElement createPathItem() {
        return new SwElement(OpenAPISpec.createPathItem(), io.swagger.v3.oas.models.PathItem.class.getCanonicalName());
    }

    public static SwElement createPaths() {
        return new SwElement(OpenAPISpec.createPaths(), io.swagger.v3.oas.models.Paths.class.getCanonicalName());
    }

    public static SwElement createCallback() {
        return new SwElement(OpenAPISpec.createCallback(), io.swagger.v3.oas.models.callbacks.Callback.class.getCanonicalName());
    }

    public static SwElement createExample() {
        return new SwElement(OpenAPISpec.createExample(), io.swagger.v3.oas.models.examples.Example.class.getCanonicalName());
    }

    public static SwElement createHeader() {
        return new SwElement(OpenAPISpec.createHeader(), io.swagger.v3.oas.models.headers.Header.class.getCanonicalName());
    }

    public static SwElement createContact() {
        return new SwElement(OpenAPISpec.createContact(), io.swagger.v3.oas.models.info.Contact.class.getCanonicalName());
    }

    public static SwElement createInfo() {
        return new SwElement(OpenAPISpec.createInfo(), io.swagger.v3.oas.models.info.Info.class.getCanonicalName());
    }

    public static SwElement createLicense() {
        return new SwElement(OpenAPISpec.createLicense(), io.swagger.v3.oas.models.info.License.class.getCanonicalName());
    }

    public static SwElement createLink() {
        return new SwElement(OpenAPISpec.createLink(), io.swagger.v3.oas.models.links.Link.class.getCanonicalName());
    }

    public static SwElement createContent() {
        return new SwElement(OpenAPISpec.createContent(), io.swagger.v3.oas.models.media.Content.class.getCanonicalName());
    }

    public static SwElement createDiscriminator() {
        return new SwElement(OpenAPISpec.createDiscriminator(), io.swagger.v3.oas.models.media.Discriminator.class.getCanonicalName());
    }

    public static SwElement createEncoding() {
        return new SwElement(OpenAPISpec.createEncoding(), io.swagger.v3.oas.models.media.Encoding.class.getCanonicalName());
    }

    public static SwElement createMediaType() {
        return new SwElement(OpenAPISpec.createMediaType(), io.swagger.v3.oas.models.media.MediaType.class.getCanonicalName());
    }

    public static SwElement createSchema() {
        return new SwElement(OpenAPISpec.createSchema(), io.swagger.v3.oas.models.media.Schema.class.getCanonicalName());
    }

    public static SwElement createXML() {
        return new SwElement(OpenAPISpec.createXML(), io.swagger.v3.oas.models.media.XML.class.getCanonicalName());
    }

    public static SwElement createParameter() {
        return new SwElement(OpenAPISpec.createParameter(), io.swagger.v3.oas.models.parameters.Parameter.class.getCanonicalName());
    }

    public static SwElement createRequestBody() {
        return new SwElement(OpenAPISpec.createRequestBody(), io.swagger.v3.oas.models.parameters.RequestBody.class.getCanonicalName());
    }

    public static SwElement createAPIResponse() {
        return new SwElement(OpenAPISpec.createAPIResponse(), io.swagger.v3.oas.models.responses.ApiResponse.class.getCanonicalName());
    }

    public static SwElement createAPIResponses() {
        return new SwElement(OpenAPISpec.createAPIResponses(), io.swagger.v3.oas.models.responses.ApiResponses.class.getCanonicalName());
    }

    public static SwElement createOAuthFlow() {
        return new SwElement(OpenAPISpec.createOAuthFlow(), io.swagger.v3.oas.models.security.OAuthFlow.class.getCanonicalName());
    }

    public static SwElement createOAuthFlows() {
        return new SwElement(OpenAPISpec.createOAuthFlows(), io.swagger.v3.oas.models.security.OAuthFlows.class.getCanonicalName());
    }

    public static SwElement createScopes() {
        return new SwElement(OpenAPISpec.createScopes(), io.swagger.v3.oas.models.security.Scopes.class.getCanonicalName());
    }

    public static SwElement createSecurityRequirement() {
        return new SwElement(OpenAPISpec.createSecurityRequirement(), io.swagger.v3.oas.models.security.SecurityRequirement.class.getCanonicalName());
    }

    public static SwElement createSecurityScheme() {
        return new SwElement(OpenAPISpec.createSecurityScheme(), io.swagger.v3.oas.models.security.SecurityScheme.class.getCanonicalName());
    }

    public static SwElement createServer() {
        return new SwElement(OpenAPISpec.createServer(), io.swagger.v3.oas.models.servers.Server.class.getCanonicalName());
    }

    public static SwElement createServerVariable() {
        return new SwElement(OpenAPISpec.createServerVariable(), io.swagger.v3.oas.models.servers.ServerVariable.class.getCanonicalName());
    }

    public static SwElement createServerVariables() {
        return new SwElement(OpenAPISpec.createServerVariables(), io.swagger.v3.oas.models.servers.ServerVariables.class.getCanonicalName());
    }

    public static SwElement createTag() {
        return new SwElement(OpenAPISpec.createTag(), io.swagger.v3.oas.models.tags.Tag.class.getCanonicalName());
    }
}