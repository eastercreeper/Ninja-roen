package com.github.eastercreeper.ninjaroen.main.module.render;

import com.github.eastercreeper.ninjaroen.main.module.Category;
import com.github.eastercreeper.ninjaroen.main.module.Module;

public class FullBright extends Module {
    private float defGamma
    public FullBright(String name, String description, boolean detectable, boolean toggled, Category category) {
        super("FullBright", "Lights up everyrthing", false, false, Category.RENDER);
    }

    @Override
    public void onEnabled() {
        super.onEnabled();
        defGamma = mc.gameSettings.gammaSetting;
        mc.gameSettings.gammaSetting = 10f;
    }

    @Override
    public void onDisabled() {
        super.onDisabled();
        mc.gameSettings.gammaSetting = defGamma;
    }
}
