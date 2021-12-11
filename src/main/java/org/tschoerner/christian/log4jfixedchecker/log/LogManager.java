package org.tschoerner.christian.log4jfixedchecker.log;

import org.bukkit.Bukkit;

/**
 * @author Christian Tschörner
 */
public class LogManager {

    private static final String CONSOLE_PREFIX = "[Log4jFixedChecker]";

    public static void log(String message){
        Bukkit.getConsoleSender().sendMessage(String.format("%s %s", CONSOLE_PREFIX, message));
    }
}
