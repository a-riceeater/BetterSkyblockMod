package com.darthvader.dbsm.commands;

import net.minecraft.command.CommandBase;
import net.minecraft.command.CommandException;
import net.minecraft.command.ICommand;
import net.minecraft.command.ICommandSender;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.BlockPos;
import net.minecraft.util.ChatComponentText;
import net.minecraftforge.fml.client.config.GuiConfigEntries;

import java.awt.*;
import java.util.List;

public class ToggleCommand extends CommandBase implements ICommand {

    public static boolean spirtSceptre;
    public static boolean midasStaff;
    public static boolean healMessages;
    public static boolean cooldownMessages;
    public static boolean notEnoughMana;
    public static boolean implosion;
    public static boolean killCombo;
    public static boolean clickingTooFast;
    public static boolean openingTooFast;
    public static boolean miningSpeedBoost;
    public static boolean itemDisabledMessages;
    public static boolean AbilityTimers;
    public static boolean copyFailMessages;

    @Override
    public String getCommandName() {
        return "dtoggle";
    }

    @Override
    public String getCommandUsage(ICommandSender sender) {
        return "/" + getCommandName() + "<sceptremessages/staffmessages/healmessages/cooldownmessages/outofmanamessages/implosionmessages/killcombomessages/clickingtoofast/inventoriestoofast/miningspeedboostmessages>";
    }
    public static String usage(ICommandSender arg0) {
        return new ToggleCommand().getCommandUsage(arg0);
    }
    @Override
    public int getRequiredPermissionLevel() {
        return 0;
    }
    @Override
    public List<String> addTabCompletionOptions(ICommandSender sender, String[] args, BlockPos pos) {
        if (args.length == 1) {
            return getListOfStringsMatchingLastWord(args, "sceptremessages", "staffmessages", "healmessages", "cooldownmessages", "notenoughmanamessages", "implosionmessages", "killcombomessages", "clickingtoofast", "inventoriestoofast", "miningspeedboostmessages", "itemdisabledmessages");
        }
        return null;
    }
    @Override
    public void processCommand(ICommandSender arg0, String[] arg1) throws CommandException {
        final EntityPlayer player = (EntityPlayer)arg0;
        if (arg1.length == 0) {
            player.addChatMessage(new ChatComponentText("§cUsage: " + getCommandUsage(arg0)));
            return;
        }
        if (arg1[0].toLowerCase().contains("sceptremessages")) {
            spirtSceptre = !spirtSceptre;
            player.addChatMessage(new ChatComponentText("§aSpirit Sceptre messages have been toggled to: " + Color.GREEN + spirtSceptre));
        }
    }
}
