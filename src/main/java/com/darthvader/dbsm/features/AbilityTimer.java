package com.darthvader.dbsm.features;

import com.darthvader.dbsm.commands.MoveCommand;
import com.darthvader.dbsm.commands.ToggleCommand;
import net.minecraft.client.Minecraft;
import net.minecraft.util.StringUtils;
import net.minecraftforge.client.event.ClientChatReceivedEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import sun.java2d.pipe.TextRenderer;

import java.util.ArrayList;
import java.util.List;

public class AbilityTimer {
    @SubscribeEvent
    public void onChat(ClientChatReceivedEvent e) {
        String message = StringUtils.stripControlCodes(e.message.getUnformattedText());
        Minecraft mc = Minecraft.getMinecraft();
        if (!ToggleCommand.AbilityTimers && message.contains("Your Guided Sheep hit")) {
            System.out.println("Started Guided Sheep Timer");
        }
        if (!ToggleCommand.AbilityTimers && message.contains("Used Thunderstorm")) {
            System.out.println("Started Thunderstorm Timer");
        }
        if (!ToggleCommand.AbilityTimers && message.contains("Used Throwing Axe")) {
            System.out.println("Started Throwing Axe Timer");
        }
        if (!ToggleCommand.AbilityTimers && message.contains("Used Ragnarok")) {
            System.out.println("Started Ragnarok Timer");
        }
        if (!ToggleCommand.AbilityTimers && message.contains("Used Thunderstorm")) {
            System.out.println("Started Thunderstorm Timer");
        }
        if (!ToggleCommand.AbilityTimers && message.contains("Used Rapid Fire")) {
            System.out.println("Started Thunderstorm Timer");
        }
    }
}
