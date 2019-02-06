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
package fr.jmini.empoa.simple.internal.models.info;

import org.eclipse.microprofile.openapi.models.info.Info;

public class InfoImpl implements Info {

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

    private String _title;

    @Override
    public String getTitle() {
        return _title;
    }

    @Override
    public void setTitle(String title) {
        _title = title;
    }

    @Override
    public Info title(String title) {
        setTitle(title);
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
    public Info description(String description) {
        setDescription(description);
        return this;
    }

    private String _termsOfService;

    @Override
    public String getTermsOfService() {
        return _termsOfService;
    }

    @Override
    public void setTermsOfService(String termsOfService) {
        _termsOfService = termsOfService;
    }

    @Override
    public Info termsOfService(String termsOfService) {
        setTermsOfService(termsOfService);
        return this;
    }

    private org.eclipse.microprofile.openapi.models.info.Contact _contact;

    @Override
    public org.eclipse.microprofile.openapi.models.info.Contact getContact() {
        return _contact;
    }

    @Override
    public void setContact(org.eclipse.microprofile.openapi.models.info.Contact contact) {
        _contact = contact;
    }

    @Override
    public Info contact(org.eclipse.microprofile.openapi.models.info.Contact contact) {
        setContact(contact);
        return this;
    }

    private org.eclipse.microprofile.openapi.models.info.License _license;

    @Override
    public org.eclipse.microprofile.openapi.models.info.License getLicense() {
        return _license;
    }

    @Override
    public void setLicense(org.eclipse.microprofile.openapi.models.info.License license) {
        _license = license;
    }

    @Override
    public Info license(org.eclipse.microprofile.openapi.models.info.License license) {
        setLicense(license);
        return this;
    }

    private String _version;

    @Override
    public String getVersion() {
        return _version;
    }

    @Override
    public void setVersion(String version) {
        _version = version;
    }

    @Override
    public Info version(String version) {
        setVersion(version);
        return this;
    }

}
