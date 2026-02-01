package zg.critickal_modding.commands;

import com.hypixel.hytale.component.Ref;
import com.hypixel.hytale.component.Store;
import com.hypixel.hytale.server.core.Message;
import com.hypixel.hytale.server.core.command.system.AbstractCommand;
import com.hypixel.hytale.server.core.command.system.CommandContext;
import com.hypixel.hytale.server.core.command.system.CommandRegistry;
import com.hypixel.hytale.server.core.command.system.basecommands.AbstractPlayerCommand;
import com.hypixel.hytale.server.core.universe.PlayerRef;
import com.hypixel.hytale.server.core.universe.world.World;
import com.hypixel.hytale.server.core.universe.world.storage.EntityStore;
import zg.critickal_modding.commands.ShowPageCommand;
import javax.annotation.Nonnull;

public class ShowComandos extends AbstractPlayerCommand {
    private final CommandRegistry REGISTRY;

    public ShowComandos(@Nonnull String name, @Nonnull String description, CommandRegistry registry) {
        super(name, description);
        this.REGISTRY = registry; // Pasamos el registro al comando [1]
    }

    @Override
    protected void execute(@Nonnull CommandContext context,
                           @Nonnull Store<EntityStore> store,
                           @Nonnull Ref<EntityStore> ref,
                           @Nonnull PlayerRef playerRef,
                           @Nonnull World world) {

        context.sendMessage(Message.raw("--- Lista de Comandos ---"));
        System.out.println(this.REGISTRY.isEnabled());
    }

}