package com.darthvader.dbsm.commands;

import net.minecraft.command.CommandBase;
import net.minecraft.command.CommandException;
import net.minecraft.command.ICommandSender;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.EnumChatFormatting;

public class HelpCommand extends CommandBase {
    @Override
    public String getCommandName() {
        return "dbsmhelp";
    }

    @Override
    public String getCommandUsage(ICommandSender sender) {
        return null;
    }

    @Override
    public void processCommand(ICommandSender arg0, String[] args) throws CommandException {
        final EntityPlayer player = (EntityPlayer)arg0;
        player.addChatMessage(new ChatComponentText(EnumChatFormatting.AQUA + "" + EnumChatFormatting.BOLD + "" + EnumChatFormatting.STRIKETHROUGH + "--------------------------------------\n" +
                EnumChatFormatting.AQUA + "" + EnumChatFormatting.BOLD + "List Of Commands:\n" +
                EnumChatFormatting.WHITE + " /dsbmhelp: Provides a list of availble commands" + "\n" +
                EnumChatFormatting.WHITE + " /dbsm: Opens the main GUI" + "\n" +
                EnumChatFormatting.WHITE + " /dbsmsetkey: Set your API key - Currently in development" + "\n" +
                EnumChatFormatting.WHITE + " /dreloadconfig: Reloads the configuration. - Currently in development" + "\n" +
                EnumChatFormatting.AQUA + "" + EnumChatFormatting.BOLD + "" + EnumChatFormatting.STRIKETHROUGH + "--------------------------------------\n"));
    }
}
