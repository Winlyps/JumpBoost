package winlyps.jumpBoost

import org.bukkit.Material
import org.bukkit.entity.Player
import org.bukkit.event.EventHandler
import org.bukkit.event.Listener
import org.bukkit.event.player.PlayerMoveEvent
import org.bukkit.potion.PotionEffect
import org.bukkit.potion.PotionEffectType

class JumpBoostListener(private val plugin: JumpBoost) : Listener {

    @EventHandler
    fun onPlayerMove(event: PlayerMoveEvent) {
        val player: Player = event.player

        // Check if the player is jumping
        if (player.location.add(0.0, -1.0, 0.0).block.type == Material.AIR && player.velocity.y > 0) {
            // Apply jump boost effect for 5 seconds
            player.addPotionEffect(PotionEffect(PotionEffectType.JUMP, 100, 1))
        }
    }
}