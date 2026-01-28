package zg.critickal_modding.fachadas;

import com.hypixel.hytale.server.core.entity.entities.player.pages.InteractiveCustomUIPage;
import com.hypixel.hytale.server.core.universe.world.storage.EntityStore;

@SuppressWarnings("unchecked")
public class PlayerPageFachada {
    public static final Class<InteractiveCustomUIPage<EntityStore>> INTERACTIVE_PAGE =
            (Class<InteractiveCustomUIPage<EntityStore>>) (Class<?>) InteractiveCustomUIPage.class;
}
