package com.darthvader.dbsm.features;

import com.darthvader.dbsm.commands.ToggleCommand;
import com.darthvader.dbsm.utils.utils;
import net.minecraft.util.StringUtils;
import net.minecraftforge.client.event.ClientChatReceivedEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class HideMessages {

    @SubscribeEvent
    public void onChat(ClientChatReceivedEvent e) {
        String message = e.message.getUnformattedText();
        if (!utils.inSkyblock) return;

        // Spirit Sceptre Messages
        if (message.contains("Your Spirit Sceptre hit ")) {
            e.setCanceled(true);
            return;
        }
        // Midas Staff Messages
        if (message.contains("Your Molten Wave hit ")) {
            e.setCanceled(true);
            return;
        }
        // Healing Messages
        if (message.contains(" health!") && (message.contains("You healed ") || message.contains(" healed you for "))) {
            e.setCanceled(true);
            return;
        }
        // Cooldown Messages
        if (message.contains("This ability is on cooldown for ")) {
            e.setCanceled(true);
            return;
        }
        // Out of mana messages
        if (message.contains("You do not have enough mana to do this!")) {
            e.setCanceled(true);
            return;
        }
        // Implosion
            if (message.contains("Your Implosion hit ") || message.contains("There are blocks in the way")) {
                e.setCanceled(true);
                return;
        }
        // Kill Combo
            if ((message.contains("+") && message.contains(" Kill Combo ")) || message.contains("Your Kill Combo has expired!")) {
                e.setCanceled(true);
                return;
        }
        // Clicking too fast
        if (message.contains("You're clicking too fast!'")) {
            e.setCanceled(true);
            return;
        }
        // Opening inventories too fast
        if (message.contains("You're opening inventories too fast.")) {
            e.setCanceled(true);
            return;
        }
        // Mining Speed Boost Messages
        if (message.contains("Mining Speed Boost is now available!")) {
            e.setCanceled(true);
            return;
        }
        // Item Disabled Messages
        if (message.contains("This item is currently disabled!")) {
            e.setCanceled(true);
        }
    }
}
