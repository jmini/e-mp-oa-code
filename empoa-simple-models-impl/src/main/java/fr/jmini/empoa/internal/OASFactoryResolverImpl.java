package fr.jmini.empoa.internal;

public class OASFactoryResolverImpl extends org.eclipse.microprofile.openapi.spi.OASFactoryResolver {

    @Override
    @SuppressWarnings("unchecked")
    public <T extends org.eclipse.microprofile.openapi.models.Constructible> T createObject(Class<T> clazz) {
        T instance;
        if (clazz == null) {
            throw new IllegalArgumentException("Class can not be null");
        } else if (clazz == org.eclipse.microprofile.openapi.models.Components.class) {
            instance = (T) new fr.jmini.empoa.internal.models.ComponentsImpl();
        } else if (clazz == org.eclipse.microprofile.openapi.models.ExternalDocumentation.class) {
            instance = (T) new fr.jmini.empoa.internal.models.ExternalDocumentationImpl();
        } else if (clazz == org.eclipse.microprofile.openapi.models.OpenAPI.class) {
            instance = (T) new fr.jmini.empoa.internal.models.OpenAPIImpl();
        } else if (clazz == org.eclipse.microprofile.openapi.models.Operation.class) {
            instance = (T) new fr.jmini.empoa.internal.models.OperationImpl();
        } else if (clazz == org.eclipse.microprofile.openapi.models.PathItem.class) {
            instance = (T) new fr.jmini.empoa.internal.models.PathItemImpl();
        } else if (clazz == org.eclipse.microprofile.openapi.models.Paths.class) {
            instance = (T) new fr.jmini.empoa.internal.models.PathsImpl();
        } else if (clazz == org.eclipse.microprofile.openapi.models.callbacks.Callback.class) {
            instance = (T) new fr.jmini.empoa.internal.models.callbacks.CallbackImpl();
        } else if (clazz == org.eclipse.microprofile.openapi.models.examples.Example.class) {
            instance = (T) new fr.jmini.empoa.internal.models.examples.ExampleImpl();
        } else if (clazz == org.eclipse.microprofile.openapi.models.headers.Header.class) {
            instance = (T) new fr.jmini.empoa.internal.models.headers.HeaderImpl();
        } else if (clazz == org.eclipse.microprofile.openapi.models.info.Contact.class) {
            instance = (T) new fr.jmini.empoa.internal.models.info.ContactImpl();
        } else if (clazz == org.eclipse.microprofile.openapi.models.info.Info.class) {
            instance = (T) new fr.jmini.empoa.internal.models.info.InfoImpl();
        } else if (clazz == org.eclipse.microprofile.openapi.models.info.License.class) {
            instance = (T) new fr.jmini.empoa.internal.models.info.LicenseImpl();
        } else if (clazz == org.eclipse.microprofile.openapi.models.links.Link.class) {
            instance = (T) new fr.jmini.empoa.internal.models.links.LinkImpl();
        } else if (clazz == org.eclipse.microprofile.openapi.models.media.Content.class) {
            instance = (T) new fr.jmini.empoa.internal.models.media.ContentImpl();
        } else if (clazz == org.eclipse.microprofile.openapi.models.media.Discriminator.class) {
            instance = (T) new fr.jmini.empoa.internal.models.media.DiscriminatorImpl();
        } else if (clazz == org.eclipse.microprofile.openapi.models.media.Encoding.class) {
            instance = (T) new fr.jmini.empoa.internal.models.media.EncodingImpl();
        } else if (clazz == org.eclipse.microprofile.openapi.models.media.MediaType.class) {
            instance = (T) new fr.jmini.empoa.internal.models.media.MediaTypeImpl();
        } else if (clazz == org.eclipse.microprofile.openapi.models.media.Schema.class) {
            instance = (T) new fr.jmini.empoa.internal.models.media.SchemaImpl();
        } else if (clazz == org.eclipse.microprofile.openapi.models.media.XML.class) {
            instance = (T) new fr.jmini.empoa.internal.models.media.XMLImpl();
        } else if (clazz == org.eclipse.microprofile.openapi.models.parameters.Parameter.class) {
            instance = (T) new fr.jmini.empoa.internal.models.parameters.ParameterImpl();
        } else if (clazz == org.eclipse.microprofile.openapi.models.parameters.RequestBody.class) {
            instance = (T) new fr.jmini.empoa.internal.models.parameters.RequestBodyImpl();
        } else if (clazz == org.eclipse.microprofile.openapi.models.responses.APIResponse.class) {
            instance = (T) new fr.jmini.empoa.internal.models.responses.APIResponseImpl();
        } else if (clazz == org.eclipse.microprofile.openapi.models.responses.APIResponses.class) {
            instance = (T) new fr.jmini.empoa.internal.models.responses.APIResponsesImpl();
        } else if (clazz == org.eclipse.microprofile.openapi.models.security.OAuthFlow.class) {
            instance = (T) new fr.jmini.empoa.internal.models.security.OAuthFlowImpl();
        } else if (clazz == org.eclipse.microprofile.openapi.models.security.OAuthFlows.class) {
            instance = (T) new fr.jmini.empoa.internal.models.security.OAuthFlowsImpl();
        } else if (clazz == org.eclipse.microprofile.openapi.models.security.Scopes.class) {
            instance = (T) new fr.jmini.empoa.internal.models.security.ScopesImpl();
        } else if (clazz == org.eclipse.microprofile.openapi.models.security.SecurityRequirement.class) {
            instance = (T) new fr.jmini.empoa.internal.models.security.SecurityRequirementImpl();
        } else if (clazz == org.eclipse.microprofile.openapi.models.security.SecurityScheme.class) {
            instance = (T) new fr.jmini.empoa.internal.models.security.SecuritySchemeImpl();
        } else if (clazz == org.eclipse.microprofile.openapi.models.servers.Server.class) {
            instance = (T) new fr.jmini.empoa.internal.models.servers.ServerImpl();
        } else if (clazz == org.eclipse.microprofile.openapi.models.servers.ServerVariable.class) {
            instance = (T) new fr.jmini.empoa.internal.models.servers.ServerVariableImpl();
        } else if (clazz == org.eclipse.microprofile.openapi.models.servers.ServerVariables.class) {
            instance = (T) new fr.jmini.empoa.internal.models.servers.ServerVariablesImpl();
        } else if (clazz == org.eclipse.microprofile.openapi.models.tags.Tag.class) {
            instance = (T) new fr.jmini.empoa.internal.models.tags.TagImpl();
        } else {
            throw new IllegalArgumentException("Can not create " + clazz.getCanonicalName());
        }
        return instance;
    }

}
