package com.paas.istio.model.virtualservice;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import io.fabric8.kubernetes.api.model.KubernetesResource;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.annotation.Generated;
import java.util.Map;

/**
 * @Classname VirtualServiceSpec
 * @Description TODO
 * @Date 2020/10/17 0017 15:57
 * @Create by llarao
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
        "apiVersion",
        "kind",
        "metadata",
})
@JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@ToString
@EqualsAndHashCode
@Data
@AllArgsConstructor
@NoArgsConstructor
public class SpecHttpMatch implements KubernetesResource {
    private Map<String, SpecHttpMatchCondition> headers;
    private SpecHttpMatchCondition uri;
    private SpecHttpMatchCondition scheme;
    private SpecHttpMatchCondition methods;
    private Map<String, String> sourceLabels;
}
