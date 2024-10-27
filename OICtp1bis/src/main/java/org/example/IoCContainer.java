package org.example;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class IoCContainer {
    Map<Class<?>, Object > services = new HashMap<Class<?>, Object >();

    public void registerService( Class<?> serviceClass, Object serviceInstance  ){

        services.put(serviceClass, serviceInstance);
    }
    public <T> T getService(Class<T> serviceClass){
        return   serviceClass.cast(services.get(serviceClass));
    }
}
