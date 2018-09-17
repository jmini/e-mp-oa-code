package fr.jmini.empoa.internal.models;

import org.eclipse.microprofile.openapi.models.PathItem;

public class PathItemImpl implements PathItem {

    private String _ref;

    @Override
    public String getRef() {
        return _ref;
    }

    @Override
    public PathItem ref(String ref) {
        setRef(ref);
        return this;
    }

    @Override
    public void setRef(String ref) {
        if (ref != null && !ref.contains("#") && !ref.contains("/")) {
            _ref = "#/components/pathItems/" + ref;
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

    private String _summary;

    @Override
    public String getSummary() {
        return _summary;
    }

    @Override
    public void setSummary(String summary) {
        _summary = summary;
    }

    @Override
    public PathItem summary(String summary) {
        setSummary(summary);
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
    public PathItem description(String description) {
        setDescription(description);
        return this;
    }

    private org.eclipse.microprofile.openapi.models.Operation _gET;

    @Override
    public org.eclipse.microprofile.openapi.models.Operation getGET() {
        return _gET;
    }

    @Override
    public void setGET(org.eclipse.microprofile.openapi.models.Operation gET) {
        _gET = gET;
    }

    @Override
    public PathItem GET(org.eclipse.microprofile.openapi.models.Operation gET) {
        setGET(gET);
        return this;
    }

    private org.eclipse.microprofile.openapi.models.Operation _pUT;

    @Override
    public org.eclipse.microprofile.openapi.models.Operation getPUT() {
        return _pUT;
    }

    @Override
    public void setPUT(org.eclipse.microprofile.openapi.models.Operation pUT) {
        _pUT = pUT;
    }

    @Override
    public PathItem PUT(org.eclipse.microprofile.openapi.models.Operation pUT) {
        setPUT(pUT);
        return this;
    }

    private org.eclipse.microprofile.openapi.models.Operation _pOST;

    @Override
    public org.eclipse.microprofile.openapi.models.Operation getPOST() {
        return _pOST;
    }

    @Override
    public void setPOST(org.eclipse.microprofile.openapi.models.Operation pOST) {
        _pOST = pOST;
    }

    @Override
    public PathItem POST(org.eclipse.microprofile.openapi.models.Operation pOST) {
        setPOST(pOST);
        return this;
    }

    private org.eclipse.microprofile.openapi.models.Operation _dELETE;

    @Override
    public org.eclipse.microprofile.openapi.models.Operation getDELETE() {
        return _dELETE;
    }

    @Override
    public void setDELETE(org.eclipse.microprofile.openapi.models.Operation dELETE) {
        _dELETE = dELETE;
    }

    @Override
    public PathItem DELETE(org.eclipse.microprofile.openapi.models.Operation dELETE) {
        setDELETE(dELETE);
        return this;
    }

    private org.eclipse.microprofile.openapi.models.Operation _oPTIONS;

    @Override
    public org.eclipse.microprofile.openapi.models.Operation getOPTIONS() {
        return _oPTIONS;
    }

    @Override
    public void setOPTIONS(org.eclipse.microprofile.openapi.models.Operation oPTIONS) {
        _oPTIONS = oPTIONS;
    }

    @Override
    public PathItem OPTIONS(org.eclipse.microprofile.openapi.models.Operation oPTIONS) {
        setOPTIONS(oPTIONS);
        return this;
    }

    private org.eclipse.microprofile.openapi.models.Operation _hEAD;

    @Override
    public org.eclipse.microprofile.openapi.models.Operation getHEAD() {
        return _hEAD;
    }

    @Override
    public void setHEAD(org.eclipse.microprofile.openapi.models.Operation hEAD) {
        _hEAD = hEAD;
    }

    @Override
    public PathItem HEAD(org.eclipse.microprofile.openapi.models.Operation hEAD) {
        setHEAD(hEAD);
        return this;
    }

    private org.eclipse.microprofile.openapi.models.Operation _pATCH;

    @Override
    public org.eclipse.microprofile.openapi.models.Operation getPATCH() {
        return _pATCH;
    }

    @Override
    public void setPATCH(org.eclipse.microprofile.openapi.models.Operation pATCH) {
        _pATCH = pATCH;
    }

    @Override
    public PathItem PATCH(org.eclipse.microprofile.openapi.models.Operation pATCH) {
        setPATCH(pATCH);
        return this;
    }

    private org.eclipse.microprofile.openapi.models.Operation _tRACE;

    @Override
    public org.eclipse.microprofile.openapi.models.Operation getTRACE() {
        return _tRACE;
    }

    @Override
    public void setTRACE(org.eclipse.microprofile.openapi.models.Operation tRACE) {
        _tRACE = tRACE;
    }

    @Override
    public PathItem TRACE(org.eclipse.microprofile.openapi.models.Operation tRACE) {
        setTRACE(tRACE);
        return this;
    }

    @Override
    public java.util.List<org.eclipse.microprofile.openapi.models.Operation> readOperations() {
        java.util.List<org.eclipse.microprofile.openapi.models.Operation> list = new java.util.ArrayList<>();
        if (getGET() != null) {
            list.add(getGET());
        }
        if (getPUT() != null) {
            list.add(getPUT());
        }
        if (getPOST() != null) {
            list.add(getPOST());
        }
        if (getDELETE() != null) {
            list.add(getDELETE());
        }
        if (getOPTIONS() != null) {
            list.add(getOPTIONS());
        }
        if (getHEAD() != null) {
            list.add(getHEAD());
        }
        if (getPATCH() != null) {
            list.add(getPATCH());
        }
        if (getTRACE() != null) {
            list.add(getTRACE());
        }
        return java.util.Collections.unmodifiableList(list);
    }

    @Override
    public java.util.Map<HttpMethod, org.eclipse.microprofile.openapi.models.Operation> readOperationsMap() {
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

    private java.util.List<org.eclipse.microprofile.openapi.models.servers.Server> _servers;

    @Override
    public java.util.List<org.eclipse.microprofile.openapi.models.servers.Server> getServers() {
        return _servers;
    }

    @Override
    public void setServers(java.util.List<org.eclipse.microprofile.openapi.models.servers.Server> servers) {
        _servers = servers;
    }

    @Override
    public PathItem servers(java.util.List<org.eclipse.microprofile.openapi.models.servers.Server> servers) {
        setServers(servers);
        return this;
    }

    @Override
    public PathItem addServer(org.eclipse.microprofile.openapi.models.servers.Server server) {
        if (_servers == null) {
            _servers = new java.util.ArrayList<>();
        }
        _servers.add(server);
        return this;
    }

    private java.util.List<org.eclipse.microprofile.openapi.models.parameters.Parameter> _parameters;

    @Override
    public java.util.List<org.eclipse.microprofile.openapi.models.parameters.Parameter> getParameters() {
        return _parameters;
    }

    @Override
    public void setParameters(java.util.List<org.eclipse.microprofile.openapi.models.parameters.Parameter> parameters) {
        _parameters = parameters;
    }

    @Override
    public PathItem parameters(java.util.List<org.eclipse.microprofile.openapi.models.parameters.Parameter> parameters) {
        setParameters(parameters);
        return this;
    }

    @Override
    public PathItem addParameter(org.eclipse.microprofile.openapi.models.parameters.Parameter parameter) {
        if (_parameters == null) {
            _parameters = new java.util.ArrayList<>();
        }
        _parameters.add(parameter);
        return this;
    }

}
