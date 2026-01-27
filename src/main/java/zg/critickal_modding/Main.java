package zg.critickal_modding;

import com.hypixel.hytale.server.core.event.events.player.PlayerReadyEvent;
import com.hypixel.hytale.server.core.plugin.JavaPlugin;
import com.hypixel.hytale.server.core.plugin.JavaPluginInit;
import zg.critickal_modding.commands.*;
import zg.critickal_modding.events.OpenGuiListener;

import javax.annotation.Nonnull;

public class Main extends JavaPlugin {

    public Main(@Nonnull JavaPluginInit init) {
        super(init);
    }

    @Override
    protected void setup() {
        this.getEventRegistry().registerGlobal(PlayerReadyEvent.class, OpenGuiListener::openGui);

        this.getCommandRegistry().registerCommand(new ShowHudCommand("showhud", "Example command"));
        this.getCommandRegistry().registerCommand(new HideHudCommand("hidehud", "Example command"));
        this.getCommandRegistry().registerCommand(new UpdateHudCommand("updatehud", "Example command"));
        this.getCommandRegistry().registerCommand(new ShowPageCommand("showpage", "Example command"));
        this.getCommandRegistry().registerCommand(new HidePageCommand("hidepage", "Example command"));
    }
}