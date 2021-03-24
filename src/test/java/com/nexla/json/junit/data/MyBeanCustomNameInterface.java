package com.nexla.json.junit.data;

import com.nexla.json.JSONPropertyIgnore;
import com.nexla.json.JSONPropertyName;

public interface MyBeanCustomNameInterface {
    @JSONPropertyName("InterfaceField")
    float getSomeFloat();
    @JSONPropertyIgnore
    int getIgnoredInt();
}