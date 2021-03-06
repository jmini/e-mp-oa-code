/**
 * Copyright 2017 Red Hat, Inc, and individual contributors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
//Adapted from https://github.com/smallrye/smallrye-open-api/blob/1.0.3/implementation/src/main/java/io/smallrye/openapi/api/OpenApiConstants.java
package fr.jmini.empoa.jackson.internal;

/**
 * @author eric.wittmann@gmail.com
 */
public final class OpenAPIConstants {

    public static final String OPEN_API_VERSION = "3.0.1";

    public static final String SCAN_DEPENDENCIES_DISABLE = "mp.openapi.extensions.scan-dependencies.disable";
    public static final String SCAN_DEPENDENCIES_JARS = "mp.openapi.extensions.scan-dependencies.jars";

    public static final String CLASS_SUFFIX = ".class";
    public static final String JAR_SUFFIX = ".jar";
    public static final String WEB_ARCHIVE_CLASS_PREFIX = "/WEB-INF/classes/";

    public static final String EXTENSION_PROPERTY_PREFIX = "x-";

    private static final String MIME_ANY = "*/*";
    public static final String[] DEFAULT_PARAMETER_MEDIA_TYPES = { MIME_ANY };
    public static final String[] DEFAULT_REQUEST_BODY_TYPES = { MIME_ANY };

    public static final String PROP_TRACE = "trace";
    public static final String PROP_PATCH = "patch";
    public static final String PROP_HEAD = "head";
    public static final String PROP_OPTIONS = "options";
    public static final String PROP_DELETE = "delete";
    public static final String PROP_POST = "post";
    public static final String PROP_PUT = "put";
    public static final String PROP_GET = "get";
    public static final String PROP_SERVER = "server";
    public static final String PROP_REQUEST_BODY = "requestBody";
    public static final String PROP_OPERATION_ID = "operationId";
    public static final String PROP_OPERATION_REF = "operationRef";
    public static final String PROP_SCOPES = "scopes";
    public static final String PROP_REFRESH_URL = "refreshUrl";
    public static final String PROP_TOKEN_URL = "tokenUrl";
    public static final String PROP_AUTHORIZATION_URL = "authorizationUrl";
    public static final String PROP_AUTHORIZATION_CODE = "authorizationCode";
    public static final String PROP_CLIENT_CREDENTIALS = "clientCredentials";
    public static final String PROP_PASSWORD = "password";
    public static final String PROP_IMPLICIT = "implicit";
    public static final String PROP_OPEN_ID_CONNECT_URL = "openIdConnectUrl";
    public static final String PROP_FLOWS = "flows";
    public static final String PROP_BEARER_FORMAT = "bearerFormat";
    public static final String PROP_SCHEME = "scheme";
    public static final String PROP_EXTERNAL_VALUE = "externalValue";
    public static final String PROP_VALUE = "value";
    public static final String PROP_SUMMARY = "summary";
    public static final String PROP_ALLOW_EMPTY_VALUE = "allowEmptyValue";
    public static final String PROP_IN = "in";
    public static final String PROP_ALLOW_RESERVED = "allowReserved";
    public static final String PROP_EXPLODE = "explode";
    public static final String PROP_STYLE = "style";
    public static final String PROP_CONTENT_TYPE = "contentType";
    public static final String PROP_ENCODING = "encoding";
    public static final String PROP_SCHEMA = "schema";
    public static final String PROP_CONTENT = "content";
    public static final String PROP_MAPPING = "mapping";
    public static final String PROP_PROPERTY_NAME = "propertyName";
    public static final String PROP_WRAPPED = "wrapped";
    public static final String PROP_ATTRIBUTE = "attribute";
    public static final String PROP_PREFIX = "prefix";
    public static final String PROP_NAMESPACE = "namespace";
    public static final String PROP_DEPRECATED = "deprecated";
    public static final String PROP_WRITE_ONLY = "writeOnly";
    public static final String PROP_NULLABLE = "nullable";
    public static final String PROP_DISCRIMINATOR = "discriminator";
    public static final String PROP_ANY_OF = "anyOf";
    public static final String PROP_ONE_OF = "oneOf";
    public static final String PROP_EXAMPLE = "example";
    public static final String PROP_XML = "xml";
    public static final String PROP_READ_ONLY = "readOnly";
    public static final String PROP_ADDITIONAL_PROPERTIES = "additionalProperties";
    public static final String PROP_PROPERTIES = "properties";
    public static final String PROP_ALL_OF = "allOf";
    public static final String PROP_NOT = "not";
    public static final String PROP_ITEMS = "items";
    public static final String PROP_TYPE = "type";
    public static final String PROP_REQUIRED = "required";
    public static final String PROP_MIN_PROPERTIES = "minProperties";
    public static final String PROP_MAX_PROPERTIES = "maxProperties";
    public static final String PROP_UNIQUE_ITEMS = "uniqueItems";
    public static final String PROP_MIN_ITEMS = "minItems";
    public static final String PROP_MAX_ITEMS = "maxItems";
    public static final String PROP_PATTERN = "pattern";
    public static final String PROP_MIN_LENGTH = "minLength";
    public static final String PROP_MAX_LENGTH = "maxLength";
    public static final String PROP_EXCLUSIVE_MINIMUM = "exclusiveMinimum";
    public static final String PROP_MINIMUM = "minimum";
    public static final String PROP_EXCLUSIVE_MAXIMUM = "exclusiveMaximum";
    public static final String PROP_MAXIMUM = "maximum";
    public static final String PROP_MULTIPLE_OF = "multipleOf";
    public static final String PROP_FORMAT = "format";
    public static final String PROP_$REF = "$ref";
    public static final String PROP_CALLBACKS = "callbacks";
    public static final String PROP_LINKS = "links";
    public static final String PROP_SECURITY_SCHEMES = "securitySchemes";
    public static final String PROP_HEADERS = "headers";
    public static final String PROP_REQUEST_BODIES = "requestBodies";
    public static final String PROP_EXAMPLES = "examples";
    public static final String PROP_PARAMETERS = "parameters";
    public static final String PROP_RESPONSES = "responses";
    public static final String PROP_SCHEMAS = "schemas";
    public static final String PROP_DEFAULT = "default";
    public static final String PROP_ENUM = "enum";
    public static final String PROP_VARIABLES = "variables";
    public static final String PROP_EMAIL = "email";
    public static final String PROP_URL = "url";
    public static final String PROP_NAME = "name";
    public static final String PROP_VERSION = "version";
    public static final String PROP_LICENSE = "license";
    public static final String PROP_CONTACT = "contact";
    public static final String PROP_TERMS_OF_SERVICE = "termsOfService";
    public static final String PROP_DESCRIPTION = "description";
    public static final String PROP_TITLE = "title";
    public static final String PROP_COMPONENTS = "components";
    public static final String PROP_PATHS = "paths";
    public static final String PROP_TAGS = "tags";
    public static final String PROP_SECURITY = "security";
    public static final String PROP_SERVERS = "servers";
    public static final String PROP_EXTERNAL_DOCS = "externalDocs";
    public static final String PROP_INFO = "info";
    public static final String PROP_OPENAPI = "openapi";

    public static final String PROP_REF = "ref";
    public static final String PROP_REFS = "refs";
    public static final String PROP_METHOD = "method";
    public static final String PROP_CALLBACK_URL_EXPRESSION = "callbackUrlExpression";
    public static final String PROP_OPERATIONS = "operations";
    public static final String PROP_EXTENSIONS = "extensions";
    public static final String PROP_EXPRESSION = "expression";
    public static final String PROP_HIDDEN = "hidden";
    public static final String PROP_MEDIA_TYPE = "mediaType";
    public static final String PROP_REQUIRED_PROPERTIES = "requiredProperties";
    public static final String PROP_DEFAULT_VALUE = "defaultValue";
    public static final String PROP_DISCRIMINATOR_MAPPING = "discriminatorMapping";
    public static final String PROP_SECURITY_SCHEME_NAME = "securitySchemeName";
    public static final String PROP_API_KEY_NAME = "apiKeyName";
    public static final String PROP_RESPONSE_CODE = "responseCode";
    public static final String PROP_IMPLEMENTATION = "implementation";
    public static final String PROP_ENUMERATION = "enumeration";

    public static final String[] DEFAULT_CONSUMES = new String[] { MIME_ANY };
    public static final String[] DEFAULT_PRODUCES = new String[] { MIME_ANY };

    public static final String REF_PREFIX_API_RESPONSE = "#/components/responses/";
    public static final String REF_PREFIX_CALLBACK = "#/components/callbacks/";
    public static final String REF_PREFIX_EXAMPLE = "#/components/examples/";
    public static final String REF_PREFIX_HEADER = "#/components/headers/";
    public static final String REF_PREFIX_LINK = "#/components/links/";
    public static final String REF_PREFIX_PARAMETER = "#/components/parameters/";
    public static final String REF_PREFIX_REQUEST_BODY = "#/components/requestBodies/";
    public static final String REF_PREFIX_SCHEMA = "#/components/schemas/";
    public static final String REF_PREFIX_SECURITY_SCHEME = "#/components/securitySchemes/";

    /**
     * Constructor.
     */
    private OpenAPIConstants() {
    }

}
