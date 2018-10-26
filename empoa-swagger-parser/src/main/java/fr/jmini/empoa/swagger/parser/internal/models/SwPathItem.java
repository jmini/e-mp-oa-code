package fr.jmini.empoa.swagger.parser.internal.models;

import org.eclipse.microprofile.openapi.models.PathItem;

public class SwPathItem implements PathItem {

    private io.swagger.v3.oas.models.PathItem swPathItem;

    public SwPathItem() {
        swPathItem = new io.swagger.v3.oas.models.PathItem();
    }

    public SwPathItem(io.swagger.v3.oas.models.PathItem swPathItem) {
        this.swPathItem = swPathItem;
    }

    @Override
    public String getRef() {
        return swPathItem.getRef();
    }

    @Override
    public void setRef(String ref) {
    }

    @Override
    public java.util.Map<String, Object> getExtensions() {
        java.util.Map<String, Object> result = swPathItem.getExtensions();
        if (result == null) {
            return null;
        }
        return java.util.Collections.unmodifiableMap(result);
    }

    @Override
    public void setExtensions(java.util.Map<String, Object> extensions) {
        swPathItem.setExtensions(null);
        if (extensions != null) {
            for (java.util.Map.Entry<String, Object> e : extensions.entrySet()) {
                this.addExtension(e.getKey(), e.getValue());
            }
        }
    }

    @Override
    public PathItem addExtension(String key, Object object) {
        swPathItem.addExtension(key, object);
        return this;
    }

    @Override
    public void removeExtension(String key) {
    }

    @Override
    public String getSummary() {
        return swPathItem.getSummary();
    }

    @Override
    public void setSummary(String summary) {
        swPathItem.setSummary(summary);
    }

    @Override
    public String getDescription() {
        return swPathItem.getDescription();
    }

    @Override
    public void setDescription(String description) {
        swPathItem.setDescription(description);
    }

    @Override
    public org.eclipse.microprofile.openapi.models.Operation getGET() {
        return swPathItem.getGET();
    }

    @Override
    public void setGET(org.eclipse.microprofile.openapi.models.Operation gET) {
        swPathItem.setGET(gET);
    }

    @Override
    public org.eclipse.microprofile.openapi.models.Operation getPUT() {
        return swPathItem.getPUT();
    }

    @Override
    public void setPUT(org.eclipse.microprofile.openapi.models.Operation pUT) {
        swPathItem.setPUT(pUT);
    }

    @Override
    public org.eclipse.microprofile.openapi.models.Operation getPOST() {
        return swPathItem.getPOST();
    }

    @Override
    public void setPOST(org.eclipse.microprofile.openapi.models.Operation pOST) {
        swPathItem.setPOST(pOST);
    }

    @Override
    public org.eclipse.microprofile.openapi.models.Operation getDELETE() {
        return swPathItem.getDELETE();
    }

    @Override
    public void setDELETE(org.eclipse.microprofile.openapi.models.Operation dELETE) {
        swPathItem.setDELETE(dELETE);
    }

    @Override
    public org.eclipse.microprofile.openapi.models.Operation getOPTIONS() {
        return swPathItem.getOPTIONS();
    }

    @Override
    public void setOPTIONS(org.eclipse.microprofile.openapi.models.Operation oPTIONS) {
        swPathItem.setOPTIONS(oPTIONS);
    }

    @Override
    public org.eclipse.microprofile.openapi.models.Operation getHEAD() {
        return swPathItem.getHEAD();
    }

    @Override
    public void setHEAD(org.eclipse.microprofile.openapi.models.Operation hEAD) {
        swPathItem.setHEAD(hEAD);
    }

    @Override
    public org.eclipse.microprofile.openapi.models.Operation getPATCH() {
        return swPathItem.getPATCH();
    }

    @Override
    public void setPATCH(org.eclipse.microprofile.openapi.models.Operation pATCH) {
        swPathItem.setPATCH(pATCH);
    }

    @Override
    public org.eclipse.microprofile.openapi.models.Operation getTRACE() {
        return swPathItem.getTRACE();
    }

    @Override
    public void setTRACE(org.eclipse.microprofile.openapi.models.Operation tRACE) {
        swPathItem.setTRACE(tRACE);
    }

    @Override
    public java.util.Map<HttpMethod, org.eclipse.microprofile.openapi.models.Operation> getOperations() {
        java.util.Map<HttpMethod, org.eclipse.microprofile.openapi.models.Operation> map = new java.util.LinkedHashMap<>();
        if (getGET() != null) {
            map.put(HttpMethod.GET, getGET());
        }
        if (getPUT() != null) {
            map.put(HttpMethod.PUT, getPUT());
        }
        if (getPOST() != null) {
            map.put(HttpMethod.POST, getPOST());
        }
        if (getDELETE() != null) {
            map.put(HttpMethod.DELETE, getDELETE());
        }
        if (getOPTIONS() != null) {
            map.put(HttpMethod.OPTIONS, getOPTIONS());
        }
        if (getHEAD() != null) {
            map.put(HttpMethod.HEAD, getHEAD());
        }
        if (getPATCH() != null) {
            map.put(HttpMethod.PATCH, getPATCH());
        }
        if (getTRACE() != null) {
            map.put(HttpMethod.TRACE, getTRACE());
        }
        return java.util.Collections.unmodifiableMap(map);
    }

    @Override
    public java.util.List<org.eclipse.microprofile.openapi.models.servers.Server> getServers() {
        java.util.List<org.eclipse.microprofile.openapi.models.servers.Server> result = swPathItem.getServers();
        if (result == null) {
            return null;
        }
        return java.util.Collections.unmodifiableList(result);
    }

    @Override
    public void setServers(java.util.List<org.eclipse.microprofile.openapi.models.servers.Server> servers) {
        swPathItem.setServers(null);
        if (servers != null) {
            for (org.eclipse.microprofile.openapi.models.servers.Server e : servers) {
                this.addServer(e);
            }
        }
    }

    @Override
    public PathItem addServer(org.eclipse.microprofile.openapi.models.servers.Server server) {
        swPathItem.addServer(e);
        return this;
    }

    @Override
    public void removeServer(org.eclipse.microprofile.openapi.models.servers.Server server) {
    }

    @Override
    public java.util.List<org.eclipse.microprofile.openapi.models.parameters.Parameter> getParameters() {
        java.util.List<org.eclipse.microprofile.openapi.models.parameters.Parameter> result = swPathItem.getParameters();
        if (result == null) {
            return null;
        }
        return java.util.Collections.unmodifiableList(result);
    }

    @Override
    public void setParameters(java.util.List<org.eclipse.microprofile.openapi.models.parameters.Parameter> parameters) {
        swPathItem.setParameters(null);
        if (parameters != null) {
            for (org.eclipse.microprofile.openapi.models.parameters.Parameter e : parameters) {
                this.addParameter(e);
            }
        }
    }

    @Override
    public PathItem addParameter(org.eclipse.microprofile.openapi.models.parameters.Parameter parameter) {
        swPathItem.addParameter(e);
        return this;
    }

    @Override
    public void removeParameter(org.eclipse.microprofile.openapi.models.parameters.Parameter parameter) {
    }

}
