package fr.jmini.empoa.specs;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.eclipse.microprofile.openapi.models.Components;
import org.eclipse.microprofile.openapi.models.ExternalDocumentation;
import org.eclipse.microprofile.openapi.models.OpenAPI;
import org.eclipse.microprofile.openapi.models.Operation;
import org.eclipse.microprofile.openapi.models.PathItem;
import org.eclipse.microprofile.openapi.models.Paths;
import org.eclipse.microprofile.openapi.models.callbacks.Callback;
import org.eclipse.microprofile.openapi.models.examples.Example;
import org.eclipse.microprofile.openapi.models.headers.Header;
import org.eclipse.microprofile.openapi.models.info.Contact;
import org.eclipse.microprofile.openapi.models.info.Info;
import org.eclipse.microprofile.openapi.models.info.License;
import org.eclipse.microprofile.openapi.models.links.Link;
import org.eclipse.microprofile.openapi.models.media.Content;
import org.eclipse.microprofile.openapi.models.media.Discriminator;
import org.eclipse.microprofile.openapi.models.media.Encoding;
import org.eclipse.microprofile.openapi.models.media.MediaType;
import org.eclipse.microprofile.openapi.models.media.Schema;
import org.eclipse.microprofile.openapi.models.media.XML;
import org.eclipse.microprofile.openapi.models.parameters.Parameter;
import org.eclipse.microprofile.openapi.models.parameters.RequestBody;
import org.eclipse.microprofile.openapi.models.responses.APIResponse;
import org.eclipse.microprofile.openapi.models.responses.APIResponses;
import org.eclipse.microprofile.openapi.models.security.OAuthFlow;
import org.eclipse.microprofile.openapi.models.security.OAuthFlows;
import org.eclipse.microprofile.openapi.models.security.Scopes;
import org.eclipse.microprofile.openapi.models.security.SecurityRequirement;
import org.eclipse.microprofile.openapi.models.security.SecurityScheme;
import org.eclipse.microprofile.openapi.models.servers.Server;
import org.eclipse.microprofile.openapi.models.servers.ServerVariable;
import org.eclipse.microprofile.openapi.models.servers.ServerVariables;
import org.eclipse.microprofile.openapi.models.tags.Tag;

import fr.jmini.empoa.specs.AdditionalMethod.Type;

public class OpenAPISpec {

    public static List<Class<?>> interfaces() {
        return Arrays.asList(
                org.eclipse.microprofile.openapi.models.Components.class,
                org.eclipse.microprofile.openapi.models.ExternalDocumentation.class,
                org.eclipse.microprofile.openapi.models.OpenAPI.class,
                org.eclipse.microprofile.openapi.models.Operation.class,
                org.eclipse.microprofile.openapi.models.PathItem.class,
                org.eclipse.microprofile.openapi.models.Paths.class,
                org.eclipse.microprofile.openapi.models.callbacks.Callback.class,
                org.eclipse.microprofile.openapi.models.examples.Example.class,
                org.eclipse.microprofile.openapi.models.headers.Header.class,
                org.eclipse.microprofile.openapi.models.info.Contact.class,
                org.eclipse.microprofile.openapi.models.info.Info.class,
                org.eclipse.microprofile.openapi.models.info.License.class,
                org.eclipse.microprofile.openapi.models.links.Link.class,
                org.eclipse.microprofile.openapi.models.media.Content.class,
                org.eclipse.microprofile.openapi.models.media.Discriminator.class,
                org.eclipse.microprofile.openapi.models.media.Encoding.class,
                org.eclipse.microprofile.openapi.models.media.MediaType.class,
                org.eclipse.microprofile.openapi.models.media.Schema.class,
                org.eclipse.microprofile.openapi.models.media.XML.class,
                org.eclipse.microprofile.openapi.models.parameters.Parameter.class,
                org.eclipse.microprofile.openapi.models.parameters.RequestBody.class,
                org.eclipse.microprofile.openapi.models.responses.APIResponse.class,
                org.eclipse.microprofile.openapi.models.responses.APIResponses.class,
                org.eclipse.microprofile.openapi.models.security.OAuthFlow.class,
                org.eclipse.microprofile.openapi.models.security.OAuthFlows.class,
                org.eclipse.microprofile.openapi.models.security.Scopes.class,
                org.eclipse.microprofile.openapi.models.security.SecurityRequirement.class,
                org.eclipse.microprofile.openapi.models.security.SecurityScheme.class,
                org.eclipse.microprofile.openapi.models.servers.Server.class,
                org.eclipse.microprofile.openapi.models.servers.ServerVariable.class,
                org.eclipse.microprofile.openapi.models.servers.ServerVariables.class,
                org.eclipse.microprofile.openapi.models.tags.Tag.class);
    }

    public static List<Element> elements() {
        List<Element> elements = new ArrayList<>();
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

    public static Element createComponents() {
        List<IMember> members = new ArrayList<>();
        members.add(new MapMember("Schemas", Schema.class.getCanonicalName()));
        members.add(new MapMember("Responses", APIResponse.class.getCanonicalName()));
        members.add(new MapMember("Parameters", Parameter.class.getCanonicalName()));
        members.add(new MapMember("Examples", Example.class.getCanonicalName()));
        members.add(new MapMember("RequestBodies", RequestBody.class.getCanonicalName()));
        members.add(new MapMember("Headers", Header.class.getCanonicalName()));
        members.add(new MapMember("SecuritySchemes", SecurityScheme.class.getCanonicalName()));
        members.add(new MapMember("Links", Link.class.getCanonicalName()));
        members.add(new MapMember("Callbacks", Callback.class.getCanonicalName()));
        return new Element(Components.class.getName(), true, false, members);
    }

    public static Element createExternalDocumentation() {
        List<IMember> members = new ArrayList<>();
        members.add(new Member("Description", String.class.getSimpleName()));
        members.add(new Member("Url", String.class.getSimpleName()));
        return new Element(ExternalDocumentation.class.getName(), true, false, members);
    }

    public static Element createOpenAPI() {
        List<IMember> members = new ArrayList<>();
        members.add(new Member("Openapi", String.class.getSimpleName()));
        members.add(new Member("Info", Info.class.getCanonicalName()));
        members.add(new Member("ExternalDocs", ExternalDocumentation.class.getCanonicalName()));
        members.add(new ListMember("Servers", Server.class.getCanonicalName()));
        members.add(new ListMember("Security", SecurityRequirement.class.getCanonicalName(), "addSecurityRequirement", "removeSecurityRequirement"));
        members.add(new ListMember("Tags", Tag.class.getCanonicalName()));
        members.add(new Member("Paths", Paths.class.getCanonicalName()));
        members.add(new AdditionalMethod(Type.OpenAPI_path));
        members.add(new Member("Components", Components.class.getCanonicalName()));
        return new Element(OpenAPI.class.getName(), true, false, members);
    }

    public static Element createOperation() {
        List<IMember> members = new ArrayList<>();
        members.add(new ListMember("Tags", String.class.getSimpleName()));
        members.add(new Member("Summary", String.class.getSimpleName()));
        members.add(new Member("Description", String.class.getSimpleName()));
        members.add(new Member("ExternalDocs", ExternalDocumentation.class.getCanonicalName()));
        members.add(new Member("OperationId", String.class.getSimpleName()));
        members.add(new ListMember("Parameters", Parameter.class.getCanonicalName()));
        members.add(new Member("RequestBody", RequestBody.class.getCanonicalName()));
        members.add(new Member("Responses", APIResponses.class.getCanonicalName()));
        members.add(new MapMember("Callbacks", Callback.class.getCanonicalName(), true, true));
        members.add(new Member("Deprecated", Boolean.class.getSimpleName()));
        members.add(new ListMember("Security", SecurityRequirement.class.getName(), "addSecurityRequirement", "removeSecurityRequirement"));
        members.add(new ListMember("Servers", Server.class.getCanonicalName()));
        return new Element(Operation.class.getName(), true, false, members);
    }

    public static Element createPathItem() {
        List<IMember> members = new ArrayList<>();
        members.add(new Member("Summary", String.class.getSimpleName()));
        members.add(new Member("Description", String.class.getSimpleName()));
        members.add(new Member("GET", Operation.class.getCanonicalName()));
        members.add(new Member("PUT", Operation.class.getCanonicalName()));
        members.add(new Member("POST", Operation.class.getCanonicalName()));
        members.add(new Member("DELETE", Operation.class.getCanonicalName()));
        members.add(new Member("OPTIONS", Operation.class.getCanonicalName()));
        members.add(new Member("HEAD", Operation.class.getCanonicalName()));
        members.add(new Member("PATCH", Operation.class.getCanonicalName()));
        members.add(new Member("TRACE", Operation.class.getCanonicalName()));
        members.add(new AdditionalMethod(Type.PathItem_getOperations));
        members.add(new ListMember("Servers", Server.class.getCanonicalName()));
        members.add(new ListMember("Parameters", Parameter.class.getCanonicalName()));
        return new Element(PathItem.class.getName(), true, true, members);
    }

    public static Element createPaths() {
        List<IMember> members = new ArrayList<>();
        return new Element(Paths.class.getName(), true, false, members, PathItem.class.getName());
    }

    public static Element createCallback() {
        List<IMember> members = new ArrayList<>();
        return new Element(Callback.class.getName(), true, true, members, PathItem.class.getName());
    }

    public static Element createExample() {
        List<IMember> members = new ArrayList<>();
        members.add(new Member("Summary", String.class.getSimpleName()));
        members.add(new Member("Description", String.class.getSimpleName()));
        members.add(new Member("Value", Object.class.getSimpleName()));
        members.add(new Member("ExternalValue", String.class.getSimpleName()));
        return new Element(Example.class.getName(), true, true, members);
    }

    public static Element createHeader() {
        List<IMember> members = new ArrayList<>();
        members.add(new Member("Description", String.class.getSimpleName()));
        members.add(new Member("Required", Boolean.class.getSimpleName()));
        members.add(new Member("Deprecated", Boolean.class.getSimpleName()));
        members.add(new Member("AllowEmptyValue", Boolean.class.getSimpleName()));
        members.add(new Member("Style", Header.Style.class.getCanonicalName()));
        members.add(new Member("Explode", Boolean.class.getSimpleName()));
        members.add(new Member("Schema", Schema.class.getCanonicalName()));
        members.add(new MapMember("Examples", Example.class.getCanonicalName()));
        members.add(new Member("Example", Object.class.getSimpleName()));
        members.add(new Member("Content", Content.class.getCanonicalName()));
        return new Element(Header.class.getName(), true, true, members);
    }

    public static Element createContact() {
        List<IMember> members = new ArrayList<>();
        members.add(new Member("Name", String.class.getSimpleName()));
        members.add(new Member("Url", String.class.getSimpleName()));
        members.add(new Member("Email", String.class.getSimpleName()));
        return new Element(Contact.class.getName(), true, false, members);
    }

    public static Element createInfo() {
        List<IMember> members = new ArrayList<>();
        members.add(new Member("Title", String.class.getSimpleName()));
        members.add(new Member("Description", String.class.getSimpleName()));
        members.add(new Member("TermsOfService", String.class.getSimpleName()));
        members.add(new Member("Contact", Contact.class.getCanonicalName()));
        members.add(new Member("License", License.class.getCanonicalName()));
        members.add(new Member("Version", String.class.getSimpleName()));
        return new Element(Info.class.getName(), true, false, members);
    }

    public static Element createLicense() {
        List<IMember> members = new ArrayList<>();
        members.add(new Member("Name", String.class.getSimpleName()));
        members.add(new Member("Url", String.class.getSimpleName()));
        return new Element(License.class.getName(), true, false, members);
    }

    public static Element createLink() {
        List<IMember> members = new ArrayList<>();
        members.add(new Member("Server", Server.class.getCanonicalName()));
        members.add(new Member("OperationRef", String.class.getSimpleName()));
        members.add(new Member("RequestBody", Object.class.getSimpleName()));
        members.add(new Member("OperationId", String.class.getSimpleName()));
        members.add(new MapMember("Parameters", Object.class.getSimpleName()));
        members.add(new Member("Description", String.class.getSimpleName()));
        return new Element(Link.class.getName(), true, true, members);
    }

    public static Element createContent() {
        List<IMember> members = new ArrayList<>();
        return new Element(Content.class.getName(), false, false, members, MediaType.class.getName());
    }

    public static Element createDiscriminator() {
        List<IMember> members = new ArrayList<>();
        members.add(new Member("PropertyName", String.class.getSimpleName()));
        members.add(new MapMember("Mapping", String.class.getSimpleName()));
        return new Element(Discriminator.class.getName(), false, false, members);
    }

    public static Element createEncoding() {
        List<IMember> members = new ArrayList<>();
        members.add(new Member("ContentType", String.class.getSimpleName()));
        members.add(new MapMember("Headers", Header.class.getName(), true, true));
        members.add(new Member("Style", Encoding.Style.class.getCanonicalName()));
        members.add(new Member("Explode", Boolean.class.getSimpleName()));
        members.add(new Member("AllowReserved", Boolean.class.getSimpleName()));
        return new Element(Encoding.class.getName(), true, false, members);
    }

    public static Element createMediaType() {
        List<IMember> members = new ArrayList<>();
        members.add(new Member("Schema", Schema.class.getCanonicalName()));
        members.add(new MapMember("Examples", Example.class.getCanonicalName()));
        members.add(new Member("Example", Object.class.getSimpleName()));
        members.add(new MapMember("Encoding", Encoding.class.getCanonicalName()));
        return new Element(MediaType.class.getName(), true, false, members);
    }

    public static Element createSchema() {
        List<IMember> members = new ArrayList<>();
        members.add(new Member("Discriminator", Discriminator.class.getCanonicalName()));
        members.add(new Member("Title", String.class.getSimpleName()));
        members.add(new Member("DefaultValue", Object.class.getSimpleName()));
        members.add(new ListMember("Enumeration", Object.class.getSimpleName()));
        members.add(new Member("MultipleOf", BigDecimal.class.getCanonicalName()));
        members.add(new Member("Maximum", BigDecimal.class.getCanonicalName()));
        members.add(new Member("ExclusiveMaximum", Boolean.class.getSimpleName()));
        members.add(new Member("Minimum", BigDecimal.class.getCanonicalName()));
        members.add(new Member("ExclusiveMinimum", Boolean.class.getSimpleName()));
        members.add(new Member("MaxLength", Integer.class.getSimpleName()));
        members.add(new Member("MinLength", Integer.class.getSimpleName()));
        members.add(new Member("Pattern", String.class.getSimpleName()));
        members.add(new Member("MaxItems", Integer.class.getSimpleName()));
        members.add(new Member("MinItems", Integer.class.getSimpleName()));
        members.add(new Member("UniqueItems", Boolean.class.getSimpleName()));
        members.add(new Member("MaxProperties", Integer.class.getSimpleName()));
        members.add(new Member("MinProperties", Integer.class.getSimpleName()));
        members.add(new ListMember("Required", String.class.getSimpleName()));
        members.add(new Member("Type", Schema.SchemaType.class.getSimpleName()));
        members.add(new Member("Not", Schema.class.getCanonicalName()));
        members.add(new MapMember("Properties", Schema.class.getCanonicalName()));
        members.add(new Member("AdditionalPropertiesSchema", Schema.class.getCanonicalName(), true, true, false, true));
        members.add(new AdditionalMethod(Type.Schema_setAdditionalPropertiesSchema));
        members.add(new Member("AdditionalPropertiesBoolean", Boolean.class.getSimpleName(), true, true, false, true));
        members.add(new AdditionalMethod(Type.Schema_setAdditionalPropertiesBoolean));
        members.add(new Member("Description", String.class.getSimpleName()));
        members.add(new Member("Format", String.class.getSimpleName()));
        members.add(new Member("Nullable", Boolean.class.getSimpleName()));
        members.add(new Member("ReadOnly", Boolean.class.getSimpleName()));
        members.add(new Member("WriteOnly", Boolean.class.getSimpleName()));
        members.add(new Member("Example", Object.class.getSimpleName()));
        members.add(new Member("ExternalDocs", ExternalDocumentation.class.getCanonicalName()));
        members.add(new Member("Deprecated", Boolean.class.getSimpleName()));
        members.add(new Member("Xml", XML.class.getCanonicalName()));
        members.add(new Member("Items", Schema.class.getCanonicalName()));
        members.add(new ListMember("AllOf", Schema.class.getCanonicalName()));
        members.add(new ListMember("AnyOf", Schema.class.getCanonicalName()));
        members.add(new ListMember("OneOf", Schema.class.getCanonicalName()));
        return new Element(Schema.class.getName(), true, true, members);
    }

    public static Element createXML() {
        List<IMember> members = new ArrayList<>();
        members.add(new Member("Name", String.class.getSimpleName()));
        members.add(new Member("Namespace", String.class.getSimpleName()));
        members.add(new Member("Prefix", String.class.getSimpleName()));
        members.add(new Member("Attribute", Boolean.class.getSimpleName()));
        members.add(new Member("Wrapped", Boolean.class.getSimpleName()));
        return new Element(XML.class.getName(), true, false, members);
    }

    public static Element createParameter() {
        List<IMember> members = new ArrayList<>();
        members.add(new Member("Name", String.class.getSimpleName()));
        members.add(new Member("In", Parameter.In.class.getSimpleName()));
        members.add(new Member("Description", String.class.getSimpleName()));
        members.add(new Member("Required", Boolean.class.getSimpleName()));
        members.add(new Member("Deprecated", Boolean.class.getSimpleName()));
        members.add(new Member("AllowEmptyValue", Boolean.class.getSimpleName()));
        members.add(new Member("Style", Parameter.Style.class.getCanonicalName()));
        members.add(new Member("Explode", Boolean.class.getSimpleName()));
        members.add(new Member("AllowReserved", Boolean.class.getSimpleName()));
        members.add(new Member("Schema", Schema.class.getCanonicalName()));
        members.add(new MapMember("Examples", Example.class.getCanonicalName()));
        members.add(new Member("Example", Object.class.getSimpleName()));
        members.add(new Member("Content", Content.class.getCanonicalName()));
        return new Element(Parameter.class.getName(), true, true, members);
    }

    public static Element createRequestBody() {
        List<IMember> members = new ArrayList<>();
        members.add(new Member("Description", String.class.getSimpleName()));
        members.add(new Member("Content", Content.class.getCanonicalName()));
        members.add(new Member("Required", Boolean.class.getSimpleName()));
        return new Element(RequestBody.class.getName(), true, true, members);
    }

    public static Element createAPIResponse() {
        List<IMember> members = new ArrayList<>();
        members.add(new Member("Description", String.class.getSimpleName()));
        members.add(new MapMember("Headers", Header.class.getCanonicalName()));
        members.add(new Member("Content", Content.class.getCanonicalName()));
        members.add(new MapMember("Links", Link.class.getCanonicalName()));
        return new Element(APIResponse.class.getName(), true, true, members);
    }

    public static Element createAPIResponses() {
        List<IMember> members = new ArrayList<>();
        members.add(new Member("DefaultValue", APIResponse.class.getCanonicalName(), "getDefault"));
        return new Element(APIResponses.class.getName(), true, false, members, APIResponse.class.getCanonicalName(), "addAPIResponse");
    }

    public static Element createOAuthFlow() {
        List<IMember> members = new ArrayList<>();
        members.add(new Member("AuthorizationUrl", String.class.getSimpleName()));
        members.add(new Member("TokenUrl", String.class.getSimpleName()));
        members.add(new Member("RefreshUrl", String.class.getSimpleName()));
        members.add(new Member("Scopes", Scopes.class.getCanonicalName()));
        return new Element(OAuthFlow.class.getName(), true, false, members);
    }

    public static Element createOAuthFlows() {
        List<IMember> members = new ArrayList<>();
        members.add(new Member("Implicit", OAuthFlow.class.getCanonicalName()));
        members.add(new Member("Password", OAuthFlow.class.getCanonicalName()));
        members.add(new Member("ClientCredentials", OAuthFlow.class.getCanonicalName()));
        members.add(new Member("AuthorizationCode", OAuthFlow.class.getCanonicalName()));
        return new Element(OAuthFlows.class.getName(), true, false, members);
    }

    public static Element createScopes() {
        List<IMember> members = new ArrayList<>();
        return new Element(Scopes.class.getName(), true, false, members, String.class.getSimpleName(), "addScope");
    }

    public static Element createSecurityRequirement() {
        List<IMember> members = new ArrayList<>();
        members.add(new AdditionalMethod(Type.SecurityRequirement_addScheme_singleton));
        members.add(new AdditionalMethod(Type.SecurityRequirement_addScheme_empty));
        return new Element(SecurityRequirement.class.getName(), false, false, members, "java.util.List<String>", "addScheme");
    }

    public static Element createSecurityScheme() {
        List<IMember> members = new ArrayList<>();
        members.add(new Member("Type", SecurityScheme.Type.class.getCanonicalName()));
        members.add(new Member("Description", String.class.getSimpleName()));
        members.add(new Member("Name", String.class.getSimpleName()));
        members.add(new Member("In", SecurityScheme.In.class.getCanonicalName()));
        members.add(new Member("Scheme", String.class.getSimpleName()));
        members.add(new Member("BearerFormat", String.class.getSimpleName()));
        members.add(new Member("Flows", OAuthFlows.class.getCanonicalName()));
        members.add(new Member("OpenIdConnectUrl", String.class.getSimpleName()));
        return new Element(SecurityScheme.class.getName(), true, true, members);
    }

    public static Element createServer() {
        List<IMember> members = new ArrayList<>();
        members.add(new Member("Url", String.class.getSimpleName()));
        members.add(new Member("Description", String.class.getSimpleName()));
        members.add(new Member("Variables", ServerVariables.class.getCanonicalName()));
        return new Element(Server.class.getName(), true, false, members);
    }

    public static Element createServerVariable() {
        List<IMember> members = new ArrayList<>();
        members.add(new ListMember("Enumeration", String.class.getSimpleName()));
        members.add(new Member("DefaultValue", String.class.getSimpleName()));
        members.add(new Member("Description", String.class.getSimpleName()));
        return new Element(ServerVariable.class.getName(), true, false, members);
    }

    public static Element createServerVariables() {
        List<IMember> members = new ArrayList<>();
        return new Element(ServerVariables.class.getName(), true, false, members, ServerVariable.class.getName());
    }

    public static Element createTag() {
        List<IMember> members = new ArrayList<>();
        members.add(new Member("Name", String.class.getSimpleName()));
        members.add(new Member("Description", String.class.getSimpleName()));
        members.add(new Member("ExternalDocs", ExternalDocumentation.class.getCanonicalName()));
        return new Element(Tag.class.getName(), true, false, members);
    }
}
