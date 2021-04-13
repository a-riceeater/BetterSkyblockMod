package com.darthvader.dbsm.commands;

import net.minecraft.client.Minecraft;
import net.minecraft.command.CommandBase;
import net.minecraft.command.CommandException;
import net.minecraft.command.ICommand;
import net.minecraft.command.ICommandSender;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.EnumChatFormatting;

public class WarpCommand extends CommandBase implements ICommand {
    @Override
    public String getCommandName() {
        return "wr";
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
        if (args[0].length() == 0) {
            player.addChatMessage(new ChatComponentText(EnumChatFormatting.BLUE + "[DBSM]" + EnumChatFormatting.RED + " Incorrect command usage. /wr <warp>"));
        }
        else {
            Minecraft.getMinecraft().thePlayer.sendChatMessage("/warp " + args[0]);
            player.addChatMessage(new ChatComponentText(EnumChatFormatting.BLUE + "[DBSM]" + EnumChatFormatting.GOLD + " Warping to: " + args[0]));
        }
    }
}
