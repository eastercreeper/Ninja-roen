package com.github.eastercreeper.ninjaroen.main.module;


import net.minecraft.client.Minecraft;
import net.minecraftforge.common.MinecraftForge;


public class Module {
        protected static Minecraft mc = Minecraft.getMinecraft();

        private String name, description;
        private int key;
        private boolean detectable, toggled;
        public Category category;
        public boolean visible = true;


        public Module(String name, String description, boolean detectable, boolean toggled, Category category) {
            this.name = name;
            this.description = description;
            this.key = 0;
            this.detectable = detectable;
            this.toggled = toggled;
            this.category = category;
        }


        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public int getKey() {
            return key;
        }

        public void setKey(int key) {
            this.key = key;
        }

        public boolean isDetectable() {
            return detectable;
        }

        public boolean isToggled() {
            return toggled;
        }

        public void setToggled(boolean toggled) {
            this.toggled = toggled;

            if(this.toggled) {
                this.onEnabled();
            } else {
                this.onDisabled();
            }
        }

        public String getName() {
            return name;
        }

    public Category getCategory() {
        return category;
    }

    public void toggle() {
            this.toggled = !this.toggled;

            if(this.toggled) {
                this.onEnabled();
            } else {
                this.onDisabled();
            }
    }

    public void onEnabled(){
        System.out.println("Enabled " + this.name);
        MinecraftForge.EVENT_BUS.register(this);
    }

    public void onDisabled(){
        System.out.println("Disabled" + this.name);
        MinecraftForge.EVENT_BUS.unregister(this);
    }

    @Override
    public String toString() {
        return name;
    }
}
