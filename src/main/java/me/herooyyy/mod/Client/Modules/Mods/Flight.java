package me.herooyyy.mod.Client.Modules.Mods;

import me.deftware.client.framework.event.Event;
import me.deftware.client.framework.wrappers.entity.IEntityPlayer;
import me.herooyyy.mod.Client.Modules.Mod;
import me.herooyyy.mod.Client.Modules.ModType;
/*
This is what we are going to use as the template
for all the other hacks!
 */


public class Flight extends Mod {
// this is where the things are declared (name of hack, desc. of hack, type of hack, and the hack's keybind)
    public Flight() {
        super("Flight", "Enables flying in survival", ModType.MOVEMENT, 70);
    }
// It's different than onEnable but i cant really explain how
    @Override
    public void onEvent(Event event) {
        IEntityPlayer.setFlying(true);
    }
// thing that happens when enabled
    @Override
    public void onEnable() {

    }
// Thing that happens when disabled
    @Override
    public void onDisable() {
        IEntityPlayer.setFlying(false);
    }
}
