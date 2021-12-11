package org.tschoerner.christian.log4jfixedchecker;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;
import org.tschoerner.christian.log4jfixedchecker.bstats.Metrics;
import org.tschoerner.christian.log4jfixedchecker.fix.FixDetector;
import org.tschoerner.christian.log4jfixedchecker.fix.FixPresenter;
import org.tschoerner.christian.log4jfixedchecker.versions.VersionDetector;

/**
 * @author Christian Tschörner
 */
public class FixedChecker extends JavaPlugin {

    @Override
    public void onEnable() {

        //delay message so it will be at the end of the console
        Bukkit.getScheduler().runTaskLaterAsynchronously(this, new Runnable() { //keeping 1.7 support
            @Override
            public void run() {
                VersionDetector.detectVersion();
                if(!FixDetector.alreadyFixed()){
                    FixPresenter.showFix();
                }
            }
        }, 20 * 2);

        //bStats
        int pluginId = 13551; // <-- Replace with the id of your plugin!
        Metrics metrics = new Metrics(this, pluginId);


        super.onEnable();
    }
}
