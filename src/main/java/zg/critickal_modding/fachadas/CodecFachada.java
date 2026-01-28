package zg.critickal_modding.fachadas;

import com.hypixel.hytale.codec.Codec;
import com.hypixel.hytale.codec.KeyedCodec;
import com.hypixel.hytale.codec.builder.BuilderCodec;

@SuppressWarnings("unchecked")
public class CodecFachada {

    // Devuelve el tipo Codec<String> sin raw use
    public static Class<Codec<String>> tipoStringCodec() {
        return (Class<Codec<String>>) (Class<?>) Codec.STRING.getClass();
    }

    // Devuelve el tipo KeyedCodec<T> sin raw use
    public static <T> Class<KeyedCodec<T>> tipoKeyedCodec() {
        return (Class<KeyedCodec<T>>) (Class<?>) KeyedCodec.class;
    }

    // Devuelve el tipo BuilderCodec<T> sin raw use
    public static <T> Class<BuilderCodec<T>> tipoBuilderCodec() {
        return (Class<BuilderCodec<T>>) (Class<?>) BuilderCodec.class;
    }
}
