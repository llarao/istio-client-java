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

/**
 * @Classname OutlierDetection
 * @Description TODO
 * @Date 2020/10/6 0006 11:00
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
public class OutlierDetection implements KubernetesResource {
    /**
     * 连续出现的访问异常次数
     */
    private Integer consecutiveErrors;

    /**
     * 错误出现的事件段,如interval内连续出现了consecutiveErrors次异常则触发实例隔离
     */
    private String interval;

    /**
     * 试点递增时间间隔
     */
    private String baseEjectionTime;

    /**
     * 最大可驱逐实例的百分比(默认是10%),设置该配置是为了防止驱逐过多实例导致服务能力下降
     */
    private Integer maxEjectionPercent;

    /**
     * 最小健康实例比例,如果可用实例低于该值则会进入恐慌模式,取消对问题实例的驱逐.尽可能维持服务存活(默认50%)
     */
    private Integer minHealthPercent;
}
