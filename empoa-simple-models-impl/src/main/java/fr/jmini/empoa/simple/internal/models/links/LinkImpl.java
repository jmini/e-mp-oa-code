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
package fr.jmini.empoa.simple.internal.models.links;

import org.eclipse.microprofile.openapi.models.links.Link;

public class LinkImpl implements Link {

    private String _ref;

    @Override
    public String getRef() {
        return _ref;
    }

    @Override
    public Link ref(String ref) {
        setRef(ref);
        return this;
    }

    @Override
    public void setRef(String ref) {
        if (ref != null && !ref.contains("#") && !ref.contains("/")) {
            _ref = "#/components/links/" + ref;
        } else {
            _ref = ref;
        }
    }

    private java.util.Map<String, Object> _extensions;

    @Override
    public java.util.Map<String, Object> getExtensions() {
        return _extensions;
    }

    @Override
    public void setExtensions(java.util.Map<String, Object> extensions) {
        _extensions = extensions;
    }

    @Override
    public void addExtension(String key, Object object) {
        if (_extensions == null) {
            _extensions = new java.util.LinkedHashMap<>();
        }
        _extensions.put(key, object);
    }

    private org.eclipse.microprofile.openapi.models.servers.Server _server;

    @Override
    public org.eclipse.microprofile.openapi.models.servers.Server getServer() {
        return _server;
    }

    @Override
    public void setServer(org.eclipse.microprofile.openapi.models.servers.Server server) {
        _server = server;
    }

    @Override
    public Link server(org.eclipse.microprofile.openapi.models.servers.Server server) {
        setServer(server);
        return this;
    }

    private String _operationRef;

    @Override
    public String getOperationRef() {
        return _operationRef;
    }

    @Override
    public void setOperationRef(String operationRef) {
        _operationRef = operationRef;
    }

    @Override
    public Link operationRef(String operationRef) {
        setOperationRef(operationRef);
        return this;
    }

    private Object _requestBody;

    @Override
    public Object getRequestBody() {
        return _requestBody;
    }

    @Override
    public void setRequestBody(Object requestBody) {
        _requestBody = requestBody;
    }

    @Override
    public Link requestBody(Object requestBody) {
        setRequestBody(requestBody);
        return this;
    }

    private String _operationId;

    @Override
    public String getOperationId() {
        return _operationId;
    }

    @Override
    public void setOperationId(String operationId) {
        _operationId = operationId;
    }

    @Override
    public Link operationId(String operationId) {
        setOperationId(operationId);
        return this;
    }

    private java.util.Map<String, Object> _parameters;

    @Override
    public java.util.Map<String, Object> getParameters() {
        return _parameters;
    }

    @Override
    public void setParameters(java.util.Map<String, Object> parameters) {
        _parameters = parameters;
    }

    @Override
    public Link parameters(java.util.Map<String, Object> parameters) {
        setParameters(parameters);
        return this;
    }

    @Override
    public Link addParameter(String key, Object object) {
        if (_parameters == null) {
            _parameters = new java.util.LinkedHashMap<>();
        }
        _parameters.put(key, object);
        return this;
    }

    private String _description;

    @Override
    public String getDescription() {
        return _description;
    }

    @Override
    public void setDescription(String description) {
        _description = description;
    }

    @Override
    public Link description(String description) {
        setDescription(description);
        return this;
    }

}
