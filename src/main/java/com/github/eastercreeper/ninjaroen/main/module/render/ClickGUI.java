package com.github.eastercreeper.ninjaroen.main.module.render;

import com.github.eastercreeper.ninjaroen.main.module.Category;
import com.github.eastercreeper.ninjaroen.main.module.Module;
import com.github.eastercreeper.ninjaroen.main.ninjaroen;
import org.lwjgl.input.Keyboard;

public class ClickGUI extends Module {
    public ClickGUI() {
        super("ClickGUI", "allows you to enable mods", true, false, Category.RENDER);
        this.setKey(Keyboard.KEY_RSHIFT);
    }

    @Override
    public void onEnabled() {
        super.onEnabled();
        mc.displayGuiScreen(ninjaroen.instance.clickGUI);
        this.setToggled(false);
    }
}
