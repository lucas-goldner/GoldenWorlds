package com.lucasgoldner.goldenworlds.client;

import org.lwjgl.input.Keyboard;

import cpw.mods.fml.client.registry.ClientRegistry;
import net.minecraft.client.settings.KeyBinding;

public class GoldenWorldsKeyBindings {
	
	public static KeyBinding freeze;
	
	public static void init(){
		freeze = new KeyBinding("key.freeze", Keyboard.KEY_F, "key.categories.movement");

		ClientRegistry.registerKeyBinding(freeze);
	}

}
