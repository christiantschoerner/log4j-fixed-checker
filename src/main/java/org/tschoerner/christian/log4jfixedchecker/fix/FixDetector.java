package org.tschoerner.christian.log4jfixedchecker.fix;

import org.tschoerner.christian.log4jfixedchecker.log.LogManager;
import org.tschoerner.christian.log4jfixedchecker.versions.VersionDetector;
import org.tschoerner.christian.log4jfixedchecker.versions.VersionFix;

import java.io.File;

/**
 * @author Christian Tschörner
 */
public class FixDetector {

    public static boolean alreadyFixed(){
        VersionFix versionFix = VersionDetector.VERSION_FIX;

        if(versionFix == null){
            LogManager.log("§aPASSED §rYour Minecraft Version is not vulnerable for this exploit");
            return true;
        }

        if(versionFix == VersionFix.VERSION118 || versionFix == VersionFix.VERSION117){
            String jvm = System.getProperty("log4j2.formatMsgNoLookups");

            if(jvm != null && jvm.equalsIgnoreCase("true")){
                LogManager.log("§aPASSED §rFound JVM argument '-Dlog4j2.formatMsgNoLookups=true'");
                return true;
            }else{
                LogManager.log("§cFAILED §rJVM argument '-Dlog4j2.formatMsgNoLookups=true' NOT set");
            }
        }else if(versionFix == VersionFix.VERSION112UNTIL1165){
            File fixFile = new File("log4j2_112-116.xml");

            if(fixFile.exists()){
                LogManager.log("§aPASSED §rFile 'log4j2_112-116.xml' exists");

                String jvm = System.getProperty("log4j.configurationFile");

                if(jvm != null && jvm.equalsIgnoreCase("log4j2_112-116.xml")){
                    LogManager.log("§aPASSED §rFound JVM argument '-Dlog4j.configurationFile=log4j2_112-116.xml'");
                    return true;
                }else{
                    LogManager.log("§cFAILED §rJVM argument '-Dlog4j.configurationFile=log4j2_112-116.xml' NOT set");
                }
            }else{
                LogManager.log("§cFAILED §rFile 'log4j2_112-116.xml' does not exist");
            }
        }else if(versionFix == VersionFix.VERSION17UNTIL1112){
            File fixFile = new File("log4j2_17-111.xml");

            if(fixFile.exists()){
                LogManager.log("§aPASSED §rFile 'log4j2_17-111.xml' exists");

                String jvm = System.getProperty("log4j.configurationFile");

                if(jvm != null && jvm.equalsIgnoreCase("log4j2_17-111.xml")){
                    LogManager.log("§aPASSED §rFound JVM argument '-Dlog4j.configurationFile=log4j2_17-111.xml'");
                    return true;
                }else{
                    LogManager.log("§cFAILED §rJVM argument '-Dlog4j.configurationFile=log4j2_17-111.xml' NOT set");
                }
            }else{
                LogManager.log("§cFAILED §rFile 'log4j2_17-111.xml' does not exist");
            }
        }

        return false;
    }
}
