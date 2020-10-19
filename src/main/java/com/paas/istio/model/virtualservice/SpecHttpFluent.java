package com.paas.istio.model.virtualservice;

import io.fabric8.kubernetes.api.builder.Fluent;

import java.util.Collection;
import java.util.List;

/**
 * @Classname VirtualServiceSpecFluent
 * @Description TODO
 * @Date 2020/10/20 0020 14:52
 * @Create by llarao
 */
public interface SpecHttpFluent<A extends SpecHttpFluent<A>> extends Fluent<A> {

    /*route目标设置*/
    List<SpecHttpRoute> getRoutes();
    SpecHttpRoute buildRoutes(int index);
    List<SpecHttpRoute> buildRoutes();
    A withRoutes(List<SpecHttpRoute> items);
    A withRoutes(SpecHttpRoute... items);
    Boolean hasRoutes();
    SpecHttpRouteNested<A> addNewRoutes();
    SpecHttpRouteNested<A> setNewRouteLike(SpecHttpRoute item);
    SpecHttpRouteNested<A> setNewRouteLike(int i , SpecHttpRoute item);
    SpecHttpRouteNested<A> editFirstRoutes();
    SpecHttpRouteNested<A> editLastRoutes();
    SpecHttpRouteNested<A> editRoutes(int i);
    A addNewRoutes(SpecHttpRoute specHttp);
    A setToRoutes(int index, SpecHttpRoute item);
    A addToRoutes(int index, SpecHttpRoute item);
    A addToRoutes(SpecHttpRoute... items);
    A addAllToRoutes(Collection<SpecHttpRoute> items);
    A removeFromRoutes(SpecHttpRoute... items);
    A removeAllFromRoutes(Collection<SpecHttpRoute> items);

    /*match匹配条件设置*/
    List<SpecHttpMatch> getMatchs();
    List<SpecHttpMatch> buildMatchs();
    SpecHttpMatch buildMatchs(int index);
    A withMatchs(List<SpecHttpMatch> items);
    A withMatchs(SpecHttpMatch... items);
    Boolean hasMatchs();
    SpecHttpMatchNested<A> addNewMatch();
    SpecHttpMatchNested<A> addNewMatchLike(SpecHttpMatch item);
    SpecHttpMatchNested<A> setNewMatchLike(int i , SpecHttpMatch item);
    SpecHttpMatchNested<A> editMatchs(int i);
    SpecHttpMatchNested<A> editFirstMatchs();
    SpecHttpMatchNested<A> editLastMatchs();
    A addNewMatch(SpecHttpMatch specHttp);
    A addToMatch(int index, SpecHttpMatch item);
    A setToMatch(int index, SpecHttpMatch item);
    A addToMatch(SpecHttpMatch... items);
    A addAllToMatchs(Collection<SpecHttpMatch> items);
    A removeFromMatch(SpecHttpMatch... items);
    A removeAllFromMatchs(Collection<SpecHttpMatch> items);

    SpecHttpRewrite getRewrite();
    SpecHttpRewrite buildRewrite();
    A withRewrite(SpecHttpRewrite item);
    Boolean hasRewrite();
    SpecHttpFluent.SpecHttpRewriteNested<A> withNewRewrite();
    SpecHttpFluent.SpecHttpRewriteNested<A> withNewRewriteLike(SpecHttpRewrite item);
    SpecHttpFluent.SpecHttpRewriteNested<A> editRewrite();
    SpecHttpFluent.SpecHttpRewriteNested<A> editOrNewRewrite();
    SpecHttpFluent.SpecHttpRewriteNested<A> editOrNewRewriteLike(SpecHttpRewrite item);

    SpecHttpRetries getRetries();
    SpecHttpRetries buildRetries();
    A withRetries(SpecHttpRetries item);
    Boolean hasRetries();
    SpecHttpRetriesNested<A> withNewRetries();
    SpecHttpRetriesNested<A> withNewRetriesLike(SpecHttpRetries item);
    SpecHttpRetriesNested<A> editRetries();
    SpecHttpRetriesNested<A> editOrNewRetries();
    SpecHttpRetriesNested<A> editOrNewRetriesLike(SpecHttpRetries item);

    SpecHttpMirror getMirror();
    SpecHttpMirror buildMirror();
    A withMirror(SpecHttpMirror item);
    Boolean hasMirror();
    SpecHttpFluent.SpecHttpMirrorNested<A> withNewMirror();
    SpecHttpFluent.SpecHttpMirrorNested<A> withNewMirrorLike(SpecHttpMirror item);
    SpecHttpFluent.SpecHttpMirrorNested<A> editMirror();
    SpecHttpFluent.SpecHttpMirrorNested<A> editOrNewMirror();
    SpecHttpFluent.SpecHttpMirrorNested<A> editOrNewMirrorLike(SpecHttpMirror item);



    public interface SpecHttpRouteNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>, SpecHttpRouteFluent<SpecHttpFluent.SpecHttpRouteNested<N>> {
        public N and();    public N endRoute();
    }

    public interface SpecHttpMatchNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>, SpecHttpMatchFluent<SpecHttpFluent.SpecHttpMatchNested<N>> {
        public N and();    public N endMatch();
    }

    public interface SpecHttpRewriteNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>, SpecHttpRewriteFluent<SpecHttpFluent.SpecHttpRewriteNested<N>> {
        public N and();    public N endRewrite();
    }

    public interface SpecHttpRetriesNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>, SpecHttpRetriesFluent<SpecHttpFluent.SpecHttpRetriesNested<N>> {
        public N and();    public N endRetries();
    }

    public interface SpecHttpMirrorNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>, SpecHttpMirrorFluent<SpecHttpFluent.SpecHttpMirrorNested<N>> {
        public N and();    public N endMirror();
    }
}
