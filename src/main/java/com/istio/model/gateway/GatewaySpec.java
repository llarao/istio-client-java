package com.istio.model.gateway;

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
 * @Classname GatewaySpec
 * @Description TODO
 * @Date 2020/10/9 0009 9:56
 * @Create by llarao
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
        "apiVersion",
        "kind",
        "metadata",
        "spec",
        "status"
})
@JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@ToString
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
@Data
public class GatewaySpec implements KubernetesResource {
    /**
     * 执行GW规则的Envoy的标签,在istio1.1版本后官方建议将执行规则的envoy放在与gw规则同一个命名空间下,但官方的经典项目
     * bookinfo依然将该envoy服务放在istio-system中
     */
    private Map<String, String> selector;

    private List<GatewayServer> servers;


}
