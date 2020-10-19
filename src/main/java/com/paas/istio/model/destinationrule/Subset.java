package com.paas.istio.model.destinationrule;

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
import java.util.List;
import java.util.Map;

/**
 * @Classname TrafficPolicy
 * @Description TODO
 * @Date 2020/10/6 0006 10:07
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
public class Subset implements KubernetesResource {
    /**
     * 版本子集名称
     */
    private String name;
    /**
     * 子集的筛选标签(用于定位目标版本的pod,一般建议使用version标签)
     */
    private Map<String, String> labels;
    /**
     * 针对当前子集的trafficPolicy流量策略,如果子集配置了策略会被优先使用
     */
    private TrafficPolicy trafficPolicy;


}
