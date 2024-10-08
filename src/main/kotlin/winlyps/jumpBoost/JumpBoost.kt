package winlyps.jumpBoost

import org.bukkit.plugin.java.JavaPlugin

class JumpBoost : JavaPlugin() {

    override fun onEnable() {
        // Register the event listener
        server.pluginManager.registerEvents(JumpBoostListener(this), this)
        logger.info("JumpBoost plugin enabled.")
    }

    override fun onDisable() {
        logger.info("JumpBoost plugin disabled.")
    }
}