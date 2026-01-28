package zg.critickal_modding.ui;


// import zg.critickal_modding.fachadas.CodecFachada;
import com.hypixel.hytale.codec.Codec;
import com.hypixel.hytale.codec.KeyedCodec;
import com.hypixel.hytale.codec.builder.BuilderCodec;
// import zg.critickal_modding.fachadas.ComponentFachada;
import com.hypixel.hytale.component.Ref;
import com.hypixel.hytale.component.Store;
// import zg.critickal_modding.fachadas.ProtocoloUIFachada;
import com.hypixel.hytale.protocol.packets.interface_.CustomPageLifetime;
import com.hypixel.hytale.protocol.packets.interface_.CustomUIEventBindingType;
// import zg.critickal_modding.fachadas.MensajeriaFachada;
import com.hypixel.hytale.server.core.Message;
// import zg.critickal_modding.fachadas.PlayerPageFachada;
import com.hypixel.hytale.server.core.entity.entities.player.pages.InteractiveCustomUIPage;
// import zg.critickal_modding.fachadas.UIBuilderFachada;
import com.hypixel.hytale.server.core.ui.builder.EventData;
import com.hypixel.hytale.server.core.ui.builder.UICommandBuilder;
import com.hypixel.hytale.server.core.ui.builder.UIEventBuilder;
// import zg.critickal_modding.fachadas.UniverseFachada;
import com.hypixel.hytale.server.core.universe.PlayerRef;
import com.hypixel.hytale.server.core.universe.world.storage.EntityStore;
import org.checkerframework.checker.nullness.compatqual.NonNullDecl;

import javax.annotation.Nonnull;

public class MyUI extends InteractiveCustomUIPage<MyUI.Data> {
    private static final String textobase ="Éste texto es desde el .java";
    public MyUI(
            @Nonnull PlayerRef playerRef,
            @Nonnull CustomPageLifetime lifetime) {
        super(playerRef, lifetime, Data.CODEC);
    }

    @Override
    public void build(
            @Nonnull Ref<EntityStore> ref,
            @Nonnull UICommandBuilder uiCommandBuilder,
            @Nonnull UIEventBuilder uiEventBuilder,
            @Nonnull Store<EntityStore> store) {
        uiCommandBuilder.append("MyUI.ui"); //Pasamos el diseño
        // Modifica una variable del .ui
        uiCommandBuilder.set("#Mietiqueta.TextSpans", Message.raw(textobase));
        // Enlaza un evento a un input
        uiEventBuilder.addEventBinding(
                CustomUIEventBindingType.ValueChanged, //tipo de disparo
                "#MyInput", //Input del .ui
                EventData.of
                        (
                                "@MyInput",     //key
                                "#MyInput.Value"//value //Averiguar sobre el .Value y alternativas
                        ),
                false);
        //! Descubrir qué es locksinterface
    }

    /**
     * recibe cada actualización del input y lo envia a la consola de comandos.
     **/
    @Override
    public void handleDataEvent(
            @Nonnull Ref<EntityStore> ref,
            @Nonnull Store<EntityStore> store,
            @NonNullDecl Data data)
    {
        super.handleDataEvent(ref, store, data);

        System.out.println("EVENT: " + data.value);
        updateText(data.value);

        sendUpdate(); //Supondré que es obligatorio
    }

    public static class Data {
        public static final BuilderCodec<Data> CODEC = BuilderCodec.builder(Data.class, Data::new)
                .append(new KeyedCodec<>("@MyInput", Codec.STRING),
                        (data, value) -> data.value = value,
                        data -> data.value).add()
                .build();

        private String value;
    }

    private void updateText(String texto){
        UICommandBuilder uiCommandBuilder = new UICommandBuilder();
        if (texto.isEmpty()){
            texto = textobase;
        }
        uiCommandBuilder.set("#Mietiqueta.TextSpans", Message.raw(texto));
        sendUpdate(uiCommandBuilder); //la documentación lo escribe diferente, pero no funcionaba
    }
}
