package com.darthvader.dbsm.features;

import com.darthvader.dbsm.commands.ToggleCommand;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.util.StringUtils;
import net.minecraftforge.client.event.ClientChatReceivedEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

import java.awt.*;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.util.ArrayList;
import java.util.List;

public class CopyFail {
    @SubscribeEvent
    public void onReceiveDeathMessage(ClientChatReceivedEvent e) {
        String message = StringUtils.stripControlCodes(e.message.getUnformattedText());
        Minecraft mc = Minecraft.getMinecraft();
        EntityPlayer player = mc.thePlayer;
        // add if in dungeon
        if (message.contains("died to a trap")) {
            player.addChatMessage(new ChatComponentText(EnumChatFormatting.BLUE +"[DBSM]" + EnumChatFormatting.GOLD + " Copied death/fail to clipboard"));
            StringSelection stringSelection = new StringSelection(e.message.getUnformattedText());
            Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
            clipboard.setContents(stringSelection, null);
        }
        else if (message.contains("was killed by")) {
            player.addChatMessage(new ChatComponentText(EnumChatFormatting.BLUE +"[DBSM]" + EnumChatFormatting.GOLD + " Copied death/fail to clipboard"));
            StringSelection stringSelection = new StringSelection(e.message.getUnformattedText());
            Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
            clipboard.setContents(stringSelection, null);
        }
        else if (message.contains("fell to their death")) {
            player.addChatMessage(new ChatComponentText(EnumChatFormatting.BLUE +"[DBSM]" + EnumChatFormatting.GOLD + " Copied death/fail to clipboard"));
            StringSelection stringSelection = new StringSelection(e.message.getUnformattedText());
            Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
            clipboard.setContents(stringSelection, null);
        }
        else if (message.contains("suffocated")) {
            player.addChatMessage(new ChatComponentText(EnumChatFormatting.BLUE +"[DBSM]" + EnumChatFormatting.GOLD + " Copied death/fail to clipboard"));
            StringSelection stringSelection = new StringSelection(e.message.getUnformattedText());
            Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
            clipboard.setContents(stringSelection, null);
        }
        else if (message.contains("drowned")) {
            player.addChatMessage(new ChatComponentText(EnumChatFormatting.BLUE +"[DBSM]" + EnumChatFormatting.GOLD + " Copied death/fail to clipboard"));
            StringSelection stringSelection = new StringSelection(e.message.getUnformattedText());
            Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
            clipboard.setContents(stringSelection, null);
        }
        else if (message.contains("died to")) {
            player.addChatMessage(new ChatComponentText(EnumChatFormatting.BLUE +"[DBSM]" + EnumChatFormatting.GOLD + " Copied death/fail to clipboard"));
            StringSelection stringSelection = new StringSelection(e.message.getUnformattedText());
            Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
            clipboard.setContents(stringSelection, null);
        }
        else if (message.contains("burned to death")) {
            player.addChatMessage(new ChatComponentText(EnumChatFormatting.BLUE +"[DBSM]" + EnumChatFormatting.GOLD + " Copied death/fail to clipboard"));
            StringSelection stringSelection = new StringSelection(e.message.getUnformattedText());
            Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
            clipboard.setContents(stringSelection, null);
        }
        else if (message.contains("exploded")) {
            player.addChatMessage(new ChatComponentText(EnumChatFormatting.BLUE +"[DBSM]" + EnumChatFormatting.GOLD + " Copied death/fail to clipboard"));
            StringSelection stringSelection = new StringSelection(e.message.getUnformattedText());
            Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
            clipboard.setContents(stringSelection, null);
        }
        else if (message.contains("were killed by")) {
            player.addChatMessage(new ChatComponentText(EnumChatFormatting.BLUE +"[DBSM]" + EnumChatFormatting.GOLD + " Copied death/fail to clipboard"));
            StringSelection stringSelection = new StringSelection(e.message.getUnformattedText());
            Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
            clipboard.setContents(stringSelection, null);
        }
    }
}
