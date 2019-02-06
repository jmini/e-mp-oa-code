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
package fr.jmini.empoa.simple.internal.models.responses;

import org.eclipse.microprofile.openapi.models.responses.APIResponses;

public class APIResponsesImpl extends java.util.LinkedHashMap<String, org.eclipse.microprofile.openapi.models.responses.APIResponse> implements APIResponses {
    private static final long serialVersionUID = 1L;

    private org.eclipse.microprofile.openapi.models.responses.APIResponse _defaultValue;

    @Override
    public org.eclipse.microprofile.openapi.models.responses.APIResponse getDefault() {
        return _defaultValue;
    }

    @Override
    public void setDefaultValue(org.eclipse.microprofile.openapi.models.responses.APIResponse defaultValue) {
        _defaultValue = defaultValue;
    }

    @Override
    public APIResponses defaultValue(org.eclipse.microprofile.openapi.models.responses.APIResponse defaultValue) {
        setDefaultValue(defaultValue);
        return this;
    }

    @Override
    public APIResponses addApiResponse(String key, org.eclipse.microprofile.openapi.models.responses.APIResponse aPIResponse) {
        this.put(key, aPIResponse);
        return this;
    }

}
