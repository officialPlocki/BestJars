package me.revoltix.bestjars.util.files;

import java.util.Map;

public interface ConfigurationSerializable {

    Map<String, Object> serialize();
}