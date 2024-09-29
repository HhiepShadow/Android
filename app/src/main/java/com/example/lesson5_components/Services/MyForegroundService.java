package com.example.lesson5_components.Services;

import java.security.Provider;
import java.util.List;
import java.util.Map;

public class MyForegroundService extends Provider.Service {

    public MyForegroundService(Provider provider, String type, String algorithm, String className, List<String> aliases, Map<String, String> attributes) {
        super(provider, type, algorithm, className, aliases, attributes);
    }
}
