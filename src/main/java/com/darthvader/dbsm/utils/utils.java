package com.darthvader.dbsm.utils;

import net.minecraft.client.Minecraft;
import net.minecraft.scoreboard.ScoreObjective;

public class utils {
    public static boolean inSkyblock = false;
    public static boolean isOnHypixel() {
        Minecraft mc = Minecraft.getMinecraft();
        if (mc != null && mc.theWorld != null && !mc.isSingleplayer()) {
            return mc.getCurrentServerData().serverIP.toLowerCase().contains("hypixel");
        }
        return false;
    }

    public static void isOnSkyblock() {
        Minecraft mc = Minecraft.getMinecraft();
        if (mc != null && mc.theWorld != null && !mc.isSingleplayer()) {
            ScoreObjective scoreboardObj = mc.theWorld.getScoreboard().getObjectiveInDisplaySlot(1);
            if (scoreboardObj != null) {
                if (scoreboardObj.getDisplayName().contains("SKYBLOCK")) {
                    inSkyblock = true;
                    return;
                }
            }
        }
        inSkyblock = false;
    }
}
