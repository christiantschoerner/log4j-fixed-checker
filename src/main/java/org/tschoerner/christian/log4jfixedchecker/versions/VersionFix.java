package org.tschoerner.christian.log4jfixedchecker.versions;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @author Christian Tschörner
 */
public enum VersionFix {

    VERSION118(Collections.singletonList("1.18")),
    VERSION117(Collections.singletonList("1.17")),
    VERSION112UNTIL1165(Arrays.asList("1.12", "1.13", "1.14", "1.15", "1.16")),
    VERSION17UNTIL1112(Arrays.asList("1.7", "1.8", "1.9", "1.10", "1.11"));

    private final List<String> detectKeys;

    VersionFix(List<String> detectKeys){
        this.detectKeys = detectKeys;
    }

    public List<String> getDetectKeys() {
        return detectKeys;
    }
}
