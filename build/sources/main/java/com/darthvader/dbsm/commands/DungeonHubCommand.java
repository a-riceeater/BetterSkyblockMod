package com.darthvader.dbsm.commands;

import net.minecraft.client.Minecraft;
import net.minecraft.command.CommandBase;
import net.minecraft.command.CommandException;
import net.minecraft.command.ICommand;
import net.minecraft.command.ICommandSender;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.EnumChatFormatting;

public class DungeonHubCommand extends CommandBase implements ICommand {
    @Override
    public String getCommandName() {
        return "dun";
    }

    @Override
    public String getCommandUsage(ICommandSender arg0) {
        return "/" + getCommandName();
    }

    @Override
    public int getRequiredPermissionLevel() {
        return 0;
    }

    @Override
    public void processCommand(ICommandSender arg0, String[] args) throws CommandException {
        final EntityPlayer player = (EntityPlayer) arg0;
        Minecraft.getMinecraft().thePlayer.sendChatMessage("/warp dungeon_hub");
        player.addChatMessage(new ChatComponentText(EnumChatFormatting.BLUE +"[DBSM]" + EnumChatFormatting.GOLD + " Warping to Dungeon Hub"));
    }
}
