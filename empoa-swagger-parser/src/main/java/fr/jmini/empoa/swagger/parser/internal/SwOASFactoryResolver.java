package fr.jmini.empoa.swagger.parser.internal;

public class SwOASFactoryResolver extends org.eclipse.microprofile.openapi.spi.OASFactoryResolver {

    @Override
    @SuppressWarnings("unchecked")
    public <T extends org.eclipse.microprofile.openapi.models.Constructible> T createObject(Class<T> clazz) {
        T instance;
        if (clazz == null) {
            throw new IllegalArgumentException("Class can not be null");
        } else if (clazz == org.eclipse.microprofile.openapi.models.Components.class) {
            instance = (T) new fr.jmini.empoa.swagger.parser.internal.models.SwComponents();
        } else if (clazz == org.eclipse.microprofile.openapi.models.ExternalDocumentation.class) {
            instance = (T) new fr.jmini.empoa.swagger.parser.internal.models.SwExternalDocumentation();
        } else if (clazz == org.eclipse.microprofile.openapi.models.OpenAPI.class) {
            instance = (T) new fr.jmini.empoa.swagger.parser.internal.models.SwOpenAPI();
        } else if (clazz == org.eclipse.microprofile.openapi.models.Operation.class) {
            instance = (T) new fr.jmini.empoa.swagger.parser.internal.models.SwOperation();
        } else if (clazz == org.eclipse.microprofile.openapi.models.PathItem.class) {
            instance = (T) new fr.jmini.empoa.swagger.parser.internal.models.SwPathItem();
        } else if (clazz == org.eclipse.microprofile.openapi.models.Paths.class) {
            instance = (T) new fr.jmini.empoa.swagger.parser.internal.models.SwPaths();
        } else if (clazz == org.eclipse.microprofile.openapi.models.callbacks.Callback.class) {
            instance = (T) new fr.jmini.empoa.swagger.parser.internal.models.callbacks.SwCallback();
        } else if (clazz == org.eclipse.microprofile.openapi.models.examples.Example.class) {
            instance = (T) new fr.jmini.empoa.swagger.parser.internal.models.examples.SwExample();
        } else if (clazz == org.eclipse.microprofile.openapi.models.headers.Header.class) {
            instance = (T) new fr.jmini.empoa.swagger.parser.internal.models.headers.SwHeader();
        } else if (clazz == org.eclipse.microprofile.openapi.models.info.Contact.class) {
            instance = (T) new fr.jmini.empoa.swagger.parser.internal.models.info.SwContact();
        } else if (clazz == org.eclipse.microprofile.openapi.models.info.Info.class) {
            instance = (T) new fr.jmini.empoa.swagger.parser.internal.models.info.SwInfo();
        } else if (clazz == org.eclipse.microprofile.openapi.models.info.License.class) {
            instance = (T) new fr.jmini.empoa.swagger.parser.internal.models.info.SwLicense();
        } else if (clazz == org.eclipse.microprofile.openapi.models.links.Link.class) {
            instance = (T) new fr.jmini.empoa.swagger.parser.internal.models.links.SwLink();
        } else if (clazz == org.eclipse.microprofile.openapi.models.media.Content.class) {
            instance = (T) new fr.jmini.empoa.swagger.parser.internal.models.media.SwContent();
        } else if (clazz == org.eclipse.microprofile.openapi.models.media.Discriminator.class) {
            instance = (T) new fr.jmini.empoa.swagger.parser.internal.models.media.SwDiscriminator();
        } else if (clazz == org.eclipse.microprofile.openapi.models.media.Encoding.class) {
            instance = (T) new fr.jmini.empoa.swagger.parser.internal.models.media.SwEncoding();
        } else if (clazz == org.eclipse.microprofile.openapi.models.media.MediaType.class) {
            instance = (T) new fr.jmini.empoa.swagger.parser.internal.models.media.SwMediaType();
        } else if (clazz == org.eclipse.microprofile.openapi.models.media.Schema.class) {
            instance = (T) new fr.jmini.empoa.swagger.parser.internal.models.media.SwSchema();
        } else if (clazz == org.eclipse.microprofile.openapi.models.media.XML.class) {
            instance = (T) new fr.jmini.empoa.swagger.parser.internal.models.media.SwXML();
        } else if (clazz == org.eclipse.microprofile.openapi.models.parameters.Parameter.class) {
            instance = (T) new fr.jmini.empoa.swagger.parser.internal.models.parameters.SwParameter();
        } else if (clazz == org.eclipse.microprofile.openapi.models.parameters.RequestBody.class) {
            instance = (T) new fr.jmini.empoa.swagger.parser.internal.models.parameters.SwRequestBody();
        } else if (clazz == org.eclipse.microprofile.openapi.models.responses.APIResponse.class) {
            instance = (T) new fr.jmini.empoa.swagger.parser.internal.models.responses.SwAPIResponse();
        } else if (clazz == org.eclipse.microprofile.openapi.models.responses.APIResponses.class) {
            instance = (T) new fr.jmini.empoa.swagger.parser.internal.models.responses.SwAPIResponses();
        } else if (clazz == org.eclipse.microprofile.openapi.models.security.OAuthFlow.class) {
            instance = (T) new fr.jmini.empoa.swagger.parser.internal.models.security.SwOAuthFlow();
        } else if (clazz == org.eclipse.microprofile.openapi.models.security.OAuthFlows.class) {
            instance = (T) new fr.jmini.empoa.swagger.parser.internal.models.security.SwOAuthFlows();
        } else if (clazz == org.eclipse.microprofile.openapi.models.security.Scopes.class) {
            instance = (T) new fr.jmini.empoa.swagger.parser.internal.models.security.SwScopes();
        } else if (clazz == org.eclipse.microprofile.openapi.models.security.SecurityRequirement.class) {
            instance = (T) new fr.jmini.empoa.swagger.parser.internal.models.security.SwSecurityRequirement();
        } else if (clazz == org.eclipse.microprofile.openapi.models.security.SecurityScheme.class) {
            instance = (T) new fr.jmini.empoa.swagger.parser.internal.models.security.SwSecurityScheme();
        } else if (clazz == org.eclipse.microprofile.openapi.models.servers.Server.class) {
            instance = (T) new fr.jmini.empoa.swagger.parser.internal.models.servers.SwServer();
        } else if (clazz == org.eclipse.microprofile.openapi.models.servers.ServerVariable.class) {
            instance = (T) new fr.jmini.empoa.swagger.parser.internal.models.servers.SwServerVariable();
        } else if (clazz == org.eclipse.microprofile.openapi.models.servers.ServerVariables.class) {
            instance = (T) new fr.jmini.empoa.swagger.parser.internal.models.servers.SwServerVariables();
        } else if (clazz == org.eclipse.microprofile.openapi.models.tags.Tag.class) {
            instance = (T) new fr.jmini.empoa.swagger.parser.internal.models.tags.SwTag();
        } else {
            throw new IllegalArgumentException("Can not create " + clazz.getCanonicalName());
        }
        return instance;
    }

}
