package org.tschoerner.christian.log4jfixedchecker.versions;

import org.bukkit.Bukkit;
import org.tschoerner.christian.log4jfixedchecker.log.LogManager;

/**
 * @author Christian Tschörner
 */
public class VersionDetector {

    public static VersionFix VERSION_FIX = null;

    public static void detectVersion(){
        String version = Bukkit.getServer().getVersion();
        LogManager.log("Detected Version: " + version);

        for(VersionFix versionFix : VersionFix.values()){
            for(String key : versionFix.getDetectKeys()){
                if(version.contains(key)){
                    LogManager.log("Detected Fix: " + versionFix.name());

                    VERSION_FIX = versionFix;
                    break;
                }
            }
        }
    }
}
