package zg.critickal_modding.fachadas;

import com.hypixel.hytale.server.core.ui.builder.EventData;
import com.hypixel.hytale.server.core.ui.builder.UICommandBuilder;
import com.hypixel.hytale.server.core.ui.builder.UIEventBuilder;

@SuppressWarnings("unchecked")
public class UIBuilderFachada {
    public static final Class<EventData> EVENT_DATA =
            (Class<EventData>) (Class<?>) EventData.class;
    public static final Class<UICommandBuilder> COMMAND_BUILDER =
            (Class<UICommandBuilder>) (Class<?>) UICommandBuilder.class;
    public static final Class<UIEventBuilder> EVENT_BUILDER =
            (Class<UIEventBuilder>) (Class<?>) UIEventBuilder.class;
}
