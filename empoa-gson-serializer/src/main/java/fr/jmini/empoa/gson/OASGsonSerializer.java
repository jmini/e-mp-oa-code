package fr.jmini.empoa.gson;

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

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import fr.jmini.empoa.gson.intermal.serializers.ComponentsSerializer;
import fr.jmini.empoa.gson.intermal.serializers.ExternalDocumentationSerializer;
import fr.jmini.empoa.gson.intermal.serializers.OpenAPISerializer;
import fr.jmini.empoa.gson.intermal.serializers.OperationSerializer;
import fr.jmini.empoa.gson.intermal.serializers.PathItemSerializer;
import fr.jmini.empoa.gson.intermal.serializers.PathsSerializer;
import fr.jmini.empoa.gson.intermal.serializers.callbacks.CallbackSerializer;
import fr.jmini.empoa.gson.intermal.serializers.examples.ExampleSerializer;
import fr.jmini.empoa.gson.intermal.serializers.headers.HeaderSerializer;
import fr.jmini.empoa.gson.intermal.serializers.info.ContactSerializer;
import fr.jmini.empoa.gson.intermal.serializers.info.InfoSerializer;
import fr.jmini.empoa.gson.intermal.serializers.info.LicenseSerializer;
import fr.jmini.empoa.gson.intermal.serializers.links.LinkSerializer;
import fr.jmini.empoa.gson.intermal.serializers.media.ContentSerializer;
import fr.jmini.empoa.gson.intermal.serializers.media.DiscriminatorSerializer;
import fr.jmini.empoa.gson.intermal.serializers.media.EncodingSerializer;
import fr.jmini.empoa.gson.intermal.serializers.media.MediaTypeSerializer;
import fr.jmini.empoa.gson.intermal.serializers.media.SchemaSerializer;
import fr.jmini.empoa.gson.intermal.serializers.media.XMLSerializer;
import fr.jmini.empoa.gson.intermal.serializers.parameters.ParameterSerializer;
import fr.jmini.empoa.gson.intermal.serializers.parameters.RequestBodySerializer;
import fr.jmini.empoa.gson.intermal.serializers.responses.APIResponseSerializer;
import fr.jmini.empoa.gson.intermal.serializers.responses.APIResponsesSerializer;
import fr.jmini.empoa.gson.intermal.serializers.security.OAuthFlowSerializer;
import fr.jmini.empoa.gson.intermal.serializers.security.OAuthFlowsSerializer;
import fr.jmini.empoa.gson.intermal.serializers.security.ScopesSerializer;
import fr.jmini.empoa.gson.intermal.serializers.security.SecurityRequirementSerializer;
import fr.jmini.empoa.gson.intermal.serializers.security.SecuritySchemeSerializer;
import fr.jmini.empoa.gson.intermal.serializers.servers.ServerSerializer;
import fr.jmini.empoa.gson.intermal.serializers.servers.ServerVariableSerializer;
import fr.jmini.empoa.gson.intermal.serializers.servers.ServerVariablesSerializer;
import fr.jmini.empoa.gson.intermal.serializers.tags.TagSerializer;

public class OASGsonSerializer {

    public static Gson instance() {
        return new GsonBuilder()
                .registerTypeHierarchyAdapter(Components.class, new ComponentsSerializer())
                .registerTypeHierarchyAdapter(ExternalDocumentation.class, new ExternalDocumentationSerializer())
                .registerTypeHierarchyAdapter(OpenAPI.class, new OpenAPISerializer())
                .registerTypeHierarchyAdapter(Operation.class, new OperationSerializer())
                .registerTypeHierarchyAdapter(PathItem.class, new PathItemSerializer())
                .registerTypeHierarchyAdapter(Paths.class, new PathsSerializer())
                .registerTypeHierarchyAdapter(Callback.class, new CallbackSerializer())
                .registerTypeHierarchyAdapter(Example.class, new ExampleSerializer())
                .registerTypeHierarchyAdapter(Header.class, new HeaderSerializer())
                .registerTypeHierarchyAdapter(Contact.class, new ContactSerializer())
                .registerTypeHierarchyAdapter(Info.class, new InfoSerializer())
                .registerTypeHierarchyAdapter(License.class, new LicenseSerializer())
                .registerTypeHierarchyAdapter(Link.class, new LinkSerializer())
                .registerTypeHierarchyAdapter(Content.class, new ContentSerializer())
                .registerTypeHierarchyAdapter(Discriminator.class, new DiscriminatorSerializer())
                .registerTypeHierarchyAdapter(Encoding.class, new EncodingSerializer())
                .registerTypeHierarchyAdapter(MediaType.class, new MediaTypeSerializer())
                .registerTypeHierarchyAdapter(Schema.class, new SchemaSerializer())
                .registerTypeHierarchyAdapter(XML.class, new XMLSerializer())
                .registerTypeHierarchyAdapter(Parameter.class, new ParameterSerializer())
                .registerTypeHierarchyAdapter(RequestBody.class, new RequestBodySerializer())
                .registerTypeHierarchyAdapter(APIResponse.class, new APIResponseSerializer())
                .registerTypeHierarchyAdapter(APIResponses.class, new APIResponsesSerializer())
                .registerTypeHierarchyAdapter(OAuthFlow.class, new OAuthFlowSerializer())
                .registerTypeHierarchyAdapter(OAuthFlows.class, new OAuthFlowsSerializer())
                .registerTypeHierarchyAdapter(Scopes.class, new ScopesSerializer())
                .registerTypeHierarchyAdapter(SecurityRequirement.class, new SecurityRequirementSerializer())
                .registerTypeHierarchyAdapter(SecurityScheme.class, new SecuritySchemeSerializer())
                .registerTypeHierarchyAdapter(Server.class, new ServerSerializer())
                .registerTypeHierarchyAdapter(ServerVariable.class, new ServerVariableSerializer())
                .registerTypeHierarchyAdapter(ServerVariables.class, new ServerVariablesSerializer())
                .registerTypeHierarchyAdapter(Tag.class, new TagSerializer())
                .setPrettyPrinting()
                .create();
    }
}
