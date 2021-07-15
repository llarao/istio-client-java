package com.istio.model.destinationrule;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.annotation.Generated;

/**
 * @Classname TcpKeepalive
 * @Description TODO
 * @Date 2020/10/8 0008 17:00
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
public class TcpKeepalive {
    /**
     * 多少次探测没有应答认为连接断开,linux默认配置为9
     */
    private Integer probes;
    /**
     * 连接空闲多少时间后开始探测,linux默认为2h
     */
    private String time;
    /**
     * 探测间隔时间,linux默认为75s
     */
    private String interval;
}
