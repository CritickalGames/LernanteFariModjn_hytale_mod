package zg.critickal_modding.fachadas;

import com.hypixel.hytale.protocol.packets.interface_.CustomPageLifetime;
import com.hypixel.hytale.protocol.packets.interface_.CustomUIEventBindingType;

@SuppressWarnings("unchecked")
public class ProtocoloUIFachada {
    public static final Class<CustomPageLifetime> PAGE_LIFETIME =
            (Class<CustomPageLifetime>) (Class<?>) CustomPageLifetime.class;
    public static final Class<CustomUIEventBindingType> EVENT_BINDING_TYPE =
            (Class<CustomUIEventBindingType>) (Class<?>) CustomUIEventBindingType.class;
}
