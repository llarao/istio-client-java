package com.paas.istio.model.virtualservice;

import java.util.HashMap;
import java.util.Map;

/**
 * @Classname VirtualServiceSpecHttpMatchFluent
 * @Description TODO
 * @Date 2020/10/20 0020 16:00
 * @Create by llarao
 */
public class SpecHttpMatchFluentImpl<A extends SpecHttpMatchFluent<A>> extends io.fabric8.kubernetes.api.builder.BaseFluent<A> implements SpecHttpMatchFluent<A> {
    private Map<String, SpecHttpMatchConditionBuilder> headers;
    private SpecHttpMatchConditionBuilder uri;
    private SpecHttpMatchConditionBuilder scheme;
    private SpecHttpMatchConditionBuilder methods;
    private Map<String, String> sourceLabels;


    public SpecHttpMatchFluentImpl(){
    }
    public SpecHttpMatchFluentImpl(SpecHttpMatch instance){
        this.withHeaders(instance.getHeaders());
        this.withUri(instance.getUri());
        this.withScheme(instance.getScheme());
        this.withMethods(instance.getMethods());
        this.withSourceLabels(instance.getSourceLabels());
    }

    @Override
    public Map<String, SpecHttpMatchCondition> getHeaders() {
        Map<String, SpecHttpMatchCondition> headerMap = new HashMap<>();
        if (headers != null) {
            for (String key : headers.keySet()) {
                headerMap.put(key, headers.get(key).build());
            }
        }
        return headerMap;

    }

    @Override
    public Map<String, SpecHttpMatchCondition> buildHeaders() {
        Map<String, SpecHttpMatchCondition> headerMap = new HashMap<>();
        if (headers != null) {
            for (String key : headers.keySet()) {
                headerMap.put(key, headers.get(key).build());
            }
        }
        return headerMap;
    }

    @Override
    public SpecHttpMatchCondition buildHeader(String key) {
        return headers.get(key)==null?null:headers.get(key).build();
    }

    @Override
    public A withHeaders(Map<String, SpecHttpMatchCondition> headers) {
        if (this.headers == null) {
            this.headers = new HashMap<>();
        }
        if (headers != null) {
            for (String key : headers.keySet()) {
                this.headers.put(key, new SpecHttpMatchConditionBuilder(headers.get(key)));
            }
        } else {
            this.headers = null;
        }

        return (A) this;
    }

    @Override
    public Boolean hasHeaders() {
        return this.headers!=null;
    }

    @Override
    public SpecHttpMatchHeaderConditionNested<A> addNewHeader(String key) {
        return new SpecHttpMatchHeaderConditionNestedImpl<>(key);
    }

    @Override
    public SpecHttpMatchHeaderConditionNested<A> addNewHeadersLike(String key , SpecHttpMatchCondition item) {
        return new SpecHttpMatchHeaderConditionNestedImpl<>(key, item);
    }

    @Override
    public SpecHttpMatchHeaderConditionNested<A> editHeaders(String key) {
        if (!headers.containsKey(key)) {
            throw new RuntimeException("Can't edit headers. key is node exceeds .");
        }
        return addNewHeadersLike(key,buildHeader(key));
    }



    @Override
    public A addNewHeaders(String key ,SpecHttpMatchCondition item) {
        if (this.headers == null) {
            this.headers = new HashMap();
        }
        SpecHttpMatchConditionBuilder builder = new SpecHttpMatchConditionBuilder(item);
        this.headers.put(key, builder);
        return (A)this;
    }

    @Override
    public A removeFromHeaders(String... keys) {
        if (this.headers == null) {
            return null;
        } else {
            for (String key : keys) {
                this.headers.remove(key);
            }
        }
        return (A)this;
    }

    @Override
    public SpecHttpMatchCondition getUri() {
        return this.uri!=null?this.uri.build():null;

    }

    @Override
    public SpecHttpMatchCondition buildUri() {
        return this.uri!=null?this.uri.build():null;

    }

    @Override
    public A withUri(SpecHttpMatchCondition uri) {
        _visitables.get("uri").remove(this.uri);
        if (uri!=null){ this.uri= new SpecHttpMatchConditionBuilder(uri); _visitables.get("uri").add(this.uri);} return (A) this;
    }

    @Override
    public Boolean hasUri() {
        return this.uri != null;
    }

    @Override
    public SpecHttpMatchUriConditionNested<A> withNewUri() {
        return new SpecHttpMatchUriConditionNestedImpl<>();
    }

    @Override
    public SpecHttpMatchUriConditionNested<A> withNewUriLike(SpecHttpMatchCondition item) {
        return new SpecHttpMatchUriConditionNestedImpl<>(item);

    }

    @Override
    public SpecHttpMatchUriConditionNested<A> editUris() {
        return withNewUriLike(getUri());

    }

    @Override
    public SpecHttpMatchUriConditionNested<A> editOrNewUri() {
        return withNewUriLike(getUri() != null ? getUri(): new SpecHttpMatchConditionBuilder().build());

    }

    @Override
    public SpecHttpMatchUriConditionNested<A> editOrNewUriLike(SpecHttpMatchCondition item) {
        return withNewUriLike(getUri() != null ? getUri(): item);

    }

    @Override
    public SpecHttpMatchCondition getScheme() {
        return this.uri!=null?this.uri.build():null;

    }

    @Override
    public SpecHttpMatchCondition buildScheme() {
        return this.uri!=null?this.uri.build():null;

    }

    @Override
    public A withScheme(SpecHttpMatchCondition scheme) {
        _visitables.get("scheme").remove(this.scheme);
        if (scheme!=null){ this.scheme= new SpecHttpMatchConditionBuilder(scheme); _visitables.get("scheme").add(this.scheme);} return (A) this;
    }

    @Override
    public Boolean hasScheme() {
        return this.scheme != null;

    }

    @Override
    public SpecHttpMatchSchemeConditionNested<A> withNewScheme() {
        return new SpecHttpMatchSchemeConditionNestedImpl<>();
    }

    @Override
    public SpecHttpMatchSchemeConditionNested<A> withNewSchemeLike(SpecHttpMatchCondition item) {
        return new SpecHttpMatchSchemeConditionNestedImpl<>(item);
    }

    @Override
    public SpecHttpMatchSchemeConditionNested<A> editSchemes() {
        return withNewSchemeLike(getScheme());
    }

    @Override
    public SpecHttpMatchSchemeConditionNested<A> editOrNewScheme() {
        return withNewSchemeLike(getScheme() != null ? getScheme(): new SpecHttpMatchConditionBuilder().build());
    }

    @Override
    public SpecHttpMatchSchemeConditionNested<A> editOrNewSchemeLike(SpecHttpMatchCondition item) {
        return withNewSchemeLike(getScheme() != null ? getScheme(): item);
    }

    @Override
    public SpecHttpMatchCondition getMethods() {
        return this.methods!=null?this.methods.build():null;
    }

    @Override
    public SpecHttpMatchCondition buildMethods() {
        return this.methods!=null?this.methods.build():null;
    }

    @Override
    public A withMethods(SpecHttpMatchCondition methods) {
        _visitables.get("methods").remove(this.methods);
        if (methods!=null){
            this.methods= new SpecHttpMatchConditionBuilder(methods);
            _visitables.get("methods").add(this.methods);
        }
        return (A) this;
    }

    @Override
    public Boolean hasMethods() {
        return this.methods != null;
    }

    @Override
    public SpecHttpMatchMethodsConditionNested<A> withNewMethods() {
        return new SpecHttpMatchMethodsConditionNestedImpl<>();
    }

    @Override
    public SpecHttpMatchMethodsConditionNested<A> withNewMethodsLike(SpecHttpMatchCondition item) {
        return new SpecHttpMatchMethodsConditionNestedImpl<>(item);
    }

    @Override
    public SpecHttpMatchMethodsConditionNested<A> editMethods() {
        return withNewMethodsLike(getMethods());
    }

    @Override
    public SpecHttpMatchMethodsConditionNested<A> editOrNewMethods() {
        return withNewMethodsLike(getMethods() != null ? getMethods(): new SpecHttpMatchConditionBuilder().build());
    }

    @Override
    public SpecHttpMatchMethodsConditionNested<A> editOrNewMethodsLike(SpecHttpMatchCondition item) {
        return withNewMethodsLike(getMethods() != null ? getMethods(): item);
    }

    @Override
    public Map<String, String> getSourceLabels() {
        return this.sourceLabels;
    }

    @Override
    public Map<String, String> buildSourceLabels() {
        return this.sourceLabels;
    }

    @Override
    public A withSourceLabels(Map<String, String> sourceLabels) {
        if (sourceLabels!=null) {
            this.sourceLabels = new HashMap<>();
            this.sourceLabels.putAll(sourceLabels);
        }
        return (A) this;
    }

    @Override
    public Boolean hasSourceLabels() {
        return this.sourceLabels != null;
    }

    @Override
    public A setNewSourceLabel(String key, String value) {
        if (this.sourceLabels==null) {
            this.sourceLabels = new HashMap<>();
        }
        this.sourceLabels.put(key, value);
        return (A) this;
    }

    @Override
    public A addAllToSourceLabels(Map<String, String> sourceLabels) {
        if (this.sourceLabels==null) {
            this.sourceLabels = new HashMap<>();
        }
        this.sourceLabels.putAll(sourceLabels);
        return  (A) this;
    }

    @Override
    public A removeFromSourceLabel(String... items) {
        if (this.sourceLabels!=null) {
            if (items != null) {
                for (String item : items) {
                    this.sourceLabels.remove(item);
                }
            }
        }
        return  (A) this;
    }

    public class SpecHttpMatchConditionNestedImpl<N>
            extends SpecHttpMatchConditionFluentImpl<SpecHttpMatchFluent.SpecHttpMatchConditionNested<N>>
            implements SpecHttpMatchFluent.SpecHttpMatchConditionNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

        private SpecHttpMatchConditionBuilder builder;

        SpecHttpMatchConditionNestedImpl(SpecHttpMatchCondition item){
            this.builder = new SpecHttpMatchConditionBuilder(this, item);
        }
        SpecHttpMatchConditionNestedImpl(){
            this.builder = new SpecHttpMatchConditionBuilder(this);
        }

        @Override
        public N and(){
            return (N) SpecHttpMatchFluentImpl.this.withUri(builder.build());
        }

        @Override
        public N endCondition() {
            return and();
        }

    }

    public class SpecHttpMatchHeaderConditionNestedImpl<N> extends SpecHttpMatchConditionFluentImpl<SpecHttpMatchHeaderConditionNested<N>> implements SpecHttpMatchFluent.SpecHttpMatchHeaderConditionNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

        private SpecHttpMatchConditionBuilder builder;
        private String key;

        SpecHttpMatchHeaderConditionNestedImpl(String key,SpecHttpMatchCondition item){
            this.builder = new SpecHttpMatchConditionBuilder(this, item);
            this.key = key;
        }
        SpecHttpMatchHeaderConditionNestedImpl(String key){
            this.builder = new SpecHttpMatchConditionBuilder(this);
            this.key = key;
        }

        @Override
        public N and(){
            Map<String,SpecHttpMatchCondition> map = new HashMap();
            map.put(key, builder.build());
            return (N) SpecHttpMatchFluentImpl.this.withHeaders(map);
        }

        @Override
        public N endHeader() {
            return and();
        }

    }

    public class SpecHttpMatchUriConditionNestedImpl<N> extends SpecHttpMatchConditionFluentImpl<SpecHttpMatchUriConditionNested<N>> implements SpecHttpMatchFluent.SpecHttpMatchUriConditionNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

        private SpecHttpMatchConditionBuilder builder;

        SpecHttpMatchUriConditionNestedImpl(SpecHttpMatchCondition item){
            this.builder = new SpecHttpMatchConditionBuilder(this, item);
        }
        SpecHttpMatchUriConditionNestedImpl(){
            this.builder = new SpecHttpMatchConditionBuilder(this);
        }

        @Override
        public N and(){
            return (N) SpecHttpMatchFluentImpl.this.withUri(builder.build());
        }

        @Override
        public N endUri() {
            return and();
        }

    }

    public class SpecHttpMatchSchemeConditionNestedImpl<N> extends SpecHttpMatchConditionFluentImpl<SpecHttpMatchSchemeConditionNested<N>> implements SpecHttpMatchFluent.SpecHttpMatchSchemeConditionNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

        private SpecHttpMatchConditionBuilder builder;

        SpecHttpMatchSchemeConditionNestedImpl(SpecHttpMatchCondition item){
            this.builder = new SpecHttpMatchConditionBuilder(this, item);
        }
        SpecHttpMatchSchemeConditionNestedImpl(){
            this.builder = new SpecHttpMatchConditionBuilder(this);
        }

        @Override
        public N and(){
            return (N) SpecHttpMatchFluentImpl.this.withScheme(builder.build());
        }

        @Override
        public N endScheme() {
            return and();
        }

    }

    public class SpecHttpMatchMethodsConditionNestedImpl<N>
            extends SpecHttpMatchConditionFluentImpl<SpecHttpMatchMethodsConditionNested<N>>
            implements SpecHttpMatchMethodsConditionNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

        private SpecHttpMatchConditionBuilder builder;

        SpecHttpMatchMethodsConditionNestedImpl(SpecHttpMatchCondition item){
            this.builder = new SpecHttpMatchConditionBuilder(this, item);
        }
        SpecHttpMatchMethodsConditionNestedImpl(){
            this.builder = new SpecHttpMatchConditionBuilder(this);
        }

        @Override
        public N and(){
            return (N) SpecHttpMatchFluentImpl.this.withMethods(builder.build());
        }

        @Override
        public N endMethod() {
            return and();
        }

    }
}
