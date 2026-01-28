package zg.critickal_modding.fachadas;

import com.hypixel.hytale.server.core.Message;

@SuppressWarnings("unchecked")
public class MensajeriaFachada {
    public static final Class<Message> MESSAGE =
            (Class<Message>) (Class<?>) Message.class;
}
