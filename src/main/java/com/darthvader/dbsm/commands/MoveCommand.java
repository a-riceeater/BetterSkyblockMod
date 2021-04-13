package com.darthvader.dbsm.commands;

import net.minecraft.command.CommandBase;
import net.minecraft.command.CommandException;
import net.minecraft.command.ICommandSender;
import net.minecraft.util.BlockPos;

import java.util.List;

public class MoveCommand extends CommandBase {

    public static int[] bonzoMaskTimer = {0, 0};

    @Override
    public String getCommandName() {
        return "move";
    }

    @Override
    public String getCommandUsage(ICommandSender arg0) {
        return "/" + getCommandName() + " <bonzomasktimer/normalability/ultimateability> <x> <y>";
    }

    public static String usage(ICommandSender arg0) {
        return new MoveCommand().getCommandUsage(arg0);
    }

    @Override
    public int getRequiredPermissionLevel() {
        return 0;
    }

    @Override
    public List<String> addTabCompletionOptions(ICommandSender sender, String[] args, BlockPos pos) {
        if (args.length == 1) {
            return getListOfStringsMatchingLastWord(args, "bonzomasktimer", "normalability", "ultimateability");
        }
        return null;
    }

    @Override
    public void processCommand(ICommandSender sender, String[] args) throws CommandException {

    }
}
