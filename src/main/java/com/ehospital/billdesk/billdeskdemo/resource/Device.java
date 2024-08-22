package com.ehospital.billdesk.billdeskdemo.resource;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class Device {

    @JsonProperty("accept_header")
    private String acceptHeader;

    @JsonProperty("init_channel")
    private String initChannel;

    @JsonProperty("ip")
    private String ip;

    @JsonProperty("user_agent")
    private String userAgent;

    @JsonProperty("browser_language")
    private String browserLanguage;

    @JsonProperty("browser_javascript_enabled")
    private String browserJavascriptEnabled;

    @JsonProperty("browser_tz")
    private String browserTz;

    @JsonProperty("browser_color_depth")
    private String browserColorDepth;

    @JsonProperty("browser_java_enabled")
    private String browserJavaEnabled;

    @JsonProperty("browser_screen_height")
    private String browserScreenHeight;

    @JsonProperty("browser_screen_width")
    private String browserScreenWidth;

    // Constructor
    public Device() {
    }
}
