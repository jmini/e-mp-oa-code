/*******************************************************************************
 * Copyright 2019 Jeremie Bresson
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License.  You may obtain a copy
 * of the License at
 * 
 *   http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.  See the
 * License for the specific language governing permissions and limitations under
 * the License.
 ******************************************************************************/
package org.openapitools.empoa.specs;

public enum MemberType {
    Components_Schemas(ElementType.Components), Components_Responses(ElementType.Components), Components_Parameters(ElementType.Components), Components_Examples(ElementType.Components), Components_RequestBodies(
        ElementType.Components), Components_Headers(ElementType.Components), Components_SecuritySchemes(ElementType.Components), Components_Links(ElementType.Components), Components_Callbacks(
            ElementType.Components), ExternalDocumentation_Description(ElementType.ExternalDocumentation), ExternalDocumentation_Url(ElementType.ExternalDocumentation), OpenAPI_Openapi(ElementType.OpenAPI), OpenAPI_Info(
                ElementType.OpenAPI), OpenAPI_ExternalDocs(ElementType.OpenAPI), OpenAPI_Servers(ElementType.OpenAPI), OpenAPI_Security(ElementType.OpenAPI), OpenAPI_Tags(ElementType.OpenAPI), OpenAPI_Paths(
                    ElementType.OpenAPI), OpenAPI_Components(ElementType.OpenAPI), Operation_Tags(ElementType.Operation), Operation_Summary(ElementType.Operation), Operation_Description(ElementType.Operation), Operation_ExternalDocs(
                        ElementType.Operation), Operation_OperationId(ElementType.Operation), Operation_Parameters(ElementType.Operation), Operation_RequestBody(ElementType.Operation), Operation_Responses(
                            ElementType.Operation), Operation_Callbacks(ElementType.Operation), Operation_Deprecated(ElementType.Operation), Operation_Security(ElementType.Operation), Operation_Servers(
                                ElementType.Operation), PathItem_Summary(ElementType.PathItem), PathItem_Description(ElementType.PathItem), PathItem_GET(ElementType.PathItem), PathItem_PUT(ElementType.PathItem), PathItem_POST(
                                    ElementType.PathItem), PathItem_DELETE(ElementType.PathItem), PathItem_OPTIONS(ElementType.PathItem), PathItem_HEAD(ElementType.PathItem), PathItem_PATCH(ElementType.PathItem), PathItem_TRACE(
                                        ElementType.PathItem), PathItem_Servers(ElementType.PathItem), PathItem_Parameters(ElementType.PathItem), Paths_PathItems(ElementType.Paths), Callback_PathItems(ElementType.Callback), Example_Summary(
                                            ElementType.Example), Example_Description(ElementType.Example), Example_Value(ElementType.Example), Example_ExternalValue(ElementType.Example), Header_Description(
                                                ElementType.Header), Header_Required(ElementType.Header), Header_Deprecated(ElementType.Header), Header_AllowEmptyValue(ElementType.Header), Header_Style(ElementType.Header), Header_Explode(
                                                    ElementType.Header), Header_Schema(ElementType.Header), Header_Examples(ElementType.Header), Header_Example(ElementType.Header), Header_Content(ElementType.Header), Contact_Name(
                                                        ElementType.Contact), Contact_Url(ElementType.Contact), Contact_Email(ElementType.Contact), Info_Title(ElementType.Info), Info_Description(ElementType.Info), Info_TermsOfService(
                                                            ElementType.Info), Info_Contact(ElementType.Info), Info_License(ElementType.Info), Info_Version(ElementType.Info), License_Name(ElementType.License), License_Url(
                                                                ElementType.License), Link_Server(ElementType.Link), Link_OperationRef(ElementType.Link), Link_RequestBody(ElementType.Link), Link_OperationId(
                                                                    ElementType.Link), Link_Parameters(ElementType.Link), Link_Description(ElementType.Link), Content_MediaTypes(ElementType.Content), Discriminator_PropertyName(
                                                                        ElementType.Discriminator), Discriminator_Mapping(ElementType.Discriminator), Encoding_ContentType(ElementType.Encoding), Encoding_Headers(
                                                                            ElementType.Encoding), Encoding_Style(ElementType.Encoding), Encoding_Explode(ElementType.Encoding), Encoding_AllowReserved(ElementType.Encoding), MediaType_Schema(
                                                                                ElementType.MediaType), MediaType_Examples(ElementType.MediaType), MediaType_Example(ElementType.MediaType), MediaType_Encoding(
                                                                                    ElementType.MediaType), Schema_Discriminator(ElementType.Schema), Schema_Title(ElementType.Schema), Schema_DefaultValue(
                                                                                        ElementType.Schema), Schema_Enumeration(ElementType.Schema), Schema_MultipleOf(ElementType.Schema), Schema_Maximum(
                                                                                            ElementType.Schema), Schema_ExclusiveMaximum(ElementType.Schema), Schema_Minimum(ElementType.Schema), Schema_ExclusiveMinimum(
                                                                                                ElementType.Schema), Schema_MaxLength(ElementType.Schema), Schema_MinLength(ElementType.Schema), Schema_Pattern(
                                                                                                    ElementType.Schema), Schema_MaxItems(ElementType.Schema), Schema_MinItems(ElementType.Schema), Schema_UniqueItems(
                                                                                                        ElementType.Schema), Schema_MaxProperties(ElementType.Schema), Schema_MinProperties(ElementType.Schema), Schema_Required(
                                                                                                            ElementType.Schema), Schema_Type(ElementType.Schema), Schema_Not(ElementType.Schema), Schema_Properties(
                                                                                                                ElementType.Schema), Schema_AdditionalProperties_Schema(ElementType.Schema), Schema_AdditionalProperties_Boolean(
                                                                                                                    ElementType.Schema), Schema_Description(ElementType.Schema), Schema_Format(ElementType.Schema), Schema_Nullable(
                                                                                                                        ElementType.Schema), Schema_ReadOnly(ElementType.Schema), Schema_WriteOnly(ElementType.Schema), Schema_Example(
                                                                                                                            ElementType.Schema), Schema_ExternalDocs(ElementType.Schema), Schema_Deprecated(ElementType.Schema), Schema_Xml(
                                                                                                                                ElementType.Schema), Schema_Items(ElementType.Schema), Schema_AllOf(ElementType.Schema), Schema_AnyOf(
                                                                                                                                    ElementType.Schema), Schema_OneOf(ElementType.Schema), XML_Name(ElementType.XML), XML_Namespace(
                                                                                                                                        ElementType.XML), XML_Prefix(ElementType.XML), XML_Attribute(ElementType.XML), XML_Wrapped(
                                                                                                                                            ElementType.XML), Parameter_Name(ElementType.Parameter), Parameter_In(
                                                                                                                                                ElementType.Parameter), Parameter_Description(ElementType.Parameter), Parameter_Required(
                                                                                                                                                    ElementType.Parameter), Parameter_Deprecated(
                                                                                                                                                        ElementType.Parameter), Parameter_AllowEmptyValue(
                                                                                                                                                            ElementType.Parameter), Parameter_Style(ElementType.Parameter), Parameter_Explode(
                                                                                                                                                                ElementType.Parameter), Parameter_AllowReserved(
                                                                                                                                                                    ElementType.Parameter), Parameter_Schema(
                                                                                                                                                                        ElementType.Parameter), Parameter_Examples(
                                                                                                                                                                            ElementType.Parameter), Parameter_Example(
                                                                                                                                                                                ElementType.Parameter), Parameter_Content(
                                                                                                                                                                                    ElementType.Parameter), RequestBody_Description(
                                                                                                                                                                                        ElementType.RequestBody), RequestBody_Content(
                                                                                                                                                                                            ElementType.RequestBody), RequestBody_Required(
                                                                                                                                                                                                ElementType.RequestBody), APIResponse_Description(
                                                                                                                                                                                                    ElementType.APIResponse), APIResponse_Headers(
                                                                                                                                                                                                        ElementType.APIResponse), APIResponse_Content(
                                                                                                                                                                                                            ElementType.APIResponse), APIResponse_Links(
                                                                                                                                                                                                                ElementType.APIResponse), APIResponses_APIResponses(
                                                                                                                                                                                                                    ElementType.APIResponses), OAuthFlow_AuthorizationUrl(
                                                                                                                                                                                                                        ElementType.OAuthFlow), OAuthFlow_TokenUrl(
                                                                                                                                                                                                                            ElementType.OAuthFlow), OAuthFlow_RefreshUrl(
                                                                                                                                                                                                                                ElementType.OAuthFlow), OAuthFlow_Scopes(
                                                                                                                                                                                                                                    ElementType.OAuthFlow), OAuthFlows_Implicit(
                                                                                                                                                                                                                                        ElementType.OAuthFlows), OAuthFlows_Password(
                                                                                                                                                                                                                                            ElementType.OAuthFlows), OAuthFlows_ClientCredentials(
                                                                                                                                                                                                                                                ElementType.OAuthFlows), OAuthFlows_AuthorizationCode(
                                                                                                                                                                                                                                                    ElementType.OAuthFlows), Scopes_Scopes(
                                                                                                                                                                                                                                                        ElementType.Scopes), SecurityRequirement_Schemes(
                                                                                                                                                                                                                                                            ElementType.SecurityRequirement), SecurityScheme_Type(
                                                                                                                                                                                                                                                                ElementType.SecurityScheme), SecurityScheme_Description(
                                                                                                                                                                                                                                                                    ElementType.SecurityScheme), SecurityScheme_Name(
                                                                                                                                                                                                                                                                        ElementType.SecurityScheme), SecurityScheme_In(
                                                                                                                                                                                                                                                                            ElementType.SecurityScheme), SecurityScheme_Scheme(
                                                                                                                                                                                                                                                                                ElementType.SecurityScheme), SecurityScheme_BearerFormat(
                                                                                                                                                                                                                                                                                    ElementType.SecurityScheme), SecurityScheme_Flows(
                                                                                                                                                                                                                                                                                        ElementType.SecurityScheme), SecurityScheme_OpenIdConnectUrl(
                                                                                                                                                                                                                                                                                            ElementType.SecurityScheme), Server_Url(
                                                                                                                                                                                                                                                                                                ElementType.Server), Server_Description(
                                                                                                                                                                                                                                                                                                    ElementType.Server), Server_Variables(
                                                                                                                                                                                                                                                                                                        ElementType.Server), ServerVariable_Enumeration(
                                                                                                                                                                                                                                                                                                            ElementType.ServerVariable), ServerVariable_DefaultValue(
                                                                                                                                                                                                                                                                                                                ElementType.ServerVariable), ServerVariable_Description(
                                                                                                                                                                                                                                                                                                                    ElementType.ServerVariable), ServerVariables_ServerVariables(
                                                                                                                                                                                                                                                                                                                        ElementType.ServerVariables), Tag_Name(
                                                                                                                                                                                                                                                                                                                            ElementType.Tag), Tag_Description(
                                                                                                                                                                                                                                                                                                                                ElementType.Tag), Tag_ExternalDocs(
                                                                                                                                                                                                                                                                                                                                    ElementType.Tag);

    private ElementType elementType;

    private MemberType(ElementType elementType) {
        this.elementType = elementType;
    }

    public ElementType getElement() {
        return elementType;
    }
}
