package org.vishnu.prototype;

import java.util.HashMap;
import java.util.Map;

/**
 * @author vishnu.g
 * @project org.vishnu.prototype : prototype-pattern
 * @created 14/May/2020
 */
public class PrototypeRegistry {
    private Map<String, Prototype> prototypeRegistry;

    public PrototypeRegistry() {
        this.prototypeRegistry = new HashMap<>();
    }

    public void addPrototypeToRegistry(String prototypeName, Prototype prototype) {
        this.prototypeRegistry.put(prototypeName, prototype);
    }
    public Prototype getPrototypeCloneFromRegistry(String prototypeName) {
        return this.prototypeRegistry.get(prototypeName).clone();
    }

    public static class RegistryType
    {
        public static final String CONCRETE_PROTOTYPE_A = "concrete-prototype-a";
        public static final String CONCRETE_PROTOTYPE_B = "concrete-prototype-b";
        public static final String CONCRETE_PROTOTYPE_C = "concrete-prototype-c";
    }
}
