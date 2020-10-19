package com.paas.istio.model.virtualservice;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * @Classname VirtualServiceSpecFluentImpl
 * @Description TODO
 * @Date 2020/10/21 0021 10:20
 * @Create by llarao
 */
public class SpecHttpFluentImpl<A extends SpecHttpFluent<A>> extends io.fabric8.kubernetes.api.builder.BaseFluent<A> implements SpecHttpFluent<A> {

    private List<SpecHttpRouteBuilder> route;
    private List<SpecHttpMatchBuilder> match;
    private SpecHttpRewriteBuilder rewrite;
    private SpecHttpRetriesBuilder retries;
    private SpecHttpMirrorBuilder mirror;

    public SpecHttpFluentImpl(){
    }
    public SpecHttpFluentImpl(SpecHttp instance){
        this.withRoutes(instance.getRoute());
        this.withMatchs(instance.getMatch());
        this.withRewrite(instance.getRewrite());
        this.withRetries(instance.getRetries());
        this.withMirror(instance.getMirror());
    }

    @Override
    public List<SpecHttpRoute> getRoutes() {
        return build(route);
    }

    @Override
    public SpecHttpRoute buildRoutes(int index) {
        return this.route.get(index).build();
    }

    @Override
    public List<SpecHttpRoute> buildRoutes() {
        return build(route);
    }

    @Override
    public A withRoutes(List<SpecHttpRoute> route) {
        if (this.route != null) {
            _visitables.get("route").removeAll(this.route);
        }
        if (route != null) {
            this.route = new ArrayList<>();
            for (SpecHttpRoute item : route){
                this.addToRoutes(item);
            }
        } else {
            this.route = null;
        }
        return (A) this;
    }

    @Override
    public A withRoutes(SpecHttpRoute... route) {
        if (this.route != null) {
            this.route.clear();
        }
        if (route != null) {
            for (SpecHttpRoute item :route){
                this.addToRoutes(item);
            }
        }
        return (A) this;    }

    @Override
    public Boolean hasRoutes() {
        return route!=null;
    }

    @Override
    public SpecHttpRouteNested<A> addNewRoutes() {
        return new SpecHttpRouteNestedImpl();
    }

    @Override
    public SpecHttpRouteNested<A> setNewRouteLike(int i, SpecHttpRoute item) {
        return new SpecHttpRouteNestedImpl(i,item);

    }

    @Override
    public SpecHttpRouteNested<A> setNewRouteLike(SpecHttpRoute item) {
        return new SpecHttpRouteNestedImpl(-1,item);
    }

    @Override
    public SpecHttpRouteNested<A> editRoutes(int i) {
        if (route.size() <= 0) {
            throw new RuntimeException("Can't edit route. Index exceeds size.");
        }
        return setNewRouteLike(i, buildRoutes(i));
    }

    @Override
    public SpecHttpRouteNested<A> editFirstRoutes() {
        if (route.size() == 0) {
            throw new RuntimeException("Can't edit route. Index exceeds size.");
        }
        return setNewRouteLike(0, buildRoutes(0));
    }

    @Override
    public SpecHttpRouteNested<A> editLastRoutes() {
        int index = route.size() - 1;
        if (index < 0) {
            throw new RuntimeException("Can't edit route. Index exceeds size.");
        }
        return setNewRouteLike(0, buildRoutes(0));
    }




    @Override
    public A addNewRoutes(SpecHttpRoute specHttpRoute) {
        return this.addToRoutes(-1,specHttpRoute);
    }



    @Override
    public A setToRoutes(int index, SpecHttpRoute item) {
        if (this.route == null) {
            this.route = new ArrayList<SpecHttpRouteBuilder>();
        }
        SpecHttpRouteBuilder builder = new SpecHttpRouteBuilder(item);
        if (index < 0 || index >= _visitables.get("route").size()) {
            _visitables.get("route").add(builder);
        } else {
            _visitables.get("route").set(index, builder);
        }
        if (index < 0 || index >= route.size()) {
            route.add(builder);
        } else {
            route.set(index, builder);
        }
        return (A)this;
    }

    @Override
    public A addToRoutes(int index, SpecHttpRoute item) {
        if (this.route == null) {
            this.route = new ArrayList<SpecHttpRouteBuilder>();
        }
        SpecHttpRouteBuilder builder = new SpecHttpRouteBuilder(item);
        _visitables.get("route").add(index >= 0 ? index : _visitables.get("route").size(), builder);
        this.route.add(index >= 0 ? index : route.size(), builder);
        return (A)this;
    }

    @Override
    public A addToRoutes(SpecHttpRoute... items) {
        if (this.route == null) {
            this.route = new ArrayList<SpecHttpRouteBuilder>();
        }
        for (SpecHttpRoute item : items) {
            SpecHttpRouteBuilder builder = new SpecHttpRouteBuilder(item);
            _visitables.get("route").add(builder);
            this.route.add(builder);
        }
        return (A)this;
    }

    @Override
    public A addAllToRoutes(Collection<SpecHttpRoute> items) {
        if (this.route == null) {
            this.route = new ArrayList<SpecHttpRouteBuilder>();
        }
        for (SpecHttpRoute item : items) {
            SpecHttpRouteBuilder builder = new SpecHttpRouteBuilder(item);
            _visitables.get("route").add(builder);
            this.route.add(builder);
        }
        return (A)this;      }

    @Override
    public A removeFromRoutes(SpecHttpRoute... items) {
        for (SpecHttpRoute item : items) {
            SpecHttpRouteBuilder builder = new SpecHttpRouteBuilder(item);
            _visitables.get("route").remove(builder);
            if (this.route != null) {
                this.route.remove(builder);
            }
        }
        return (A)this;
    }

    @Override
    public A removeAllFromRoutes(Collection<SpecHttpRoute> items) {
        for (SpecHttpRoute item : items) {
            SpecHttpRouteBuilder builder = new SpecHttpRouteBuilder(item);
            _visitables.get("route").remove(builder);
            if (this.route != null) {
                this.route.remove(builder);
            }
        }
        return (A)this;
    }

    @Override
    public List<SpecHttpMatch> getMatchs() {
        return build(match);
    }

    @Override
    public List<SpecHttpMatch> buildMatchs() {
        return build(match);

    }

    @Override
    public SpecHttpMatch buildMatchs(int index) {
        return this.match.get(index).build();
    }

    @Override
    public A withMatchs(List<SpecHttpMatch> match) {
        if (this.match != null) { _visitables.get("match").removeAll(this.match);}
        if (match != null) {
            this.match = new ArrayList<>();
            for (SpecHttpMatch item : match){
                this.addToMatch(item);
            }
        } else {
            this.match = null;
        }
        return (A) this;
    }

    @Override
    public A withMatchs(SpecHttpMatch... match) {
        if (this.match != null) {
            this.match.clear();
        }
        if (match != null) {
            for (SpecHttpMatch item :match){
                this.addToMatch(item);
            }
        }
        return (A) this;
    }

    @Override
    public Boolean hasMatchs() {
        return this.match!=null;
    }

    @Override
    public SpecHttpMatchNested addNewMatch() {
        return new SpecHttpMatchNestedImpl<>();
    }

    @Override
    public SpecHttpMatchNested addNewMatchLike(SpecHttpMatch item) {
        return new SpecHttpMatchNestedImpl<>(-1,item);

    }

    @Override
    public SpecHttpMatchNested<A> setNewMatchLike(int i, SpecHttpMatch item) {
        return new SpecHttpMatchNestedImpl<>(i,item);

    }

    @Override
    public SpecHttpMatchNested editMatchs(int index) {
        if (match.size() <= 0) {
            throw new RuntimeException("Can't edit match. Index exceeds size.");
        }
        return setNewMatchLike(index, buildMatchs(index));
    }

    @Override
    public SpecHttpMatchNested editFirstMatchs() {
        if (match.size() == 0) {
            throw new RuntimeException("Can't edit match. Index exceeds size.");
        }
        return setNewMatchLike(0, buildMatchs(0));
    }

    @Override
    public SpecHttpMatchNested editLastMatchs() {
        int index = match.size() - 1;
        if (index < 0) {
            throw new RuntimeException("Can't edit match. Index exceeds size.");
        }
        return setNewMatchLike(index, buildMatchs(index));
    }


    @Override
    public A addNewMatch(SpecHttpMatch specHttp) {
        return this.addToMatch(-1,specHttp);
    }

    @Override
    public A addToMatch(int index, SpecHttpMatch match) {
        if (this.match == null) {
            this.match = new ArrayList<SpecHttpMatchBuilder>();
        }
        SpecHttpMatchBuilder builder = new SpecHttpMatchBuilder(match);
        _visitables.get("match").add(index >= 0 ? index : _visitables.get("match").size(), builder);
        this.match.add(index >= 0 ? index : this.match.size(), builder);
        return (A)this;
    }

    @Override
    public A setToMatch(int index, SpecHttpMatch item) {
        if (this.match == null) {
            this.match = new ArrayList<SpecHttpMatchBuilder>();
        }
        SpecHttpMatchBuilder builder = new SpecHttpMatchBuilder(item);
        if (index < 0 || index >= _visitables.get("match").size()) {
            _visitables.get("match").add(builder);
        } else {
            _visitables.get("match").set(index, builder);
        }
        if (index < 0 || index >= match.size()) {
            match.add(builder);
        } else {
            match.set(index, builder);
        }
        return (A)this;
    }

    @Override
    public A addToMatch(SpecHttpMatch... match) {
        if (this.match == null) {
            this.match = new ArrayList<SpecHttpMatchBuilder>();
        }
        for (SpecHttpMatch item : match) {
            SpecHttpMatchBuilder builder = new SpecHttpMatchBuilder(item);
            _visitables.get("match").add(builder);
            this.match.add(builder);
        }
        return (A)this;
    }

    @Override
    public A addAllToMatchs(Collection<SpecHttpMatch> match) {
        if (this.match == null) {
            this.match = new ArrayList<SpecHttpMatchBuilder>();
        }
        for (SpecHttpMatch item : match) {
            SpecHttpMatchBuilder builder = new SpecHttpMatchBuilder(item);
            _visitables.get("match").add(builder);
            this.match.add(builder);
        }
        return (A)this;
    }

    @Override
    public A removeFromMatch(SpecHttpMatch... match) {
        for (SpecHttpMatch item : match) {
            SpecHttpMatchBuilder builder = new SpecHttpMatchBuilder(item);
            _visitables.get("match").remove(builder);
            if (this.match != null) {
                this.match.remove(builder);
            }
        }
        return (A)this;
    }

    @Override
    public A removeAllFromMatchs(Collection<SpecHttpMatch> match) {
        for (SpecHttpMatch item : match) {
            SpecHttpMatchBuilder builder = new SpecHttpMatchBuilder(item);
            _visitables.get("match").remove(builder);
            if (this.match != null) {
                this.match.remove(builder);
            }
        }
        return (A)this;
    }

    @Override
    public SpecHttpRewrite getRewrite() {
        return this.rewrite!=null?this.rewrite.build():null;
    }

    @Override
    public SpecHttpRewrite buildRewrite() {
        return this.rewrite!=null?this.rewrite.build():null;
    }

    @Override
    public A withRewrite(SpecHttpRewrite rewrite) {
        _visitables.get("rewrite").remove(this.rewrite);
        if (rewrite!=null){ this.rewrite= new SpecHttpRewriteBuilder(rewrite); _visitables.get("rewrite").add(this.rewrite);} return (A) this;
    }

    @Override
    public Boolean hasRewrite() {
        return this.rewrite!=null;
    }

    @Override
    public SpecHttpRewriteNested<A> withNewRewrite() {
        return new SpecHttpRewriteNestedImpl<>();
    }

    @Override
    public SpecHttpRewriteNested<A> withNewRewriteLike(SpecHttpRewrite item) {
        return new SpecHttpRewriteNestedImpl(item);

    }

    @Override
    public SpecHttpRewriteNested<A> editRewrite() {
        return withNewRewriteLike(getRewrite());
    }

    @Override
    public SpecHttpRewriteNested<A> editOrNewRewrite() {
        return withNewRewriteLike(getRewrite() != null ? getRewrite(): new SpecHttpRewriteBuilder().build());

    }

    @Override
    public SpecHttpRewriteNested<A> editOrNewRewriteLike(SpecHttpRewrite item) {
        return withNewRewriteLike(getRewrite() != null ? getRewrite(): item);
    }

    @Override
    public SpecHttpRetries getRetries() {
        return this.retries!=null?this.retries.build():null;

    }

    @Override
    public SpecHttpRetries buildRetries() {
        return this.retries!=null?this.retries.build():null;

    }

    @Override
    public A withRetries(SpecHttpRetries retries) {
        _visitables.get("retries").remove(this.retries);
        if (retries!=null){ this.retries= new SpecHttpRetriesBuilder(retries); _visitables.get("retries").add(this.retries);} return (A) this;
    }

    @Override
    public Boolean hasRetries() {
        return this.retries!=null;

    }

    @Override
    public SpecHttpRetriesNested<A> withNewRetries() {
        return new SpecHttpRetriesNestedImpl<>();

    }

    @Override
    public SpecHttpRetriesNested<A> withNewRetriesLike(SpecHttpRetries item) {
        return new SpecHttpRetriesNestedImpl<>(item);

    }

    @Override
    public SpecHttpRetriesNested<A> editRetries() {
        return withNewRetriesLike(getRetries());

    }

    @Override
    public SpecHttpRetriesNested<A> editOrNewRetries() {
        return withNewRetriesLike(getRetries() != null ? getRetries(): new SpecHttpRetriesBuilder().build());

    }

    @Override
    public SpecHttpRetriesNested<A> editOrNewRetriesLike(SpecHttpRetries item) {
        return withNewRetriesLike(getRetries() != null ? getRetries(): item);

    }

    @Override
    public SpecHttpMirror getMirror() {
        return this.mirror!=null?this.mirror.build():null;

    }

    @Override
    public SpecHttpMirror buildMirror() {
        return this.mirror!=null?this.mirror.build():null;

    }

    @Override
    public A withMirror(SpecHttpMirror mirror) {
        _visitables.get("mirror").remove(this.mirror);
        if (mirror!=null){ this.mirror= new SpecHttpMirrorBuilder(mirror); _visitables.get("mirror").add(this.mirror);} return (A) this;
    }

    @Override
    public Boolean hasMirror() {
        return this.mirror!=null;

    }

    @Override
    public SpecHttpMirrorNested<A> withNewMirror() {
        return new SpecHttpMirrorNestedImpl<>();

    }

    @Override
    public SpecHttpMirrorNested<A> withNewMirrorLike(SpecHttpMirror item) {
        return new SpecHttpMirrorNestedImpl<>(item);

    }

    @Override
    public SpecHttpMirrorNested<A> editMirror() {
        return withNewMirrorLike(getMirror());

    }

    @Override
    public SpecHttpMirrorNested<A> editOrNewMirror() {
        return withNewMirrorLike(getMirror() != null ? getMirror(): new SpecHttpMirrorBuilder().build());

    }

    @Override
    public SpecHttpMirrorNested<A> editOrNewMirrorLike(SpecHttpMirror item) {
        return withNewMirrorLike(getMirror() != null ? getMirror(): item);

    }

//    public class SpecHttpRouteNestedImpl<N> extends SpecHttpRouteFluentImpl<SpecHttpFluent.SpecHttpRouteNested<N>> implements SpecHttpFluent.SpecHttpRouteNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{
//
//        private SpecHttpRouteBuilder builder;
//        private final int index;
//
//        SpecHttpRouteNestedImpl(int index, SpecHttpRoute item){
//            this.builder = new SpecHttpRouteBuilder(this, item);
//        }
//        SpecHttpRouteNestedImpl(){
//            this.builder = new SpecHttpRouteBuilder(this);
//        }
//
//        @Override
//        public N and(){
//            return (N) SpecHttpFluentImpl.this.setNewRouteLike(index,builder.build());
//        }
//
//
//    }

    public class SpecHttpRouteNestedImpl<N> extends SpecHttpRouteFluentImpl<SpecHttpFluent.SpecHttpRouteNested<N>> implements SpecHttpFluent.SpecHttpRouteNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

        private SpecHttpRouteBuilder builder;
        private final int index;

        SpecHttpRouteNestedImpl(int index, SpecHttpRoute item){
            this.index = index;
            this.builder = new SpecHttpRouteBuilder(this, item);
        }
        SpecHttpRouteNestedImpl(){
            this.index = -1;
            this.builder = new SpecHttpRouteBuilder(this);
        }

        @Override
        public N and(){
            return (N) SpecHttpFluentImpl.this.setToRoutes(index,builder.build());
        }

        @Override
        public N endRoute() {
            return and();
        }


    }

    public class SpecHttpMatchNestedImpl<N> extends SpecHttpMatchFluentImpl<SpecHttpFluent.SpecHttpMatchNested<N>> implements SpecHttpFluent.SpecHttpMatchNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

        private SpecHttpMatchBuilder builder;
        private final int index;

        SpecHttpMatchNestedImpl(int index, SpecHttpMatch item){
            this.index = index;
            this.builder = new SpecHttpMatchBuilder(this, item);
        }
        SpecHttpMatchNestedImpl(){
            this.index = -1;
            this.builder = new SpecHttpMatchBuilder(this);
        }

        @Override
        public N and(){
            return (N) SpecHttpFluentImpl.this.setToMatch(index,builder.build());
        }

        @Override
        public N endMatch() {
            return and();
        }
    }

    public class SpecHttpRewriteNestedImpl<N> extends SpecHttpRewriteFluentImpl<SpecHttpRewriteNested<N>> implements SpecHttpFluent.SpecHttpRewriteNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

        private SpecHttpRewriteBuilder builder;

        SpecHttpRewriteNestedImpl(SpecHttpRewrite item){
            this.builder = new SpecHttpRewriteBuilder(this, item);
        }
        SpecHttpRewriteNestedImpl(){
            this.builder = new SpecHttpRewriteBuilder(this);
        }

        @Override
        public N and(){
            return (N) SpecHttpFluentImpl.this.withRewrite(builder.build());
        }

        @Override
        public N endRewrite() {
            return and();
        }
    }

    public class SpecHttpRetriesNestedImpl<N> extends SpecHttpRetriesFluentImpl<SpecHttpRetriesNested<N>> implements SpecHttpRetriesNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

        private SpecHttpRetriesBuilder builder;

        SpecHttpRetriesNestedImpl(SpecHttpRetries item){
            this.builder = new SpecHttpRetriesBuilder(this, item);
        }
        SpecHttpRetriesNestedImpl(){
            this.builder = new SpecHttpRetriesBuilder(this);
        }

        @Override
        public N and(){
            return (N) SpecHttpFluentImpl.this.withRetries(builder.build());
        }

        @Override
        public N endRetries() {
            return and();
        }
    }


    public class SpecHttpMirrorNestedImpl<N> extends SpecHttpMirrorFluentImpl<SpecHttpMirrorNested<N>> implements SpecHttpFluent.SpecHttpMirrorNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

        private SpecHttpMirrorBuilder builder;

        SpecHttpMirrorNestedImpl(SpecHttpMirror item){
            this.builder = new SpecHttpMirrorBuilder(this, item);
        }
        SpecHttpMirrorNestedImpl(){
            this.builder = new SpecHttpMirrorBuilder(this);
        }

        @Override
        public N and(){
            return (N) SpecHttpFluentImpl.this.withMirror(builder.build());
        }

        @Override
        public N endMirror() {
            return and();
        }
    }

}
