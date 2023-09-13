package com.github.eastercreeper.ninjaroen.main.module.movement;

import com.github.eastercreeper.ninjaroen.main.module.Category;
import com.github.eastercreeper.ninjaroen.main.module.Module;
import net.minecraft.client.settings.KeyBinding;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class Sprint extends Module {
    public Sprint(String name, String description, boolean detectable, boolean toggled, Category category) {
        super(name, description, detectable, toggled, category);
    }

    @SubscribeEvent
    public void onPlayerTick() {
        KeyBinding.setKeyBindState(mc.gameSettings.keyBindSprint.getKeyCode(), true);
    }

    @Override
    public void onDisabled() {
        super.onDisabled();
        KeyBinding.setKeyBindState(mc.gameSettings.keyBindSprint.getKeyCode(), false);
    }
}
