package com.darthvader.dbsm;

import com.darthvader.dbsm.commands.DungeonHubCommand;
import com.darthvader.dbsm.commands.HelpCommand;
import com.darthvader.dbsm.commands.WarpCommand;
import com.darthvader.dbsm.features.CopyFail;
import com.darthvader.dbsm.features.HideMessages;
import com.darthvader.dbsm.proxy.CommonProxy;
import com.darthvader.dbsm.utils.Reference;
import net.minecraftforge.client.ClientCommandHandler;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MOD_ID, name = Reference.NAME, version = Reference.VERSION)
public class Dbsm {
    @Mod.Instance
    public static Dbsm instance;

    @SidedProxy(
            clientSide = Reference.CLIENT_PROXY_CLASS,
            serverSide = Reference.COMMON_PROXY_CLASS
    )
    public static CommonProxy proxy;

    @EventHandler
    public void PreInit(FMLPreInitializationEvent e) {
        System.out.println("Hello, World!");
        ClientCommandHandler.instance.registerCommand(new WarpCommand());
        ClientCommandHandler.instance.registerCommand(new DungeonHubCommand());
        ClientCommandHandler.instance.registerCommand(new HelpCommand());
    }

    @EventHandler
    public void init(FMLInitializationEvent e) {
        MinecraftForge.EVENT_BUS.register(this);
        MinecraftForge.EVENT_BUS.register(new CopyFail());
    }

    @EventHandler
    public void PostInit(FMLPreInitializationEvent e) {

    }
}
