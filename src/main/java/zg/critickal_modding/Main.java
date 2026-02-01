package zg.critickal_modding;

import com.hypixel.hytale.server.core.command.system.AbstractCommand;
import com.hypixel.hytale.server.core.command.system.CommandRegistry;
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

        AbstractCommand [] lista = {
                new ShowHudCommand("showhud", "Example command"),
                new HideHudCommand("hidehud", "Example command"),
                new UpdateHudCommand("updatehud", "Example command"),
                new ShowPageCommand("showpage", "Example command"),
                new HidePageCommand("hidepage", "Example command"),
                new ShowComandos("showcomandos", "clon del helper", this.getCommandRegistry())
        };
        this.registrarComandos(lista);
    }
    
    private void registrarComandos(@Nonnull AbstractCommand [] comandos){
        for (int i = 0; i < comandos.length; i++) {
            AbstractCommand cmd = comandos[i];
            if (cmd == null) {
                continue;
            }
            System.out.println("Registrando comando en posición [" + i + "]: " + cmd);
            this.getCommandRegistry().registerCommand(cmd);
        }
    }
}