package fr.jmini.empoa.extended.tck.specs;

import static org.eclipse.microprofile.openapi.OASFactory.*;

import org.eclipse.microprofile.openapi.models.Components;
import org.eclipse.microprofile.openapi.models.OpenAPI;
import org.eclipse.microprofile.openapi.models.Operation;
import org.eclipse.microprofile.openapi.models.PathItem;
import org.eclipse.microprofile.openapi.models.Paths;
import org.eclipse.microprofile.openapi.models.info.Contact;
import org.eclipse.microprofile.openapi.models.info.Info;
import org.eclipse.microprofile.openapi.models.info.License;
import org.eclipse.microprofile.openapi.models.media.Content;
import org.eclipse.microprofile.openapi.models.media.MediaType;
import org.eclipse.microprofile.openapi.models.media.Schema;
import org.eclipse.microprofile.openapi.models.parameters.Parameter;
import org.eclipse.microprofile.openapi.models.responses.APIResponse;
import org.eclipse.microprofile.openapi.models.responses.APIResponses;
import org.eclipse.microprofile.openapi.models.servers.Server;

public final class HelloSpec {
    public static OpenAPI create() {
        return createObject(OpenAPI.class)
                .openapi("3.0.1")
                .info(
                        createObject(Info.class)
                                .title("Hello Specification")
                                .description("This specification says Hello")
                                .termsOfService("http://example.com/terms/")
                                .contact(
                                        createObject(Contact.class)
                                                .name("Support")
                                                .url("http://www.example.com/support/")
                                                .email("support@example.com")
                                )
                                .license(
                                        createObject(License.class)
                                                .name("Apache 2.0")
                                                .url("https://www.apache.org/licenses/LICENSE-2.0.html")
                                )
                                .version("1.0")
                )
                .addServer(
                        createObject(Server.class)
                                .url("http://api.example.com/")
                                .description("Main server")
                )
                .addServer(
                        createObject(Server.class)
                                .url("http://api.example.io/")
                                .description("Secondary server")
                )
                .paths(
                        createObject(Paths.class)
                                .addPathItem(
                                        "/hello/{name}", createObject(PathItem.class)
                                                .GET(
                                                        createObject(Operation.class)
                                                                .summary("Retun an hello object")
                                                                .operationId("hello")
                                                                .addParameter(
                                                                        createObject(Parameter.class)
                                                                                .name("name")
                                                                                .in(Parameter.In.PATH)
                                                                                .required(true)
                                                                                .schema(
                                                                                        createObject(Schema.class)
                                                                                                .type(Schema.SchemaType.STRING)
                                                                                )
                                                                )
                                                                .addParameter(
                                                                        createObject(Parameter.class)
                                                                                .name("language")
                                                                                .in(Parameter.In.QUERY)
                                                                                .description("Language used to say hello")
                                                                                .schema(
                                                                                        createObject(Schema.class)
                                                                                                .addEnumeration("english")
                                                                                                .addEnumeration("french")
                                                                                                .addEnumeration("german")
                                                                                                .addEnumeration("italian")
                                                                                                .type(Schema.SchemaType.STRING)
                                                                                )
                                                                )
                                                                .responses(
                                                                        createObject(APIResponses.class)
                                                                                .addApiResponse(
                                                                                        "200", createObject(APIResponse.class)
                                                                                                .description("OK")
                                                                                                .content(
                                                                                                        createObject(Content.class)
                                                                                                                .addMediaType(
                                                                                                                        "application/text", createObject(MediaType.class)
                                                                                                                                .schema(
                                                                                                                                        createObject(Schema.class)
                                                                                                                                                .type(Schema.SchemaType.STRING)
                                                                                                                                )
                                                                                                                )
                                                                                                                .addMediaType(
                                                                                                                        "application/json", createObject(MediaType.class)
                                                                                                                                .schema(
                                                                                                                                        createObject(Schema.class)
                                                                                                                                                .ref("#/components/schemas/Hello")
                                                                                                                                )
                                                                                                                )
                                                                                                                .addMediaType(
                                                                                                                        "application/xml", createObject(MediaType.class)
                                                                                                                                .schema(
                                                                                                                                        createObject(Schema.class)
                                                                                                                                                .ref("#/components/schemas/Hello")
                                                                                                                                )
                                                                                                                )
                                                                                                )
                                                                                )
                                                                                .addApiResponse(
                                                                                        "4XX", createObject(APIResponse.class)
                                                                                                .description("Error")
                                                                                                .content(
                                                                                                        createObject(Content.class)
                                                                                                                .addMediaType(
                                                                                                                        "*/*", createObject(MediaType.class)
                                                                                                                                .schema(
                                                                                                                                        createObject(Schema.class)
                                                                                                                                                .ref("#/components/schemas/Error")
                                                                                                                                )
                                                                                                                )
                                                                                                )
                                                                                )
                                                                )
                                                )
                                )
                )
                .components(
                        createObject(Components.class)
                                .addSchema(
                                        "Hello", createObject(Schema.class)
                                                .type(Schema.SchemaType.OBJECT)
                                                .addProperty(
                                                        "timestamp", createObject(Schema.class)
                                                                .type(Schema.SchemaType.INTEGER)
                                                                .description("Unix timestamp (generation time)")
                                                                .format("int32")
                                                )
                                                .addProperty(
                                                        "message", createObject(Schema.class)
                                                                .type(Schema.SchemaType.STRING)
                                                )
                                )
                                .addSchema(
                                        "Error", createObject(Schema.class)
                                                .type(Schema.SchemaType.OBJECT)
                                                .addProperty(
                                                        "code", createObject(Schema.class)
                                                                .type(Schema.SchemaType.INTEGER)
                                                                .format("int32")
                                                )
                                                .addProperty(
                                                        "message", createObject(Schema.class)
                                                                .type(Schema.SchemaType.STRING)
                                                )
                                )
                );
    }
}