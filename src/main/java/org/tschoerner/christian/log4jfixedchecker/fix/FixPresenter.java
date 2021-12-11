package org.tschoerner.christian.log4jfixedchecker.fix;

import org.tschoerner.christian.log4jfixedchecker.log.LogManager;
import org.tschoerner.christian.log4jfixedchecker.versions.VersionDetector;
import org.tschoerner.christian.log4jfixedchecker.versions.VersionFix;

/**
 * @author Christian Tschörner
 */
public class FixPresenter {

    public static void showFix(){
        VersionFix versionFix = VersionDetector.VERSION_FIX;

        LogManager.log("============================ Log4j SECURITY RISK ============================");
        LogManager.log("");
        LogManager.log("Your server is vulnerable for a security exploit. More information:");
        LogManager.log("https://www.minecraft.net/en-us/article/important-message--security-vulnerability-java-edition");
        LogManager.log("");
        LogManager.log("§eHow to fix this exploit:");

        if(versionFix == VersionFix.VERSION118){
            LogManager.log("You are running your Minecraft Server on version 1.18!");
            LogManager.log("If possible, please update to 1.18.1");
        }
        if(versionFix == VersionFix.VERSION118 || versionFix == VersionFix.VERSION117){
            LogManager.log("If updating to 1.18.1 is not possible, please add this JVM argument to your start file:");
            LogManager.log("-Dlog4j2.formatMsgNoLookups=true");
            LogManager.log("");
            LogManager.log("Example: java -jar -Dlog4j2.formatMsgNoLookups=true spigot.jar");
        }

        if(versionFix == VersionFix.VERSION112UNTIL1165){
            LogManager.log("1) Please download this file (log4j2_112-116.xml) and place it into your servers main directory:");
            LogManager.log("https://launcher.mojang.com/v1/objects/02937d122c86ce73319ef9975b58896fc1b491d1/log4j2_112-116.xml");
            LogManager.log("");
            LogManager.log("2) Please add this JVM argument to your start file:");
            LogManager.log("-Dlog4j.configurationFile=log4j2_112-116.xml");
            LogManager.log("");
            LogManager.log("Start file example: java -Dlog4j.configurationFile=log4j2_112-116.xml -jar spigot.jar");
        }

        if(versionFix == VersionFix.VERSION17UNTIL1112){
            LogManager.log("1) Please download this file (log4j2_17-111.xml) and place it into your servers main directory:");
            LogManager.log("https://launcher.mojang.com/v1/objects/dd2b723346a8dcd48e7f4d245f6bf09e98db9696/log4j2_17-111.xml");
            LogManager.log("");
            LogManager.log("2) Please add this JVM argument to your start file:");
            LogManager.log("-Dlog4j.configurationFile=log4j2_17-111.xml");
            LogManager.log("");
            LogManager.log("Start file example: java -Dlog4j.configurationFile=log4j2_17-111.xml -jar spigot.jar");
        }

        LogManager.log("");
        LogManager.log("");
        LogManager.log("After a successfull fix this message will dissappear on server start!");
        LogManager.log("For additional security, you can install this plugin:");
        LogManager.log("https://www.spigotmc.org/resources/log4jexploit-fix.98243/");
        LogManager.log("");
        LogManager.log("============================ SECURITY RISK ============================");
    }
}
