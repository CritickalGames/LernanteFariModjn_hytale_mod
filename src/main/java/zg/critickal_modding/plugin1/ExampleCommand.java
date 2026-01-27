package zg.critickal_modding.plugin1;

import com.hypixel.hytale.protocol.GameMode; //auxiliar
import com.hypixel.hytale.server.core.Message; //auxiliar
import com.hypixel.hytale.server.core.command.system.CommandContext; //Tipo de dato
import com.hypixel.hytale.server.core.command.system.basecommands.CommandBase; //Trait

import javax.annotation.Nonnull;

/**
 * This is an example command that will simply print the name of the plugin in chat when used.
 */
public class ExampleCommand extends CommandBase {

    private final String pluginName;
    private final String pluginVersion;

    public ExampleCommand(String pluginName, String pluginVersion) {
        super("test", "Prints a test message from the " + pluginName + " plugin.");
        this.setPermissionGroup(GameMode.Adventure); // Allows the command to be used by anyone, not just OP
        this.pluginName = pluginName;
        this.pluginVersion = pluginVersion;
    }

    @Override
    protected void executeSync(@Nonnull CommandContext ctx) {
        ctx.sendMessage(Message.raw("Hola mundo, esto es " + pluginName + " v" + pluginVersion + " y yo soy Zeta"));
    }
}