package fr.jmini.empoa.swagger.parser.internal.models;

import org.eclipse.microprofile.openapi.models.PathItem;

public class SwPathItem implements PathItem {

    private io.swagger.v3.oas.models.PathItem _swPathItem;

    public SwPathItem() {
        _swPathItem = new io.swagger.v3.oas.models.PathItem();
    }

    public SwPathItem(io.swagger.v3.oas.models.PathItem _swPathItem) {
        this._swPathItem = _swPathItem;
    }

    public io.swagger.v3.oas.models.PathItem getSw() {
        return _swPathItem;
    }

    @Override
    public String getRef() {
        return _swPathItem.get$ref();
    }

    @Override
    public void setRef(String ref) {
        _swPathItem.set$ref(ref);
    }

    @Override
    public java.util.Map<String, Object> getExtensions() {
        java.util.Map<String, Object> result = _swPathItem.getExtensions();
        if (result == null) {
            return null;
        }
        return java.util.Collections.unmodifiableMap(result);
    }

    @Override
    public void setExtensions(java.util.Map<String, Object> extensions) {
        _swPathItem.setExtensions(null);
        if (extensions != null) {
            for (java.util.Map.Entry<String, Object> e : extensions.entrySet()) {
                this.addExtension(e.getKey(), e.getValue());
            }
        }
    }

    @Override
    public PathItem addExtension(String key, Object object) {
        _swPathItem.addExtension(key, object);
        return this;
    }

    @Override
    public void removeExtension(String key) {
        if (getExtensions() != null) {
            _swPathItem.getExtensions()
                    .remove(key);
        }
    }

    @Override
    public String getSummary() {
        return _swPathItem.getSummary();
    }

    @Override
    public void setSummary(String summary) {
        _swPathItem.setSummary(summary);
    }

    @Override
    public String getDescription() {
        return _swPathItem.getDescription();
    }

    @Override
    public void setDescription(String description) {
        _swPathItem.setDescription(description);
    }

    private fr.jmini.empoa.swagger.parser.internal.models.SwOperation _gET;

    private void initGET() {
        if (_swPathItem.getGet() == null) {
            _gET = null;
        } else {
            _gET = new fr.jmini.empoa.swagger.parser.internal.models.SwOperation(_swPathItem.getGet());
        }
    }

    @Override
    public org.eclipse.microprofile.openapi.models.Operation getGET() {
        initGET();
        return _gET;
    }

    @Override
    public void setGET(org.eclipse.microprofile.openapi.models.Operation gET) {
        if (gET != null) {
            if (!(gET instanceof fr.jmini.empoa.swagger.parser.internal.models.SwOperation)) {
                throw new IllegalArgumentException("Unexpected type: " + gET);
            }
            _gET = (fr.jmini.empoa.swagger.parser.internal.models.SwOperation) gET;
            _swPathItem.setGet(_gET.getSw());
        } else {
            _gET = null;
            _swPathItem.setGet(null);
        }
    }

    private fr.jmini.empoa.swagger.parser.internal.models.SwOperation _pUT;

    private void initPUT() {
        if (_swPathItem.getPut() == null) {
            _pUT = null;
        } else {
            _pUT = new fr.jmini.empoa.swagger.parser.internal.models.SwOperation(_swPathItem.getPut());
        }
    }

    @Override
    public org.eclipse.microprofile.openapi.models.Operation getPUT() {
        initPUT();
        return _pUT;
    }

    @Override
    public void setPUT(org.eclipse.microprofile.openapi.models.Operation pUT) {
        if (pUT != null) {
            if (!(pUT instanceof fr.jmini.empoa.swagger.parser.internal.models.SwOperation)) {
                throw new IllegalArgumentException("Unexpected type: " + pUT);
            }
            _pUT = (fr.jmini.empoa.swagger.parser.internal.models.SwOperation) pUT;
            _swPathItem.setPut(_pUT.getSw());
        } else {
            _pUT = null;
            _swPathItem.setPut(null);
        }
    }

    private fr.jmini.empoa.swagger.parser.internal.models.SwOperation _pOST;

    private void initPOST() {
        if (_swPathItem.getPost() == null) {
            _pOST = null;
        } else {
            _pOST = new fr.jmini.empoa.swagger.parser.internal.models.SwOperation(_swPathItem.getPost());
        }
    }

    @Override
    public org.eclipse.microprofile.openapi.models.Operation getPOST() {
        initPOST();
        return _pOST;
    }

    @Override
    public void setPOST(org.eclipse.microprofile.openapi.models.Operation pOST) {
        if (pOST != null) {
            if (!(pOST instanceof fr.jmini.empoa.swagger.parser.internal.models.SwOperation)) {
                throw new IllegalArgumentException("Unexpected type: " + pOST);
            }
            _pOST = (fr.jmini.empoa.swagger.parser.internal.models.SwOperation) pOST;
            _swPathItem.setPost(_pOST.getSw());
        } else {
            _pOST = null;
            _swPathItem.setPost(null);
        }
    }

    private fr.jmini.empoa.swagger.parser.internal.models.SwOperation _dELETE;

    private void initDELETE() {
        if (_swPathItem.getDelete() == null) {
            _dELETE = null;
        } else {
            _dELETE = new fr.jmini.empoa.swagger.parser.internal.models.SwOperation(_swPathItem.getDelete());
        }
    }

    @Override
    public org.eclipse.microprofile.openapi.models.Operation getDELETE() {
        initDELETE();
        return _dELETE;
    }

    @Override
    public void setDELETE(org.eclipse.microprofile.openapi.models.Operation dELETE) {
        if (dELETE != null) {
            if (!(dELETE instanceof fr.jmini.empoa.swagger.parser.internal.models.SwOperation)) {
                throw new IllegalArgumentException("Unexpected type: " + dELETE);
            }
            _dELETE = (fr.jmini.empoa.swagger.parser.internal.models.SwOperation) dELETE;
            _swPathItem.setDelete(_dELETE.getSw());
        } else {
            _dELETE = null;
            _swPathItem.setDelete(null);
        }
    }

    private fr.jmini.empoa.swagger.parser.internal.models.SwOperation _oPTIONS;

    private void initOPTIONS() {
        if (_swPathItem.getOptions() == null) {
            _oPTIONS = null;
        } else {
            _oPTIONS = new fr.jmini.empoa.swagger.parser.internal.models.SwOperation(_swPathItem.getOptions());
        }
    }

    @Override
    public org.eclipse.microprofile.openapi.models.Operation getOPTIONS() {
        initOPTIONS();
        return _oPTIONS;
    }

    @Override
    public void setOPTIONS(org.eclipse.microprofile.openapi.models.Operation oPTIONS) {
        if (oPTIONS != null) {
            if (!(oPTIONS instanceof fr.jmini.empoa.swagger.parser.internal.models.SwOperation)) {
                throw new IllegalArgumentException("Unexpected type: " + oPTIONS);
            }
            _oPTIONS = (fr.jmini.empoa.swagger.parser.internal.models.SwOperation) oPTIONS;
            _swPathItem.setOptions(_oPTIONS.getSw());
        } else {
            _oPTIONS = null;
            _swPathItem.setOptions(null);
        }
    }

    private fr.jmini.empoa.swagger.parser.internal.models.SwOperation _hEAD;

    private void initHEAD() {
        if (_swPathItem.getHead() == null) {
            _hEAD = null;
        } else {
            _hEAD = new fr.jmini.empoa.swagger.parser.internal.models.SwOperation(_swPathItem.getHead());
        }
    }

    @Override
    public org.eclipse.microprofile.openapi.models.Operation getHEAD() {
        initHEAD();
        return _hEAD;
    }

    @Override
    public void setHEAD(org.eclipse.microprofile.openapi.models.Operation hEAD) {
        if (hEAD != null) {
            if (!(hEAD instanceof fr.jmini.empoa.swagger.parser.internal.models.SwOperation)) {
                throw new IllegalArgumentException("Unexpected type: " + hEAD);
            }
            _hEAD = (fr.jmini.empoa.swagger.parser.internal.models.SwOperation) hEAD;
            _swPathItem.setHead(_hEAD.getSw());
        } else {
            _hEAD = null;
            _swPathItem.setHead(null);
        }
    }

    private fr.jmini.empoa.swagger.parser.internal.models.SwOperation _pATCH;

    private void initPATCH() {
        if (_swPathItem.getPatch() == null) {
            _pATCH = null;
        } else {
            _pATCH = new fr.jmini.empoa.swagger.parser.internal.models.SwOperation(_swPathItem.getPatch());
        }
    }

    @Override
    public org.eclipse.microprofile.openapi.models.Operation getPATCH() {
        initPATCH();
        return _pATCH;
    }

    @Override
    public void setPATCH(org.eclipse.microprofile.openapi.models.Operation pATCH) {
        if (pATCH != null) {
            if (!(pATCH instanceof fr.jmini.empoa.swagger.parser.internal.models.SwOperation)) {
                throw new IllegalArgumentException("Unexpected type: " + pATCH);
            }
            _pATCH = (fr.jmini.empoa.swagger.parser.internal.models.SwOperation) pATCH;
            _swPathItem.setPatch(_pATCH.getSw());
        } else {
            _pATCH = null;
            _swPathItem.setPatch(null);
        }
    }

    private fr.jmini.empoa.swagger.parser.internal.models.SwOperation _tRACE;

    private void initTRACE() {
        if (_swPathItem.getTrace() == null) {
            _tRACE = null;
        } else {
            _tRACE = new fr.jmini.empoa.swagger.parser.internal.models.SwOperation(_swPathItem.getTrace());
        }
    }

    @Override
    public org.eclipse.microprofile.openapi.models.Operation getTRACE() {
        initTRACE();
        return _tRACE;
    }

    @Override
    public void setTRACE(org.eclipse.microprofile.openapi.models.Operation tRACE) {
        if (tRACE != null) {
            if (!(tRACE instanceof fr.jmini.empoa.swagger.parser.internal.models.SwOperation)) {
                throw new IllegalArgumentException("Unexpected type: " + tRACE);
            }
            _tRACE = (fr.jmini.empoa.swagger.parser.internal.models.SwOperation) tRACE;
            _swPathItem.setTrace(_tRACE.getSw());
        } else {
            _tRACE = null;
            _swPathItem.setTrace(null);
        }
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

    private java.util.List<fr.jmini.empoa.swagger.parser.internal.models.servers.SwServer> _servers;

    private void initServers() {
        if (_swPathItem.getServers() == null) {
            _servers = null;
        } else {
            _swPathItem.getServers()
                    .stream()
                    .map(fr.jmini.empoa.swagger.parser.internal.models.servers.SwServer::new)
                    .collect(java.util.stream.Collectors.toCollection(java.util.ArrayList::new));
        }
    }

    @Override
    public java.util.List<org.eclipse.microprofile.openapi.models.servers.Server> getServers() {
        initServers();
        if (_servers == null) {
            return null;
        }
        return java.util.Collections.unmodifiableList(_servers);
    }

    @Override
    public void setServers(java.util.List<org.eclipse.microprofile.openapi.models.servers.Server> servers) {
        _swPathItem.setServers(null);
        if (servers != null) {
            for (org.eclipse.microprofile.openapi.models.servers.Server e : servers) {
                this.addServer(e);
            }
        }
    }

    @Override
    public PathItem addServer(org.eclipse.microprofile.openapi.models.servers.Server server) {
        if (!(server instanceof fr.jmini.empoa.swagger.parser.internal.models.servers.SwServer)) {
            throw new IllegalArgumentException("Unexpected type: " + server);
        }
        fr.jmini.empoa.swagger.parser.internal.models.servers.SwServer element = (fr.jmini.empoa.swagger.parser.internal.models.servers.SwServer) server;
        initServers();
        if (_servers == null) {
            _servers = new java.util.ArrayList<>();
            _swPathItem.setServers(new java.util.ArrayList<>());
        }
        _servers.add(element);
        _swPathItem.getServers()
                .add(element.getSw());
        return this;
    }

    @Override
    public void removeServer(org.eclipse.microprofile.openapi.models.servers.Server server) {
        if (!(server instanceof fr.jmini.empoa.swagger.parser.internal.models.servers.SwServer)) {
            throw new IllegalArgumentException("Unexpected type: " + server);
        }
        fr.jmini.empoa.swagger.parser.internal.models.servers.SwServer element = (fr.jmini.empoa.swagger.parser.internal.models.servers.SwServer) server;
        initServers();
        if (_servers != null) {
            _servers.remove(server);
            _swPathItem.getServers()
                    .remove(element.getSw());
        }
    }

    private java.util.List<fr.jmini.empoa.swagger.parser.internal.models.parameters.SwParameter> _parameters;

    private void initParameters() {
        if (_swPathItem.getParameters() == null) {
            _parameters = null;
        } else {
            _swPathItem.getParameters()
                    .stream()
                    .map(fr.jmini.empoa.swagger.parser.internal.models.parameters.SwParameter::new)
                    .collect(java.util.stream.Collectors.toCollection(java.util.ArrayList::new));
        }
    }

    @Override
    public java.util.List<org.eclipse.microprofile.openapi.models.parameters.Parameter> getParameters() {
        initParameters();
        if (_parameters == null) {
            return null;
        }
        return java.util.Collections.unmodifiableList(_parameters);
    }

    @Override
    public void setParameters(java.util.List<org.eclipse.microprofile.openapi.models.parameters.Parameter> parameters) {
        _swPathItem.setParameters(null);
        if (parameters != null) {
            for (org.eclipse.microprofile.openapi.models.parameters.Parameter e : parameters) {
                this.addParameter(e);
            }
        }
    }

    @Override
    public PathItem addParameter(org.eclipse.microprofile.openapi.models.parameters.Parameter parameter) {
        if (!(parameter instanceof fr.jmini.empoa.swagger.parser.internal.models.parameters.SwParameter)) {
            throw new IllegalArgumentException("Unexpected type: " + parameter);
        }
        fr.jmini.empoa.swagger.parser.internal.models.parameters.SwParameter element = (fr.jmini.empoa.swagger.parser.internal.models.parameters.SwParameter) parameter;
        initParameters();
        if (_parameters == null) {
            _parameters = new java.util.ArrayList<>();
            _swPathItem.setParameters(new java.util.ArrayList<>());
        }
        _parameters.add(element);
        _swPathItem.getParameters()
                .add(element.getSw());
        return this;
    }

    @Override
    public void removeParameter(org.eclipse.microprofile.openapi.models.parameters.Parameter parameter) {
        if (!(parameter instanceof fr.jmini.empoa.swagger.parser.internal.models.parameters.SwParameter)) {
            throw new IllegalArgumentException("Unexpected type: " + parameter);
        }
        fr.jmini.empoa.swagger.parser.internal.models.parameters.SwParameter element = (fr.jmini.empoa.swagger.parser.internal.models.parameters.SwParameter) parameter;
        initParameters();
        if (_parameters != null) {
            _parameters.remove(parameter);
            _swPathItem.getParameters()
                    .remove(element.getSw());
        }
    }

}
