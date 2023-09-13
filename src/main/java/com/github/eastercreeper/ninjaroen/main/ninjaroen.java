package com.github.eastercreeper.ninjaroen.main;

import com.github.eastercreeper.ninjaroen.main.clickgui.ClickGUI;
import com.github.eastercreeper.ninjaroen.main.module.ModuleManager;
import com.github.eastercreeper.ninjaroen.main.settings.SettingsManager;
import net.minecraftforge.common.MinecraftForge;

public class ninjaroen {

    public static final String MODID = "NinjaRoen";
    public static final String VERSION = "Roen1";
    public static  String prefix = ".";

    public static ninjaroen instance;
    public ModuleManager moduleManager;
    public SettingsManager settingsManager;
    public ClickGUI clickGUI;


    public void init() {
        MinecraftForge.EVENT_BUS.register(this);
        instance = this;
        settingsManager = new SettingsManager();
        clickGUI = new ClickGUI();
        moduleManager = new ModuleManager();


    }

}
