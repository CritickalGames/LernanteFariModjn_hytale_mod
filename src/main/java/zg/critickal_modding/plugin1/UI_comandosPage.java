package zg.critickal_modding.plugin1;

import com.hypixel.hytale.protocol.packets.interface_.CustomPageLifetime;
import com.hypixel.hytale.server.core.entity.entities.player.pages.CustomUIPage; // [2]
import com.hypixel.hytale.server.core.ui.builder.UICommandBuilder; // [4]
import com.hypixel.hytale.server.core.ui.builder.UIEventBuilder;
import com.hypixel.hytale.server.core.universe.PlayerRef; // [5]
import com.hypixel.hytale.component.Ref;
import com.hypixel.hytale.component.Store;
import com.hypixel.hytale.server.core.universe.world.storage.EntityStore;

import javax.annotation.Nonnull;

public class UI_comandosPage extends CustomUIPage {

    public UI_comandosPage(PlayerRef playerRef) {
        // Se pasan las tres referencias: el jugador, el tiempo de vida y el codec de datos
        super(playerRef, CustomPageLifetime.CanDismiss);
    }

    @Override
    public void build(@Nonnull Ref<EntityStore> ref,
                      @Nonnull UICommandBuilder uiCommandBuilder,
                      @Nonnull UIEventBuilder uiEventBuilder, // Este parámetro faltaba [1]
                      @Nonnull Store<EntityStore> store) {

        // Carga el archivo .ui [1, 2]
        uiCommandBuilder.append("UI_comandos.ui");
    }
}