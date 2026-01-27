package zg.critickal_modding.plugin1;

import com.hypixel.hytale.logger.HytaleLogger;
import com.hypixel.hytale.server.core.event.events.player.PlayerReadyEvent;
import com.hypixel.hytale.server.core.plugin.JavaPlugin;
import com.hypixel.hytale.server.core.plugin.JavaPluginInit;
//import dev.hytalemodding.commands.*;
//import dev.hytalemodding.events.OpenGuiListener;

import javax.annotation.Nonnull;
/**
 * This class serves as the entrypoint for your plugin. Use the setup method to register into game registries or add
 * event listeners.
 */
public class ExamplePlugin extends JavaPlugin {
    private static final HytaleLogger LOGGER = HytaleLogger.forEnclosingClass();

    public ExamplePlugin(@Nonnull JavaPluginInit init) {
        super(init);
        LOGGER.atInfo().log("HOLA " + this.getName() + " VERSIÓN " + this.getManifest().getVersion().toString());
    }

    @Override
    protected void setup() {
        LOGGER.atInfo().log("INICIANDO PLUGIN " + this.getName());
        this.getCommandRegistry().registerCommand(new ExampleCommand(this.getName(), this.getManifest().getVersion().toString()));

        //this.getEventRegistry().registerGlobal(PlayerReadyEvent.class, OpenGuiListener::openGui);

        //this.getCommandRegistry().registerCommand(new ShowHudCommand("showhud", "Example command"));
        //this.getCommandRegistry().registerCommand(new HideHudCommand("hidehud", "Example command"));
        //this.getCommandRegistry().registerCommand(new UpdateHudCommand("updatehud", "Example command"));
        //this.getCommandRegistry().registerCommand(new ShowPageCommand("showpage", "Example command"));
        //this.getCommandRegistry().registerCommand(new HidePageCommand("hidepage", "Example command"));
    }
}
